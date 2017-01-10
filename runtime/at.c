#include <stdio.h>
#include <pthread.h>
#include "at.h"
#include <stdlib.h>
#include "tool.h"

extern pthread_mutex_t seq_mutex;
extern int seq_control;


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
  char * command = (char*) calloc(1024, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
        1024 * sizeof(char),
        "AT*CONFIG_IDS=%d,\"%s\",\"%s\",\"%s\"\rAT*CONFIG=%d,\"%s\",\"%s\"\r",
        seq_control,
        SESSION_ID,
        USER_ID,
        APP_ID,
        seq_control + 1,
        opt_name,
        opt_value);

  printf("AT*CONFIG_IDS=%d,\"%s\",\"%s\",\"%s\"\\rAT*CONFIG=%d,\"%s\",\"%s\"\\r\n",
        seq_control,
        SESSION_ID,
        USER_ID,
        APP_ID,
        seq_control + 1,
        opt_name,
        opt_value);

  seq_control += 2;
  pthread_mutex_unlock(&seq_mutex);
  return command;
}

char * createAT_CONFIG_IDS(){
  char * command = (char*) calloc(256, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            256 * sizeof(char),
            "AT*CONFIG_IDS=%d,\"%s\",\"%s\",\"%s\"\r",
            seq_control,
            SESSION_ID,
            USER_ID,
            APP_ID);

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

char * createAT_CTRL(){
  char * command = (char*) calloc(32, sizeof(char));
  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            32 * sizeof(char),
            "AT*CTRL=%d,0\r",
            seq_control);
  seq_control++;
  printf("%s\n",command);
  pthread_mutex_unlock(&seq_mutex);
  return command;
}

char * createAT_LED(int animation_number, float freq, int duration){
  char * command = (char*) calloc(64, sizeof(char));

  pthread_mutex_lock(&seq_mutex);
  snprintf(command,
            64 * sizeof(char),
            "AT*LED=%d,%d,%d,%d\r",
            seq_control,
            animation_number,
            *(int*)&freq,
            duration);
  seq_control++;
  printf("%s\n",command);
  pthread_mutex_unlock(&seq_mutex);
  return command;
}
