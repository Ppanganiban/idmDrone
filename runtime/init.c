#include "init.h"
void Action_filling(){

actions[0].type =0 ;
actions[0].axis.curr_action.func = &backward;
actions[0].axis.distance = 8;
actions[0].axis.curr_action.time = 5;
actions[0].axis.curr_action.repeat = 1;
actions[0].axis.curr_action.execution_phase = 0;


actions[1].type =0 ;
actions[1].axis.curr_action.func = &forward;
actions[1].axis.distance = 8;
actions[1].axis.curr_action.time = 5;
actions[1].axis.curr_action.repeat = 1;
actions[1].axis.curr_action.execution_phase = 1;


actions[2].type =1 ;
actions[2].rotate.curr_action.func = &rotate;
actions[2].rotate.angle = 90;
actions[2].rotate.curr_action.time = 2;
actions[2].rotate.curr_action.repeat = 1;
actions[2].rotate.curr_action.execution_phase = 2;


actions[3].type =0 ;
actions[3].axis.curr_action.func = &left;
actions[3].axis.distance = 6;
actions[3].axis.curr_action.time = 4;
actions[3].axis.curr_action.repeat = 1;
actions[3].axis.curr_action.execution_phase = 3;




actions[4].type =0 ;
actions[4].axis.curr_action.func = &right;
actions[4].axis.distance = 8;
actions[4].axis.curr_action.time = 5;
actions[4].axis.curr_action.repeat = 1;
actions[4].axis.curr_action.execution_phase = 4;


length=5;
pe=5;
}