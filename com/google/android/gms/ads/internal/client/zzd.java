package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;

public final class zzd
  extends zzg
{
  private static final zzd zztB;
  
  static
  {
    zzd localzzd = new com/google/android/gms/ads/internal/client/zzd;
    localzzd.<init>();
    zztB = localzzd;
  }
  
  private zzd()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public static zzs zza(Context paramContext, String paramString, zzew paramzzew)
  {
    int i = 8487000;
    Object localObject = zzn.zzcS();
    boolean bool1 = ((zza)localObject).zzU(paramContext);
    if (bool1)
    {
      localObject = zztB.zzb(paramContext, paramString, paramzzew);
      if (localObject != null) {}
    }
    else
    {
      zzb.zzaI("Using AdLoader from the client jar.");
      localObject = new com/google/android/gms/ads/internal/util/client/VersionInfoParcel;
      boolean bool2 = true;
      ((VersionInfoParcel)localObject).<init>(i, i, bool2);
      zzl localzzl = zzn.zzcU();
      localObject = localzzl.createAdLoaderBuilder(paramContext, paramString, paramzzew, (VersionInfoParcel)localObject);
    }
    return (zzs)localObject;
  }
  
  private zzs zzb(Context paramContext, String paramString, zzew paramzzew)
  {
    try
    {
      localObject1 = zze.zzC(paramContext);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzt)localObject2;
      int i = 8487000;
      localObject2 = ((zzt)localObject2).zza((com.google.android.gms.dynamic.zzd)localObject1, paramString, paramzzew, i);
      localObject2 = zzs.zza.zzi((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not create remote builder for AdLoader.";
        zzb.zzd((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        Object localObject1 = "Could not create remote builder for AdLoader.";
        zzb.zzd((String)localObject1, localzza);
      }
    }
    return (zzs)localObject2;
  }
  
  protected zzt zzc(IBinder paramIBinder)
  {
    return zzt.zza.zzj(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */