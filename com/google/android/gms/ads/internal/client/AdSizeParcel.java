package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AdSizeParcel
  implements SafeParcelable
{
  public static final zzi CREATOR;
  public final int height;
  public final int heightPixels;
  public final int versionCode;
  public final int width;
  public final int widthPixels;
  public final String zzuh;
  public final boolean zzui;
  public final AdSizeParcel[] zzuj;
  public final boolean zzuk;
  public final boolean zzul;
  public boolean zzum;
  
  static
  {
    zzi localzzi = new com/google/android/gms/ads/internal/client/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  public AdSizeParcel()
  {
    this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }
  
  AdSizeParcel(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, int paramInt5, AdSizeParcel[] paramArrayOfAdSizeParcel, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.versionCode = paramInt1;
    this.zzuh = paramString;
    this.height = paramInt2;
    this.heightPixels = paramInt3;
    this.zzui = paramBoolean1;
    this.width = paramInt4;
    this.widthPixels = paramInt5;
    this.zzuj = paramArrayOfAdSizeParcel;
    this.zzuk = paramBoolean2;
    this.zzul = paramBoolean3;
    this.zzum = paramBoolean4;
  }
  
  public AdSizeParcel(Context paramContext, AdSize paramAdSize)
  {
    this(paramContext, arrayOfAdSize);
  }
  
  public AdSizeParcel(Context paramContext, AdSize[] paramArrayOfAdSize)
  {
    AdSize localAdSize = paramArrayOfAdSize[0];
    this.versionCode = 5;
    this.zzui = false;
    boolean bool1 = localAdSize.isFluid();
    this.zzul = bool1;
    bool1 = this.zzul;
    int j;
    int k;
    label96:
    label121:
    Object localObject2;
    DisplayMetrics localDisplayMetrics;
    int n;
    com.google.android.gms.ads.internal.util.client.zza localzza1;
    label208:
    label279:
    label291:
    Object localObject3;
    if (bool1)
    {
      j = AdSize.BANNER.getWidth();
      this.width = j;
      localObject1 = AdSize.BANNER;
      j = ((AdSize)localObject1).getHeight();
      this.height = j;
      j = this.width;
      k = -1;
      if (j != k) {
        break label482;
      }
      j = i;
      k = this.height;
      int m = -2;
      float f1 = 0.0F / 0.0F;
      if (k != m) {
        break label491;
      }
      k = i;
      localObject2 = paramContext.getResources();
      localDisplayMetrics = ((Resources)localObject2).getDisplayMetrics();
      if (j == 0) {
        break label516;
      }
      localObject2 = zzn.zzcS();
      boolean bool3 = ((com.google.android.gms.ads.internal.util.client.zza)localObject2).zzV(paramContext);
      if (!bool3) {
        break label500;
      }
      localObject2 = zzn.zzcS();
      bool3 = ((com.google.android.gms.ads.internal.util.client.zza)localObject2).zzW(paramContext);
      if (!bool3) {
        break label500;
      }
      n = zza(localDisplayMetrics);
      localzza1 = zzn.zzcS();
      int i1 = localzza1.zzX(paramContext);
      n -= i1;
      this.widthPixels = n;
      f1 = this.widthPixels;
      float f2 = localDisplayMetrics.density;
      f1 /= f2;
      double d1 = f1;
      n = (int)d1;
      double d2 = (int)d1;
      d1 -= d2;
      d2 = 0.01D;
      int i2 = d1 < d2;
      if (i2 >= 0) {
        n += 1;
      }
      i2 = n;
      if (k == 0) {
        break label557;
      }
      n = zzc(localDisplayMetrics);
      com.google.android.gms.ads.internal.util.client.zza localzza2 = zzn.zzcS();
      int i4 = localzza2.zza(localDisplayMetrics, n);
      this.heightPixels = i4;
      if ((j == 0) && (k == 0)) {
        break label566;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(i2).append("x").append(n);
      localObject3 = "_as";
      localObject1 = (String)localObject3;
      this.zzuh = ((String)localObject1);
    }
    for (;;)
    {
      j = paramArrayOfAdSize.length;
      if (j <= i) {
        break label606;
      }
      localObject1 = new AdSizeParcel[paramArrayOfAdSize.length];
      this.zzuj = ((AdSizeParcel[])localObject1);
      j = 0;
      localObject1 = null;
      for (;;)
      {
        i = paramArrayOfAdSize.length;
        if (j >= i) {
          break;
        }
        AdSizeParcel[] arrayOfAdSizeParcel = this.zzuj;
        localObject3 = new com/google/android/gms/ads/internal/client/AdSizeParcel;
        localObject2 = paramArrayOfAdSize[j];
        ((AdSizeParcel)localObject3).<init>(paramContext, (AdSize)localObject2);
        arrayOfAdSizeParcel[j] = localObject3;
        j += 1;
      }
      j = localAdSize.getWidth();
      this.width = j;
      j = localAdSize.getHeight();
      this.height = j;
      break;
      label482:
      j = 0;
      localObject1 = null;
      break label96;
      label491:
      k = 0;
      localObject3 = null;
      break label121;
      label500:
      n = zza(localDisplayMetrics);
      this.widthPixels = n;
      break label208;
      label516:
      n = this.width;
      localzza1 = zzn.zzcS();
      int i5 = this.width;
      int i3 = localzza1.zza(localDisplayMetrics, i5);
      this.widthPixels = i3;
      i3 = n;
      break label279;
      label557:
      n = this.height;
      break label291;
      label566:
      bool2 = this.zzul;
      if (bool2)
      {
        localObject1 = "320x50_mb";
        this.zzuh = ((String)localObject1);
      }
      else
      {
        localObject1 = localAdSize.toString();
        this.zzuh = ((String)localObject1);
      }
    }
    label606:
    boolean bool2 = false;
    Object localObject1 = null;
    this.zzuj = null;
    this.zzuk = false;
    this.zzum = false;
  }
  
  public AdSizeParcel(AdSizeParcel paramAdSizeParcel, AdSizeParcel[] paramArrayOfAdSizeParcel)
  {
    this(5, str, i, j, bool1, k, m, paramArrayOfAdSizeParcel, bool2, bool3, bool4);
  }
  
  public static int zza(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static int zzb(DisplayMetrics paramDisplayMetrics)
  {
    float f1 = zzc(paramDisplayMetrics);
    float f2 = paramDisplayMetrics.density;
    return (int)(f1 * f2);
  }
  
  private static int zzc(DisplayMetrics paramDisplayMetrics)
  {
    float f1 = paramDisplayMetrics.heightPixels;
    float f2 = paramDisplayMetrics.density;
    f1 /= f2;
    int i = (int)f1;
    int j = 400;
    f2 = 5.6E-43F;
    if (i <= j)
    {
      i = 32;
      f1 = 4.5E-44F;
    }
    for (;;)
    {
      return i;
      j = 720;
      f2 = 1.009E-42F;
      if (i <= j)
      {
        i = 50;
        f1 = 7.0E-44F;
      }
      else
      {
        i = 90;
        f1 = 1.26E-43F;
      }
    }
  }
  
  public static AdSizeParcel zzcP()
  {
    AdSizeParcel localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    localAdSizeParcel.<init>(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    return localAdSizeParcel;
  }
  
  public static AdSizeParcel zzt(Context paramContext)
  {
    AdSizeParcel localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    localAdSizeParcel.<init>(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    return localAdSizeParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public AdSize zzcQ()
  {
    int i = this.width;
    int j = this.height;
    String str = this.zzuh;
    return com.google.android.gms.ads.zza.zza(i, j, str);
  }
  
  public void zzi(boolean paramBoolean)
  {
    this.zzum = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\AdSizeParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */