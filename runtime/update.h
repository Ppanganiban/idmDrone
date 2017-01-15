#define DRONE_SPEED 1000 //mm/s
#define DRONE_SPEED_IN_DEG 10 //deg
#define EQUILIBRE 3

typedef enum {
  FORWARD,
  BACKWARD,
  RIGHT,
  LEFT,
  UP,
  DOWN
} atomic_move;

int pre_move;

void spin_update();
void pitch_update();
void tilt_update();
void vspeed_update();
