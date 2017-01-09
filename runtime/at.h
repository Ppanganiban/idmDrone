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

char * createAT_PCMD(int flag, float roll, float pitch, float gaz, float yaw);

char * createAT_REF(int startBit, int emergency);

char * createAT_FTRIM();

char * createAT_CALIB(int device);

char * createAT_CONFIG(char * opt_name, char * opt_value);

char * createAT_CONFIG_IDS();

char * createAT_COMWDG();


