package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

final class AbstractFuture$Sync
  extends AbstractQueuedSynchronizer
{
  static final int CANCELLED = 4;
  static final int COMPLETED = 2;
  static final int COMPLETING = 1;
  static final int INTERRUPTED = 8;
  static final int RUNNING;
  private static final long serialVersionUID;
  private Throwable exception;
  private Object value;
  
  private boolean complete(Object paramObject, Throwable paramThrowable, int paramInt)
  {
    int i = 1;
    boolean bool = compareAndSetState(0, i);
    int j;
    if (bool)
    {
      this.value = paramObject;
      j = paramInt & 0xC;
      if (j != 0)
      {
        paramThrowable = new java/util/concurrent/CancellationException;
        String str = "Future.cancel() was called.";
        paramThrowable.<init>(str);
      }
      this.exception = paramThrowable;
      releaseShared(paramInt);
    }
    for (;;)
    {
      return bool;
      j = getState();
      if (j == i)
      {
        j = -1;
        acquireShared(j);
      }
    }
  }
  
  private Object getValue()
  {
    int i = getState();
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = "Error, synchronizer in invalid state: " + i;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 2: 
      localObject2 = this.exception;
      if (localObject2 != null)
      {
        localObject2 = new java/util/concurrent/ExecutionException;
        localObject1 = this.exception;
        ((ExecutionException)localObject2).<init>((Throwable)localObject1);
        throw ((Throwable)localObject2);
      }
      return this.value;
    }
    Object localObject1 = this.exception;
    throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", (Throwable)localObject1);
  }
  
  boolean cancel(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 8;; i = 4) {
      return complete(null, null, i);
    }
  }
  
  Object get()
  {
    acquireSharedInterruptibly(-1);
    return getValue();
  }
  
  Object get(long paramLong)
  {
    boolean bool = tryAcquireSharedNanos(-1, paramLong);
    if (!bool)
    {
      TimeoutException localTimeoutException = new java/util/concurrent/TimeoutException;
      localTimeoutException.<init>("Timeout waiting for task.");
      throw localTimeoutException;
    }
    return getValue();
  }
  
  boolean isCancelled()
  {
    int i = getState() & 0xC;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isDone()
  {
    int i = getState() & 0xE;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean set(Object paramObject)
  {
    return complete(paramObject, null, 2);
  }
  
  boolean setException(Throwable paramThrowable)
  {
    return complete(null, paramThrowable, 2);
  }
  
  protected int tryAcquireShared(int paramInt)
  {
    int i = isDone();
    if (i != 0) {}
    int j;
    for (i = 1;; j = -1) {
      return i;
    }
  }
  
  protected boolean tryReleaseShared(int paramInt)
  {
    setState(paramInt);
    return true;
  }
  
  boolean wasInterrupted()
  {
    int i = getState();
    int k = 8;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\AbstractFuture$Sync.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */