package com.bumptech.glide.load.engine.executor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class GlideExecutor
  implements ExecutorService
{
  private static final String ANIMATION_EXECUTOR_NAME = "animation";
  private static final String DEFAULT_DISK_CACHE_EXECUTOR_NAME = "disk-cache";
  private static final int DEFAULT_DISK_CACHE_EXECUTOR_THREADS = 1;
  private static final String DEFAULT_SOURCE_EXECUTOR_NAME = "source";
  private static final long KEEP_ALIVE_TIME_MS = TimeUnit.SECONDS.toMillis(10);
  private static final int MAXIMUM_AUTOMATIC_THREAD_COUNT = 4;
  private static final String SOURCE_UNLIMITED_EXECUTOR_NAME = "source-unlimited";
  private static final String TAG = "GlideExecutor";
  private static volatile int bestThreadCount;
  private final ExecutorService delegate;
  
  GlideExecutor(ExecutorService paramExecutorService)
  {
    this.delegate = paramExecutorService;
  }
  
  public static int calculateBestThreadCount()
  {
    int i = bestThreadCount;
    if (i == 0)
    {
      int j = RuntimeCompat.availableProcessors();
      i = Math.min(4, j);
      bestThreadCount = i;
    }
    return bestThreadCount;
  }
  
  public static GlideExecutor newAnimationExecutor()
  {
    int i = calculateBestThreadCount();
    int j = 4;
    if (i >= j) {}
    for (i = 2;; i = 1)
    {
      GlideExecutor.UncaughtThrowableStrategy localUncaughtThrowableStrategy = GlideExecutor.UncaughtThrowableStrategy.DEFAULT;
      return newAnimationExecutor(i, localUncaughtThrowableStrategy);
    }
  }
  
  public static GlideExecutor newAnimationExecutor(int paramInt, GlideExecutor.UncaughtThrowableStrategy paramUncaughtThrowableStrategy)
  {
    GlideExecutor localGlideExecutor = new com/bumptech/glide/load/engine/executor/GlideExecutor;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    long l = KEEP_ALIVE_TIME_MS;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    PriorityBlockingQueue localPriorityBlockingQueue = new java/util/concurrent/PriorityBlockingQueue;
    localPriorityBlockingQueue.<init>();
    GlideExecutor.DefaultThreadFactory localDefaultThreadFactory = new com/bumptech/glide/load/engine/executor/GlideExecutor$DefaultThreadFactory;
    localDefaultThreadFactory.<init>("animation", paramUncaughtThrowableStrategy, true);
    localThreadPoolExecutor.<init>(0, paramInt, l, localTimeUnit, localPriorityBlockingQueue, localDefaultThreadFactory);
    localGlideExecutor.<init>(localThreadPoolExecutor);
    return localGlideExecutor;
  }
  
  public static GlideExecutor newDiskCacheExecutor()
  {
    GlideExecutor.UncaughtThrowableStrategy localUncaughtThrowableStrategy = GlideExecutor.UncaughtThrowableStrategy.DEFAULT;
    return newDiskCacheExecutor(1, "disk-cache", localUncaughtThrowableStrategy);
  }
  
  public static GlideExecutor newDiskCacheExecutor(int paramInt, String paramString, GlideExecutor.UncaughtThrowableStrategy paramUncaughtThrowableStrategy)
  {
    GlideExecutor localGlideExecutor = new com/bumptech/glide/load/engine/executor/GlideExecutor;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    PriorityBlockingQueue localPriorityBlockingQueue = new java/util/concurrent/PriorityBlockingQueue;
    localPriorityBlockingQueue.<init>();
    GlideExecutor.DefaultThreadFactory localDefaultThreadFactory = new com/bumptech/glide/load/engine/executor/GlideExecutor$DefaultThreadFactory;
    localDefaultThreadFactory.<init>(paramString, paramUncaughtThrowableStrategy, true);
    localThreadPoolExecutor.<init>(paramInt, paramInt, 0L, localTimeUnit, localPriorityBlockingQueue, localDefaultThreadFactory);
    localGlideExecutor.<init>(localThreadPoolExecutor);
    return localGlideExecutor;
  }
  
  public static GlideExecutor newDiskCacheExecutor(GlideExecutor.UncaughtThrowableStrategy paramUncaughtThrowableStrategy)
  {
    return newDiskCacheExecutor(1, "disk-cache", paramUncaughtThrowableStrategy);
  }
  
  public static GlideExecutor newSourceExecutor()
  {
    int i = calculateBestThreadCount();
    GlideExecutor.UncaughtThrowableStrategy localUncaughtThrowableStrategy = GlideExecutor.UncaughtThrowableStrategy.DEFAULT;
    return newSourceExecutor(i, "source", localUncaughtThrowableStrategy);
  }
  
  public static GlideExecutor newSourceExecutor(int paramInt, String paramString, GlideExecutor.UncaughtThrowableStrategy paramUncaughtThrowableStrategy)
  {
    GlideExecutor localGlideExecutor = new com/bumptech/glide/load/engine/executor/GlideExecutor;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    PriorityBlockingQueue localPriorityBlockingQueue = new java/util/concurrent/PriorityBlockingQueue;
    localPriorityBlockingQueue.<init>();
    GlideExecutor.DefaultThreadFactory localDefaultThreadFactory = new com/bumptech/glide/load/engine/executor/GlideExecutor$DefaultThreadFactory;
    localDefaultThreadFactory.<init>(paramString, paramUncaughtThrowableStrategy, false);
    localThreadPoolExecutor.<init>(paramInt, paramInt, 0L, localTimeUnit, localPriorityBlockingQueue, localDefaultThreadFactory);
    localGlideExecutor.<init>(localThreadPoolExecutor);
    return localGlideExecutor;
  }
  
  public static GlideExecutor newSourceExecutor(GlideExecutor.UncaughtThrowableStrategy paramUncaughtThrowableStrategy)
  {
    return newSourceExecutor(calculateBestThreadCount(), "source", paramUncaughtThrowableStrategy);
  }
  
  public static GlideExecutor newUnlimitedSourceExecutor()
  {
    GlideExecutor localGlideExecutor = new com/bumptech/glide/load/engine/executor/GlideExecutor;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    long l = KEEP_ALIVE_TIME_MS;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    SynchronousQueue localSynchronousQueue = new java/util/concurrent/SynchronousQueue;
    localSynchronousQueue.<init>();
    GlideExecutor.DefaultThreadFactory localDefaultThreadFactory = new com/bumptech/glide/load/engine/executor/GlideExecutor$DefaultThreadFactory;
    GlideExecutor.UncaughtThrowableStrategy localUncaughtThrowableStrategy = GlideExecutor.UncaughtThrowableStrategy.DEFAULT;
    localDefaultThreadFactory.<init>("source-unlimited", localUncaughtThrowableStrategy, false);
    localThreadPoolExecutor.<init>(0, -1 >>> 1, l, localTimeUnit, localSynchronousQueue, localDefaultThreadFactory);
    localGlideExecutor.<init>(localThreadPoolExecutor);
    return localGlideExecutor;
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.delegate.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.delegate.execute(paramRunnable);
  }
  
  public List invokeAll(Collection paramCollection)
  {
    return this.delegate.invokeAll(paramCollection);
  }
  
  public List invokeAll(Collection paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return this.delegate.invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public Object invokeAny(Collection paramCollection)
  {
    return this.delegate.invokeAny(paramCollection);
  }
  
  public Object invokeAny(Collection paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return this.delegate.invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public boolean isShutdown()
  {
    return this.delegate.isShutdown();
  }
  
  public boolean isTerminated()
  {
    return this.delegate.isTerminated();
  }
  
  public void shutdown()
  {
    this.delegate.shutdown();
  }
  
  public List shutdownNow()
  {
    return this.delegate.shutdownNow();
  }
  
  public Future submit(Runnable paramRunnable)
  {
    return this.delegate.submit(paramRunnable);
  }
  
  public Future submit(Runnable paramRunnable, Object paramObject)
  {
    return this.delegate.submit(paramRunnable, paramObject);
  }
  
  public Future submit(Callable paramCallable)
  {
    return this.delegate.submit(paramCallable);
  }
  
  public String toString()
  {
    return this.delegate.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\GlideExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */