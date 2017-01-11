typedef signed short      int16_t;
typedef unsigned short     uint16_t;
typedef float  float32_t;
typedef double float64_t;
typedef _Bool bool_t;

typedef struct _navdata_demo_t {
  uint16_t    tag;            /*!< Navdata block ('option') identifier */
  uint16_t    size;           /*!< set this to the size of this structure */
  uint32_t    ctrl_state;     /*!< Flying state (landed, flying, hovering, etc.)
                                defined in CTRL_STATES enum. */
  uint32_t    vbat_flying_percentage; /*!< battery voltage filtered (mV) */
  float32_t   theta;                  /*!< UAV's pitch in milli-degrees */
  float32_t   phi;                    /*!< UAV's roll  in milli-degrees */
  float32_t   psi;                    /*!< UAV's yaw   in milli-degrees */
  int32_t     altitude;               /*!< UAV's altitude in centimeters */
  float32_t   vx;                     /*!< UAV's estimated linear velocity */
  float32_t   vy;                     /*!< UAV's estimated linear velocity */
  float32_t   vz;                     /*!< UAV's estimated linear velocity */
  uint32_t    num_frames;       /*!< streamed frame index */
                                // Not used -> To integrate in video stage.
  uint32_t    detection_tag_index;    /*!<  Deprecated ! Don't use ! */
  uint32_t    detection_camera_type;  /*!<  Type of tag searched in detection */
}navdata_demo_t;

typedef struct _navdata_vision_detect_t {
    uint16_t   tag;
    uint16_t   size;

    uint32_t   nb_detected;  
    uint32_t   type[4];
    uint32_t   xc[4];        
    uint32_t   yc[4];
    uint32_t   width[4];     
    uint32_t   height[4];    
    uint32_t   dist[4];      
} navdata_vision_detect_t;

typedef struct _navdata_option_t{
  uint16_t tag;
  uint16_t size;
  uint8_t data[1];
} __attribute__((packed)) navdata_option_t;

typedef struct _navdata_t {
  uint32_t header;
  uint32_t ardrone_state;
  uint32_t sequence;
  uint32_t vision_define;
  navdata_demo_t options[1];
} __attribute__((packed)) navdata_t;


typedef enum {
  ARDRONE_FLY_MASK            = 1U <<  0, // FLY MASK                  : (0) Ardrone is landed, (1) Ardrone is flying
  ARDRONE_VIDEO_MASK          = 1U <<  1, // VIDEO MASK                : (0) Video disable, (1) Video enable
  ARDRONE_VISION_MASK         = 1U <<  2, // VISION MASK               : (0) Vision disable, (1) Vision enable
  ARDRONE_CONTROL_MASK        = 1U <<  3, // CONTROL ALGO              : (0) Euler angles control, (1) Angular speed control
  ARDRONE_ALTITUDE_MASK       = 1U <<  4, // ALTITUDE CONTROL ALGO     : (0) Altitude control inactive (1) Altitude control active
  ARDRONE_USER_FEEDBACK_START = 1U <<  5, // USER feedback             :     Start button state 
  ARDRONE_COMMAND_MASK        = 1U <<  6, // Control command ACK       : (0) None, (1) One received
  ARDRONE_CAMERA_MASK         = 1U <<  7, // CAMERA MASK               : (0) Camera not ready, (1) Camera ready
  ARDRONE_TRAVELLING_MASK     = 1U <<  8, // Travelling mask           : (0) Disable, (1) Enable
  ARDRONE_USB_MASK            = 1U <<  9, // USB key                   : (0) Usb key not ready, (1) Usb key ready
  ARDRONE_NAVDATA_DEMO_MASK   = 1U << 10, // Navdata demo              : (0) All navdata, (1) Only navdata demo
  ARDRONE_NAVDATA_BOOTSTRAP   = 1U << 11, // Navdata bootstrap         : (0) Options sent in all or demo mode, (1) No navdata options sent
  ARDRONE_MOTORS_MASK         = 1U << 12, // Motors status             : (0) Ok, (1) Motors problem
  ARDRONE_COM_LOST_MASK       = 1U << 13, // Communication Lost        : (1) Com problem, (0) Com is ok
  ARDRONE_VBAT_LOW            = 1U << 15, // VBat low                  : (1) Too low, (0) Ok
  ARDRONE_USER_EL             = 1U << 16, // User Emergency Landing    : (1) User EL is ON, (0) User EL is OFF
  ARDRONE_TIMER_ELAPSED       = 1U << 17, // Timer elapsed             : (1) Elapsed, (0) Not elapsed
  ARDRONE_ANGLES_OUT_OF_RANGE = 1U << 19, // Angles                    : (0) Ok, (1) Out of range
  ARDRONE_ULTRASOUND_MASK     = 1U << 21, // Ultrasonic sensor         : (0) Ok, (1) Deaf
  ARDRONE_CUTOUT_MASK         = 1U << 22, // Cutout system detection   : (0) Not detected, (1) Detected
  ARDRONE_PIC_VERSION_MASK    = 1U << 23, // PIC Version number OK     : (0) A bad version number, (1) Version number is OK */
  ARDRONE_ATCODEC_THREAD_ON   = 1U << 24, // ATCodec thread ON         : (0) Thread OFF (1) thread ON
  ARDRONE_NAVDATA_THREAD_ON   = 1U << 25, // Navdata thread ON         : (0) Thread OFF (1) thread ON
  ARDRONE_VIDEO_THREAD_ON     = 1U << 26, // Video thread ON           : (0) Thread OFF (1) thread ON
  ARDRONE_ACQ_THREAD_ON       = 1U << 27, // Acquisition thread ON     : (0) Thread OFF (1) thread ON
  ARDRONE_CTRL_WATCHDOG_MASK  = 1U << 28, // CTRL watchdog             : (1) Delay in control execution (> 5ms), (0) Control is well scheduled
  ARDRONE_ADC_WATCHDOG_MASK   = 1U << 29, // ADC Watchdog              : (1) Delay in uart2 dsr (> 5ms), (0) Uart2 is good
  ARDRONE_COM_WATCHDOG_MASK   = 1U << 30, // Communication Watchdog    : (1) Com problem, (0) Com is ok
  ARDRONE_EMERGENCY_MASK      = 1U << 31  // Emergency landing         : (0) No emergency, (1) Emergency
} ARDRONE_STATES;


typedef enum  {
  ARDRONE_NAVDATA_DEMO_TAG            =  0,
  ARDRONE_NAVDATA_TIME_TAG            =  1,
  ARDRONE_NAVDATA_RAW_MEASURES_TAG    =  2,
  ARDRONE_NAVDATA_PHYS_MEASURES_TAG   =  3,
  ARDRONE_NAVDATA_GYROS_OFFSETS_TAG   =  4,
  ARDRONE_NAVDATA_EULER_ANGLES_TAG    =  5,
  ARDRONE_NAVDATA_REFERENCES_TAG      =  6,
  ARDRONE_NAVDATA_TRIMS_TAG           =  7,
  ARDRONE_NAVDATA_RC_REFERENCES_TAG   =  8,
  ARDRONE_NAVDATA_PWM_TAG             =  9,
  ARDRONE_NAVDATA_ALTITUDE_TAG        = 10,
  ARDRONE_NAVDATA_VISION_RAW_TAG      = 11,
  ARDRONE_NAVDATA_VISION_OF_TAG       = 12,
  ARDRONE_NAVDATA_VISION_TAG          = 13,
  ARDRONE_NAVDATA_VISION_PERF_TAG     = 14,
  ARDRONE_NAVDATA_TRACKERS_SEND_TAG   = 15,
  ARDRONE_NAVDATA_VISION_DETECT_TAG   = 16,
  ARDRONE_NAVDATA_WATCHDOG_TAG        = 17,
  ARDRONE_NAVDATA_IPHONE_ANGLES_TAG   = 18,
  ARDRONE_NAVDATA_ADC_DATA_FRAME_TAG  = 18,
  ARDRONE_NAVDATA_VIDEO_STREAM_TAG    = 19,
  ARDRONE_NAVDATA_GAME_TAG            = 20,       // AR.Drone 1.7.4
  ARDRONE_NAVDATA_PRESSURE_RAW_TAG    = 21,       // AR.Drone 2.0
  ARDRONE_NAVDATA_MAGNETO_TAG         = 22,       // AR.Drone 2.0
  ARDRONE_NAVDATA_WIND_TAG            = 23,       // AR.Drone 2.0
  ARDRONE_NAVDATA_KALMAN_PRESSURE_TAG = 24,       // AR.Drone 2.0
  ARDRONE_NAVDATA_HDVIDEO_STREAM_TAG  = 25,       // AR.Drone 2.0
  ARDRONE_NAVDATA_WIFI_TAG            = 26,       // AR.Drone 2.0
  ARDRONE_NAVDATA_ZIMMU3000_TAG       = 27,       // AR.Drone 2.0
  ARDRONE_NAVDATA_GPS_TAG             = 27,       // AR.Drone 2.4.1
  ARDRONE_NAVDATA_CKS_TAG             = 0xFFFF
}ARDRONE_NAVDATA_TAG;

typedef enum {
  CTRL_DEFAULT,
  CTRL_INT,
  CTRL_LANDED,
  CTRL_FLYING,
  CTRL_HOVERING,
  CTRL_TEST,
  CTRL_TRANS_TAKEOFF,
  CTRL_TRANS_GOTOFIX,
  CTRL_TRANS_LANDING,
  CTRL_TRANS_LOOPING,
  CTRL_NUM_STATES
} CTRL_SATES;
