package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class zzcm
  implements zzp.zze
{
  private boolean mClosed;
  private final Context mContext;
  private final String zzbhM;
  private String zzbij;
  private zzbf zzbkg;
  private zzs zzbkh;
  private final ScheduledExecutorService zzbkj;
  private final zzcm.zza zzbkk;
  private ScheduledFuture zzbkl;
  
  public zzcm(Context paramContext, String paramString, zzs paramzzs)
  {
    this(paramContext, paramString, paramzzs, null, null);
  }
  
  zzcm(Context paramContext, String paramString, zzs paramzzs, zzcm.zzb paramzzb, zzcm.zza paramzza)
  {
    this.zzbkh = paramzzs;
    this.mContext = paramContext;
    this.zzbhM = paramString;
    if (paramzzb == null)
    {
      paramzzb = new com/google/android/gms/tagmanager/zzcm$1;
      paramzzb.<init>(this);
    }
    Object localObject = paramzzb.zzHb();
    this.zzbkj = ((ScheduledExecutorService)localObject);
    if (paramzza == null)
    {
      localObject = new com/google/android/gms/tagmanager/zzcm$2;
      ((zzcm.2)localObject).<init>(this);
    }
    for (this.zzbkk = ((zzcm.zza)localObject);; this.zzbkk = paramzza) {
      return;
    }
  }
  
  private void zzHa()
  {
    try
    {
      boolean bool = this.mClosed;
      if (bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        String str = "called method after closed";
        localIllegalStateException.<init>(str);
        throw localIllegalStateException;
      }
    }
    finally {}
  }
  
  private zzcl zzgm(String paramString)
  {
    Object localObject1 = this.zzbkk;
    Object localObject2 = this.zzbkh;
    localObject1 = ((zzcm.zza)localObject1).zza((zzs)localObject2);
    localObject2 = this.zzbkg;
    ((zzcl)localObject1).zza((zzbf)localObject2);
    localObject2 = this.zzbij;
    ((zzcl)localObject1).zzfW((String)localObject2);
    ((zzcl)localObject1).zzgl(paramString);
    return (zzcl)localObject1;
  }
  
  public void release()
  {
    try
    {
      zzHa();
      Object localObject1 = this.zzbkl;
      if (localObject1 != null)
      {
        localObject1 = this.zzbkl;
        ((ScheduledFuture)localObject1).cancel(false);
      }
      localObject1 = this.zzbkj;
      ((ScheduledExecutorService)localObject1).shutdown();
      boolean bool = true;
      this.mClosed = bool;
      return;
    }
    finally {}
  }
  
  public void zza(zzbf paramzzbf)
  {
    try
    {
      zzHa();
      this.zzbkg = paramzzbf;
      return;
    }
    finally {}
  }
  
  public void zzf(long paramLong, String paramString)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "loadAfterDelay: containerId=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = this.zzbhM;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = " delay=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      zzbg.v((String)localObject1);
      zzHa();
      localObject1 = this.zzbkg;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = "callback must be set before loadAfterDelay() is called.";
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.zzbkl;
    if (localObject3 != null)
    {
      localObject3 = this.zzbkl;
      localObject4 = null;
      ((ScheduledFuture)localObject3).cancel(false);
    }
    localObject3 = this.zzbkj;
    Object localObject4 = zzgm(paramString);
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    localObject3 = ((ScheduledExecutorService)localObject3).schedule((Runnable)localObject4, paramLong, localTimeUnit);
    this.zzbkl = ((ScheduledFuture)localObject3);
  }
  
  public void zzfW(String paramString)
  {
    try
    {
      zzHa();
      this.zzbij = paramString;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */