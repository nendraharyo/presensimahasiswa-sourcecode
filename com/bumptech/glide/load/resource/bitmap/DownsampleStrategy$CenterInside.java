package com.bumptech.glide.load.resource.bitmap;

class DownsampleStrategy$CenterInside
  extends DownsampleStrategy
{
  public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return DownsampleStrategy.SampleSizeRounding.QUALITY;
  }
  
  public float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f = FIT_CENTER.getScaleFactor(paramInt1, paramInt2, paramInt3, paramInt4);
    return Math.min(1.0F, f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DownsampleStrategy$CenterInside.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */