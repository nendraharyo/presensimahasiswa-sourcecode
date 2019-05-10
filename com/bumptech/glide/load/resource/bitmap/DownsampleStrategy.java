package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

public abstract class DownsampleStrategy
{
  public static final DownsampleStrategy AT_LEAST;
  public static final DownsampleStrategy AT_MOST;
  public static final DownsampleStrategy CENTER_INSIDE;
  public static final DownsampleStrategy CENTER_OUTSIDE;
  public static final DownsampleStrategy DEFAULT;
  public static final DownsampleStrategy FIT_CENTER;
  public static final DownsampleStrategy NONE;
  public static final Option OPTION;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$FitCenter;
    ((DownsampleStrategy.FitCenter)localObject).<init>();
    FIT_CENTER = (DownsampleStrategy)localObject;
    localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$CenterOutside;
    ((DownsampleStrategy.CenterOutside)localObject).<init>();
    CENTER_OUTSIDE = (DownsampleStrategy)localObject;
    localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$AtLeast;
    ((DownsampleStrategy.AtLeast)localObject).<init>();
    AT_LEAST = (DownsampleStrategy)localObject;
    localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$AtMost;
    ((DownsampleStrategy.AtMost)localObject).<init>();
    AT_MOST = (DownsampleStrategy)localObject;
    localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$CenterInside;
    ((DownsampleStrategy.CenterInside)localObject).<init>();
    CENTER_INSIDE = (DownsampleStrategy)localObject;
    localObject = new com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$None;
    ((DownsampleStrategy.None)localObject).<init>();
    NONE = (DownsampleStrategy)localObject;
    DEFAULT = CENTER_OUTSIDE;
    DownsampleStrategy localDownsampleStrategy = DEFAULT;
    OPTION = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", localDownsampleStrategy);
  }
  
  public abstract DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract float getScaleFactor(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DownsampleStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */