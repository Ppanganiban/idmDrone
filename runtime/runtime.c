#include "runtime.h"
#include "at.h"
#include <stdio.h>
#include <arpa/inet.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <sys/time.h>
#include <stdint.h>
#include <math.h>
#include "tool.h"
#include "navdata.h"

#define EMERGENCY 1

/******************** OPTION ***********************/
#define NB_OPTIONS 2

#define CAMERA 0
#define LED 1


//Attributs and values
#define MODE 0
#define ON "ON"
#define OFF "OFF"

#define ID 1

#define COLOR 2
#define RED "RED"
#define GREEN "GREEN"
#define ORANGE "ORANGE"
#define WHITE "WHITE"

#define NAME 0
#define VALUE 1

/**************** NETWORK **************************/
#define TIMER 2
#define BUFFER_SIZE 512
#define DroneAddress "192.168.1.1"
#define AT_PORT 5556
#define NAVDATA_PORT 5554
#define MSG_PER_SEC 30

/*******************************************************************************
 ***************************** VARIABLES ***************************************
 ******************************************************************************/

//Use for message
int seq_control = 1;              //Sequence number for our packets
pthread_mutex_t seq_mutex;

char * mess_cmd_curr = NULL;      //Current movement (send every 0.03sec)
pthread_mutex_t cmd_mutex;
pthread_cond_t cond_cmd_initialized;
int dance_start = 0;

char * mess_navdata_curr = NULL;  //Message for navdata (send every 0.003sec)
pthread_mutex_t navdata_mutex;

pthread_cond_t cond_drone_initialized;
int drone_initialized = 0;            //Flag for begining the creation of ATCMD
int dance_over = 0;

pthread_cond_t cond_first_navdata;
int first_navdata = 0;

//Sockets
int socket_command;
struct sockaddr_in serv_addr;

int socket_navdata;
struct sockaddr_in serv_addr_navdata;

//Moving data
float tilt,pitch,vspeed,spin;
int flag;

//pile of instructions
struct uAction pile[4];
int indexof = 0;

//Use for print time spended
double timer;

//Use for reception of navdata
#define NAV_BUFFER_SIZE 4096
unsigned char buffer[NAV_BUFFER_SIZE];
char one = 1;

/*******************************************************************************
 ***************************** TOOLS *******************************************
 ******************************************************************************/

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

int send_msg(int socket, struct sockaddr_in socket_addr, char * msg, int nb){
  int count;
  int sended;
  printf("%lf :: Send command %s\n\n",
                my_gettimeofday() - timer,
                msg);
  for(count = 0; count < nb; count++){  
    sended = sendto(socket,
                    msg,
                    strlen(msg) + 1,
                    0,
                    (struct sockaddr*)&socket_addr,
                    sizeof(socket_addr));

    if(sended == -1){
      perror("Error when sending command");
      return -1;
    }
  }
  return 0;
}

int send_dirty(int socket, struct sockaddr_in socket_addr, int nb){
  int count;
  int sended;
  printf("%lf :: Send DIRTY COMMAND\n\n",
                my_gettimeofday() - timer);
  for(count = 0; count < nb; count++){  
    sended = sendto(socket,
                    &one,
                    1,
                    0,
                    (struct sockaddr*)&socket_addr,
                    sizeof(socket_addr));

    if(sended == -1){
      perror("Error when sending command");
      return -1;
    }
  }
  return 0;
}
/*******************************************************************************
 ************************ UPDATE ROTORS ****************************************
 ******************************************************************************/

extern void pitch_update();
extern void spin_update();
extern void vspeed_update();
extern void tilt_update();


/*******************************************************************************
 ************************ RUNTIME MOVEMENTS ************************************
 ******************************************************************************/

int takeoff(struct global* g){
  char *cmd;

  dance_start = 1;
  pthread_cond_broadcast(&cond_cmd_initialized);

  printf("Takeoff / curr emergency mode : %d\n",(int)g->curr_state.emergency);
  //Check in control state if it actually takeoff
  /**************** TO DO ******************/
  //TESTER SANS BOUCLE
  while(g->curr_state.hovering_mode == 0){
    printf("TAKING OFF\n");

    if(g->curr_state.emergency == EMERGENCY)
      cmd = createAT_REF(TAKEOFF, EMERGENCY_CHANGE);
    else
      cmd = createAT_REF(TAKEOFF, EMERGENCY_STAY);

    send_msg(socket_command, serv_addr, cmd, 1);
    usleep(33000);
  }

  printf("Hovering mode : %d / landing : %d\n",
          g->curr_state.hovering_mode,
          g->curr_state.landing);
 
  return 0;
}

int land(struct global* g){
  char *cmd, *tmp;
  printf("Land\n");
  if(g->curr_state.emergency == EMERGENCY)
    cmd = createAT_REF(LAND, EMERGENCY_CHANGE);
  else
    cmd = createAT_REF(LAND, EMERGENCY_STAY);
  tmp = mess_cmd_curr;

  pthread_mutex_lock(&cmd_mutex);
  mess_cmd_curr = cmd;
  pthread_mutex_unlock(&cmd_mutex);

  if(tmp != NULL)
    free(tmp);

  //Check in control state if AR DRONE is actually landed
  while(g->curr_state.landing == 0){
    printf("LANDING\n");
    send_msg(socket_command, serv_addr, cmd, 1);
    usleep(33000);
  }
  return 0;
}


/*
 * Replace the current AT_PCMD command with the next one with the
 * values of global variables : tilt, pitch, spin, vpseed.
 */
void next_ATPCMD(){
  char * cmd, *tmp;
  int time;

  cmd = createAT_PCMD(flag, tilt, pitch, spin, vspeed);
  tmp = mess_cmd_curr;

  if(pile[g.index_action].type == ACTION_AXIS)
    time = pile[g.index_action].axis.curr_action.time;
  else
    time = pile[g.index_action].rotate.curr_action.time;

 /* pthread_mutex_lock(&cmd_mutex);
  mess_cmd_curr = cmd;
  pthread_mutex_unlock(&cmd_mutex);
*/
  send_msg(socket_command, serv_addr, cmd, 1);
  if(tmp != NULL)
    free(tmp);

  sleep(time);
}

int up(struct global* g){
  vspeed_update();
  flag = FLAG_PROG;
  printf("UP d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);
  next_ATPCMD();
  return 0;
}

int down(struct global* g){
  vspeed_update();
  flag = FLAG_PROG;
  printf("Down d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);
  next_ATPCMD();
  return 0;
}
int forward(struct global* g){
  pitch_update();
  flag = FLAG_PROG;
  printf("Forward d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);
  next_ATPCMD();
  return 0;
}

int backward(struct global* g){
  pitch_update();
  flag = FLAG_PROG;
  printf("Backward d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}

int left(struct global* g){
  tilt_update();
  flag = FLAG_PROG;
  printf("Left d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}
int right(struct global* g){
  tilt_update();
  flag = FLAG_PROG;
  printf("Right d: %d t: %d\n",
          pile[g->index_action].axis.distance,
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}

int rotate(struct global* g){
  spin_update();
  flag = FLAG_PROG;
  printf("Rotate a: %d t: %d\n",
          pile[g->index_action].rotate.angle,
          pile[g->index_action].rotate.curr_action.time);

  next_ATPCMD();
  return 0;
}

int wait(struct global* g){
  flag = FLAG_HOVER;
  printf(" Wait t: %d\n",
          pile[g->index_action].axis.curr_action.time);

  next_ATPCMD();
  return 0;
}

/*******************************************************************************
 ************************ RUNTIME CONNECTION ***********************************
 ******************************************************************************/

int connectDrone(struct global* glob){
  //Notify the ardrone to send navdata
  char * cmd;
  int recu;
  int wait_command = 1;
  int bootstrap = 0;
  navdata_t* packet;

  printf("**************** CONNECTION TO DRONE  **************\n");

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


  printf("Send DIRTY PACKET\n");
  send_dirty(socket_navdata, serv_addr_navdata, 1);

  socklen_t t = sizeof((struct sockaddr *)&serv_addr_navdata);
  //Check boot strap
  recu = recvfrom(socket_navdata,
                      buffer,
                      sizeof(unsigned char)*NAV_BUFFER_SIZE,
                      0,
                      (struct sockaddr *)&serv_addr_navdata,
                      &t);
  if( recu == -1)
      perror("Erreur during reception of navdata\n");

  packet =(navdata_t*) &buffer;
  printf("BOOT STRAP : %d\n", packet->ardrone_state & ARDRONE_NAVDATA_BOOTSTRAP);
  if(packet->ardrone_state & ARDRONE_NAVDATA_BOOTSTRAP)
      bootstrap = 1;
 
  //EXIT BOOTSTRAP
  if(bootstrap){
    printf("BOOTRSTRAP\n");
    //Initiate navdata_demo
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    cmd = createAT_CONFIG("general:navdata_demo","TRUE");
    send_msg(socket_command, serv_addr, cmd, 1);
    free(cmd);
    usleep(100000);
    
    while(wait_command){
      recu = recvfrom(socket_navdata,
                      buffer,
                      sizeof(unsigned char)*NAV_BUFFER_SIZE,
                      0,
                      (struct sockaddr *)&serv_addr_navdata,
                      &t);
      if( recu == -1)
        perror("Erreur during reception of navdata\n");

     packet =(navdata_t*) &buffer;
     printf("COMMAND_MASK : %d\n", packet->ardrone_state & ARDRONE_COMMAND_MASK);
     if(packet->ardrone_state & ARDRONE_COMMAND_MASK)
        wait_command = 0;
    }

    
    //Send ACK
    cmd = createAT_CTRL();
    send_msg(socket_command, serv_addr, cmd, 1);
    free(cmd);
    printf("END BOOTSTRAP\n");
  }
  
  int comm_watchdog = packet->ardrone_state & ARDRONE_COM_WATCHDOG_MASK;
  if(comm_watchdog){
    cmd = createAT_COMWDG();
    send_msg(socket_navdata, serv_addr_navdata, cmd, 1);
    free(cmd);
  }

  //Send AT*CONFIGS
  configureDrone(glob);

  //Send FTRIM
  cmd = createAT_FTRIM();
  send_msg(socket_command, serv_addr, cmd, 1);
  free(cmd);

  return 0;
}

int disconnectDrone(struct global* g){
  printf("*************** DRONE DISCONNECTION : OK **************\n");
  close(socket_command);
  close(socket_navdata);
  pthread_cond_destroy(&cond_drone_initialized);
  return 0;
}


int configureDrone(struct global *state_g){
    char * cmd, *var;

    printf("*********** CONFIGURE DRONE ************\n");
    printf("SESSION ID\n");
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    cmd = createAT_CONFIG("custom:session_id",SESSION_ID);
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);

    printf("APP ID\n");
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    cmd = createAT_CONFIG("custom:application_id",APP_ID);
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);

    printf("USER ID\n");
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    cmd = createAT_CONFIG("custom:profile_id",USER_ID);
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);


    printf("ALTITUDE MAX\n");
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    var = (char*) calloc(20,sizeof(char));
    snprintf(var, 20 * sizeof(char),"%d", state_g->context.height);
    cmd = createAT_CONFIG("control:altitude_max",var);   
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    free(var);

    printf("ANGULAR SPEED MAX\n");
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    var = (char*) calloc(20,sizeof(char));
    snprintf(var, 20 * sizeof(char),"%f", state_g->context.angular_speed);
    cmd = createAT_CONFIG("control:control_yaw",var);
    send_msg(socket_command, serv_addr, cmd,1);
    free(var);
    free(cmd);

    printf("VERTICAL SPEED MAX\n");
    cmd = createAT_CONFIG_IDS();
    send_msg(socket_command, serv_addr, cmd,1);
    free(cmd);
    var = (char*) calloc(20,sizeof(char));
    snprintf(var, 20 * sizeof(char),"%f", state_g->context.vertical_speed);
    cmd = createAT_CONFIG("control:control_vzmax",var);
    send_msg(socket_command, serv_addr, cmd,1);
    free(var);
    free(cmd);
    printf("*************FIN CONFIGURATION***********\n");
    
    return 0;
}

/*******************************************************************************
 ************************ THREADS ROUTINE*** ***********************************
 ******************************************************************************/

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
  printf("END CONTROL\n");
  pthread_exit(NULL);
}


/*
 * Routine used to send message to the drone.
 * In one second, it sends the command to be execute by the drone
 * and asks for navdata.
 */ 
void* sender_routine(){
  int sended, count;
  char * prec;

  //Wait the initialization of the first command
  pthread_mutex_lock(&cmd_mutex);
  while(dance_start != 1)
    pthread_cond_wait(&cond_cmd_initialized, &cmd_mutex);
  pthread_mutex_unlock(&cmd_mutex);

 
  //Until the dance is not over we still send messages
  while(dance_over != 1){
    //Send 30 times the current command in 0.9sec
    for(count = 0; count < 1; count++){
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
      usleep(33000);
    }
  }
  printf("END SENDER\n");
  pthread_exit(NULL);
}

void * listen_navdata(){
  char * cmd;
  ssize_t recu;
  navdata_t * packet;
  navdata_option_t* nav_option;
  navdata_demo_t* nav_demo;  
  uint32_t control_state;
  socklen_t t = sizeof((struct sockaddr *)&serv_addr_navdata);


  while(dance_over != 1){
    //printf("Send DIRTY PACKET\n");
    send_dirty(socket_navdata, serv_addr_navdata,1);
    
    //RECV NAVDATA
    //printf("WAIT MESSAGE\n");
    recu = recvfrom(socket_navdata,
                    buffer,
                    sizeof(unsigned char)*NAV_BUFFER_SIZE,
                    0,
                    (struct sockaddr *)&serv_addr_navdata,
                    &t);
    if( recu == -1)
      perror("Erreur during reception of navdata\n");

    packet =(navdata_t*) &buffer;
    g.curr_state.emergency = packet->ardrone_state & ARDRONE_EMERGENCY_MASK;

    nav_option = (navdata_option_t*) &(packet->options[0]);
    printf("Nav_option size = %d // TAG %d\n",nav_option->size, nav_option->tag);
    int full = 0;
    while (!full && nav_option->size >0){ 
      switch(nav_option->tag){
        //NAVDATA_DEMO
        case 0:
          printf("NAVDATA_DEMO !!!\n"); 
          nav_demo = (navdata_demo_t*)nav_option;
          g.curr_state.battery_life = nav_demo->vbat_flying_percentage;
          control_state = nav_demo->ctrl_state >> 16;
          printf("CONTROL_STATE %d\n",control_state);
          //printf("VX %f\n",nav_demo->vx);
          //printf("ALTITUDE %d\n",nav_demo->altitude);
          switch(control_state){
            case CTRL_LANDED:
              printf("LANDED\n");
              g.curr_state.hovering_mode = 0;
              g.curr_state.landing = 1;
              break;
            case CTRL_HOVERING :
              printf("HOVERING\n");
              g.curr_state.hovering_mode = 1;
              g.curr_state.landing = 0;
              break;
            default:
              printf("\n");
              g.curr_state.hovering_mode = 0;
              g.curr_state.landing = 0;
              break;
          }
          full=1;
          break;

        //CHECKSUM
        case 0xFFFF:
          printf("CHECKSUM\n");
          full = 1;
          break;

        default:
          //printf("OTHER OPTION %d\n",nav_option->tag);
          break;
      }
      nav_option = (navdata_option_t*)((uint32_t*)nav_option+nav_option->size);
    }

    //UPDATE DRONE STATE
    printf("Landing : %d\n",g.curr_state.landing);
    printf("Emergency : %d\n",g.curr_state.emergency);
//    printf("Hovering : %d\n",g.curr_state.hovering_mode);
    printf("-----------------------------\n");

    //Allow the creation of the first action.
    drone_initialized = 1;
    pthread_cond_broadcast(&cond_drone_initialized);
    first_navdata = 1;
    usleep(50000);
  }
  printf("END LISTENER\n");
  pthread_exit(NULL);
}

void choreography(){

  //pthread_t t_sender;
  pthread_t t_control;
  pthread_t t_navdata;
  //pthread_t t_video;


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

  g.curr_state.hovering_mode = 0;
  g.curr_state.landing = 1;

  timer = my_gettimeofday();
  //Thread which sends all packet to the drone
  //pthread_create(&t_sender, NULL, sender_routine, (void*) NULL);

  //Thread which schedules and replaces the ATPCMD to send
  //pthread_create(&t_control, NULL, control_udp, (void*) NULL);
  //pthread_join(t_control, NULL);

  //Thread which listen for navdata 
  pthread_create(&t_navdata, NULL, listen_navdata, (void*) NULL);
  pthread_join(t_navdata, NULL);
 // pthread_join(t_sender, NULL);

 

  if(mess_cmd_curr != NULL)
    free(mess_cmd_curr);
}
