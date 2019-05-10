package com.bumptech.glide.load.resource.bitmap;

class DownsampleStrategy$FitCenter
  extends DownsampleStrategy
{
  public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return DownsampleStrategy.SampleSizeRounding.QUALITY;
  }
  
  public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = paramInt3;
    float f2 = paramInt1;
    f1 /= f2;
    f2 = paramInt4;
    float f3 = paramInt2;
    f2 /= f3;
    return Math.min(f1, f2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DownsampleStrategy$FitCenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */