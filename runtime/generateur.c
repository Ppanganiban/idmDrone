#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <libxml/tree.h>
#include <libxml/parser.h>
#include <malloc.h>
#include "runtime.h"

int nameAction=0;
int distance =0;
int time = 0;
int maxLength =0;
int connection =0;
int ip = 0;
int repeat =0;
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
char ismerge=0;


void actions_genere(xmlNode * node,FILE * f){
	
	xmlNode * a_node = node;
	xmlNode * c_node =a_node;
	int repeat =1;
	struct option opt;
	//access the content of an action
	if(!strcmp("action",a_node->name))
		a_node = a_node->children;
	

	while(a_node!=NULL){
		



	if(!strcmp("merge",a_node->name)){
		ismerge=1;
		printf("it's a merge\n");
		actions_genere(a_node->children,f);
	}

	//check repeat
	if(!strcmp("repeat",a_node->name)){
	
		repeat = atoi(a_node->children->content);
		a_node = a_node -> next;

	}
	
	//access the content of an action
	if(!strcmp("action",a_node->name)){
		ismerge=0;
		actions_genere(a_node,f);
		a_node=a_node->next;
		//continue;
		break;
	}

	//check with
	if(!strcmp("with",a_node->name)){
		
		/* NOT IMPLEMENTED YET! */
		
	}
	
	
	//one Axis action
	if(!strcmp("right",a_node->name) || !strcmp("left",a_node->name) || !strcmp("backward",a_node->name) || !strcmp("forward",a_node->name)){
		fprintf(f,"actions[%d].type =0 ;\n",i);
		fprintf(f,"actions[%d].axis.curr_action.func = &%s;\n",i,a_node->name);
		fprintf(f,"actions[%d].axis.distance = %s;\n",i,a_node->children->children->content);
		fprintf(f,"actions[%d].axis.curr_action.time = %s;\n",i,a_node->children->next->children->content);
		fprintf(f,"actions[%d].axis.curr_action.repeat = %d;\n",i,repeat);
		fprintf(f,"actions[%d].axis.curr_action.execution_phase = %d;\n",i,pe);
		if(!ismerge)
			pe++;
		i++;
		

	//rotation action
	}else if(!strcmp("rotate",a_node->name)){
			fprintf(f,"actions[%d].type =1 ;\n",i);
			fprintf(f,"actions[%d].rotate.curr_action.func = &%s;\n",i,a_node->name);
			//printf("naaame: %s\n",a_node->children->name);
			fprintf(f,"actions[%d].rotate.angle = %s;\n",i,a_node->children->children->content);
			fprintf(f,"actions[%d].rotate.curr_action.time = %s;\n",i,a_node->children->next->children->content);
			fprintf(f,"actions[%d].rotate.curr_action.repeat = %d;\n",i,repeat);
			fprintf(f,"actions[%d].rotate.curr_action.execution_phase = %d;\n",i,pe);
			if(!ismerge)
				pe++;
			i++;
		
	//access content of an action
	}else if(!strcmp("action",a_node->name)){
		ismerge=0;
		actions_genere(a_node,f);
		a_node=a_node->next;
		break;
		//continue;
	}
	a_node=a_node->next;
	
	}
	if(node->next)
		actions_genere(node->next,f);

}
void context_genere (FILE * f){

	xmlNode * a_node = cur_node;
	cur_node = cur_node ->next;
	a_node =cur_node->children;

	while(a_node){
		//max height
		if(!strcmp(a_node->name,"maxHeight")){
			fprintf(f,"g.context.height = %s;\n",a_node->children->content);
		//maxlength
		}else if(!strcmp(a_node->name,"maxLength")){
			fprintf(f,"g.context.length = %s;\n",a_node->children->content);
		//maxwidth
		}else if (!strcmp(a_node->name,"maxWidth")){
			fprintf(f,"g.context.width = %s;\n",a_node->children->content);
		//maxangularspeed
		}else if (!strcmp(a_node->name,"maxAngularSpeed")){
			fprintf(f,"g.context.angular_speed = %s;\n",a_node->children->content);
		//maxverticalspeed
		}else if (!strcmp(a_node->name,"maxVerticalSpeed")){
			fprintf(f,"g.context.vertical_speed = %s;\n",a_node->children->content);
		//initial x position of the drone
		}else if (!strcmp(a_node->name,"positionX")){
			fprintf(f,"g.context.initial_pos.x = %s;\n",a_node->children->content);
		//initial y position of the drone
		}else if (!strcmp(a_node->name,"positionY")){
			fprintf(f,"g.context.initial_pos.y = %s;\n",a_node->children->content);
		//initial direction of the drone
		}else if (!strcmp(a_node->name,"initialDirection")){
			fprintf(f,"g.context.initial_direction = %s;\n",a_node->children->content);

		}
		a_node = a_node->next;

	}
}

//WRITE INCLUDES
void include_genere(FILE *f){
	char includes[] = "#include <stdio.h>\r\n#include <stdlib.h>\r\n#include <string.h>\r\n#include <malloc.h>\r\n#include \"init.h\"\r\n";
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

	if(strcmp("config",cur_node->name)){
        	fprintf(stderr, "XML file is wrong !\n");
        	exit(-1);
   	}
    	
    	//Check connection

	a_node = a_node->children;

	if(strcmp("connection",a_node->name)){
        	fprintf(stderr, "XML file is wrong !\n");
        	exit(-1);
    	}
    	fprintf(f,"cnx.type =  \"%s\";\n",a_node->children->content); 
    	a_node = a_node->next;
    	
    	//Check Address
    	
    	if(strcmp("address",a_node->name)){
        	fprintf(stderr, "XML file is wrong !\n");
        	exit(-1);
    	}
   	fprintf(f,"cnx.address = \"%s\";\n",a_node->children->content);
}


void main_genere(FILE * f,FILE * actions){


    	char monmain []="int main(int argc, char * argv[]){\n";
	fprintf(f,"%s",monmain);
    	cur_node = node; 
    	if(strcmp("model",cur_node->name)){
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
    	fprintf(f,"Action_filling();printf(\"type: %%d\",actions[0].type);\n");
   	fprintf(f,"connectDrone(&g);\n");
    	//generate the actions
    	actions_genere(cur_node->next,actions);
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

    	//Open fichier
	FILE * genere = fopen("genere.c","w");
	FILE * init = fopen("init.c","w");

	//Écriture des includes
   	 printf("open file ok\n");
   	 fprintf(init,"#include \"init.h\" \nvoid Action_filling(){\n\n");

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














































