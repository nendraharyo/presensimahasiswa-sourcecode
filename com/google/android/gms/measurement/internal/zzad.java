package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.zzmq;

public class zzad
  extends zzz
{
  private Handler mHandler;
  private long zzaZa;
  private final Runnable zzaZb;
  private final zzf zzaZc;
  private final zzf zzaZd;
  
  zzad(zzw paramzzw)
  {
    super(paramzzw);
    Object localObject = new com/google/android/gms/measurement/internal/zzad$1;
    ((zzad.1)localObject).<init>(this);
    this.zzaZb = ((Runnable)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzad$2;
    zzw localzzw = this.zzaTV;
    ((zzad.2)localObject).<init>(this, localzzw);
    this.zzaZc = ((zzf)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzad$3;
    localzzw = this.zzaTV;
    ((zzad.3)localObject).<init>(this, localzzw);
    this.zzaZd = ((zzf)localObject);
  }
  
  private void zzDv()
  {
    try
    {
      Handler localHandler = this.mHandler;
      if (localHandler == null)
      {
        localHandler = new android/os/Handler;
        Looper localLooper = Looper.getMainLooper();
        localHandler.<init>(localLooper);
        this.mHandler = localHandler;
      }
      return;
    }
    finally {}
  }
  
  private void zzDy()
  {
    zzjk();
    long l = zzjl().elapsedRealtime();
    zzp.zza localzza = zzAo().zzCK();
    Object localObject = Long.valueOf(l);
    localzza.zzj("Session started, time", localObject);
    zzCo().zzaXu.set(false);
    localObject = zzCf();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    ((zzab)localObject).zze("auto", "_s", localBundle);
  }
  
  private void zzDz()
  {
    long l1 = 3600000L;
    long l2 = 0L;
    zzjk();
    Object localObject1 = zzjl();
    long l3 = ((zzmq)localObject1).elapsedRealtime();
    long l4 = this.zzaZa;
    boolean bool = l4 < l2;
    if (!bool)
    {
      l4 = l3 - l1;
      this.zzaZa = l4;
    }
    l4 = zzCo().zzaXw.get();
    long l5 = this.zzaZa;
    l5 = l3 - l5;
    l4 += l5;
    zzCo().zzaXw.set(l4);
    Object localObject2 = zzAo().zzCK();
    Long localLong = Long.valueOf(l4);
    ((zzp.zza)localObject2).zzj("Recording user engagement, ms", localLong);
    localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    ((Bundle)localObject2).putLong("_et", l4);
    zzCf().zze("auto", "_e", (Bundle)localObject2);
    zzCo().zzaXw.set(l2);
    this.zzaZa = l3;
    localObject1 = this.zzaZd;
    l4 = zzCo().zzaXw.get();
    l4 = l1 - l4;
    l4 = Math.max(l2, l4);
    ((zzf)localObject1).zzt(l4);
  }
  
  private void zzae(long paramLong)
  {
    long l1 = 0L;
    zzjk();
    zzDv();
    this.zzaZc.cancel();
    this.zzaZd.cancel();
    Object localObject1 = zzAo().zzCK();
    Object localObject2 = "Activity resumed, time";
    Object localObject3 = Long.valueOf(paramLong);
    ((zzp.zza)localObject1).zzj((String)localObject2, localObject3);
    this.zzaZa = paramLong;
    localObject1 = zzjl();
    long l2 = ((zzmq)localObject1).currentTimeMillis();
    long l3 = zzCo().zzaXt.get();
    l2 -= l3;
    localObject3 = zzCo().zzaXv;
    l3 = ((zzt.zzb)localObject3).get();
    boolean bool1 = l2 < l3;
    if (bool1)
    {
      localObject1 = zzCo().zzaXu;
      boolean bool2 = true;
      ((zzt.zza)localObject1).set(bool2);
      localObject1 = zzCo().zzaXw;
      ((zzt.zzb)localObject1).set(l1);
    }
    localObject1 = zzCo().zzaXu;
    bool1 = ((zzt.zza)localObject1).get();
    long l4;
    if (bool1)
    {
      localObject1 = this.zzaZc;
      l3 = zzCo().zzaXs.get();
      localObject2 = zzCo().zzaXw;
      l4 = ((zzt.zzb)localObject2).get();
      l3 -= l4;
      l3 = Math.max(l1, l3);
      ((zzf)localObject1).zzt(l3);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaZd;
      localObject2 = zzCo().zzaXw;
      l4 = ((zzt.zzb)localObject2).get();
      l3 = 3600000L - l4;
      l3 = Math.max(l1, l3);
      ((zzf)localObject1).zzt(l3);
    }
  }
  
  private void zzaf(long paramLong)
  {
    zzjk();
    zzDv();
    this.zzaZc.cancel();
    this.zzaZd.cancel();
    Object localObject1 = zzAo().zzCK();
    Object localObject3 = "Activity paused, time";
    Long localLong = Long.valueOf(paramLong);
    ((zzp.zza)localObject1).zzj((String)localObject3, localLong);
    long l1 = this.zzaZa;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      localObject1 = zzCo().zzaXw;
      localObject3 = zzCo().zzaXw;
      l2 = ((zzt.zzb)localObject3).get();
      long l3 = this.zzaZa;
      l3 = paramLong - l3;
      l2 += l3;
      ((zzt.zzb)localObject1).set(l2);
    }
    localObject1 = zzCo().zzaXv;
    localObject3 = zzjl();
    l2 = ((zzmq)localObject3).currentTimeMillis();
    ((zzt.zzb)localObject1).set(l2);
    try
    {
      localObject1 = zzCo();
      localObject1 = ((zzt)localObject1).zzaXu;
      bool = ((zzt.zza)localObject1).get();
      if (!bool)
      {
        localObject1 = this.mHandler;
        localObject3 = this.zzaZb;
        l2 = 1000L;
        ((Handler)localObject1).postDelayed((Runnable)localObject3, l2);
      }
      return;
    }
    finally {}
  }
  
  protected void zzDu()
  {
    try
    {
      zzDv();
      Handler localHandler = this.mHandler;
      Runnable localRunnable = this.zzaZb;
      localHandler.removeCallbacks(localRunnable);
      long l = zzjl().elapsedRealtime();
      zzv localzzv = zzCn();
      zzad.4 local4 = new com/google/android/gms/measurement/internal/zzad$4;
      local4.<init>(this, l);
      localzzv.zzg(local4);
      return;
    }
    finally {}
  }
  
  protected void zzDw()
  {
    long l = zzjl().elapsedRealtime();
    zzv localzzv = zzCn();
    zzad.5 local5 = new com/google/android/gms/measurement/internal/zzad$5;
    local5.<init>(this, l);
    localzzv.zzg(local5);
  }
  
  public void zzDx()
  {
    long l1 = 0L;
    zzjk();
    Object localObject1 = zzAo().zzCJ();
    String str1 = "Application backgrounded. Logging engagement";
    ((zzp.zza)localObject1).zzfg(str1);
    localObject1 = zzCo().zzaXw;
    long l2 = ((zzt.zzb)localObject1).get();
    boolean bool = l2 < l1;
    Object localObject2;
    String str2;
    if (bool)
    {
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      ((Bundle)localObject2).putLong("_et", l2);
      localObject1 = zzCf();
      str1 = "auto";
      str2 = "_e";
      ((zzab)localObject1).zze(str1, str2, (Bundle)localObject2);
      localObject1 = zzCo().zzaXw;
      ((zzt.zzb)localObject1).set(l1);
    }
    for (;;)
    {
      return;
      localObject2 = zzAo().zzCF();
      str2 = "Not logging non-positive engagement time";
      localObject1 = Long.valueOf(l2);
      ((zzp.zza)localObject2).zzj(str2, localObject1);
    }
  }
  
  protected void zziJ() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */