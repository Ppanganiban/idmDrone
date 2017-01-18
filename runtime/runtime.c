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
#include "update.h"

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
struct uAction dirt_action;
int index_pile = 0;

//Use for print time spended
double timer;

//Use for reception of navdata
#define NAV_BUFFER_SIZE 4096
unsigned char buffer[NAV_BUFFER_SIZE];
char one = 1;

int comm_ok;

/*******************************************************************************
 ***************************** TOOLS *******************************************
 ******************************************************************************/

int send_msg(int socket, struct sockaddr_in socket_addr, char * msg, int nb){
  int count;
  int sended;
/*  printf("%lf :: Send command %s\n\n",
                my_gettimeofday() - timer,
                msg);
  */
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

/*Handle action*/
void handle_actions(){
  int i = 0;
  int empty_pile = 0;
  int time_pile_tmp[4];
  int t_min;
  char * cmd;

  //Copy time of action inside the "stack"
  for(i = 0; i < 4; i++){
    if(pile[i].type == ACTION_AXIS)
      time_pile_tmp[i] = pile[i].axis.curr_action.time;
    else
      time_pile_tmp[i] = pile[i].rotate.curr_action.time;
  }
   

  while(!empty_pile){
    printf("--------------\n");

    t_min = 9999999;
    empty_pile = 1;
    index_pile = 0;

    //Looking for t_min
    for(i = 0; i < 4; i++){
      if(time_pile_tmp[i] < t_min && time_pile_tmp[i] > 0){
        t_min = time_pile_tmp[i];
        empty_pile = 0;  
      }
    }
   
    if(!empty_pile){    
      for(i = 0; i < 4; i++){
        //Update angles
        if(time_pile_tmp[i] > 0){
          index_pile = i;

          if(pile[i].type == ACTION_AXIS)
            pile[i].axis.curr_action.func(&g);
          else
            pile[i].rotate.curr_action.func(&g);

          time_pile_tmp[i] -= t_min;
        }
      }

      //If it's not a merge the designate function will do the job
      if(flag != FLAG_PROG){
        empty_pile = 1;
        pile[0].axis.curr_action.func(&g);
      }

      //If we have an other movement
      else if(flag == FLAG_PROG){
        //Create the command and send it
        
        int time_tmp = my_gettimeofday();
        printf("t_min = %d\n", t_min); 
        while (my_gettimeofday() - time_tmp < t_min){
        
          cmd = createAT_PCMD(flag, tilt, pitch, vspeed, spin);
          send_msg(socket_command, serv_addr, cmd, 1); 
          free(cmd);
          usleep(33000);
        }
       
/*
         //Stop inertie
        if(tilt > 0)
          tilt = -tilt;
        if(pitch > 0)
          pitch = -pitch;
        if(vspeed > 0)
          vspeed = -vspeed;
        if(spin > 0)
          spin = -spin;

        cmd = createAT_PCMD(flag, tilt, pitch, vspeed, spin);
        send_msg(socket_command, serv_addr, cmd, 1); 
        free(cmd);
        usleep(500000);

         //Stop inertie
        cmd = createAT_PCMD(FLAG_HOVER, 0, 0, 0, 0);
        send_msg(socket_command, serv_addr, cmd, 1); 
        free(cmd);
        usleep(500000);
*/  
      }
    
    }

    tilt = 0;
    pitch = 0;
    vspeed = 0;
    spin = 0;
  }
}


int send_dirty(int socket, struct sockaddr_in socket_addr, int nb){
  int count;
  int sended;
  //printf("%lf :: Send DIRTY COMMAND\n\n",
                //my_gettimeofday() - timer);
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
 ************************ RUNTIME MOVEMENTS ************************************
 ******************************************************************************/

int takeoff(struct global* g){
  char *cmd;

  flag = FLAG_OTHER;
  dance_start = 1;
  pthread_cond_broadcast(&cond_cmd_initialized);

  printf("Takeoff / curr emergency mode : %d\n",(int)g->curr_state.emergency);
  //Check in control state if it actually takeoff
  /**************** TO DO ******************/
  //TESTER SANS 

  printf("TAKING OFF\n");

  while(g->curr_state.hovering_mode == 0 || g->curr_position.z < 700){

   if(g->curr_state.emergency == EMERGENCY)
      cmd = createAT_REF(TAKEOFF, EMERGENCY_CHANGE);
    else
      cmd = createAT_REF(TAKEOFF, EMERGENCY_STAY);

    send_msg(socket_command, serv_addr, cmd, 1);
    free(cmd);

    usleep(33000);
    
    cmd = createAT_PCMD(FLAG_HOVER, 0, 0, 0, 0);
    send_msg(socket_command, serv_addr, cmd, 1);
    free(cmd);

    usleep(33000);
  }


  printf("Hovering mode : %d / landing : %d\n",
          g->curr_state.hovering_mode,
          g->curr_state.landing);
 
  pre_move = -1;

  return 0;
}

int land(struct global* g){
  char *cmd, *tmp;

  flag = FLAG_OTHER;
  printf("Land\n");
  cmd = createAT_PCMD(FLAG_HOVER, 0, 0, 0, 0);
  send_msg(socket_command, serv_addr, cmd, 1);
  free(cmd);
  sleep(1);

  pre_move = -1;

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
    usleep(330000);
  }
  return 0;
}

int up(struct global* g){
  vspeed_update();
  flag = FLAG_PROG;
  printf("UP d: %d t: %d\n",
          pile[g->index_action + index_pile ].axis.distance,
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}

int down(struct global* g){
  vspeed_update();
  flag = FLAG_PROG;
  printf("Down d: %d t: %d\n",
          pile[g->index_action + index_pile].axis.distance,
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}
int forward(struct global* g){
  pitch_update();
  flag = FLAG_PROG;
  printf("Forward d: %d t: %d\n",
          pile[g->index_action + index_pile].axis.distance,
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}

int backward(struct global* g){
  pitch_update();
  flag = FLAG_PROG;
  printf("Backward d: %d t: %d\n",
          pile[g->index_action + index_pile].axis.distance,
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}

int left(struct global* g){
  tilt_update();
  flag = FLAG_PROG;
  printf("Left d: %d t: %d\n",
          pile[g->index_action + index_pile].axis.distance,
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}
int right(struct global* g){
  tilt_update();
  flag = FLAG_PROG;
  printf("Right d: %d t: %d\n",
          pile[g->index_action + index_pile].axis.distance,
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}

int rotate(struct global* g){
  spin_update();
  flag = FLAG_PROG;
  printf("Rotate a: %d t: %d\n",
          pile[g->index_action + index_pile].rotate.angle,
          pile[g->index_action + index_pile].rotate.curr_action.time);
  return 0;
}

int wait(struct global* g){
  flag = FLAG_HOVER;
  printf(" Wait t: %d\n",
          pile[g->index_action + index_pile].axis.curr_action.time);
  return 0;
}

int flip(struct global*g){
  char tmp[20], *cmd;
  flag = FLAG_OTHER;

  printf("FLIP %d\n", ARDRONE_ANIM_FLIP_RIGHT);
  snprintf(tmp, 20 * sizeof(char),"%d,2000", ARDRONE_ANIM_FLIP_RIGHT);
  cmd = createAT_CONFIG("control:flight_anim",tmp);
  send_msg(socket_command, serv_addr, cmd, 1);
  free(cmd);
  sleep(2);
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
  
  socklen_t t = sizeof((struct sockaddr *)&serv_addr_navdata);
  navdata_t* packet;
  //navdata_option_t* nav_option;
  
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

  //Initiate navdata_demo
  printf("Send DIRTY PACKET\n");
  send_dirty(socket_navdata, serv_addr_navdata, 1);
  sleep(1);

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
  
  //EXIT BOOTSTRAP  
  cmd = createAT_CONFIG("general:navdata_demo","TRUE");
  send_msg(socket_command, serv_addr, cmd, 1);
  free(cmd);

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
    //printf("COMMAND_MASK : %d\n", packet->ardrone_state & ARDRONE_COMMAND_MASK);
    if(packet->ardrone_state & ARDRONE_COMMAND_MASK)
      wait_command = 0;

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
  
  printf("ALTITUDE MAX\n");
  var = (char*) calloc(20,sizeof(char));
  snprintf(var, 20 * sizeof(char),"%d", state_g->context.height);
  cmd = createAT_CONFIG("control:altitude_max",var);   
  send_msg(socket_command, serv_addr, cmd,1);
  free(cmd);
  free(var);

  printf("ANGULAR SPEED MAX\n");
  var = (char*) calloc(20,sizeof(char));
  snprintf(var, 20 * sizeof(char),"%f", state_g->context.angular_speed);
  cmd = createAT_CONFIG("control:control_yaw",var);
  send_msg(socket_command, serv_addr, cmd,1);
  free(var);
  free(cmd);

  printf("VERTICAL SPEED MAX\n");
  var = (char*) calloc(20,sizeof(char));
  snprintf(var, 20 * sizeof(char),"%f", state_g->context.vertical_speed);
  cmd = createAT_CONFIG("control:control_vzmax",var);
  send_msg(socket_command, serv_addr, cmd,1);
  free(var);
  free(cmd);

  printf("EULER MAX\n");
  var = (char*) calloc(20,sizeof(char));
  snprintf(var, 20 * sizeof(char),"%f", DRONE_SPEED_IN_DEG * 3.14 /180);
  cmd = createAT_CONFIG("control:control_euler_angle_max",var);
  send_msg(socket_command, serv_addr, cmd,1);
  free(var);
  free(cmd);


  printf("OUTDOOR\n");
  if(state_g->context.indoor)
    cmd = createAT_CONFIG("control:outdoor","FALSE");
  else
    cmd = createAT_CONFIG("control:outdoor","TRUE");

  send_msg(socket_command, serv_addr, cmd,1);
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
  int idx_action=0;
  int phase=0;
  char start = 'a';
  int exec = 0;
  int idx_pile = 0;

  //Check if it starts 
  pthread_mutex_lock(&seq_mutex);
  while(!drone_initialized)
    pthread_cond_wait(&cond_drone_initialized, &seq_mutex);
  pthread_mutex_unlock(&seq_mutex);

  takeoff(&g);

  printf("**** PRESS <ENTER> FOR STARTING THE CHOREOGRAPHY ****");
  while(start != '\n')
    scanf("%c",&start);
  printf("************ START **************\n");

  idx_action = 0;

  //For each execution phase
  for(phase = 0; phase < pe && comm_ok; phase++ ){ 

     printf("Phase : %d\n",phase);

    //get the current execution phase
    if(actions[idx_action].type == ACTION_AXIS)
      exec = actions[idx_action].axis.curr_action.execution_phase;
    else
      exec = actions[idx_action].rotate.curr_action.execution_phase;

    idx_pile = 0;
    //We fill our stack of action (merge)
    while(idx_pile < 4 && exec == phase){
      pile[idx_pile] = actions[idx_action + idx_pile];

      idx_pile++;
      if(actions[idx_action + idx_pile].type == ACTION_AXIS)
        exec = actions[idx_action + idx_pile].axis.curr_action.execution_phase;
      else
        exec = actions[idx_action + idx_pile].rotate.curr_action.execution_phase;
    }

    int blank = 0;
    for(blank = idx_pile; blank < 4; blank++){
      pile[blank] = dirt_action;
    }

    //Compute and send our action (deplacement or merge)
    handle_actions();
    idx_action += idx_pile;
    printf("***************************\n");
  }
  land(&g);

  dance_over = 1;
  printf("END CONTROL\n");
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
    send_dirty(socket_navdata, serv_addr_navdata,1);
    
    //RECV NAVDATA
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

    if(g.curr_state.emergency){
      printf("EMERGENCY MODE\n");
      cmd = createAT_REF(LAND,EMERGENCY_CHANGE);
      send_msg(socket_command, serv_addr, cmd, 1);
      free(cmd);
    }
   

    if(packet->ardrone_state & ARDRONE_COM_LOST_MASK){
      printf("COMMUNICATION LOST !!!!\n!");
      comm_ok = 0; 
    }
   

    nav_option = (navdata_option_t*) &(packet->options[0]);
    int full = 0;
    while (!full && nav_option->size >0){ 
      switch(nav_option->tag){
        //NAVDATA_DEMO
        case 0:
          nav_demo = (navdata_demo_t*)nav_option;
          g.curr_state.battery_life = nav_demo->vbat_flying_percentage;
          control_state = nav_demo->ctrl_state >> 16;

          if(g.curr_state.battery_life < 10)
            printf("BATTERY : %d\n",g.curr_state.battery_life);

          g.curr_position.z = nav_demo->altitude;

          switch(control_state){
            case CTRL_LANDED:
              //printf("LANDED\n");
              g.curr_state.hovering_mode = 0;
              g.curr_state.landing = 1;
              break;
            case CTRL_HOVERING :
              //printf("HOVERING\n");
              g.curr_state.hovering_mode = 1;
              g.curr_state.landing = 0;
              break;
            default:
              //printf("\n");
              g.curr_state.hovering_mode = 0;
              g.curr_state.landing = 0;
              break;
          }
          
          //Allow the creation of the first action.
          if(!g.curr_state.emergency){
            drone_initialized = 1;
            pthread_cond_broadcast(&cond_drone_initialized);
            first_navdata = 1;
          }
          full=1;
          break;

        //CHECKSUM
        case 0xFFFF:
          full = 1;
          break;

        default:
          break;
      }
      nav_option = (navdata_option_t*)((uint32_t*)nav_option+nav_option->size);
    }
    
    usleep(5000);
  }
  printf("END LISTENER\n");
  pthread_exit(NULL);
}

void choreography(){

  //pthread_t t_sender;
  pthread_t t_control;
  pthread_t t_navdata;
  //pthread_t t_video;

 
  dirt_action.axis.curr_action.func = NULL;
  dirt_action.axis.curr_action.time = 0;
  dirt_action.axis.curr_action.execution_phase = -1;
  dirt_action.type = 1;
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
  comm_ok = 1;

  g.curr_state.hovering_mode = 0;
  g.curr_state.landing = 1;

  timer = my_gettimeofday();

  //Thread which schedules and replaces the ATPCMD to send
  pthread_create(&t_control, NULL, control_udp, (void*) NULL);

  //Thread which listen for navdata 
  pthread_create(&t_navdata, NULL, listen_navdata, (void*) NULL);

  pthread_join(t_control, NULL);
  pthread_join(t_navdata, NULL);

  if(mess_cmd_curr != NULL)
    free(mess_cmd_curr);
}
