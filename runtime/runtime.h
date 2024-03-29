#define DEF_MAX_ALTITUDE 30000 //mm
#define DEF_MAX_LENGTH 1000000 //mm
#define DEF_MAX_WIDTH 1000000 //mm
#define DEF_MAX_YAW 4.0 //MUST BE convert in RADIAN/SEC in config drone
#define DEF_MAX_VSPEED 1000 //MUST BE between 200 to 2000 mm/s

#define BEHIND 1
#define REAR 2
#define RIGHTWARD 3
#define LEFTWARD 4

#define ACTION_ROTATE 1
#define ACTION_AXIS 0

struct attribute{
	char  name[255];
	char  value[255];	
};
struct option{
	char * name;
	struct attribute * att;
};


//state of the drone
struct state {
	char hovering_mode;
	int battery_life;
	char emergency;
	char landing;
	int direction;
}state;

//position of the drone in the context
struct position {
	int x;
	int y;
	int z;
}position;

//speed of the drone
struct speed {
	
	float vx;
	float vy;
	float angular_speed;
	float vertical_speed;

}speed;

//context of the drone
struct limits {
  int indoor;
	float vertical_speed;
	float angular_speed;
	int length;
	int width;
	int height;
	struct position initial_pos;
	int initial_direction;

}limits;


//connexion
struct connexion {
    char * type;
    char * address;
}connexion;

//global structure of the current state of the choreography;
struct global {
	struct state curr_state;
	struct position curr_position;
	struct speed curr_speed;
	struct limits context;
	int index_action;
	struct option * options;
}global;
// action
struct action {
  int (*func)();
  int time;
  int execution_phase;
}action;

// dep on one Axis
struct oneAxis {
    struct action curr_action;
    unsigned int distance;
}oneAxis;

//rotation
struct rotation {
	struct action curr_action;
	int angle;
}rotation;
//current action of the drone
struct uAction {
	union {
		struct oneAxis axis;
		struct rotation rotate;
	};
	int type;
  struct option * options;
}uAction;


int length;
int pe;
struct connexion cnx;
struct global g;
struct uAction actions[512];

int takeoff(struct global*);
int forward(struct global*);
int backward(struct global*);
int left(struct global*);
int right(struct global*);
int rotate(struct global*);
int up(struct global*);
int down(struct global*);
int land(struct global*);
int wait(struct global*);
int connectDrone(struct global*);
int disconnectDrone(struct global*);
int configureDrone(struct global*);
int flip(struct global*);
void choreography();
void fillActions();
