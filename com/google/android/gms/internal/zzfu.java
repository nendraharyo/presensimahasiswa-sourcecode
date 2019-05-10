package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class zzfu
  extends zzg
{
  private static final zzfu zzFp;
  
  static
  {
    zzfu localzzfu = new com/google/android/gms/internal/zzfu;
    localzzfu.<init>();
    zzFp = localzzfu;
  }
  
  private zzfu()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public static zzfv createAdOverlay(Activity paramActivity)
  {
    try
    {
      bool = zzb(paramActivity);
      if (!bool)
      {
        localObject = zzFp;
        localObject = ((zzfu)localObject).zzc(paramActivity);
        if (localObject != null) {}
      }
      else
      {
        localObject = "Using AdOverlay from the client jar.";
        zzb.zzaI((String)localObject);
        localObject = zzn.zzcU();
        localObject = ((zzl)localObject).createAdOverlay(paramActivity);
      }
    }
    catch (zzfu.zza localzza)
    {
      for (;;)
      {
        zzb.zzaK(localzza.getMessage());
        boolean bool = false;
        Object localObject = null;
      }
    }
    return (zzfv)localObject;
  }
  
  private static boolean zzb(Activity paramActivity)
  {
    Object localObject = paramActivity.getIntent();
    String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
    boolean bool = ((Intent)localObject).hasExtra(str);
    if (!bool)
    {
      localObject = new com/google/android/gms/internal/zzfu$zza;
      ((zzfu.zza)localObject).<init>("Ad overlay requires the useClientJar flag in intent extras.");
      throw ((Throwable)localObject);
    }
    return ((Intent)localObject).getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }
  
  private zzfv zzc(Activity paramActivity)
  {
    try
    {
      localObject1 = zze.zzC(paramActivity);
      localObject2 = zzaB(paramActivity);
      localObject2 = (zzfw)localObject2;
      localObject2 = ((zzfw)localObject2).zze((zzd)localObject1);
      localObject2 = zzfv.zza.zzL((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not create remote AdOverlay.";
        zzb.zzd((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        Object localObject1 = "Could not create remote AdOverlay.";
        zzb.zzd((String)localObject1, localzza);
        Object localObject4 = null;
      }
    }
    return (zzfv)localObject2;
  }
  
  protected zzfw zzK(IBinder paramIBinder)
  {
    return zzfw.zza.zzM(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */