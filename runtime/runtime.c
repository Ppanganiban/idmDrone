#include "runtime.h"
#include <stdio.h>
#include <arpa/inet.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <sys/time.h>
#include <stdint.h>
#include <math.h>

#define TIMER 2
#define BUFFER_SIZE 512
#define DroneAddress "192.168.1.1"
#define AT_PORT 5556
#define NAVDATA_PORT 5554
#define DRONE_SPEED 5 //m/s
#define MSG_PER_SEC 30

//FOR AT*REF
#define TAKEOFF 1
#define LAND 0
#define EMERGENCY_CHANGE 1
#define EMERGENCY_STAY 0
#define DEF_ATREF 290717696

//FOR AT*PCMD
#define FLAG_HOVER 0
#define FLAG_PROG 1     //Progressive mode
#define FLAG_PROGWITHYAW 3  //Progressive mode with yaw


/*******************************************************************************
 ***************************** NAV DATA ****************************************
 ******************************************************************************/

typedef signed short      int16_t;
typedef unsigned short     uint16_t;
typedef float  float32_t;
typedef double float64_t;

typedef struct _navdata_demo_t {
  uint16_t    tag;            /*!< Navdata block ('option') identifier */
  uint16_t    size;           /*!< set this to the size of this structure */

  uint32_t    ctrl_state;     /*!< Flying state (landed, flying, hovering, etc.)
                                defined in CTRL_STATES enum. */

  uint32_t    vbat_flying_percentage; /*!< battery voltage filtered (mV) */

  float32_t   theta;                  /*!< UAV's pitch in milli-degrees */
  float32_t   phi;                    /*!< UAV's roll  in milli-degrees */
  float32_t   psi;                    /*!< UAV's yaw   in milli-degrees */

  int32_t     altitude;               /*!< UAV's altitude in centimeters */

  float32_t   vx;                     /*!< UAV's estimated linear velocity */
  float32_t   vy;                     /*!< UAV's estimated linear velocity */
  float32_t   vz;                     /*!< UAV's estimated linear velocity */

  uint32_t    num_frames;       /*!< streamed frame index */
                                // Not used -> To integrate in video stage.


  uint32_t    detection_tag_index;    /*!<  Deprecated ! Don't use ! */

  uint32_t    detection_camera_type;  /*!<  Type of tag searched in detection */


}navdata_demo_t;

typedef struct _navdata_iphone_angles_t {
    uint16_t   tag;
    uint16_t   size;

    int32_t    enable;
    float32_t  ax;
    float32_t  ay;
    float32_t  az;
    uint32_t   elapsed;
}navdata_iphone_angles_t;

typedef struct _navdata_vision_detect_t {
    uint16_t   tag;
    uint16_t   size;

    uint32_t   nb_detected;  
    uint32_t   type[4];
    uint32_t   xc[4];        
    uint32_t   yc[4];
    uint32_t   width[4];     
    uint32_t   height[4];    
    uint32_t   dist[4];      
} navdata_vision_detect_t;

typedef struct _navdata_unpacked_t {
    uint32_t  mykonos_state;
    int    vision_defined;

    navdata_demo_t           navdata_demo;
    navdata_iphone_angles_t  navdata_iphone_angles;
    navdata_vision_detect_t  navdata_vision_detect;
} navdata_unpacked_t;


/*******************************************************************************
 ***************************** VARIABLES ***************************************
 ******************************************************************************/

//Use for message
int seq_control = 1;              //Sequence number for our packets
pthread_mutex_t seq_mutex;

char * mess_cmd_curr = NULL;      //Current movement (send every 0.03sec)
pthread_mutex_t cmd_mutex;
pthread_cond_t cond_cmd_initialized;
int dance_start;

char * mess_navdata_curr = NULL;  //Message for navdata (send every 0.003sec)
pthread_mutex_t navdata_mutex;

pthread_cond_t cond_drone_initialized;
int drone_initialized;            //Flag for begining the creation of ATCMD
int dance_over;

//Sockets
int socket_command;
struct sockaddr_in serv_addr;

int socket_navdata;
struct sockaddr_in serv_addr_navdata;

//Moving data
float tilt,pitch,vspeed,spin;

//pile of instructions
struct uAction pile[4];
int indexof = 0;


navdata_unpacked_t navdata_buffer;

double timer;

/*******************************************************************************
 ***************************** TOOLS *******************************************
 ******************************************************************************/

float convert32BitsToFloat(char bits[32]){
  int i;
  float result = 0;
  for (i = 0; i < 32; i+=4){
    if(bits[i] == '1')
      result += pow(2,i);
    if(bits[i+1] == '1')
      result += pow(2,i + 1);
    if(bits[i+2] == '1')
      result += pow(2,i + 2);
    if(bits[i+3] == '1')
      result += pow(2,i + 3);
  }
  return result;
}

double my_gettimeofday(){
  struct timeval tmp_time;
  gettimeofday(&tmp_time, NULL);
  return (tmp_time.tv_sec + (tmp_time.tv_usec * 1.0e-6L));
}

int setBitToOne(int val, int pos){
  return (val | ( 1 << pos) );
}

int setBitToZero(int val, int pos){
  int mask = setBitToOne(0, pos);
  return (val & ~mask);
}

/*Handle action*/
void pile_sorting(){
  int i=0;
  int j=0;
  char b=0;
  int time1,time2;
  struct uAction tmp;
  for(i = indexof-1; i > 0; i--){
    b = 1;
    for(j = 0; j < i-1; j++){

      if(pile[j+1].type == ACTION_AXIS)
        time1 = pile[j+1].axis.curr_action.time;
      else
        time1 = pile[j+1].rotate.curr_action.time;


      if(pile[j].type == ACTION_AXIS)
        time2 = pile[j].axis.curr_action.time;
      else
        time2 = pile[j].rotate.curr_action.time;

      if(time1 < time2){
        b=0;
        memcpy(&tmp, &pile[j+1], sizeof(pile[j+1]));
        memcpy(&pile[j+1], &pile[j], sizeof(pile[j]));
        memcpy(&pile[j], &tmp, sizeof(tmp));

        if(pile[j+1].type == ACTION_AXIS && pile[j].type == ACTION_AXIS)
          pile[j+1].axis.curr_action.time -= pile[j].axis.curr_action.time;

        else if(pile[j+1].type == ACTION_AXIS && pile[j].type == ACTION_ROTATE)
          pile[j+1].axis.curr_action.time -= pile[j].rotate.curr_action.time;

        else if(pile[j+1].type == ACTION_ROTATE && pile[j].type== ACTION_AXIS)
          pile[j+1].rotate.curr_action.time -= pile[j].axis.curr_action.time;

        else
          pile[j+1].rotate.curr_action.time -= pile[j].rotate.curr_action.time;
      }    
    }
    if(b)
      break;
  }    
}


/*******************************************************************************
 ************************ UPDATE ROTORS ****************************************
 ******************************************************************************/

void pitch_update(){
  float distance, time;

  distance  = (float) pile[g.index_action].axis.distance;
  time      = (float) pile[g.index_action].axis.curr_action.time;
  if(pile[g.index_action].axis.curr_action.func == forward)
    pitch = (distance / time) * -1 / DRONE_SPEED;

  else
    pitch = (distance / time) /DRONE_SPEED;
}

void spin_update(){
  /*************TO DO***************/
  if(pile[g.index_action].rotate.angle<0)
    spin = -0.5 ;
  else
    spin = 0.5;
}

void vspeed_update(){
  float distance, time;

  distance  = (float) pile[g.index_action].axis.distance;
  time      = (float) pile[g.index_action].axis.curr_action.time;

  if(pile[g.index_action].axis.curr_action.func == down)
    tilt = (distance / time) * -1 / DRONE_SPEED;
  else
    tilt = (distance / time) / DRONE_SPEED;
}

void tilt_update(){
  float distance, time;

  distance  = (float) pile[g.index_action].axis.distance;
  time      = (float) pile[g.index_action].axis.curr_action.time;

  if(pile[g.index_action].axis.curr_action.func == left)
    tilt = (distance / time) * -1 / DRONE_SPEED;
  else
    tilt = (distance / time) / DRONE_SPEED;
}


/*******************************************************************************
 ***************************** ATCMD *******************************************
 ******************************************************************************/

char * createAT_PCMD(int flag, float roll, float pitch, float gaz, float yaw){
  char * command = (char*) calloc(64, sizeof(char));

  printf("CREATE PCMD : (%f)%d /(%f)%d /(%f)%d /(%f)%d\n",
      roll, *(int*)&roll,
      pitch, *(int*)&pitch,
      gaz, *(int*)&gaz,
      yaw, *(int*)&yaw);

  pthread_mutex_lock(&seq_mutex);
  if(flag == FLAG_HOVER || flag == FLAG_PROG || flag == FLAG_PROGWITHYAW){
    snprintf(command,
            64 * sizeof(char),
            "AT*PCMD=%d,%d,%d,%d,%d,%d\r",
            seq_control,
	          flag,
	          *(int*) &roll,
	          *(int*) &pitch,
	          *(int*) &gaz,
	          *(int*) &yaw);
  }
  else{
    perror("Creating command AT_PCMD :: Flag not allowed");
  }
  seq_control++;
  pthread_mutex_unlock(&seq_mutex);
  return command;
}

char * createAT_REF(int startBit, int emergency){
  char * command = (char*) calloc(32, sizeof(char));
  int arg = DEF_ATREF; //Default values
  if(startBit == TAKEOFF)
    arg = setBitToOne(arg, 9);
  
  if(emergency == EMERGENCY_CHANGE)
    arg = setBitToOne(arg, 8);

  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            32 * sizeof(char),
            "AT*REF=%d,%d\r",
            seq_control,
            arg);

  seq_control++;
  pthread_mutex_unlock(&seq_mutex);

  return command;
}

char * createAT_FTRIM(){ 
  char * command = (char*) calloc(32, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command, 32 * sizeof(char), "AT*FTRIM=%d\r", seq_control);
  seq_control++;
  pthread_mutex_unlock(&seq_mutex);
  return command;
}

char * createAT_CALIB(int id_device){ 
  char * command = (char*) calloc(32, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            32 * sizeof(char),
            "AT*CALIB=%d,%d\r",
            seq_control,
            id_device);
  
  seq_control++;
  pthread_mutex_unlock(&seq_mutex);
  return command;
}

char * createAT_CONFIG(char * opt_name, char * opt_value){
  char * command = (char*) calloc(256, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            256 * sizeof(char),
            "AT*CONFIG=%d,\"%s\",\"%s\"\r",
            seq_control,
            opt_name,
            opt_value);

  seq_control++;
  pthread_mutex_unlock(&seq_mutex);
  return command;
}

char * createAT_COMWDG(){
  char * command = (char*) calloc(32, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            32 * sizeof(char),
            "AT*COMWDG=%d\r",
            seq_control);

  seq_control++;
  pthread_mutex_unlock(&seq_mutex);
  return command;
}


/*******************************************************************************
 ************************ RUNTIME MOVEMENTS ************************************
 ******************************************************************************/

int takeoff(struct global* g){
  char *cmd, *tmp;

  cmd = createAT_FTRIM();
  tmp = mess_cmd_curr;

  pthread_mutex_lock(&cmd_mutex);
  mess_cmd_curr = cmd;
  pthread_mutex_unlock(&cmd_mutex);

  if(tmp != NULL)
    free(tmp);

  dance_start = 1;
  pthread_cond_broadcast(&cond_cmd_initialized);

  sleep(1);

  printf("Takeoff\n");
  cmd = createAT_REF(TAKEOFF, EMERGENCY_STAY);
  tmp = mess_cmd_curr;

  pthread_mutex_lock(&cmd_mutex);
  mess_cmd_curr = cmd;
  pthread_mutex_unlock(&cmd_mutex);

  if(tmp != NULL)
    free(tmp);

  //Check in control state if it actually takeoff
  /**************** TO DO ******************/
  sleep(1);

  return 0;
}

int land(struct global* g){
  char *cmd, *tmp;
  printf("Land\n");
  cmd = createAT_REF(LAND, EMERGENCY_STAY);
  tmp = mess_cmd_curr;

  pthread_mutex_lock(&cmd_mutex);
  mess_cmd_curr = cmd;
  pthread_mutex_unlock(&cmd_mutex);

  if(tmp != NULL)
    free(tmp);

  //Check in control state if AR DRONE is actually landed
  /******* TO DO ************/
  sleep(1);

  return 0;
}

/*
 * Replace the current AT_PCMD command with the next one with the
 * values of global variables : tilt, pitch, spin, vpseed.
 */
void next_ATPCMD(){
  char * cmd, *tmp;
  int time;

  cmd = createAT_PCMD(FLAG_PROG, tilt, pitch, spin, vspeed);
  tmp = mess_cmd_curr;

  if(pile[g.index_action].type == ACTION_AXIS)
    time = pile[g.index_action].axis.curr_action.time;
  else
    time = pile[g.index_action].rotate.curr_action.time;

  pthread_mutex_lock(&cmd_mutex);
  mess_cmd_curr = cmd;
  pthread_mutex_unlock(&cmd_mutex);

  
  if(tmp != NULL)
    free(tmp);

  sleep(time);
}

int up(struct global* g){
  vspeed_update();
  printf("UP d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);
  next_ATPCMD();
  return 0;
}

int down(struct global* g){
  vspeed_update();
  printf("Down d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);
  next_ATPCMD();
  return 0;
}
int forward(struct global* g){
  pitch_update();
  printf("Forward d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);
  next_ATPCMD();
  return 0;
}

int backward(struct global* g){
  pitch_update();
  printf("Backward d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}

int left(struct global* g){
  tilt_update();
  printf("Left d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}
int right(struct global* g){
  tilt_update();
  printf("Right d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}

int rotate(struct global* g){
  spin_update();
  printf("Rotate a: %d t: %d\n",
          pile[g->index_action].rotate.angle,
          pile[g->index_action].rotate.curr_action.time);

  next_ATPCMD();
  return 0;
}

/*******************************************************************************
 ************************ RUNTIME CONNECTION ***********************************
 ******************************************************************************/

int connectDrone(struct global* g){
  
  //connect to send control
  if((socket_command = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) == -1)
    perror("Error creating socket command");

  memset(&serv_addr, 0, sizeof(serv_addr));
  serv_addr.sin_family = AF_INET;
  serv_addr.sin_port=htons(AT_PORT);
  serv_addr.sin_addr.s_addr = inet_addr(DroneAddress);

  //connect to get navdata
  if((socket_navdata = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) == -1)
    perror("Error creating socket navdata");
  
  memset(&serv_addr_navdata, 0, sizeof(serv_addr_navdata));

  serv_addr_navdata.sin_family = AF_INET;
  serv_addr_navdata.sin_port=htons(NAVDATA_PORT);
  serv_addr_navdata.sin_addr.s_addr = inet_addr(DroneAddress);

  printf("**************** CONNECTION TO DRONE : OK **************\n");
  return 0;
}

int disconnectDrone(struct global* g){
  printf("*************** DRONE DISCONNECTION : OK **************\n");
  return 0;
}

/*
 * Read all actions of the choreography and send it to the drone.
 * Executed by one thread.
 */
void* control_udp(){
  int i=0;
  int j=0;
  int k=0;
  
  int exec = 0;

  //Check if it starts 
  pthread_mutex_lock(&seq_mutex);
  while(!drone_initialized)
    pthread_cond_wait(&cond_drone_initialized, &seq_mutex);
  pthread_mutex_unlock(&seq_mutex);

  takeoff(&g);

  for(j = 0;j <= pe;j++){ 
      if(actions[i].type == ACTION_AXIS)
        exec = actions[i].axis.curr_action.execution_phase;
      else
        exec = actions[i].rotate.curr_action.execution_phase;

      while(i<length && exec == j){
        pile[indexof] = actions[i];
        indexof++;
        i++;

        if(actions[i].type == ACTION_AXIS)
          exec = actions[i].axis.curr_action.execution_phase;
        else
          exec = actions[i].rotate.curr_action.execution_phase;
      }

      pile_sorting();

      for(k = indexof-1; k >= 0; k--){
        g.index_action = k;

        if(pile[k].type == ACTION_AXIS){
          pile[k].axis.curr_action.func(&g);
        }else{
          pile[k].rotate.curr_action.func(&g);
        }
      }

      for(k=indexof-1;k>=0;k--){
        if(pile[k].type== ACTION_AXIS){
          if(pile[k].axis.curr_action.func == forward
              || pile[k].axis.curr_action.func == backward)            
            pitch =0;
          else
            tilt = 0;
        
        }else{
          spin = 0;
        }
      }

      pitch = 0;
      spin  = 0;
      vspeed = 0;
      tilt = 0;
      indexof = 0;
  }
  land(&g);

  dance_over = 1;
  pthread_exit(NULL);
}

/*
 * Function used for checking state of drone by theirs navdata.
 * Used by one thread.
 */
int bootstrap(){
  int count, sended;
  char * cmd = createAT_CONFIG("general:navdata_demo","TRUE");
 
  for(count = 0; count < MSG_PER_SEC; count++){  
  //  printf("%lf :: Send command %s\n\n",my_gettimeofday()-timer,cmd);   
    
    sended = sendto(socket_command,
                    cmd,
                    strlen(cmd) + 1,
                    0,
                    (struct sockaddr*)&serv_addr,
                    sizeof(serv_addr));

    if(sended == -1){
      perror("Error when sending command");
      return -1;
    }
    usleep(30000);
  }

  //Allow the creation of the first action.
  drone_initialized = 1;
  pthread_cond_broadcast(&cond_drone_initialized);

  return 0;
}

/*
 * Routine used to send message to the drone.
 * In one second, it sends the command to be execute by the drone
 * and asks for navdata.
 */ 
void* sender_routine(){
  int sended, count;
  char * prec;

  bootstrap();

  //Wait the initialization of the first command
  pthread_mutex_lock(&cmd_mutex);
  while(dance_start != 1)
    pthread_cond_wait(&cond_cmd_initialized, &cmd_mutex);
  pthread_mutex_unlock(&cmd_mutex);

 
  //Until the dance is not over we still send messages
  while(dance_over != 1){
    //Send 30 times the current command in 0.9sec
    for(count = 0; count < MSG_PER_SEC; count++){
      pthread_mutex_lock(&cmd_mutex);

      if(prec == NULL || prec != mess_cmd_curr){
        printf("%lf :: Send command %s\n\n",
                my_gettimeofday() - timer,
                mess_cmd_curr);
        prec = mess_cmd_curr;
      }

      sended = sendto(socket_command,
                    mess_cmd_curr,
                    strlen(mess_cmd_curr) + 1,
                    0,
                    (struct sockaddr*)&serv_addr,
                    sizeof(serv_addr));

      if(sended == -1){
        perror("Error when sending command") ;
        pthread_exit(NULL);
      }
     
      pthread_mutex_unlock(&cmd_mutex);
      usleep(30000);
    }


    mess_navdata_curr =  createAT_CONFIG("general:navdata_demo","TRUE");
    //Send 30 times the current command in 0.1sec 
    for(count = 0; count < MSG_PER_SEC; count++){
      pthread_mutex_lock(&navdata_mutex);
     //printf("%lf :: Send command %s\n\n",
     //         my_gettimeofday()-timer,
     //         mess_navdata_curr); 

      sended = sendto(socket_command,
                    mess_navdata_curr,
                    strlen(mess_navdata_curr) + 1,
                    0,
                    (struct sockaddr*)&serv_addr,
                    sizeof(serv_addr));

      if(sended == -1){
        perror("Error when sending command");
        pthread_exit(NULL);
      }

      pthread_mutex_unlock(&navdata_mutex);
      usleep(3000);
    }
    free(mess_navdata_curr);
  }
  pthread_exit(NULL);
}


/*void* video_tcp(){
  int count;
  pthread_mutex_lock(&seq_mutex);
  while(!drone_initialized)
    pthread_cond_wait(&cond_drone_initialized, &seq_mutex);
  pthread_mutex_unlock(&seq_mutex);
  
  for(count = 0; count < 6; count ++){
    printf("VIDEO : TEST Concurrent Send\n");
    sending_command(createAT_CONFIG("CAM","test"), 1, serv_addr,socket_command);
    sleep(2);
  }
  pthread_exit(NULL);
}
*/


void choreography(){

  pthread_t t_sender, t_control;//, t_navdata, t_video;


  if(pthread_mutex_init(&cmd_mutex,NULL) !=0)
    perror("Error init mutex cmd_mutex");

  if(pthread_mutex_init(&navdata_mutex,NULL) !=0)
    perror("Error init mutex navdata_mutex");

  if(pthread_mutex_init(&seq_mutex,NULL) != 0)
    perror("Error init mutex seq_mutex");

  if(pthread_cond_init(&cond_drone_initialized, NULL) != 0)
    perror("Error init condition drone_initialized");

  tilt    = 0;
  spin    = 0;
  pitch   = 0;
  vspeed  = 0;

  drone_initialized = 0;
  dance_start = 0;
  dance_over = 0;

  timer = my_gettimeofday();
  //Thread which sends all packet to the drone
  pthread_create(&t_sender, NULL, sender_routine, (void*) NULL);

  //Thread which schedules and replaces the ATPCMD to send
  pthread_create(&t_control, NULL, control_udp, (void*) NULL);
  
  //pthread_create(&t_video, NULL, video_tcp, (void*) NULL);

  pthread_join(t_sender, NULL);
  pthread_join(t_control, NULL);
  //pthread_join(t_video, NULL);

  if(mess_cmd_curr != NULL)
    free(mess_cmd_curr);
}
