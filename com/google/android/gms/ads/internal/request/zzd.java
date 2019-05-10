package com.google.android.gms.ads.internal.request;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;
import com.google.android.gms.internal.zzji.zza;

public abstract class zzd
  implements zzc.zza, zzit
{
  private final zzji zzHl;
  private final zzc.zza zzHm;
  private final Object zzpV;
  
  public zzd(zzji paramzzji, zzc.zza paramzza)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzHl = paramzzji;
    this.zzHm = paramzza;
  }
  
  public void cancel()
  {
    zzgr();
  }
  
  boolean zza(zzj paramzzj, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    bool = true;
    try
    {
      zzg localzzg = new com/google/android/gms/ads/internal/request/zzg;
      localzzg.<init>(this);
      paramzzj.zza(paramAdRequestInfoParcel, localzzg);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzin.zzd("Could not fetch ad response from ad request service.", localRemoteException);
        localzzih = zzr.zzbF();
        localzzih.zzb(localRemoteException, bool);
        zzc.zza localzza = this.zzHm;
        AdResponseParcel localAdResponseParcel = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        localAdResponseParcel.<init>(0);
        localzza.zzb(localAdResponseParcel);
        bool = false;
        localzza = null;
      }
    }
    catch (NullPointerException localNullPointerException) {}catch (SecurityException localSecurityException) {}finally
    {
      for (;;)
      {
        zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", localThrowable);
        zzih localzzih = zzr.zzbF();
        localzzih.zzb(localThrowable, bool);
      }
    }
    return bool;
  }
  
  public void zzb(AdResponseParcel paramAdResponseParcel)
  {
    synchronized (this.zzpV)
    {
      zzc.zza localzza = this.zzHm;
      localzza.zzb(paramAdResponseParcel);
      zzgr();
      return;
    }
  }
  
  public Void zzga()
  {
    Object localObject1 = zzgs();
    Object localObject2;
    zzd.1 local1;
    if (localObject1 == null)
    {
      localObject1 = this.zzHm;
      localObject2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      local1 = null;
      ((AdResponseParcel)localObject2).<init>(0);
      ((zzc.zza)localObject1).zzb((AdResponseParcel)localObject2);
      zzgr();
    }
    for (;;)
    {
      return null;
      localObject2 = this.zzHl;
      local1 = new com/google/android/gms/ads/internal/request/zzd$1;
      local1.<init>(this, (zzj)localObject1);
      localObject1 = new com/google/android/gms/ads/internal/request/zzd$2;
      ((zzd.2)localObject1).<init>(this);
      ((zzji)localObject2).zza(local1, (zzji.zza)localObject1);
    }
  }
  
  public abstract void zzgr();
  
  public abstract zzj zzgs();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */