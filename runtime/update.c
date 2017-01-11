#include "runtime.h"

#define DRONE_SPEED 5 //m/s

extern float pitch, spin, tilt, vspee;
extern struct uAction pile[4];

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
  float ang_curr  = ((float) pile[g.index_action].rotate.angle) * 3.14 / 180;
  int time      = (int) pile[g.index_action].rotate.curr_action.time;
  float ang_speed_curr = ang_curr > 0 ? ang_curr/time : -ang_curr/time;

  if( ang_speed_curr <= g.context.angular_speed )
    spin = ang_curr / time;
  else
    spin = ang_curr > 0 ? 1 : -1;
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
