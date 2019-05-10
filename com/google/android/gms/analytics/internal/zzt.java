package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

abstract class zzt
{
  private static volatile Handler zzRC;
  private final zzf zzQj;
  private volatile long zzRD;
  private boolean zzRE;
  private final Runnable zzx;
  
  zzt(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    this.zzQj = paramzzf;
    zzt.1 local1 = new com/google/android/gms/analytics/internal/zzt$1;
    local1.<init>(this);
    this.zzx = local1;
  }
  
  private Handler getHandler()
  {
    Handler localHandler = zzRC;
    if (localHandler != null) {
      localHandler = zzRC;
    }
    for (;;)
    {
      return localHandler;
      synchronized (zzt.class)
      {
        localHandler = zzRC;
        if (localHandler == null)
        {
          localHandler = new android/os/Handler;
          Object localObject2 = this.zzQj;
          localObject2 = ((zzf)localObject2).getContext();
          localObject2 = ((Context)localObject2).getMainLooper();
          localHandler.<init>((Looper)localObject2);
          zzRC = localHandler;
        }
        localHandler = zzRC;
      }
    }
  }
  
  public void cancel()
  {
    this.zzRD = 0L;
    Handler localHandler = getHandler();
    Runnable localRunnable = this.zzx;
    localHandler.removeCallbacks(localRunnable);
  }
  
  public abstract void run();
  
  public boolean zzbw()
  {
    long l1 = this.zzRD;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public long zzkY()
  {
    long l1 = 0L;
    long l2 = this.zzRD;
    boolean bool = l2 < l1;
    if (!bool) {}
    for (;;)
    {
      return l1;
      zzmq localzzmq = this.zzQj.zzjl();
      l1 = localzzmq.currentTimeMillis();
      l2 = this.zzRD;
      l1 = Math.abs(l1 - l2);
    }
  }
  
  public void zzt(long paramLong)
  {
    cancel();
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool)
    {
      l = this.zzQj.zzjl().currentTimeMillis();
      this.zzRD = l;
      Object localObject1 = getHandler();
      Object localObject2 = this.zzx;
      bool = ((Handler)localObject1).postDelayed((Runnable)localObject2, paramLong);
      if (!bool)
      {
        localObject1 = this.zzQj.zzjm();
        localObject2 = "Failed to schedule delayed post. time";
        Long localLong = Long.valueOf(paramLong);
        ((zzaf)localObject1).zze((String)localObject2, localLong);
      }
    }
  }
  
  public void zzu(long paramLong)
  {
    long l1 = 0L;
    boolean bool1 = zzbw();
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = paramLong < l1;
      if (!bool1) {
        break;
      }
      cancel();
    }
    Object localObject1 = this.zzQj.zzjl();
    long l2 = ((zzmq)localObject1).currentTimeMillis();
    long l3 = this.zzRD;
    l2 = Math.abs(l2 - l3);
    l2 = paramLong - l2;
    boolean bool2 = l2 < l1;
    if (bool2) {}
    for (;;)
    {
      localObject1 = getHandler();
      Object localObject2 = this.zzx;
      ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
      localObject1 = getHandler();
      localObject2 = this.zzx;
      bool1 = ((Handler)localObject1).postDelayed((Runnable)localObject2, l1);
      if (bool1) {
        break;
      }
      localObject1 = this.zzQj.zzjm();
      localObject2 = "Failed to adjust delayed post. time";
      Long localLong = Long.valueOf(l1);
      ((zzaf)localObject1).zze((String)localObject2, localLong);
      break;
      l1 = l2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */