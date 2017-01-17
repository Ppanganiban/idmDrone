#include "runtime.h"
#include "update.h"

extern float pitch, spin, tilt, vspeed;
extern struct uAction pile[4];
extern int index_pile;

void spin_update(){
  float ang_curr  = ((float) pile[g.index_action + index_pile].rotate.angle)
                      * 3.14 / 180;
  int time = (int) pile[g.index_action + index_pile].rotate.curr_action.time;
  float ang_speed_curr = ang_curr > 0 ? ang_curr/time : -ang_curr/time;

  if(ang_speed_curr < g.context.angular_speed)
    spin = ang_curr > 0 ? ang_speed_curr/g.context.angular_speed
                          : -ang_speed_curr/g.context.angular_speed;
  else
    spin = ang_curr > 0 ? 1 : -1;
}

void pitch_update(){
  float distance, time, speed_curr, rad_curr;

  distance    = (float) pile[g.index_action + index_pile].axis.distance;
  time        = (float) pile[g.index_action + index_pile].axis.curr_action.time;
  speed_curr  = distance / time;
  
  pitch = 1;

  if(speed_curr < DRONE_SPEED){
    rad_curr  = speed_curr*DRONE_SPEED_IN_DEG * 3.1415 / 180 / DRONE_SPEED;
    pitch     = rad_curr / (DRONE_SPEED_IN_DEG * 3.1415 / 180);
  }

  if(pile[g.index_action + index_pile].axis.curr_action.func == forward)
    pitch = -pitch;

  /*if(pile[g.index_action].axis.curr_action.func == forward
      && pre_move == BACKWARD)
    pitch /= EQUILIBRE;
  else if(pile[g.index_action].axis.curr_action.func == backward
      && pre_move == FORWARD)
    pitch /= EQUILIBRE;
*/
}

void vspeed_update(){
  float distance, time, speed_curr;

  distance    = (float) pile[g.index_action + index_pile].axis.distance;
  time        = (float) pile[g.index_action + index_pile].axis.curr_action.time;
  speed_curr  = distance / time;

  vspeed = 1;

  if(speed_curr < g.context.vertical_speed)
    vspeed = speed_curr / g.context.vertical_speed;

  if(pile[g.index_action].axis.curr_action.func == down)
    vspeed = -vspeed;
}

void tilt_update(){
  float distance, time, speed_curr, rad_curr;

  distance    = (float) pile[g.index_action + index_pile].axis.distance;
  time        = (float) pile[g.index_action + index_pile].axis.curr_action.time;
  speed_curr  = distance / time;

  tilt = 1;

  if(speed_curr < DRONE_SPEED){
    rad_curr  = speed_curr*DRONE_SPEED_IN_DEG * 3.1415 / 180 / DRONE_SPEED;
    tilt      = rad_curr / (DRONE_SPEED_IN_DEG * 3.1415 / 180);
  }

  if(pile[g.index_action + index_pile].axis.curr_action.func == left)
    tilt  = -tilt;

  /*if(pile[g.index_action].axis.curr_action.func == left
      && pre_move == RIGHT)
    tilt /= EQUILIBRE;

  else if(pile[g.index_action].axis.curr_action.func == right
      && pre_move == LEFT)
    tilt /= EQUILIBRE;
*/

}
