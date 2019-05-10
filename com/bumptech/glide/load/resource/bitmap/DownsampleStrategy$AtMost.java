package com.bumptech.glide.load.resource.bitmap;

class DownsampleStrategy$AtMost
  extends DownsampleStrategy
{
  public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return DownsampleStrategy.SampleSizeRounding.MEMORY;
  }
  
  public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    float f2 = paramInt2;
    float f3 = paramInt4;
    f2 /= f3;
    f3 = paramInt1;
    float f4 = paramInt3;
    f3 /= f4;
    f2 = Math.max(f2, f3);
    double d = Math.ceil(f2);
    int j = (int)d;
    int k = Integer.highestOneBit(j);
    k = Math.max(i, k);
    if (k < j) {}
    for (;;)
    {
      f1 = k << i;
      return 1.0F / f1;
      i = 0;
      f1 = 0.0F;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DownsampleStrategy$AtMost.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */