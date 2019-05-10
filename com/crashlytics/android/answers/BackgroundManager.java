package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class BackgroundManager
{
  private static final int BACKGROUND_DELAY = 5000;
  final AtomicReference backgroundFutureRef;
  private final ScheduledExecutorService executorService;
  private volatile boolean flushOnBackground;
  boolean inBackground;
  private final List listeners;
  
  public BackgroundManager(ScheduledExecutorService paramScheduledExecutorService)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.listeners = ((List)localObject);
    this.flushOnBackground = bool;
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.backgroundFutureRef = ((AtomicReference)localObject);
    this.inBackground = bool;
    this.executorService = paramScheduledExecutorService;
  }
  
  private void notifyBackground()
  {
    Object localObject = this.listeners;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (BackgroundManager.Listener)localIterator.next();
      ((BackgroundManager.Listener)localObject).onBackground();
    }
  }
  
  public void onActivityPaused()
  {
    boolean bool = this.flushOnBackground;
    if (bool)
    {
      bool = this.inBackground;
      if (!bool)
      {
        bool = true;
        this.inBackground = bool;
      }
    }
    try
    {
      AtomicReference localAtomicReference = this.backgroundFutureRef;
      localLogger = null;
      localObject1 = this.executorService;
      localObject2 = new com/crashlytics/android/answers/BackgroundManager$1;
      ((BackgroundManager.1)localObject2).<init>(this);
      long l = 5000L;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      localObject1 = ((ScheduledExecutorService)localObject1).schedule((Runnable)localObject2, l, localTimeUnit);
      localAtomicReference.compareAndSet(null, localObject1);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        Object localObject1 = "Answers";
        Object localObject2 = "Failed to schedule background detector";
        localLogger.d((String)localObject1, (String)localObject2, localRejectedExecutionException);
      }
    }
  }
  
  public void onActivityResumed()
  {
    this.inBackground = false;
    ScheduledFuture localScheduledFuture = (ScheduledFuture)this.backgroundFutureRef.getAndSet(null);
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
  }
  
  public void registerListener(BackgroundManager.Listener paramListener)
  {
    this.listeners.add(paramListener);
  }
  
  public void setFlushOnBackground(boolean paramBoolean)
  {
    this.flushOnBackground = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\BackgroundManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */