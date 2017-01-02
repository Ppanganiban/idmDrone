#include "runtime.h"
#include <stdio.h>
#include <arpa/inet.h>
#include <pthread.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <stdint.h>
#define TIMER 2
#define BUFFER_SIZE 512
#define DroneAddress "127.0.0.1"
#define AT_PORT 5556
#define NAVDATA_PORT 5554
#define DRONE_SPEED 5 //m/s
// control_udp
int socket_command;
char * commands[] = {"AT*REF=seq,290718208","AT*REF=seq,29717696","AT_FTRIM=seq","AT*PCMD=seq,0"};
struct sockaddr_in serv_addr;
int seq_control = 0;
// navdata_udp
int socket_navdata;
char * navdata_command[] = {"AT*CONFIG=seq,general:navdata_demo,TRUE\\r","AT*CTRL=seq,0\\r"};
struct sockaddr_in serv_addr_navdata;
int seq_control_navdata = 0;
//moving data
float tilt,pitch,vspeed,spin;


//pile of instructions
struct uAction pile[4];

typedef signed short      int16_t;
typedef unsigned short     uint16_t;

typedef float        float32_t;
typedef double       float64_t;

typedef struct _navdata_demo_t {
  uint16_t    tag;            /*!< Navdata block ('option') identifier */
  uint16_t    size;           /*!< set this to the size of this structure */

  uint32_t    ctrl_state;             /*!< Flying state (landed, flying, hovering, etc.) defined in CTRL_STATES enum. */
  uint32_t    vbat_flying_percentage; /*!< battery voltage filtered (mV) */

  float32_t   theta;                  /*!< UAV's pitch in milli-degrees */
  float32_t   phi;                    /*!< UAV's roll  in milli-degrees */
  float32_t   psi;                    /*!< UAV's yaw   in milli-degrees */

  int32_t     altitude;               /*!< UAV's altitude in centimeters */

  float32_t   vx;                     /*!< UAV's estimated linear velocity */
  float32_t   vy;                     /*!< UAV's estimated linear velocity */
  float32_t   vz;                     /*!< UAV's estimated linear velocity */

  uint32_t    num_frames;       /*!< streamed frame index */ // Not used -> To integrate in video stage.


  uint32_t    detection_tag_index;    /*!<  Deprecated ! Don't use ! */

  uint32_t    detection_camera_type;  /*!<  Type of tag searched in detection */


}navdata_demo_t;
int indexof = 0;
navdata_demo_t navdata_buffer;
pthread_mutex_t navdata_mutex;

void put_seq(char *command){
 // printf("la command %s\n",command);
  char *delim = "seq";
  char *tmp;
  char p1[255]; 
  strcpy(p1,strtok(command,delim));
  char p2[255]; 
  p2[0]='\0';
  if((tmp=strtok(NULL,delim))!=NULL)
    strcpy(p2,tmp);
  

  snprintf(command,512,"%s%d%s",p1,seq_control,p2);
  //(*command)=cmd;
  seq_control++;
}
void sending_commands(char * command){
  int count =0;
  char  command_to_send[BUFFER_SIZE];
  strcpy(command_to_send,command);
  put_seq(command_to_send);

  //while(count < 30){
     if (sendto(socket_command, command_to_send,strlen(command_to_send)+1, 0, (struct sockaddr*)&serv_addr, sizeof(serv_addr))==-1)
        {
              perror("sendto");
        }
    //    count++;
  //}

  //printf("command: %s, count: %d\n",command_to_send,count);
}
int takeoff(struct global* g){
  sending_commands(commands[2]);
  sending_commands(commands[0]);
  return 0;
}
void pitch_update(){
  if(pile[g.index_action].axis.curr_action.func == forward)
    pitch = ((float)pile[g.index_action].axis.distance/actions[g.index_action].axis.curr_action.time)*-1/DRONE_SPEED;
  else
    pitch = ((float)pile[g.index_action].axis.distance/actions[g.index_action].axis.curr_action.time)*1/DRONE_SPEED;

}

int forward(struct global* g){
  char move_command[BUFFER_SIZE];
  pitch_update();
  snprintf(move_command,BUFFER_SIZE,"%s,%f,%f,%f,%f",commands[3],tilt,pitch,vspeed,spin);
  sending_commands(move_command);
  return 0;}

int backward(struct global* g){
  char move_command[BUFFER_SIZE];
  pitch_update();
  snprintf(move_command,BUFFER_SIZE,"%s,%f,%f,%f,%f",commands[3],tilt,pitch,vspeed,spin);
  sending_commands(move_command);
  return 0;}

