package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;

public final class AdSize
{
  public static final int AUTO_HEIGHT = 254;
  public static final AdSize BANNER;
  public static final AdSize FLUID;
  public static final AdSize FULL_BANNER;
  public static final int FULL_WIDTH = 255;
  public static final AdSize LARGE_BANNER;
  public static final AdSize LEADERBOARD;
  public static final AdSize MEDIUM_RECTANGLE;
  public static final AdSize SMART_BANNER;
  public static final AdSize WIDE_SKYSCRAPER;
  private final int zzoG;
  private final int zzoH;
  private final String zzoI;
  
  static
  {
    int i = 320;
    AdSize localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(i, 50, "320x50_mb");
    BANNER = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(468, 60, "468x60_as");
    FULL_BANNER = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(i, 100, "320x100_as");
    LARGE_BANNER = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(728, 90, "728x90_as");
    LEADERBOARD = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(300, 250, "300x250_as");
    MEDIUM_RECTANGLE = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(160, 600, "160x600_as");
    WIDE_SKYSCRAPER = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(-1, -2, "smart_banner");
    SMART_BANNER = localAdSize;
    localAdSize = new com/google/android/gms/ads/AdSize;
    localAdSize.<init>(-3, -4, "fluid");
    FLUID = localAdSize;
  }
  
  public AdSize(int paramInt1, int paramInt2) {}
  
  AdSize(int paramInt1, int paramInt2, String paramString)
  {
    int i;
    IllegalArgumentException localIllegalArgumentException;
    Object localObject;
    if (paramInt1 < 0)
    {
      i = -1;
      if (paramInt1 != i)
      {
        i = -3;
        if (paramInt1 != i)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = "Invalid width for AdSize: " + paramInt1;
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
    }
    if (paramInt2 < 0)
    {
      i = -2;
      if (paramInt2 != i)
      {
        i = -4;
        if (paramInt2 != i)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = "Invalid height for AdSize: " + paramInt2;
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
    }
    this.zzoG = paramInt1;
    this.zzoH = paramInt2;
    this.zzoI = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof AdSize;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (AdSize)paramObject;
        int i = this.zzoG;
        int j = ((AdSize)paramObject).zzoG;
        if (i == j)
        {
          i = this.zzoH;
          j = ((AdSize)paramObject).zzoH;
          if (i == j)
          {
            String str1 = this.zzoI;
            String str2 = ((AdSize)paramObject).zzoI;
            boolean bool3 = str1.equals(str2);
            if (bool3) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int getHeight()
  {
    return this.zzoH;
  }
  
  public int getHeightInPixels(Context paramContext)
  {
    int i = this.zzoH;
    Object localObject;
    switch (i)
    {
    default: 
      localObject = zzn.zzcS();
      int j = this.zzoH;
      i = ((zza)localObject).zzb(paramContext, j);
    }
    for (;;)
    {
      return i;
      localObject = paramContext.getResources().getDisplayMetrics();
      i = AdSizeParcel.zzb((DisplayMetrics)localObject);
      continue;
      i = -1;
    }
  }
  
  public int getWidth()
  {
    return this.zzoG;
  }
  
  public int getWidthInPixels(Context paramContext)
  {
    int i = this.zzoG;
    Object localObject;
    switch (i)
    {
    case -2: 
    default: 
      localObject = zzn.zzcS();
      int j = this.zzoG;
      i = ((zza)localObject).zzb(paramContext, j);
    }
    for (;;)
    {
      return i;
      localObject = paramContext.getResources().getDisplayMetrics();
      i = AdSizeParcel.zza((DisplayMetrics)localObject);
      continue;
      i = -1;
    }
  }
  
  public int hashCode()
  {
    return this.zzoI.hashCode();
  }
  
  public boolean isAutoHeight()
  {
    int i = this.zzoH;
    int k = -2;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isFluid()
  {
    int i = this.zzoG;
    int k = -3;
    if (i == k)
    {
      i = this.zzoH;
      int m = -4;
      if (i != m) {}
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isFullWidth()
  {
    int i = this.zzoG;
    int k = -1;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    return this.zzoI;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\AdSize.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */