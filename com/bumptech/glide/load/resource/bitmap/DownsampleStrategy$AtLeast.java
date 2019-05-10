package com.bumptech.glide.load.resource.bitmap;

class DownsampleStrategy$AtLeast
  extends DownsampleStrategy
{
  public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return DownsampleStrategy.SampleSizeRounding.QUALITY;
  }
  
  public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = 1.0F;
    int i = paramInt2 / paramInt4;
    int j = paramInt1 / paramInt3;
    i = Math.min(i, j);
    if (i == 0) {}
    for (;;)
    {
      return f1;
      i = Integer.highestOneBit(i);
      float f2 = i;
      f1 /= f2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DownsampleStrategy$AtLeast.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */