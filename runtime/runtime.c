#include "runtime.h"
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

int socket_command;
char * commands[] = {"AT*REF=seq,290718208","AT*REF=seq,29717696","AT_FTRIM=seq","AT*PCMD=seq,0"};
struct sockaddr_in serv_addr;
int seq_control = 0;



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

void put_seq(char **command){
 // printf("la command %s\n",command);
  char *delim = "seq";
  char *tmp;
  char p1[255]; 
  strcpy(p1,strtok((*command),delim));
  char p2[255]; 
  p2[0]='\0';
  if((tmp=strtok(NULL,delim))!=NULL)
    strcpy(p2,tmp);
  

  snprintf((*command),512,"%s%d%s",p1,seq_control,p2);
  //(*command)=cmd;
  seq_control++;
}
void sending_commands(char * command){
  int count =0;
  char  command_to_send[BUFFER_SIZE];
  strcpy(command_to_send,command);
  put_seq((char**)&command_to_send);

  while(count < 30){
     if (sendto(socket_command, command_to_send,strlen(command_to_send)+1, 0, (struct sockaddr*)&serv_addr, sizeof(serv_addr))==-1)
        {
              perror("sendto");
        }
        count++;
  }

  //printf("command: %s, count: %d\n",command_to_send,count);
}
int takeoff(struct global* g){
  sending_commands(commands[2]);
  sending_commands(commands[0]);
  return 0;
}
int forward(struct global* g){return 0;}
int backward(struct global* g){return 0;}
int left(struct global* g){return 0;}
int right(struct global* g){return 0;}
int rotate(struct global* g){return 0;}
int land(struct global* g){
  sending_commands(commands[1]); 
  return 0;
}
int connectDrone(struct global* g){
  if((socket_command =  socket(AF_INET,SOCK_DGRAM,IPPROTO_UDP))==-1)
    perror("socket");

  bzero(&serv_addr,sizeof(serv_addr));

  serv_addr.sin_family = AF_INET;
  serv_addr.sin_port=htons(AT_PORT);
  serv_addr.sin_addr.s_addr = inet_addr(DroneAddress);
  return 0;}
int disconnectDrone(struct global* g){return 0;}


void control_udp(union uAction* actions ){
  

  for(){
    
  }
}

void navdata_tcp(){

}

void video_udp(){

}
void choreography(union uAction * actions){

	pthread_t t1, t2, t3;

	pthread_create(&t1,NULL,control_udp,(void*)actions);
	pthread_create(&t2,NULL,navdata_tcp,(void*)NULL);
	pthread_create(&t3,NULL,video_udp,(void*)NULL);


	pthread_join(t1,NULL);
	pthread_join(t2,NULL);
	pthread_join(t3,NULL);

}