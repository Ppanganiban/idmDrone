#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include "runtime.h"

int main(int argc, char * argv[]){

/********* CONFIGURATION ***************/
cnx.type =  "WI-FI";
cnx.address = "192.168.1.1";

/***** CONTEXT OF CHOREOGRAPHY ******/
//Default value
g.context.height = 30000;
g.context.length = 1000000;
g.context.width = 1000000;
g.context.angular_speed = 3.140000;
g.context.vertical_speed = 1000;
g.context.initial_pos.x = 0;
g.context.initial_pos.y = 0;
g.context.initial_direction = REAR;
//Set value from xml file
g.context.length = 30000;
g.context.height = 3000;
g.context.width = 30000;
g.context.initial_pos.x = 100;
g.context.initial_direction = BEHIND;
g.context.initial_pos.y = 100;


fillActions();
connectDrone(&g);
choreography();
disconnectDrone(&g);
return 0;
}
