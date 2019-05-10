package com.bumptech.glide.load.engine;

 enum DecodeJob$RunReason
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/bumptech/glide/load/engine/DecodeJob$RunReason;
    ((RunReason)localObject).<init>("INITIALIZE", 0);
    INITIALIZE = (RunReason)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$RunReason;
    ((RunReason)localObject).<init>("SWITCH_TO_SOURCE_SERVICE", j);
    SWITCH_TO_SOURCE_SERVICE = (RunReason)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$RunReason;
    ((RunReason)localObject).<init>("DECODE_DATA", i);
    DECODE_DATA = (RunReason)localObject;
    localObject = new RunReason[3];
    RunReason localRunReason = INITIALIZE;
    localObject[0] = localRunReason;
    localRunReason = SWITCH_TO_SOURCE_SERVICE;
    localObject[j] = localRunReason;
    localRunReason = DECODE_DATA;
    localObject[i] = localRunReason;
    $VALUES = (RunReason[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob$RunReason.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */