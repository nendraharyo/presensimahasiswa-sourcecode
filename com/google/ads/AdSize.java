package com.google.ads;

import android.content.Context;

public final class AdSize
{
  public static final int AUTO_HEIGHT = 254;
  public static final AdSize BANNER;
  public static final int FULL_WIDTH = 255;
  public static final AdSize IAB_BANNER;
  public static final AdSize IAB_LEADERBOARD;
  public static final AdSize IAB_MRECT;
  public static final AdSize IAB_WIDE_SKYSCRAPER;
  public static final int LANDSCAPE_AD_HEIGHT = 32;
  public static final int LARGE_AD_HEIGHT = 90;
  public static final int PORTRAIT_AD_HEIGHT = 50;
  public static final AdSize SMART_BANNER;
  private final com.google.android.gms.ads.AdSize zzaJ;
  
  static
  {
    AdSize localAdSize = new com/google/ads/AdSize;
    localAdSize.<init>(-1, -2, "mb");
    SMART_BANNER = localAdSize;
    localAdSize = new com/google/ads/AdSize;
    localAdSize.<init>(320, 50, "mb");
    BANNER = localAdSize;
    localAdSize = new com/google/ads/AdSize;
    localAdSize.<init>(300, 250, "as");
    IAB_MRECT = localAdSize;
    localAdSize = new com/google/ads/AdSize;
    localAdSize.<init>(468, 60, "as");
    IAB_BANNER = localAdSize;
    localAdSize = new com/google/ads/AdSize;
    localAdSize.<init>(728, 90, "as");
    IAB_LEADERBOARD = localAdSize;
    localAdSize = new com/google/ads/AdSize;
    localAdSize.<init>(160, 600, "as");
    IAB_WIDE_SKYSCRAPER = localAdSize;
  }
  
  public AdSize(int paramInt1, int paramInt2)
  {
    this(localAdSize);
  }
  
  private AdSize(int paramInt1, int paramInt2, String paramString)
  {
    this(localAdSize);
  }
  
  public AdSize(com.google.android.gms.ads.AdSize paramAdSize)
  {
    this.zzaJ = paramAdSize;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof AdSize;
    com.google.android.gms.ads.AdSize localAdSize1;
    if (!bool)
    {
      bool = false;
      localAdSize1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (AdSize)paramObject;
      localAdSize1 = this.zzaJ;
      com.google.android.gms.ads.AdSize localAdSize2 = ((AdSize)paramObject).zzaJ;
      bool = localAdSize1.equals(localAdSize2);
    }
  }
  
  public AdSize findBestSize(AdSize... paramVarArgs)
  {
    Object localObject1 = null;
    float f1 = 1.0F;
    if (paramVarArgs == null) {
      return (AdSize)localObject1;
    }
    float f2 = 0.0F;
    Object localObject2 = null;
    int i = getWidth();
    int j = getHeight();
    int k = paramVarArgs.length;
    int m = 0;
    float f3 = 0.0F;
    int n = 0;
    label42:
    AdSize localAdSize;
    if (n < k)
    {
      localAdSize = paramVarArgs[n];
      m = localAdSize.getWidth();
      int i1 = localAdSize.getHeight();
      boolean bool2 = isSizeAppropriate(m, i1);
      if (!bool2) {
        break label164;
      }
      m *= i1;
      f3 = m;
      float f4 = i * j;
      f3 /= f4;
      boolean bool1 = f3 < f1;
      if (bool1) {
        f3 = f1 / f3;
      }
      bool1 = f3 < f2;
      if (!bool1) {
        break label164;
      }
    }
    for (localObject2 = localAdSize;; localObject2 = localObject1)
    {
      int i2 = n + 1;
      n = i2;
      localObject1 = localObject2;
      f2 = f3;
      break label42;
      break;
      label164:
      f3 = f2;
    }
  }
  
  public int getHeight()
  {
    return this.zzaJ.getHeight();
  }
  
  public int getHeightInPixels(Context paramContext)
  {
    return this.zzaJ.getHeightInPixels(paramContext);
  }
  
  public int getWidth()
  {
    return this.zzaJ.getWidth();
  }
  
  public int getWidthInPixels(Context paramContext)
  {
    return this.zzaJ.getWidthInPixels(paramContext);
  }
  
  public int hashCode()
  {
    return this.zzaJ.hashCode();
  }
  
  public boolean isAutoHeight()
  {
    return this.zzaJ.isAutoHeight();
  }
  
  public boolean isCustomAdSize()
  {
    return false;
  }
  
  public boolean isFullWidth()
  {
    return this.zzaJ.isFullWidth();
  }
  
  public boolean isSizeAppropriate(int paramInt1, int paramInt2)
  {
    float f1 = 1.25F;
    float f2 = 0.8F;
    int i = getWidth();
    int j = getHeight();
    float f3 = paramInt1;
    float f4 = i * f1;
    boolean bool2 = f3 < f4;
    boolean bool1;
    if (!bool2)
    {
      f3 = paramInt1;
      f5 = i * f2;
      bool1 = f3 < f5;
      if (!bool1)
      {
        f5 = paramInt2;
        f3 = j * f1;
        bool1 = f5 < f3;
        if (!bool1)
        {
          f5 = paramInt2;
          float f6 = j * f2;
          bool1 = f5 < f6;
          if (!bool1) {
            bool1 = true;
          }
        }
      }
    }
    for (float f5 = Float.MIN_VALUE;; f5 = 0.0F)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  public String toString()
  {
    return this.zzaJ.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\AdSize.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */