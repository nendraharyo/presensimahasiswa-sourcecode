package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PriorityThreadPoolExecutor
  extends ThreadPoolExecutor
{
  private static final int CORE_POOL_SIZE = CPU_COUNT + 1;
  private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
  private static final long KEEP_ALIVE = 1L;
  private static final int MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
  
  PriorityThreadPoolExecutor(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, DependencyPriorityBlockingQueue paramDependencyPriorityBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramDependencyPriorityBlockingQueue, paramThreadFactory);
    prestartAllCoreThreads();
  }
  
  public static PriorityThreadPoolExecutor create()
  {
    int i = CORE_POOL_SIZE;
    int j = MAXIMUM_POOL_SIZE;
    return create(i, j);
  }
  
  public static PriorityThreadPoolExecutor create(int paramInt)
  {
    return create(paramInt, paramInt);
  }
  
  public static PriorityThreadPoolExecutor create(int paramInt1, int paramInt2)
  {
    PriorityThreadPoolExecutor localPriorityThreadPoolExecutor = new io/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    DependencyPriorityBlockingQueue localDependencyPriorityBlockingQueue = new io/fabric/sdk/android/services/concurrency/DependencyPriorityBlockingQueue;
    localDependencyPriorityBlockingQueue.<init>();
    PriorityThreadPoolExecutor.PriorityThreadFactory localPriorityThreadFactory = new io/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor$PriorityThreadFactory;
    localPriorityThreadFactory.<init>(10);
    localPriorityThreadPoolExecutor.<init>(paramInt1, paramInt2, 1L, localTimeUnit, localDependencyPriorityBlockingQueue, localPriorityThreadFactory);
    return localPriorityThreadPoolExecutor;
  }
  
  protected void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    Object localObject = paramRunnable;
    localObject = (Task)paramRunnable;
    ((Task)localObject).setFinished(true);
    ((Task)localObject).setError(paramThrowable);
    getQueue().recycleBlockedQueue();
    super.afterExecute(paramRunnable, paramThrowable);
  }
  
  public void execute(Runnable paramRunnable)
  {
    boolean bool = PriorityTask.isProperDelegate(paramRunnable);
    if (bool) {
      super.execute(paramRunnable);
    }
    for (;;)
    {
      return;
      bool = false;
      RunnableFuture localRunnableFuture = newTaskFor(paramRunnable, null);
      super.execute(localRunnableFuture);
    }
  }
  
  public DependencyPriorityBlockingQueue getQueue()
  {
    return (DependencyPriorityBlockingQueue)super.getQueue();
  }
  
  protected RunnableFuture newTaskFor(Runnable paramRunnable, Object paramObject)
  {
    PriorityFutureTask localPriorityFutureTask = new io/fabric/sdk/android/services/concurrency/PriorityFutureTask;
    localPriorityFutureTask.<init>(paramRunnable, paramObject);
    return localPriorityFutureTask;
  }
  
  protected RunnableFuture newTaskFor(Callable paramCallable)
  {
    PriorityFutureTask localPriorityFutureTask = new io/fabric/sdk/android/services/concurrency/PriorityFutureTask;
    localPriorityFutureTask.<init>(paramCallable);
    return localPriorityFutureTask;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\PriorityThreadPoolExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */