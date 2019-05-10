package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;

public class zzf
{
  private static zzf zzQn;
  private final Context mContext;
  private final zzu zzQA;
  private final Context zzQo;
  private final zzr zzQp;
  private final zzaf zzQq;
  private final com.google.android.gms.measurement.zzg zzQr;
  private final zzb zzQs;
  private final zzv zzQt;
  private final zzan zzQu;
  private final zzai zzQv;
  private final GoogleAnalytics zzQw;
  private final zzn zzQx;
  private final zza zzQy;
  private final zzk zzQz;
  private final zzmq zzqW;
  
  protected zzf(zzg paramzzg)
  {
    Object localObject1 = paramzzg.getApplicationContext();
    zzx.zzb(localObject1, "Application context can't be null");
    boolean bool1 = localObject1 instanceof Application;
    Object localObject2 = "getApplicationContext didn't return the application";
    zzx.zzb(bool1, localObject2);
    Object localObject3 = paramzzg.zzjx();
    zzx.zzz(localObject3);
    this.mContext = ((Context)localObject1);
    this.zzQo = ((Context)localObject3);
    localObject3 = paramzzg.zzh(this);
    this.zzqW = ((zzmq)localObject3);
    localObject3 = paramzzg.zzg(this);
    this.zzQp = ((zzr)localObject3);
    localObject3 = paramzzg.zzf(this);
    ((zzaf)localObject3).zza();
    this.zzQq = ((zzaf)localObject3);
    localObject3 = zzjn();
    bool1 = ((zzr)localObject3).zzkr();
    Object localObject4;
    if (bool1)
    {
      localObject3 = zzjm();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Google Analytics ");
      localObject4 = zze.VERSION;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject4 = " is starting up.";
      localObject2 = (String)localObject4;
      ((zzaf)localObject3).zzbf((String)localObject2);
    }
    for (;;)
    {
      localObject3 = paramzzg.zzq(this);
      ((zzai)localObject3).zza();
      this.zzQv = ((zzai)localObject3);
      localObject3 = paramzzg.zze(this);
      ((zzan)localObject3).zza();
      this.zzQu = ((zzan)localObject3);
      localObject3 = paramzzg.zzl(this);
      localObject2 = paramzzg.zzd(this);
      localObject4 = paramzzg.zzc(this);
      Object localObject5 = paramzzg.zzb(this);
      zzu localzzu = paramzzg.zza(this);
      localObject1 = paramzzg.zzab((Context)localObject1);
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = zzjw();
      ((com.google.android.gms.measurement.zzg)localObject1).zza(localUncaughtExceptionHandler);
      this.zzQr = ((com.google.android.gms.measurement.zzg)localObject1);
      localObject1 = paramzzg.zzi(this);
      ((zzn)localObject2).zza();
      this.zzQx = ((zzn)localObject2);
      ((zza)localObject4).zza();
      this.zzQy = ((zza)localObject4);
      ((zzk)localObject5).zza();
      this.zzQz = ((zzk)localObject5);
      localzzu.zza();
      this.zzQA = localzzu;
      localObject2 = paramzzg.zzp(this);
      ((zzv)localObject2).zza();
      this.zzQt = ((zzv)localObject2);
      ((zzb)localObject3).zza();
      this.zzQs = ((zzb)localObject3);
      localObject2 = zzjn();
      boolean bool2 = ((zzr)localObject2).zzkr();
      if (bool2)
      {
        localObject2 = zzjm();
        localObject4 = "Device AnalyticsService version";
        localObject5 = zze.VERSION;
        ((zzaf)localObject2).zzb((String)localObject4, localObject5);
      }
      ((GoogleAnalytics)localObject1).zza();
      this.zzQw = ((GoogleAnalytics)localObject1);
      ((zzb)localObject3).start();
      return;
      localObject3 = zzjm();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Google Analytics ");
      localObject4 = zze.VERSION;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n");
      localObject4 = "  adb logcat -s GAv4";
      localObject2 = (String)localObject4;
      ((zzaf)localObject3).zzbf((String)localObject2);
    }
  }
  
  private void zza(zzd paramzzd)
  {
    zzx.zzb(paramzzd, "Analytics service not created/initialized");
    zzx.zzb(paramzzd.isInitialized(), "Analytics service not initialized");
  }
  
  public static zzf zzaa(Context paramContext)
  {
    zzx.zzz(paramContext);
    Object localObject1 = zzQn;
    if (localObject1 == null) {}
    synchronized (zzf.class)
    {
      localObject1 = zzQn;
      if (localObject1 == null)
      {
        localObject1 = zzmt.zzsc();
        long l1 = ((zzmq)localObject1).elapsedRealtime();
        Object localObject3 = paramContext.getApplicationContext();
        zzg localzzg = new com/google/android/gms/analytics/internal/zzg;
        localzzg.<init>((Context)localObject3);
        localObject3 = new com/google/android/gms/analytics/internal/zzf;
        ((zzf)localObject3).<init>(localzzg);
        zzQn = (zzf)localObject3;
        GoogleAnalytics.zziF();
        long l2 = ((zzmq)localObject1).elapsedRealtime();
        l1 = l2 - l1;
        localObject1 = zzy.zzSz;
        localObject1 = ((zzy.zza)localObject1).get();
        localObject1 = (Long)localObject1;
        l2 = ((Long)localObject1).longValue();
        boolean bool = l1 < l2;
        if (bool)
        {
          localObject1 = ((zzf)localObject3).zzjm();
          localObject3 = "Slow initialization (ms)";
          Long localLong1 = Long.valueOf(l1);
          Long localLong2 = Long.valueOf(l2);
          ((zzaf)localObject1).zzc((String)localObject3, localLong1, localLong2);
        }
      }
      return zzQn;
    }
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public zzb zziH()
  {
    zzb localzzb = this.zzQs;
    zza(localzzb);
    return this.zzQs;
  }
  
  public zzan zziI()
  {
    zzan localzzan = this.zzQu;
    zza(localzzan);
    return this.zzQu;
  }
  
  public zzai zzjA()
  {
    zzai localzzai = this.zzQv;
    boolean bool;
    if (localzzai != null)
    {
      localzzai = this.zzQv;
      bool = localzzai.isInitialized();
      if (bool) {}
    }
    else
    {
      bool = false;
    }
    for (localzzai = null;; localzzai = this.zzQv) {
      return localzzai;
    }
  }
  
  public zza zzjB()
  {
    zza localzza = this.zzQy;
    zza(localzza);
    return this.zzQy;
  }
  
  public zzn zzjC()
  {
    zzn localzzn = this.zzQx;
    zza(localzzn);
    return this.zzQx;
  }
  
  public void zzjk() {}
  
  public zzmq zzjl()
  {
    return this.zzqW;
  }
  
  public zzaf zzjm()
  {
    zzaf localzzaf = this.zzQq;
    zza(localzzaf);
    return this.zzQq;
  }
  
  public zzr zzjn()
  {
    return this.zzQp;
  }
  
  public com.google.android.gms.measurement.zzg zzjo()
  {
    zzx.zzz(this.zzQr);
    return this.zzQr;
  }
  
  public zzv zzjp()
  {
    zzv localzzv = this.zzQt;
    zza(localzzv);
    return this.zzQt;
  }
  
  public zzai zzjq()
  {
    zzai localzzai = this.zzQv;
    zza(localzzai);
    return this.zzQv;
  }
  
  public zzk zzjt()
  {
    zzk localzzk = this.zzQz;
    zza(localzzk);
    return this.zzQz;
  }
  
  public zzu zzju()
  {
    return this.zzQA;
  }
  
  protected Thread.UncaughtExceptionHandler zzjw()
  {
    zzf.1 local1 = new com/google/android/gms/analytics/internal/zzf$1;
    local1.<init>(this);
    return local1;
  }
  
  public Context zzjx()
  {
    return this.zzQo;
  }
  
  public zzaf zzjy()
  {
    return this.zzQq;
  }
  
  public GoogleAnalytics zzjz()
  {
    zzx.zzz(this.zzQw);
    zzx.zzb(this.zzQw.isInitialized(), "Analytics instance not initialized");
    return this.zzQw;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */