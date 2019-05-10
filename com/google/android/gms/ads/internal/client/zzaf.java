package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public class zzaf
  extends zzg
{
  public zzaf()
  {
    super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
  }
  
  private zzy zzv(Context paramContext)
  {
    try
    {
      localObject1 = zze.zzC(paramContext);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzz)localObject2;
      int i = 8487000;
      localObject2 = ((zzz)localObject2).zza((zzd)localObject1, i);
      localObject2 = zzy.zza.zzo((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not get remote MobileAdsSettingManager.";
        zzb.zzd((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        Object localObject1 = "Could not get remote MobileAdsSettingManager.";
        zzb.zzd((String)localObject1, localzza);
        Object localObject4 = null;
      }
    }
    return (zzy)localObject2;
  }
  
  protected zzz zzq(IBinder paramIBinder)
  {
    return zzz.zza.zzp(paramIBinder);
  }
  
  public zzy zzu(Context paramContext)
  {
    int i = 8487000;
    Object localObject = zzn.zzcS();
    boolean bool1 = ((zza)localObject).zzU(paramContext);
    if (bool1)
    {
      localObject = zzv(paramContext);
      if (localObject != null) {}
    }
    else
    {
      zzb.zzaI("Using MobileAdsSettingManager from the client jar.");
      localObject = new com/google/android/gms/ads/internal/util/client/VersionInfoParcel;
      boolean bool2 = true;
      ((VersionInfoParcel)localObject).<init>(i, i, bool2);
      localObject = zzn.zzcU().getMobileAdsSettingsManager(paramContext);
    }
    return (zzy)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzaf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */