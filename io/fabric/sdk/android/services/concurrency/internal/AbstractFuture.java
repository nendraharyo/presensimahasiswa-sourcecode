package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class AbstractFuture
  implements Future
{
  private final AbstractFuture.Sync sync;
  
  protected AbstractFuture()
  {
    AbstractFuture.Sync localSync = new io/fabric/sdk/android/services/concurrency/internal/AbstractFuture$Sync;
    localSync.<init>();
    this.sync = localSync;
  }
  
  static final CancellationException cancellationExceptionWithCause(String paramString, Throwable paramThrowable)
  {
    CancellationException localCancellationException = new java/util/concurrent/CancellationException;
    localCancellationException.<init>(paramString);
    localCancellationException.initCause(paramThrowable);
    return localCancellationException;
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    AbstractFuture.Sync localSync = this.sync;
    boolean bool = localSync.cancel(paramBoolean);
    if (!bool)
    {
      bool = false;
      localSync = null;
    }
    for (;;)
    {
      return bool;
      if (paramBoolean) {
        interruptTask();
      }
      bool = true;
    }
  }
  
  public Object get()
  {
    return this.sync.get();
  }
  
  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    AbstractFuture.Sync localSync = this.sync;
    long l = paramTimeUnit.toNanos(paramLong);
    return localSync.get(l);
  }
  
  protected void interruptTask() {}
  
  public boolean isCancelled()
  {
    return this.sync.isCancelled();
  }
  
  public boolean isDone()
  {
    return this.sync.isDone();
  }
  
  protected boolean set(Object paramObject)
  {
    return this.sync.set(paramObject);
  }
  
  protected boolean setException(Throwable paramThrowable)
  {
    if (paramThrowable == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>();
      throw localNullPointerException;
    }
    return this.sync.setException(paramThrowable);
  }
  
  protected final boolean wasInterrupted()
  {
    return this.sync.wasInterrupted();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\AbstractFuture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */