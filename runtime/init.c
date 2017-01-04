#include "init.h" 
void Action_filling(){

actions[0].type =1 ;
actions[0].rotate.curr_action.func = &rotate;
actions[0].rotate.angle = 180;
actions[0].rotate.curr_action.time = 2;
actions[0].rotate.curr_action.repeat = 1;
actions[0].rotate.curr_action.execution_phase = 0;
length=1;
pe=1;
}