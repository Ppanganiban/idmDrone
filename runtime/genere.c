#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include "init.h"

int main(int argc, char * argv[]){
/********* CONFIGURATION ***************/
cnx.type =  "WI-FI";
cnx.address = "192.168.1.1";

/***** CONTEXT OF CHOREOGRAPHY ******/
g.context.length = 30;
g.context.height = 30;
g.context.width = 30;
g.context.initial_pos.x = 10;
g.context.initial_direction = BEHIND;
g.context.initial_pos.y = 10;


Action_filling();
connectDrone(&g);
choreography();
disconnectDrone(&g);
return 0;
}