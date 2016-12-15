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
int i=0;

static void
print_element_names(xmlNode * a_node,int i)
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
				if(ip==1){
					global.context.ip = cur_node->content ;
					ip=0;
				}
			}
		} 
		      
		print_element_names(cur_node->children,i);
		
	}
}

xmlDocPtr doc;
xmlNodePtr node;
xmlNode *cur_node = NULL;

void include_genere(FILE *f){
	char includes[] = "#include <stdio.h>\r\n#include <stdlib.h>\r\n#include <string.h>\r\n#include <libxml/tree.h>\r\n#include <libxml/parser.h>\r\n#include <malloc.h>\r\n#include \"runtime.h\"\r\n";
		fprintf(f,"%s",includes);


}

void struct_genere(FILE *f){
	char  structs[] ="struct global * g;\r\nstruct oneAxis oaAction;\r\nstruct rotation rAction;\r\n struct connect cnx;\r\n";
	fprintf(f,"%s",structs );

}

void config_genere(FILE * f){
    


	if(strcmp("config",cur_node->name)){
        fprintf(stderr, "XML file is wrong !\n");
        exit(-1);
    }
    //Check connection
    cur_node = cur_node->children;

	if(strcmp("connection",cur_node->name)){
        fprintf(stderr, "XML file is wrong !\n");
        exit(-1);
    }
     //cur_node=cur_node->children;          
             


    fprintf(f,"cnx.type %s\n",cur_node->children->content);



    //Check ip

    cur_node = cur_node->next;

    if(strcmp("ip",cur_node->name)){
        fprintf(stderr, "XML file is wrong !\n");
        exit(-1);
    }
    //xmlNode* tmp=cur_node;
   



   fprintf(f,"cnx.ip = %s\n",cur_node->children->content);
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
 
	//function pour les actions
    char * ret="return 0\n}";
	fprintf(f,"%s",ret);
}



void actions_genere(FILE * f){

}

int main(int argc, char * argv[]){

	doc = xmlReadFile("./model.xml","UTF_8",0);
	node = xmlDocGetRootElement(doc);
    cur_node= node;
	//Open fichier
	FILE * genere = fopen("./genere.c","a");

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
	print_element_names(node,0);
	
	fclose(genere);

	return 0;
}














































