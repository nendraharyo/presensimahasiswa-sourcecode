package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class zzgj
  extends zzg
{
  private static final zzgj zzGa;
  
  static
  {
    zzgj localzzgj = new com/google/android/gms/internal/zzgj;
    localzzgj.<init>();
    zzGa = localzzgj;
  }
  
  private zzgj()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }
  
  public static zzge createInAppPurchaseManager(Activity paramActivity)
  {
    try
    {
      bool = zzb(paramActivity);
      if (!bool)
      {
        localObject = zzGa;
        localObject = ((zzgj)localObject).zzd(paramActivity);
        if (localObject != null) {}
      }
      else
      {
        localObject = "Using AdOverlay from the client jar.";
        zzin.zzaI((String)localObject);
        localObject = zzn.zzcU();
        localObject = ((zzl)localObject).createInAppPurchaseManager(paramActivity);
      }
    }
    catch (zzgj.zza localzza)
    {
      for (;;)
      {
        zzin.zzaK(localzza.getMessage());
        boolean bool = false;
        Object localObject = null;
      }
    }
    return (zzge)localObject;
  }
  
  private static boolean zzb(Activity paramActivity)
  {
    Object localObject = paramActivity.getIntent();
    String str = "com.google.android.gms.ads.internal.purchase.useClientJar";
    boolean bool = ((Intent)localObject).hasExtra(str);
    if (!bool)
    {
      localObject = new com/google/android/gms/internal/zzgj$zza;
      ((zzgj.zza)localObject).<init>("InAppPurchaseManager requires the useClientJar flag in intent extras.");
      throw ((Throwable)localObject);
    }
    return ((Intent)localObject).getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
  }
  
  private zzge zzd(Activity paramActivity)
  {
    try
    {
      localObject1 = zze.zzC(paramActivity);
      localObject2 = zzaB(paramActivity);
      localObject2 = (zzgf)localObject2;
      localObject2 = ((zzgf)localObject2).zzf((zzd)localObject1);
      localObject2 = zzge.zza.zzQ((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "Could not create remote InAppPurchaseManager.";
        zzin.zzd((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        Object localObject1 = "Could not create remote InAppPurchaseManager.";
        zzin.zzd((String)localObject1, localzza);
        Object localObject4 = null;
      }
    }
    return (zzge)localObject2;
  }
  
  protected zzgf zzU(IBinder paramIBinder)
  {
    return zzgf.zza.zzR(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */