package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzew;

public class zzad
{
  private static final Object zzqy;
  private static zzad zzuV;
  private zzy zzuW;
  private RewardedVideoAd zzuX;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  public static zzad zzdi()
  {
    synchronized (zzqy)
    {
      zzad localzzad = zzuV;
      if (localzzad == null)
      {
        localzzad = new com/google/android/gms/ads/internal/client/zzad;
        localzzad.<init>();
        zzuV = localzzad;
      }
      localzzad = zzuV;
      return localzzad;
    }
  }
  
  public RewardedVideoAd getRewardedVideoAdInstance(Context paramContext)
  {
    synchronized (zzqy)
    {
      Object localObject2 = this.zzuX;
      if (localObject2 != null)
      {
        localObject2 = this.zzuX;
        return (RewardedVideoAd)localObject2;
      }
      localObject2 = new com/google/android/gms/internal/zzew;
      ((zzew)localObject2).<init>();
      Object localObject4 = zzn.zzcX();
      localObject2 = ((zzf)localObject4).zza(paramContext, (zzew)localObject2);
      localObject4 = new com/google/android/gms/ads/internal/reward/client/zzi;
      ((zzi)localObject4).<init>(paramContext, (com.google.android.gms.ads.internal.reward.client.zzb)localObject2);
      this.zzuX = ((RewardedVideoAd)localObject4);
      localObject2 = this.zzuX;
    }
  }
  
  public void initialize(Context paramContext)
  {
    for (;;)
    {
      synchronized (zzqy)
      {
        Object localObject2 = this.zzuW;
        if (localObject2 != null) {
          return;
        }
        if (paramContext == null)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          String str2 = "Context cannot be null.";
          ((IllegalArgumentException)localObject2).<init>(str2);
          throw ((Throwable)localObject2);
        }
      }
      try
      {
        Object localObject4 = zzn.zzcV();
        localObject4 = ((zzaf)localObject4).zzu(paramContext);
        this.zzuW = ((zzy)localObject4);
        localObject4 = this.zzuW;
        ((zzy)localObject4).zza();
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str1 = "Fail to initialize mobile ads setting manager";
          com.google.android.gms.ads.internal.util.client.zzb.zzaK(str1);
        }
      }
    }
  }
  
  public void setAppVolume(float paramFloat)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    float f2 = 0.0F;
    Object localObject = null;
    boolean bool2 = 0.0F < paramFloat;
    if (!bool2)
    {
      f2 = 1.0F;
      bool2 = paramFloat < f2;
      if (!bool2)
      {
        bool2 = bool1;
        f2 = f1;
        String str1 = "The app volume must be a value between 0 and 1 inclusive.";
        zzx.zzb(bool2, str1);
        localObject = this.zzuW;
        if (localObject == null) {
          break label101;
        }
      }
    }
    for (;;)
    {
      localObject = "MobileAds.initialize() must be called prior to setting the app volume.";
      zzx.zza(bool1, localObject);
      try
      {
        localObject = this.zzuW;
        ((zzy)localObject).setAppVolume(paramFloat);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          String str2 = "Unable to set app volume.";
          com.google.android.gms.ads.internal.util.client.zzb.zzb(str2, localRemoteException);
        }
      }
      bool2 = false;
      localObject = null;
      f2 = 0.0F;
      break;
      label101:
      bool1 = false;
      str2 = null;
      f1 = 0.0F;
    }
  }
  
  public void zza(Context paramContext, String paramString, zzae paramzzae)
  {
    initialize(paramContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */