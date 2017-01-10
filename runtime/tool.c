#include <sys/time.h>
#include <stdio.h>

double my_gettimeofday(){
  struct timeval tmp_time;
  gettimeofday(&tmp_time, NULL);
  return (tmp_time.tv_sec + (tmp_time.tv_usec * 1.0e-6L));
}

int setBitToOne(int val, int pos){
  return (val | ( 1 << pos) );
}

int setBitToZero(int val, int pos){
  int mask = setBitToOne(0, pos);
  return (val & ~mask);
}
