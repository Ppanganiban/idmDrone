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

void actions_genere(xmlNode * node,FILE * f){
	
	xmlNode * a_node = node;
	if(!strcmp("action",a_node->name))
		a_node = a_node->children;
	int repeat =0;
	struct option opt;


	if(!strcmp("repeat",a_node->name)){
		repeat = atoi(a_node->children->content);
		a_node = a_node -> next;
	}
	

	if(!strcmp("with",a_node->name)){
		/*option.name = malloc(sizeof(char)*strlen(a_node->children->name));

		strcpy(option.name,a_node->children->name);
		xmlNode tmp * =a_node->children;
		int j=0;
		while(tmp){
	a_node = a_node->next;
		}*/
			a_node = a_node -> next;

	}
	xmlNode * tmp=NULL;
	if(!strcmp("action",a_node->name)){
	
		actions_genere(a_node,f);

	}
	printf("%s",a_node->name);
	
	if(!strcmp("right",a_node->name) || !strcmp("left",a_node->name) || !strcmp("backward",a_node->name) || !strcmp("forward",a_node->name)){
		fprintf(f,"oaAction.curr_action.name = %s\n",a_node->name);
		fprintf(f,"oaAction.distance = %s\n",a_node->children->children->content);
		fprintf(f,"oaAction.curr_action.time = %s\n",a_node->children->next->children->content);
		fprintf(f,"oaAction.curr_action.repeat = %d\n",repeat);


		}else if(!strcmp("rotate",a_node->name)){
			fprintf(f,"orAction.curr_action.name = %s\n",a_node->name);
			printf("naaame: %s\n",a_node->children->name);
			fprintf(f,"orAction.angle = %s\n",a_node->children->children->content);
			fprintf(f,"orAction.curr_action.time = %s\n",a_node->children->next->children->content);
			fprintf(f,"orAction.curr_action.repeat = %d\n",repeat);
		}

	if(node->next)
		actions_genere(node->next,f);

}
void context_genere (FILE * f){
	//cur_node = a_node;
	//xmlNode * tmp_node;
	xmlNode * a_node = cur_node;
	cur_node = cur_node ->next;
	a_node =cur_node->children;
	//tmp_node = cur_node;
	while(a_node){
			printf("cur_node: %s\n",a_node->name);

		if(!strcmp(a_node->name,"maxHeight")){
			fprintf(f,"g.limit.height = %s\n",a_node->children->content);

		}else if(!strcmp(a_node->name,"maxLength")){
			fprintf(f,"g.limit.length = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"maxWidth")){
			fprintf(f,"g.limit.width = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"maxAngularSpeed")){
			fprintf(f,"g.limit.angular_speed = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"maxVerticalSpeed")){
			fprintf(f,"g.limit.vertical_speed = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"maxVerticalSpeed")){
			fprintf(f,"g.limit.vertical_speed = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"positionX")){
			fprintf(f,"g.limit.initial_pos.x = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"positionY")){
			fprintf(f,"g.limit.initial_pos.y = %s\n",a_node->children->content);

		}else if (!strcmp(a_node->name,"initialDirection")){
			fprintf(f,"g.limit.initial_direction = %s\n",a_node->children->content);

		}
		a_node = a_node->next;

	}
}

/*static void print_element_names(xmlNode * a_node,int i)
{
	xmlNode *cur_node = NULL;
   	
	char* name;
	int j=0;
	
//tableaux des actions 
union uAction *actions = malloc(100*sizeof(uAction));
    	for (cur_node = a_node; cur_node; cur_node = cur_node->next) {
		//XML_NODE
	

        	if (cur_node->type == XML_ELEMENT_NODE) {
			
			
			printf("%s\n",cur_node->name);
		
			if(!strcmp("action",cur_node->name)){
				nameAction=1;
			}
			if(!strcmp("distance",cur_node->name))
				distance=1;
			if(!strcmp("time",cur_node->name))
				time=1;
			if(!strcmp("connection",cur_node->name))
				connection=1;
			if(!strcmp("ip",cur_node->name))
				ip=1;
			if(!strcmp("maxLength",cur_node->name))
				maxLength=1;
			if(!strcmp("repeat",cur_node->name))
				repeat=1;
			if(!strcmp("reference",cur_node->name))
				ref=1;
			if(!strcmp("initialDirection",cur_node->name))
				direction=1;
			if(!strcmp("angle",cur_node->name))
				angle =1;
			i++; 
			
	  	}else{
			//HAS CONTENT
			if(cur_node->content!=NULL){
				printf("%s\n",cur_node->content);
				if(nameAction==1){

					actions[i].axis.curr_action.name = cur_node->content ;

					nameAction =0;		
				}
				if(distance==1){

					actions[i].axis.distance = atoi(cur_node->content) ;
					distance =0;					
				}
				if(time==1){
					actions[i].axis.curr_action.time =atoi(cur_node->content) ;
					time=0;
				}
				if(repeat==1){
					
					actions[i].axis.curr_action.repeat = atoi(cur_node->content) ;
					repeat=0;
				}
				if(maxLength==1){
					global.context.length = atoi(cur_node->content) ;
					maxLength=0;
				}
				if(direction==1){
					global.curr_state.direction = atoi(cur_node->content) ;
					direction=0;
				}
				if(angle==1){
					actions[i].rotate.angle =atoi(cur_node->content) ;
					angle=0;
				}
			}
		} 
		      
		print_element_names(cur_node->children,i);
		
	}
}*/





void include_genere(FILE *f){
	char includes[] = "#include <stdio.h>\r\n#include <stdlib.h>\r\n#include <string.h>\r\n#include <libxml/tree.h>\r\n#include <libxml/parser.h>\r\n#include <malloc.h>\r\n#include \"runtime.h\"\r\n";
		fprintf(f,"%s",includes);


}

void struct_genere(FILE *f){
	char  structs[] ="struct global g;\r\nstruct oneAxis oaAction;\r\nstruct rotation rAction;\r\n struct connect cnx;\r\n";
	fprintf(f,"%s",structs );

}

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
     //cur_node=cur_node->children;          
             


    fprintf(f,"cnx.type %s\n",a_node->children->content);



    //Check ip

    a_node = a_node->next;

    if(strcmp("address",a_node->name)){
        fprintf(stderr, "XML file is wrong !\n");
        exit(-1);
    }
    //xmlNode* tmp=cur_node;
   



   fprintf(f,"cnx.address = %s\n",a_node->children->content);
}


void main_genere(FILE * f){
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
    
  
	//function pour configuration
    config_genere(f);
    	//function pour définition du context
    context_genere(f);

    fprintf(f,"connectDrone(&g)\n");
    printf("pt: %s\n",cur_node->next->name);
    actions_genere(cur_node->next,f);

	//function pour les actions
    char * ret="return 0\n}";
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
	FILE * genere = fopen("genere.c","a");

	//Écriture des includes
    printf("open file ok\n");
    include_genere(genere);
     printf("include ok\n");
	//Écriture des structures
    	struct_genere(genere);

     printf("structure generer ok\n");
	//Écriture du main
	main_genere(genere);
  	printf("main generer ok\n");
	//print_element_names(cur_node,0);
	fclose(genere);

	return 0;
}














































