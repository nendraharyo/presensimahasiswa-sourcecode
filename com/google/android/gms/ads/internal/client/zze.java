package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;

public class zze
  extends zzg
{
  public zze()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  private zzu zza(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, int paramInt)
  {
    try
    {
      localObject1 = com.google.android.gms.dynamic.zze.zzC(paramContext);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzv)localObject2;
      int i = 8487000;
      localObject2 = ((zzv)localObject2).zza((zzd)localObject1, paramAdSizeParcel, paramString, paramzzew, i, paramInt);
      localObject2 = zzu.zza.zzk((IBinder)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1 = "Could not create remote AdManager.";
        zzb.zza((String)localObject1, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;) {}
    }
    return (zzu)localObject2;
  }
  
  public zzu zza(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew)
  {
    int i = 8487000;
    int j = 1;
    Object localObject = zzn.zzcS();
    boolean bool = ((zza)localObject).zzU(paramContext);
    if (bool)
    {
      localObject = this;
      localObject = zza(paramContext, paramAdSizeParcel, paramString, paramzzew, j);
      if (localObject != null) {}
    }
    else
    {
      zzb.zzaI("Using BannerAdManager from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new com/google/android/gms/ads/internal/util/client/VersionInfoParcel;
      localVersionInfoParcel.<init>(i, i, j);
      localObject = zzn.zzcU().createBannerAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, localVersionInfoParcel);
    }
    return (zzu)localObject;
  }
  
  public zzu zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew)
  {
    int i = 8487000;
    Object localObject = zzn.zzcS();
    boolean bool = ((zza)localObject).zzU(paramContext);
    if (bool)
    {
      int j = 2;
      localObject = this;
      localObject = zza(paramContext, paramAdSizeParcel, paramString, paramzzew, j);
      if (localObject != null) {}
    }
    else
    {
      zzb.zzaK("Using InterstitialAdManager from the client jar.");
      VersionInfoParcel localVersionInfoParcel = new com/google/android/gms/ads/internal/util/client/VersionInfoParcel;
      bool = true;
      localVersionInfoParcel.<init>(i, i, bool);
      localObject = zzn.zzcU().createInterstitialAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, localVersionInfoParcel);
    }
    return (zzu)localObject;
  }
  
  protected zzv zze(IBinder paramIBinder)
  {
    return zzv.zza.zzl(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */