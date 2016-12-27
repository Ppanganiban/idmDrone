#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include "init.h"
int main(int argc, char * argv[]){
cnx.type =  "BLUETOOTH";
cnx.address = "2A:20:20:20:20:20";
g.context.length = 30;
g.context.height = 30;
g.context.width = 30;
g.context.initial_pos.x = 10;
g.context.initial_direction = BEHIND;
g.context.initial_pos.y = 10;
Action_filling();printf("type: %d",actions[0].type);
connectDrone(&g);
choreography();
disconnectDrone(&g);
return 0;
}