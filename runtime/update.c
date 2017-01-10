#include "runtime.h"
#define DRONE_SPEED 5 //m/s

extern float pitch, spin, tilt, vspee;
extern struct uAction *pile;

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
