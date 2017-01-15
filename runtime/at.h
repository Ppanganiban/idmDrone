#define SESSION_ID  "session1"
#define USER_ID     "user1"
#define APP_ID "app1"

//FOR AT*REF
#define TAKEOFF 1
#define LAND 0
#define EMERGENCY_CHANGE 1
#define EMERGENCY_STAY 0
#define DEF_ATREF 290717696

//FOR AT*PCM
#define FLAG_HOVER 0
#define FLAG_PROG 1     //Progressive mode
#define FLAG_PROGWITHYAW 3  //Progressive mode with yaw

// USE FOR ANIMATION
typedef enum {
	ARDRONE_ANIM_PHI_M30_DEG= 0,
	ARDRONE_ANIM_PHI_30_DEG,
	ARDRONE_ANIM_THETA_M30_DEG,
	ARDRONE_ANIM_THETA_30_DEG,
	ARDRONE_ANIM_THETA_20DEG_YAW_200DEG,
	ARDRONE_ANIM_THETA_20DEG_YAW_M200DEG,
	ARDRONE_ANIM_TURNAROUND,
	ARDRONE_ANIM_TURNAROUND_GODOWN,
	ARDRONE_ANIM_YAW_SHAKE,
	ARDRONE_ANIM_YAW_DANCE,
	ARDRONE_ANIM_PHI_DANCE,
	ARDRONE_ANIM_THETA_DANCE,
    ARDRONE_ANIM_VZ_DANCE,
	ARDRONE_ANIM_WAVE,
	ARDRONE_ANIM_PHI_THETA_MIXED,
	ARDRONE_ANIM_DOUBLE_PHI_THETA_MIXED,
	ARDRONE_ANIM_FLIP_AHEAD,
	ARDRONE_ANIM_FLIP_BEHIND,
	ARDRONE_ANIM_FLIP_LEFT,
	ARDRONE_ANIM_FLIP_RIGHT,
	ARDRONE_NB_ANIM_MAYDAY
} anim_mayday_t;

char * createAT_PCMD(int flag, float roll, float pitch, float gaz, float yaw);

char * createAT_REF(int startBit, int emergency);

char * createAT_FTRIM();

char * createAT_CALIB(int device);

char * createAT_CONFIG(char * opt_name, char * opt_value);

char * createAT_CONFIG_IDS();

char * createAT_COMWDG();

char * createAT_CTRL();

char * createAT_LED(int animation_number, float freq, int duration);
