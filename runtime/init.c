#include "init.h"
void Action_filling(){

actions[0].type =0 ;
actions[0].axis.curr_action.func = &backward;
actions[0].axis.distance = 8;
actions[0].axis.curr_action.time = 5;
actions[0].axis.curr_action.execution_phase = 0;


actions[1].type =0 ;
actions[1].axis.curr_action.func = &forward;
actions[1].axis.distance = 8;
actions[1].axis.curr_action.time = 5;
actions[1].axis.curr_action.execution_phase = 1;


actions[2].type =1 ;
actions[2].rotate.curr_action.func = &rotate;
actions[2].rotate.angle = 90;
actions[2].rotate.curr_action.time = 2;
actions[2].rotate.curr_action.execution_phase = 2;


actions[3].type =0 ;
actions[3].axis.curr_action.func = &left;
actions[3].axis.distance = 6;
actions[3].axis.curr_action.time = 4;
actions[3].axis.curr_action.execution_phase = 3;


actions[4].type =1 ;
actions[4].rotate.curr_action.func = &rotate;
actions[4].rotate.angle = 90;
actions[4].rotate.curr_action.time = 2;
actions[4].rotate.curr_action.execution_phase = 4;


actions[5].type =0 ;
actions[5].axis.curr_action.func = &left;
actions[5].axis.distance = 6;
actions[5].axis.curr_action.time = 4;
actions[5].axis.curr_action.execution_phase = 5;


actions[6].type =0 ;
actions[6].axis.curr_action.func = &right;
actions[6].axis.distance = 8;
actions[6].axis.curr_action.time = 5;
actions[6].axis.curr_action.execution_phase = 6;




length=7;
pe=7;
}