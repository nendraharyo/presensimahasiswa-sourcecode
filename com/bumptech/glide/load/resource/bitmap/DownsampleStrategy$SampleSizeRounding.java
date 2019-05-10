package com.bumptech.glide.load.resource.bitmap;

public enum DownsampleStrategy$SampleSizeRounding
{
  static
  {
    int i = 1;
    Object localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;
    ((SampleSizeRounding)localObject).<init>("MEMORY", 0);
    MEMORY = (SampleSizeRounding)localObject;
    localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;
    ((SampleSizeRounding)localObject).<init>("QUALITY", i);
    QUALITY = (SampleSizeRounding)localObject;
    localObject = new SampleSizeRounding[2];
    SampleSizeRounding localSampleSizeRounding = MEMORY;
    localObject[0] = localSampleSizeRounding;
    localSampleSizeRounding = QUALITY;
    localObject[i] = localSampleSizeRounding;
    $VALUES = (SampleSizeRounding[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DownsampleStrategy$SampleSizeRounding.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */