package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class RetryThreadPoolExecutor
  extends ScheduledThreadPoolExecutor
{
  private final Backoff backoff;
  private final RetryPolicy retryPolicy;
  
  public RetryThreadPoolExecutor(int paramInt, RetryPolicy paramRetryPolicy, Backoff paramBackoff)
  {
    this(paramInt, localThreadFactory, paramRetryPolicy, paramBackoff);
  }
  
  public RetryThreadPoolExecutor(int paramInt, ThreadFactory paramThreadFactory, RetryPolicy paramRetryPolicy, Backoff paramBackoff)
  {
    super(paramInt, paramThreadFactory);
    NullPointerException localNullPointerException;
    if (paramRetryPolicy == null)
    {
      localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("retry policy must not be null");
      throw localNullPointerException;
    }
    if (paramBackoff == null)
    {
      localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("backoff must not be null");
      throw localNullPointerException;
    }
    this.retryPolicy = paramRetryPolicy;
    this.backoff = paramBackoff;
  }
  
  private Future scheduleWithRetryInternal(Callable paramCallable)
  {
    if (paramCallable == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new io/fabric/sdk/android/services/concurrency/internal/RetryState;
    Object localObject2 = this.backoff;
    RetryPolicy localRetryPolicy = this.retryPolicy;
    ((RetryState)localObject1).<init>((Backoff)localObject2, localRetryPolicy);
    localObject2 = new io/fabric/sdk/android/services/concurrency/internal/RetryFuture;
    ((RetryFuture)localObject2).<init>(paramCallable, (RetryState)localObject1, this);
    execute((Runnable)localObject2);
    return (Future)localObject2;
  }
  
  public Backoff getBackoff()
  {
    return this.backoff;
  }
  
  public RetryPolicy getRetryPolicy()
  {
    return this.retryPolicy;
  }
  
  public Future scheduleWithRetry(Runnable paramRunnable)
  {
    Callable localCallable = Executors.callable(paramRunnable);
    return scheduleWithRetryInternal(localCallable);
  }
  
  public Future scheduleWithRetry(Runnable paramRunnable, Object paramObject)
  {
    Callable localCallable = Executors.callable(paramRunnable, paramObject);
    return scheduleWithRetryInternal(localCallable);
  }
  
  public Future scheduleWithRetry(Callable paramCallable)
  {
    return scheduleWithRetryInternal(paramCallable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\internal\RetryThreadPoolExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */