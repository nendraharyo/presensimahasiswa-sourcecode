package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

abstract class zzf
{
  private static volatile Handler zzRC;
  private volatile long zzRD;
  private final zzw zzaTV;
  private boolean zzaVI;
  private final Runnable zzx;
  
  zzf(zzw paramzzw)
  {
    zzx.zzz(paramzzw);
    this.zzaTV = paramzzw;
    this.zzaVI = true;
    zzf.1 local1 = new com/google/android/gms/measurement/internal/zzf$1;
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
      synchronized (zzf.class)
      {
        localHandler = zzRC;
        if (localHandler == null)
        {
          localHandler = new android/os/Handler;
          Object localObject2 = this.zzaTV;
          localObject2 = ((zzw)localObject2).getContext();
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
  
  public void zzt(long paramLong)
  {
    cancel();
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool)
    {
      l = this.zzaTV.zzjl().currentTimeMillis();
      this.zzRD = l;
      Object localObject1 = getHandler();
      Object localObject2 = this.zzx;
      bool = ((Handler)localObject1).postDelayed((Runnable)localObject2, paramLong);
      if (!bool)
      {
        localObject1 = this.zzaTV.zzAo().zzCE();
        localObject2 = "Failed to schedule delayed post. time";
        Long localLong = Long.valueOf(paramLong);
        ((zzp.zza)localObject1).zzj((String)localObject2, localLong);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */