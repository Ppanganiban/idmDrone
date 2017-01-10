#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <libxml/tree.h>
#include <libxml/parser.h>
#include <malloc.h>
#include "runtime.h"

int nameAction=0;
int maxLength =0;
int connection =0;
int ip = 0;
int ref = 0;
int direction = 0;
char limit_v_speed=0;
char limit_a_speed=0;
char limit_length=0;
char limit_width=0;
char angle;
int i=0;

xmlDocPtr doc;
xmlNodePtr node;
xmlNode *cur_node = NULL;

void actions_genere(xmlNode * node, FILE * f, int isMerge){
	
	xmlNode * a_node = node;

	while(a_node!=NULL){
	  printf("Node : %s\n",(char*) a_node->name);	

    if(!strcmp("merge",(char*) a_node->name)){
		  printf("**Merge***\n");
		  actions_genere(a_node->children, f, 1);
      printf("**FIN MERGE**\n");
      pe++;
    }

	  //check with
	  if(!strcmp("with",(char*) a_node->name)){
		  /* NOT IMPLEMENTED YET! */
      /* THE TARGET OF A WITH IS THE LAST NODE SAVED */
	  }
	
	  //one Axis action
	  if(!strcmp("right",(char*) a_node->name)
        || !strcmp("left",(char*) a_node->name)
        || !strcmp("backward",(char*) a_node->name)
        || !strcmp("forward",(char*) a_node->name)
        || !strcmp("up",(char*) a_node->name)
        || !strcmp("down",(char*) a_node->name)
        || !strcmp("wait",(char*) a_node->name)
        ){

        fprintf(f,"actions[%d].type =0 ;\n",i);
  		fprintf(f,"actions[%d].axis.curr_action.func = &%s;\n",i,a_node->name);
  		
        if(strcmp("wait",(char*) a_node->name) != 0){
        
            fprintf(f,
                    "actions[%d].axis.distance = %s;\n",
                    i,
                    a_node->children->children->content);
		
            fprintf(f,
                    "actions[%d].axis.curr_action.time = %s;\n",
                    i,
                    a_node->children->next->children->content);

        }
        else{
            fprintf(f,
                    "actions[%d].axis.distance = 0;\n",i);
		
            fprintf(f,
                    "actions[%d].axis.curr_action.time = %s;\n",
                    i,
                    a_node->children->children->content);
        }
        fprintf(f,"actions[%d].axis.curr_action.execution_phase = %d;\n", i, pe);

        if(!isMerge)
			  pe++;

        i++;
	  }
    //Rotation action
    else if(!strcmp("rotate",(char*) a_node->name)){
			fprintf(f,"actions[%d].type =1 ;\n",i);
			fprintf(f,"actions[%d].rotate.curr_action.func = &%s;\n",i,a_node->name);

			fprintf(f,
              "actions[%d].rotate.angle = %s;\n",
              i,
              a_node->children->children->content);

			fprintf(f,
              "actions[%d].rotate.curr_action.time = %s;\n",
              i,
              a_node->children->next->children->content);

			fprintf(f,
          "actions[%d].rotate.curr_action.execution_phase = %d;\n",
          i,
          pe);

			if(!isMerge)
				pe++;

      i++;
    }
    fprintf(f,"\n\n");
    a_node=a_node->next;
	}
}

void context_genere (FILE * f){

	xmlNode * a_node = cur_node;
	cur_node = cur_node ->next;
	a_node =cur_node->children;

    fprintf(f,"/***** CONTEXT OF CHOREOGRAPHY ******/\n");
    fprintf(f,"//Default value\n");
    fprintf(f,"g.context.height = %d;\n",DEF_MAX_ALTITUDE);
	fprintf(f,"g.context.length = %d;\n",DEF_MAX_LENGTH);
	fprintf(f,"g.context.width = %d;\n",DEF_MAX_WIDTH);
	fprintf(f,"g.context.angular_speed = %f;\n", DEF_MAX_YAW);
    fprintf(f,"g.context.vertical_speed = %d;\n",DEF_MAX_VSPEED);
    fprintf(f,"g.context.initial_pos.x = 0;\n");
    fprintf(f,"g.context.initial_pos.y = 0;\n");
    fprintf(f,"g.context.initial_direction = REAR;\n");
    fprintf(f,"//Set value from xml file\n");
	while(a_node){
		    //max height
		    if(!strcmp((char*) a_node->name,"maxHeight"))
                fprintf(f,
                        "g.context.height = %d;\n",
                        atoi((char*)a_node->children->content)*100);

            //maxlength
            else if(!strcmp((char*) a_node->name,"maxLength"))
			    fprintf(f,
                        "g.context.length = %d;\n",
                        atoi((char*)a_node->children->content)*100);

            //maxwidth
		    else if (!strcmp((char*) a_node->name,"maxWidth"))
		    	fprintf(f,
                        "g.context.width = %d;\n",
                        atoi((char*)a_node->children->content)*100);
		
            //maxangularspeed
		    else if (!strcmp((char*) a_node->name,"maxAngularSpeed"))
			    fprintf(f,
                        "g.context.angular_speed = %f;\n",
                        atof((char*)a_node->children->content) * 3.14 / 180);

            //maxverticalspeed
            else if (!strcmp((char*) a_node->name,"maxVerticalSpeed"))
			    fprintf(f,
                        "g.context.vertical_speed = %d;\n",
                        atoi((char*)a_node->children->content) * 100);
        
            //initial x position of the drone
		    else if (!strcmp((char*) a_node->name,"positionX"))
			    fprintf(f,
                        "g.context.initial_pos.x = %s;\n",
                        a_node->children->content);

            //initial y position of the drone
            else if (!strcmp((char*) a_node->name,"positionY"))
			    fprintf(f,
                        "g.context.initial_pos.y = %s;\n",
                        a_node->children->content);

            //initial direction of the drone
            else if (!strcmp((char*) a_node->name,"initialDirection"))
			    fprintf(f,"g.context.initial_direction = %s;\n",a_node->children->content);

        a_node = a_node->next;
	}

	fprintf(f,"\n\n");
}

//WRITE INCLUDES
void include_genere(FILE *f){
	char includes[] = "#include <stdio.h>\n#include <stdlib.h>\n#include <string.h>\n#include <malloc.h>\n#include \"runtime.h\"\n\n";

		fprintf(f,"%s",includes);
}

//WRITE THE STRUCTURES USED IN THE GENERATED CODE
void struct_genere(FILE *f){
	//char  structs[] =;
	//fprintf(f,"%s",structs );

}

//WRITE THE CONFIGURATION REQUIRED FOR THE DRONE
void config_genere(FILE * f){
    
	xmlNode * a_node=cur_node;

  fprintf(f,"/********* CONFIGURATION ***************/\n");
	if(strcmp("config",(char*) cur_node->name)){
    fprintf(stderr, "XML file is wrong !\n");
   	exit(-1);
  }
    	
  //Check connection
	a_node = a_node->children;

	if(strcmp("connection",(char*) a_node->name)){
    fprintf(stderr, "XML file is wrong !\n");
    exit(-1);
	}

  fprintf(f,"cnx.type =  \"%s\";\n",a_node->children->content); 
  a_node = a_node->next;
    	
  //Check Address  	
  if(strcmp("address",(char*) a_node->name)){
    fprintf(stderr, "XML file is wrong !\n");
    exit(-1);
  }
  fprintf(f,"cnx.address = \"%s\";\n\n",a_node->children->content);
}


void main_genere(FILE * f,FILE * actions){

  char monmain []="int main(int argc, char * argv[]){\n\n";

  fprintf(f,"%s",monmain);
  cur_node = node; 
  if(strcmp("model",(char*) cur_node->name)){
    fprintf(stderr, "XML file is wrong !\n");
    exit(-1);
  }

  cur_node = cur_node->children;
  if (cur_node->type == XML_ELEMENT_NODE) {
    printf("children content: %s\n",cur_node->name);
  }
  
	//function for configuration
  config_genere(f);

  //function for context definition
 	context_genere(f);

  //connect to drone

  fprintf(f,"fillActions();\n");

  fprintf(f,"connectDrone(&g);\n");

  fprintf(f,"configureDrone(&g);\n");

  //generate the actions
  actions_genere(cur_node->next,actions,0);

  fprintf(f,"choreography();\n");

  //disconnect from the drone
  fprintf(f,"disconnectDrone(&g);\n");

  char * ret="return 0;\n}";
	fprintf(f,"%s",ret);
}


int main(int argc, char * argv[]){
  if(argc < 2){
    fprintf(stderr,"Bad arguments : main <path model xml>");
    exit(-1);
  }

	doc = xmlReadFile(argv[1],"UTF_8",0);
	node = xmlDocGetRootElement(doc);
  cur_node= node;

  //Open files
	FILE * genere = fopen("genere.c","w");
	FILE * init = fopen("init.c","w");

	//Écriture des includes
  printf("open file ok\n");
  fprintf(init,"#include \"init.h\"\nvoid fillActions(){\n\n");

  include_genere(genere);
  printf("include ok\n");

  //Écriture des structures
  struct_genere(genere);

  printf("structure generer ok\n");

  //Écriture du main
	main_genere(genere,init);

  fprintf(init,"length=%d;\n",i);
	fprintf(init,"pe=%d;\n}",pe);
  printf("main generer ok\n");
  fclose(init);
	fclose(genere);

	return 0;
}














































