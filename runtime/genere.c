#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include "init.h"
struct connexion cnx;
struct global g;
union uAction actions[512];
int main(int argc, char * argv[]){
cnx.type =  "BLUETOOTH";
cnx.address = "2A:20:20:20:20:20";
g.context.length = 30;
g.context.height = 30;
g.context.width = 30;
g.context.initial_pos.x = 10;
g.context.initial_direction = BEHIND;
g.context.initial_pos.y = 10;
Action_filling(actions);
connectDrone(&g);
disconnectDrone(&g);
return 0;
}