int left(struct global* g){return 0;}
int right(struct global* g){return 0;}
int rotate(struct global* g){return 0;}
int land(struct global* g){
  sending_commands(commands[1]); 
  return 0;
}
int connectDrone(struct global* g){
  
  //connect to send control
  if((socket_command =  socket(AF_INET,SOCK_DGRAM,IPPROTO_UDP))==-1)
    perror("socket");

  bzero(&serv_addr,sizeof(serv_addr));

  serv_addr.sin_family = AF_INET;
  serv_addr.sin_port=htons(AT_PORT);
  serv_addr.sin_addr.s_addr = inet_addr(DroneAddress);

  //connect to get navdata

  if((socket_navdata =  socket(AF_INET,SOCK_DGRAM,IPPROTO_UDP))==-1)
    perror("socket");

  bzero(&serv_addr_navdata,sizeof(serv_addr_navdata));

  serv_addr_navdata.sin_family = AF_INET;
  serv_addr_navdata.sin_port=htons(NAVDATA_PORT);
  serv_addr_navdata.sin_addr.s_addr = inet_addr(DroneAddress);

   socklen_t t = sizeof((struct sockaddr *)&serv_addr_navdata);
 
   if(bind(socket_navdata,(struct sockaddr *)&serv_addr_navdata,sizeof(serv_addr_navdata))==-1)
        perror("bind");

  return 0;}
 void pile_sorting(){
  int i=0;
  int j=0;
  char b=0;
  int time1,time2;
  struct uAction tmp;
  for(i=indexof-1;i>0;i--){
    b=1;
    for(j=0;j<i-1;j++){

      if(pile[j+1].type==0)
          time1 = pile[j+1].axis.curr_action.time;
      else
        time1 = pile[j+1].rotate.curr_action.time;


      if(pile[j].type==0)
          time2 = pile[j].axis.curr_action.time;
      else
        time2 = pile[j].rotate.curr_action.time;


      if(time1 < time2){
         b=0;
         memcpy(&tmp,&pile[j+1],sizeof(pile[j+1]));
         memcpy(&pile[j+1],&pile[j],sizeof(pile[j]));
         memcpy(&pile[j],&tmp,sizeof(tmp));
         if(pile[j+1].type==0 && pile[j].type==0)
          pile[j+1].axis.curr_action.time-=pile[j].axis.curr_action.time;
        else if(pile[j+1].type==0 && pile[j].type==1)
          pile[j+1].axis.curr_action.time-=pile[j].rotate.curr_action.time;
        else if(pile[j+1].type==1 && pile[j].type==0)
          pile[j+1].rotate.curr_action.time-=pile[j].axis.curr_action.time;
        else
          pile[j+1].rotate.curr_action.time-=pile[j].rotate.curr_action.time;
      }
       
    }
    if(b)
      break;
  }
    
}

    

int disconnectDrone(struct global* g){return 0;}


void* control_udp(){
  int i=0;
  int j=0;
  int k=0;
  int mintime = 0;
  int maxtime = 0;
  
  int exec = 0;
  takeoff(&g);
  
  for(j = 0;j <= pe;j++){
     
      if(actions[i].type==0)
        exec = actions[i].axis.curr_action.execution_phase;
      else
        exec = actions[i].rotate.curr_action.execution_phase;
    while(i<length && exec==j){
     
      pile[indexof]=actions[i];
      indexof++;
      i++;
      if(actions[i].type==0)
        exec = actions[i].axis.curr_action.execution_phase;
      else
        exec = actions[i].rotate.curr_action.execution_phase;
    }
    printf("%d/%d\n",i,length);
    pile_sorting();
    for(k = indexof-1;k >= 0;k--){
       g.index_action = k;
       if(pile[k].type==0){

        pile[k].axis.curr_action.func(&g);
        //printf("ici\n");
      }else{
        pile[k].rotate.curr_action.func(&g);
        //printf("la\n");
      }
    }
    for(k=indexof-1;k>=0;k--){
       if(pile[k].type==0){

        sleep(pile[k].axis.curr_action.time);
        //printf("ici\n");
      }else{
        sleep(pile[k].rotate.curr_action.time);
        //printf("la\n");
      }

    }
    indexof=0;
  }
  land(&g);
}

void* navdata_udp(){
socklen_t t = sizeof((struct sockaddr *)&serv_addr_navdata);
sending_commands(navdata_command[0]);
pthread_mutex_lock(&navdata_mutex);
ssize_t recu = recvfrom (socket_navdata,&navdata_buffer,sizeof(navdata_buffer), 0,(struct sockaddr *)&serv_addr_navdata,&t);
pthread_mutex_unlock(&navdata_mutex);
sending_commands(navdata_command[1]);

 while(1){
         
       
 
        recu = recvfrom (socket_navdata,&navdata_buffer,sizeof(navdata_buffer), 0,(struct sockaddr *)&serv_addr_navdata,&t);
        if(recu == -1)
            perror("erreur recvfrom\n");
        printf("%f\n",navdata_buffer.vx);
    }

}

void* video_tcp(){

}
void choreography(){

  pthread_t t1, t2, t3;
  pthread_mutex_init(&navdata_mutex,NULL);
  pthread_create(&t1,NULL,control_udp,(void*)NULL);
  //pthread_create(&t2,NULL,navdata_udp,(void*)NULL);
 // pthread_create(&t3,NULL,video_tcp,(void*)NULL);


  pthread_join(t1,NULL);
  //pthread_join(t2,NULL);
  //pthread_join(t3,NULL);

}