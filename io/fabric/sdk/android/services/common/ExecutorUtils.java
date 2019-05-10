package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import io.fabric.sdk.android.services.concurrency.internal.RetryPolicy;
import io.fabric.sdk.android.services.concurrency.internal.RetryThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class ExecutorUtils
{
  private static final long DEFAULT_TERMINATION_TIMEOUT = 2L;
  
  private static final void addDelayedShutdownHook(String paramString, ExecutorService paramExecutorService)
  {
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    addDelayedShutdownHook(paramString, paramExecutorService, 2, localTimeUnit);
  }
  
  public static final void addDelayedShutdownHook(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit)
  {
    Runtime localRuntime = Runtime.getRuntime();
    Thread localThread = new java/lang/Thread;
    ExecutorUtils.2 local2 = new io/fabric/sdk/android/services/common/ExecutorUtils$2;
    Object localObject = paramString;
    local2.<init>(paramString, paramExecutorService, paramLong, paramTimeUnit);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Crashlytics Shutdown Hook for " + paramString;
    localThread.<init>(local2, (String)localObject);
    localRuntime.addShutdownHook(localThread);
  }
  
  public static RetryThreadPoolExecutor buildRetryThreadPoolExecutor(String paramString, int paramInt, RetryPolicy paramRetryPolicy, Backoff paramBackoff)
  {
    ThreadFactory localThreadFactory = getNamedThreadFactory(paramString);
    RetryThreadPoolExecutor localRetryThreadPoolExecutor = new io/fabric/sdk/android/services/concurrency/internal/RetryThreadPoolExecutor;
    localRetryThreadPoolExecutor.<init>(paramInt, localThreadFactory, paramRetryPolicy, paramBackoff);
    addDelayedShutdownHook(paramString, localRetryThreadPoolExecutor);
    return localRetryThreadPoolExecutor;
  }
  
  public static ExecutorService buildSingleThreadExecutorService(String paramString)
  {
    ExecutorService localExecutorService = Executors.newSingleThreadExecutor(getNamedThreadFactory(paramString));
    addDelayedShutdownHook(paramString, localExecutorService);
    return localExecutorService;
  }
  
  public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String paramString)
  {
    ScheduledExecutorService localScheduledExecutorService = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(paramString));
    addDelayedShutdownHook(paramString, localScheduledExecutorService);
    return localScheduledExecutorService;
  }
  
  public static final ThreadFactory getNamedThreadFactory(String paramString)
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>(1L);
    ExecutorUtils.1 local1 = new io/fabric/sdk/android/services/common/ExecutorUtils$1;
    local1.<init>(paramString, localAtomicLong);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\ExecutorUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */