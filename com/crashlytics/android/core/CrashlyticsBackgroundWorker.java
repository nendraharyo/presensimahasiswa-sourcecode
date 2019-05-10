package com.crashlytics.android.core;

import android.os.Looper;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class CrashlyticsBackgroundWorker
{
  private final ExecutorService executorService;
  
  public CrashlyticsBackgroundWorker(ExecutorService paramExecutorService)
  {
    this.executorService = paramExecutorService;
  }
  
  Future submit(Runnable paramRunnable)
  {
    try
    {
      localObject1 = this.executorService;
      localObject2 = new com/crashlytics/android/core/CrashlyticsBackgroundWorker$1;
      ((CrashlyticsBackgroundWorker.1)localObject2).<init>(this, paramRunnable);
      localObject1 = ((ExecutorService)localObject1).submit((Runnable)localObject2);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;)
      {
        Object localObject1;
        Logger localLogger = Fabric.getLogger();
        Object localObject2 = "CrashlyticsCore";
        String str = "Executor is shut down because we're handling a fatal crash.";
        localLogger.d((String)localObject2, str);
        localLogger = null;
      }
    }
    return (Future)localObject1;
  }
  
  Future submit(Callable paramCallable)
  {
    try
    {
      localObject1 = this.executorService;
      localObject2 = new com/crashlytics/android/core/CrashlyticsBackgroundWorker$2;
      ((CrashlyticsBackgroundWorker.2)localObject2).<init>(this, paramCallable);
      localObject1 = ((ExecutorService)localObject1).submit((Callable)localObject2);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;)
      {
        Object localObject1;
        Logger localLogger = Fabric.getLogger();
        Object localObject2 = "CrashlyticsCore";
        String str = "Executor is shut down because we're handling a fatal crash.";
        localLogger.d((String)localObject2, str);
        localLogger = null;
      }
    }
    return (Future)localObject1;
  }
  
  Object submitAndWait(Callable paramCallable)
  {
    for (Object localObject1 = null;; localObject1 = ((Future)localObject2).get())
    {
      try
      {
        localObject2 = Looper.getMainLooper();
        localObject3 = Looper.myLooper();
        if (localObject2 != localObject3) {
          break label52;
        }
        localObject2 = this.executorService;
        localObject2 = ((ExecutorService)localObject2).submit(paramCallable);
        long l = 4;
        localObject4 = TimeUnit.SECONDS;
        localObject1 = ((Future)localObject2).get(l, (TimeUnit)localObject4);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        for (;;)
        {
          Object localObject2;
          Logger localLogger = Fabric.getLogger();
          localObject3 = "CrashlyticsCore";
          str = "Executor is shut down because we're handling a fatal crash.";
          localLogger.d((String)localObject3, str);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label52:
          Object localObject3 = Fabric.getLogger();
          String str = "CrashlyticsCore";
          Object localObject4 = "Failed to execute task.";
          ((Logger)localObject3).e(str, (String)localObject4, localException);
        }
      }
      return localObject1;
      localObject2 = this.executorService;
      localObject2 = ((ExecutorService)localObject2).submit(paramCallable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsBackgroundWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */