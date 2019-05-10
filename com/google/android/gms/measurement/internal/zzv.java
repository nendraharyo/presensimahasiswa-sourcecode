package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public class zzv
  extends zzz
{
  private zzv.zzc zzaXI;
  private zzv.zzc zzaXJ;
  private final BlockingQueue zzaXK;
  private final BlockingQueue zzaXL;
  private final Thread.UncaughtExceptionHandler zzaXM;
  private final Thread.UncaughtExceptionHandler zzaXN;
  private final Object zzaXO;
  private final Semaphore zzaXP;
  private volatile boolean zzaXQ;
  
  zzv(zzw paramzzw)
  {
    super(paramzzw);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzaXO = localObject;
    localObject = new java/util/concurrent/Semaphore;
    ((Semaphore)localObject).<init>(2);
    this.zzaXP = ((Semaphore)localObject);
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    this.zzaXK = ((BlockingQueue)localObject);
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    this.zzaXL = ((BlockingQueue)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzv$zzb;
    ((zzv.zzb)localObject).<init>(this, "Thread death: Uncaught exception on worker thread");
    this.zzaXM = ((Thread.UncaughtExceptionHandler)localObject);
    localObject = new com/google/android/gms/measurement/internal/zzv$zzb;
    ((zzv.zzb)localObject).<init>(this, "Thread death: Uncaught exception on network thread");
    this.zzaXN = ((Thread.UncaughtExceptionHandler)localObject);
  }
  
  private void zza(FutureTask paramFutureTask)
  {
    synchronized (this.zzaXO)
    {
      Object localObject2 = this.zzaXK;
      ((BlockingQueue)localObject2).add(paramFutureTask);
      localObject2 = this.zzaXI;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/measurement/internal/zzv$zzc;
        Object localObject4 = "Measurement Worker";
        BlockingQueue localBlockingQueue = this.zzaXK;
        ((zzv.zzc)localObject2).<init>(this, (String)localObject4, localBlockingQueue);
        this.zzaXI = ((zzv.zzc)localObject2);
        localObject2 = this.zzaXI;
        localObject4 = this.zzaXM;
        ((zzv.zzc)localObject2).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject4);
        localObject2 = this.zzaXI;
        ((zzv.zzc)localObject2).start();
        return;
      }
      localObject2 = this.zzaXI;
      ((zzv.zzc)localObject2).zzfb();
    }
  }
  
  private void zzb(FutureTask paramFutureTask)
  {
    synchronized (this.zzaXO)
    {
      Object localObject2 = this.zzaXL;
      ((BlockingQueue)localObject2).add(paramFutureTask);
      localObject2 = this.zzaXJ;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/measurement/internal/zzv$zzc;
        Object localObject4 = "Measurement Network";
        BlockingQueue localBlockingQueue = this.zzaXL;
        ((zzv.zzc)localObject2).<init>(this, (String)localObject4, localBlockingQueue);
        this.zzaXJ = ((zzv.zzc)localObject2);
        localObject2 = this.zzaXJ;
        localObject4 = this.zzaXN;
        ((zzv.zzc)localObject2).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject4);
        localObject2 = this.zzaXJ;
        ((zzv.zzc)localObject2).start();
        return;
      }
      localObject2 = this.zzaXJ;
      ((zzv.zzc)localObject2).zzfb();
    }
  }
  
  public void zzCd()
  {
    Object localObject = Thread.currentThread();
    zzv.zzc localzzc = this.zzaXJ;
    if (localObject != localzzc)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Call expected from network thread");
      throw ((Throwable)localObject);
    }
  }
  
  public Future zzd(Callable paramCallable)
  {
    zzjv();
    zzx.zzz(paramCallable);
    zzv.zza localzza = new com/google/android/gms/measurement/internal/zzv$zza;
    localzza.<init>(this, paramCallable, "Task exception on worker thread");
    Thread localThread = Thread.currentThread();
    zzv.zzc localzzc = this.zzaXI;
    if (localThread == localzzc) {
      localzza.run();
    }
    for (;;)
    {
      return localzza;
      zza(localzza);
    }
  }
  
  public void zzg(Runnable paramRunnable)
  {
    zzjv();
    zzx.zzz(paramRunnable);
    zzv.zza localzza = new com/google/android/gms/measurement/internal/zzv$zza;
    localzza.<init>(this, paramRunnable, "Task exception on worker thread");
    zza(localzza);
  }
  
  public void zzh(Runnable paramRunnable)
  {
    zzjv();
    zzx.zzz(paramRunnable);
    zzv.zza localzza = new com/google/android/gms/measurement/internal/zzv$zza;
    localzza.<init>(this, paramRunnable, "Task exception on network thread");
    zzb(localzza);
  }
  
  protected void zziJ() {}
  
  public void zzjk()
  {
    Object localObject = Thread.currentThread();
    zzv.zzc localzzc = this.zzaXI;
    if (localObject != localzzc)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Call expected from worker thread");
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */