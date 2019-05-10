package com.bumptech.glide.load;

public enum EncodeStrategy
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/bumptech/glide/load/EncodeStrategy;
    ((EncodeStrategy)localObject).<init>("SOURCE", 0);
    SOURCE = (EncodeStrategy)localObject;
    localObject = new com/bumptech/glide/load/EncodeStrategy;
    ((EncodeStrategy)localObject).<init>("TRANSFORMED", j);
    TRANSFORMED = (EncodeStrategy)localObject;
    localObject = new com/bumptech/glide/load/EncodeStrategy;
    ((EncodeStrategy)localObject).<init>("NONE", i);
    NONE = (EncodeStrategy)localObject;
    localObject = new EncodeStrategy[3];
    EncodeStrategy localEncodeStrategy = SOURCE;
    localObject[0] = localEncodeStrategy;
    localEncodeStrategy = TRANSFORMED;
    localObject[j] = localEncodeStrategy;
    localEncodeStrategy = NONE;
    localObject[i] = localEncodeStrategy;
    $VALUES = (EncodeStrategy[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\EncodeStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */