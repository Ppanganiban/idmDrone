#define DRONE_SPEED 1000 //mm/s
#define DRONE_SPEED_IN_DEG 0.5 //deg
#define EQUILIBRE 3
#define COEFF_TIME 4

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
