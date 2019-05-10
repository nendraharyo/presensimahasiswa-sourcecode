package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public class zzcv
  extends zzg
{
  public zzcv()
  {
    super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
  }
  
  private zzcj zzb(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    try
    {
      localObject1 = zze.zzC(paramContext);
      zzd localzzd1 = zze.zzC(paramFrameLayout1);
      zzd localzzd2 = zze.zzC(paramFrameLayout2);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzck)localObject2;
      int i = 8487000;
      localObject2 = ((zzck)localObject2).zza((zzd)localObject1, localzzd1, localzzd2, i);
      localObject2 = zzcj.zza.zzu((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1 = "Could not create remote NativeAdViewDelegate.";
        zzb.zzd((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;) {}
    }
    return (zzcj)localObject2;
  }
  
  protected zzck zzD(IBinder paramIBinder)
  {
    return zzck.zza.zzv(paramIBinder);
  }
  
  public zzcj zza(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    Object localObject = zzn.zzcS();
    boolean bool = ((zza)localObject).zzU(paramContext);
    if (bool)
    {
      localObject = zzb(paramContext, paramFrameLayout1, paramFrameLayout2);
      if (localObject != null) {}
    }
    else
    {
      zzb.zzaI("Using NativeAdViewDelegate from the client jar.");
      localObject = zzn.zzcU().createNativeAdViewDelegate(paramFrameLayout1, paramFrameLayout2);
    }
    return (zzcj)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */