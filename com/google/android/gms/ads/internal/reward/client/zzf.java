package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;

public class zzf
  extends zzg
{
  public zzf()
  {
    super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
  }
  
  private zzb zzb(Context paramContext, zzew paramzzew)
  {
    try
    {
      localObject1 = zze.zzC(paramContext);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzc)localObject2;
      int i = 8487000;
      localObject2 = ((zzc)localObject2).zza((zzd)localObject1, paramzzew, i);
      localObject2 = zzb.zza.zzaa((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1 = "Could not get remote RewardedVideoAd.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;) {}
    }
    return (zzb)localObject2;
  }
  
  public zzb zza(Context paramContext, zzew paramzzew)
  {
    int i = 8487000;
    Object localObject = zzn.zzcS();
    boolean bool1 = ((zza)localObject).zzU(paramContext);
    if (bool1)
    {
      localObject = zzb(paramContext, paramzzew);
      if (localObject != null) {}
    }
    else
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaI("Using RewardedVideoAd from the client jar.");
      localObject = new com/google/android/gms/ads/internal/util/client/VersionInfoParcel;
      boolean bool2 = true;
      ((VersionInfoParcel)localObject).<init>(i, i, bool2);
      zzl localzzl = zzn.zzcU();
      localObject = localzzl.createRewardedVideoAd(paramContext, paramzzew, (VersionInfoParcel)localObject);
    }
    return (zzb)localObject;
  }
  
  protected zzc zzad(IBinder paramIBinder)
  {
    return zzc.zza.zzab(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */