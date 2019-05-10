package com.bumptech.glide.load.engine;

 enum DecodeJob$Stage
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/bumptech/glide/load/engine/DecodeJob$Stage;
    ((Stage)localObject).<init>("INITIALIZE", 0);
    INITIALIZE = (Stage)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$Stage;
    ((Stage)localObject).<init>("RESOURCE_CACHE", m);
    RESOURCE_CACHE = (Stage)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$Stage;
    ((Stage)localObject).<init>("DATA_CACHE", k);
    DATA_CACHE = (Stage)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$Stage;
    ((Stage)localObject).<init>("SOURCE", j);
    SOURCE = (Stage)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$Stage;
    ((Stage)localObject).<init>("ENCODE", i);
    ENCODE = (Stage)localObject;
    localObject = new com/bumptech/glide/load/engine/DecodeJob$Stage;
    ((Stage)localObject).<init>("FINISHED", 5);
    FINISHED = (Stage)localObject;
    localObject = new Stage[6];
    Stage localStage1 = INITIALIZE;
    localObject[0] = localStage1;
    localStage1 = RESOURCE_CACHE;
    localObject[m] = localStage1;
    localStage1 = DATA_CACHE;
    localObject[k] = localStage1;
    localStage1 = SOURCE;
    localObject[j] = localStage1;
    localStage1 = ENCODE;
    localObject[i] = localStage1;
    Stage localStage2 = FINISHED;
    localObject[5] = localStage2;
    $VALUES = (Stage[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob$Stage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */