package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzjd
  implements zzjg
{
  private boolean zzCy;
  private Object zzNc;
  private boolean zzNd;
  private final zzjh zzNe;
  private final Object zzpV;
  
  public zzjd()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzNc = null;
    this.zzNd = false;
    this.zzCy = false;
    localObject = new com/google/android/gms/internal/zzjh;
    ((zzjh)localObject).<init>();
    this.zzNe = ((zzjh)localObject);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = true;
    if (!paramBoolean) {}
    for (;;)
    {
      return bool1;
      synchronized (this.zzpV)
      {
        boolean bool3 = this.zzNd;
        if (!bool3) {}
      }
      bool1 = true;
      this.zzCy = bool1;
      bool1 = true;
      this.zzNd = bool1;
      Object localObject3 = this.zzpV;
      localObject3.notifyAll();
      localObject3 = this.zzNe;
      ((zzjh)localObject3).zzhK();
      bool1 = bool2;
    }
  }
  
  public Object get()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNd;
      if (!bool) {}
      try
      {
        localObject2 = this.zzpV;
        localObject2.wait();
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject2;
        String str;
        Object localObject4;
        for (;;) {}
      }
      bool = this.zzCy;
      if (bool)
      {
        localObject2 = new java/util/concurrent/CancellationException;
        str = "CallbackFuture was cancelled.";
        ((CancellationException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    localObject4 = this.zzNc;
    return localObject4;
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    synchronized (this.zzpV)
    {
      bool = this.zzNd;
      if (!bool) {}
      try
      {
        long l1 = paramTimeUnit.toMillis(paramLong);
        long l2 = 0L;
        bool = l1 < l2;
        if (bool)
        {
          localObject2 = this.zzpV;
          localObject2.wait(l1);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject2;
        String str;
        Object localObject4;
        for (;;) {}
      }
      bool = this.zzNd;
      if (!bool)
      {
        localObject2 = new java/util/concurrent/TimeoutException;
        str = "CallbackFuture timed out.";
        ((TimeoutException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    boolean bool = this.zzCy;
    if (bool)
    {
      localObject4 = new java/util/concurrent/CancellationException;
      str = "CallbackFuture was cancelled.";
      ((CancellationException)localObject4).<init>(str);
      throw ((Throwable)localObject4);
    }
    localObject4 = this.zzNc;
    return localObject4;
  }
  
  public boolean isCancelled()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzCy;
      return bool;
    }
  }
  
  public boolean isDone()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNd;
      return bool;
    }
  }
  
  public void zzb(Runnable paramRunnable)
  {
    this.zzNe.zzb(paramRunnable);
  }
  
  public void zzc(Runnable paramRunnable)
  {
    this.zzNe.zzc(paramRunnable);
  }
  
  public void zzg(Object paramObject)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        bool = this.zzCy;
        if (bool) {
          return;
        }
        bool = this.zzNd;
        if (bool)
        {
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          String str = "Provided CallbackFuture with multiple values.";
          localIllegalStateException.<init>(str);
          throw localIllegalStateException;
        }
      }
      boolean bool = true;
      this.zzNd = bool;
      this.zzNc = paramObject;
      Object localObject3 = this.zzpV;
      localObject3.notifyAll();
      localObject3 = this.zzNe;
      ((zzjh)localObject3).zzhK();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */