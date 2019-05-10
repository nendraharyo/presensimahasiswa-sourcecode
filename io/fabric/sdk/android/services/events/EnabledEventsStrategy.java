package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class EnabledEventsStrategy
  implements EventsStrategy
{
  static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = 255;
  protected final Context context;
  final ScheduledExecutorService executorService;
  protected final EventsFilesManager filesManager;
  volatile int rolloverIntervalSeconds = -1;
  final AtomicReference scheduledRolloverFutureRef;
  
  public EnabledEventsStrategy(Context paramContext, ScheduledExecutorService paramScheduledExecutorService, EventsFilesManager paramEventsFilesManager)
  {
    this.context = paramContext;
    this.executorService = paramScheduledExecutorService;
    this.filesManager = paramEventsFilesManager;
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    this.scheduledRolloverFutureRef = localAtomicReference;
  }
  
  public void cancelTimeBasedFileRollOver()
  {
    Object localObject = this.scheduledRolloverFutureRef.get();
    if (localObject != null)
    {
      CommonUtils.logControlled(this.context, "Cancelling time-based rollover because no events are currently being generated.");
      ((ScheduledFuture)this.scheduledRolloverFutureRef.get()).cancel(false);
      localObject = this.scheduledRolloverFutureRef;
      ((AtomicReference)localObject).set(null);
    }
  }
  
  protected void configureRollover(int paramInt)
  {
    this.rolloverIntervalSeconds = paramInt;
    long l = this.rolloverIntervalSeconds;
    scheduleTimeBasedFileRollOver(0L, l);
  }
  
  public void deleteAllEvents()
  {
    this.filesManager.deleteAllEventsFiles();
  }
  
  public int getRollover()
  {
    return this.rolloverIntervalSeconds;
  }
  
  public void recordEvent(Object paramObject)
  {
    Object localObject1 = this.context;
    localObject2 = paramObject.toString();
    CommonUtils.logControlled((Context)localObject1, (String)localObject2);
    try
    {
      localObject1 = this.filesManager;
      ((EventsFilesManager)localObject1).writeEvent(paramObject);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject2 = this.context;
        String str = "Failed to write event.";
        CommonUtils.logControlledError((Context)localObject2, str, localIOException);
      }
    }
    scheduleTimeBasedRollOverIfNeeded();
  }
  
  public boolean rollFileOver()
  {
    try
    {
      EventsFilesManager localEventsFilesManager = this.filesManager;
      bool = localEventsFilesManager.rollFileOver();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Context localContext = this.context;
        String str = "Failed to roll file over.";
        CommonUtils.logControlledError(localContext, str, localIOException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  void scheduleTimeBasedFileRollOver(long paramLong1, long paramLong2)
  {
    Object localObject1 = this.scheduledRolloverFutureRef.get();
    int i;
    if (localObject1 == null) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject2 = new io/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;
        localObject1 = this.context;
        ((TimeBasedFileRollOverRunnable)localObject2).<init>((Context)localObject1, this);
        localObject1 = this.context;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Scheduling time based file roll over every ").append(paramLong2);
        String str = " seconds";
        localObject3 = str;
        CommonUtils.logControlled((Context)localObject1, (String)localObject3);
      }
      try
      {
        AtomicReference localAtomicReference = this.scheduledRolloverFutureRef;
        localObject1 = this.executorService;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        localObject1 = ((ScheduledExecutorService)localObject1).scheduleAtFixedRate((Runnable)localObject2, paramLong1, paramLong2, localTimeUnit);
        localAtomicReference.set(localObject1);
        return;
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        for (;;)
        {
          localObject2 = this.context;
          localObject3 = "Failed to schedule time based file roll over";
          CommonUtils.logControlledError((Context)localObject2, (String)localObject3, localRejectedExecutionException);
        }
      }
      i = 0;
      localObject1 = null;
    }
  }
  
  public void scheduleTimeBasedRollOverIfNeeded()
  {
    int i = this.rolloverIntervalSeconds;
    int j = -1;
    if (i != j) {}
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        i = this.rolloverIntervalSeconds;
        long l1 = i;
        int k = this.rolloverIntervalSeconds;
        long l2 = k;
        scheduleTimeBasedFileRollOver(l1, l2);
      }
      return;
    }
  }
  
  void sendAndCleanUpIfSuccess()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = getFilesSender();
    if (localObject2 == null)
    {
      localObject3 = this.context;
      localObject1 = "skipping files send because we don't yet know the target endpoint";
      CommonUtils.logControlled((Context)localObject3, (String)localObject1);
      return;
    }
    CommonUtils.logControlled(this.context, "Sending all files");
    Object localObject4 = this.filesManager.getBatchOfFilesToSend();
    int j = 0;
    Object localObject3 = null;
    for (;;)
    {
      try
      {
        i = ((List)localObject4).size();
        if (i > 0)
        {
          localObject1 = this.context;
          localObject5 = Locale.US;
          String str = "attempt to send batch of %d files";
          int k = 1;
          Object[] arrayOfObject = new Object[k];
          int m = ((List)localObject4).size();
          Integer localInteger = Integer.valueOf(m);
          arrayOfObject[0] = localInteger;
          localObject5 = String.format((Locale)localObject5, str, arrayOfObject);
          CommonUtils.logControlled((Context)localObject1, (String)localObject5);
          bool = ((FilesSender)localObject2).send((List)localObject4);
          if (bool) {
            i = ((List)localObject4).size() + j;
          }
        }
      }
      catch (Exception localException1)
      {
        try
        {
          boolean bool;
          localObject3 = this.filesManager;
          ((EventsFilesManager)localObject3).deleteSentFiles((List)localObject4);
          j = i;
          if (!bool)
          {
            if (j != 0) {
              break;
            }
            localObject3 = this.filesManager;
            ((EventsFilesManager)localObject3).deleteOldestInRollOverIfOverMax();
            break;
          }
          localObject1 = this.filesManager;
          localObject1 = ((EventsFilesManager)localObject1).getBatchOfFilesToSend();
          localObject4 = localObject1;
        }
        catch (Exception localException2)
        {
          Object localObject5;
          for (;;) {}
        }
        localException1 = localException1;
        i = j;
        localObject3 = localException1;
      }
      localObject4 = this.context;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Failed to send batch of analytics files to server: ");
      localObject5 = ((Exception)localObject3).getMessage();
      localObject2 = (String)localObject5;
      CommonUtils.logControlledError((Context)localObject4, (String)localObject2, (Throwable)localObject3);
      j = i;
    }
  }
  
  public void sendEvents()
  {
    sendAndCleanUpIfSuccess();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EnabledEventsStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */