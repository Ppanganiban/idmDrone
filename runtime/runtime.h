struct attribute{
	char * name;
	char * value;	
};
struct option{
	char * name;
	struct attribute att[0];
};

// action
struct action {
    char * name;
    unsigned int repeat;
    unsigned int time;
    
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
	float xy;
	float vz;
	float angular_speed;
	float vertical_speed;

}speed;

//context of the drone
struct limits {
	float vertical_speed;
	float angular_speed;
	int length;
	int width;
	int height;
	struct position initial_pos;
	int initial_direction;

}limits;

//current action of the drone
union uAction {
	struct oneAxis axis;
	struct rotation rotate;
}uAction;
//connexion
struct connect {
    char * type;
    char * address;
}connect;

//global structure of the current state of the choreography;
struct global {
	struct state curr_state;
	struct position curr_position;
	struct speed curr_speed;
	struct limits context;
	union uAction * curr_action;
	struct option * options;
}global;


int takeoff(struct global*);
int front(struct global*);
int back(struct global*);
int left(struct global*);
int right(struct global*);
int rotate(struct global*);
int land(struct global*);
void connectDrone(struct global*);


