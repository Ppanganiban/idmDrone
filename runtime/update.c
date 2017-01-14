#include "runtime.h"

#define DRONE_SPEED 1000 //mm/s
#define DRONE_SPEED_IN_DEG 15 //deg

extern float pitch, spin, tilt, vspeed;
extern struct uAction pile[4];

void spin_update(){
  float ang_curr  = ((float) pile[g.index_action].rotate.angle) * 3.14 / 180;
  int time      = (int) pile[g.index_action].rotate.curr_action.time;
  float ang_speed_curr = ang_curr > 0 ? ang_curr/time : -ang_curr/time;

  if(ang_speed_curr < g.context.angular_speed)
    spin = ang_curr > 0 ? ang_speed_curr/g.context.angular_speed
                          : -ang_speed_curr/g.context.angular_speed;
  else
    spin = ang_curr > 0 ? 1 : -1;
}

void pitch_update(){
  float distance, time, speed_curr, rad_curr;

  distance    = (float) pile[g.index_action].axis.distance;
  time        = (float) pile[g.index_action].axis.curr_action.time;
  speed_curr  = distance / time;
  
  pitch = 1;
  
  if(speed_curr < DRONE_SPEED){
    rad_curr  = speed_curr*DRONE_SPEED_IN_DEG * 3.14 / 180 / DRONE_SPEED;
    pitch     = rad_curr / (DRONE_SPEED_IN_DEG * 3.14 / 180);
  }

  if(pile[g.index_action].axis.curr_action.func == backward)
    pitch = -pitch;
}

void vspeed_update(){
  float distance, time, speed_curr;

  distance    = (float) pile[g.index_action].axis.distance;
  time        = (float) pile[g.index_action].axis.curr_action.time;
  speed_curr  = distance / time;

  vspeed = 1;

  if(speed_curr < g.context.vertical_speed)
    vspeed = speed_curr / g.context.vertical_speed;

  if(pile[g.index_action].axis.curr_action.func == down)
    vspeed = -vspeed;
}

void tilt_update(){
  float distance, time, speed_curr, rad_curr;

  distance    = (float) pile[g.index_action].axis.distance;
  time        = (float) pile[g.index_action].axis.curr_action.time;
  speed_curr  = distance / time;

  tilt = 1;

  if(speed_curr < DRONE_SPEED){
    rad_curr  = speed_curr*DRONE_SPEED_IN_DEG * 3.14 / 180 / DRONE_SPEED;
    tilt      = rad_curr / (DRONE_SPEED_IN_DEG * 3.14 / 180);
  }

  if(pile[g.index_action].axis.curr_action.func == backward)
    tilt  = -tilt;
}
