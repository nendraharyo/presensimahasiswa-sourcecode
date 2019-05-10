package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public abstract class EventsHandler
  implements EventsStorageListener
{
  protected final Context context;
  protected final ScheduledExecutorService executor;
  protected EventsStrategy strategy;
  
  public EventsHandler(Context paramContext, EventsStrategy paramEventsStrategy, EventsFilesManager paramEventsFilesManager, ScheduledExecutorService paramScheduledExecutorService)
  {
    Context localContext = paramContext.getApplicationContext();
    this.context = localContext;
    this.executor = paramScheduledExecutorService;
    this.strategy = paramEventsStrategy;
    paramEventsFilesManager.registerRollOverListener(this);
  }
  
  public void disable()
  {
    EventsHandler.4 local4 = new io/fabric/sdk/android/services/events/EventsHandler$4;
    local4.<init>(this);
    executeAsync(local4);
  }
  
  protected void executeAsync(Runnable paramRunnable)
  {
    try
    {
      ScheduledExecutorService localScheduledExecutorService = this.executor;
      localScheduledExecutorService.submit(paramRunnable);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Context localContext = this.context;
        String str = "Failed to submit events task";
        CommonUtils.logControlledError(localContext, str, localException);
      }
    }
  }
  
  protected void executeSync(Runnable paramRunnable)
  {
    try
    {
      Object localObject = this.executor;
      localObject = ((ScheduledExecutorService)localObject).submit(paramRunnable);
      ((Future)localObject).get();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Context localContext = this.context;
        String str = "Failed to run events task";
        CommonUtils.logControlledError(localContext, str, localException);
      }
    }
  }
  
  protected abstract EventsStrategy getDisabledEventsStrategy();
  
  public void onRollOver(String paramString)
  {
    EventsHandler.3 local3 = new io/fabric/sdk/android/services/events/EventsHandler$3;
    local3.<init>(this);
    executeAsync(local3);
  }
  
  public void recordEventAsync(Object paramObject, boolean paramBoolean)
  {
    EventsHandler.1 local1 = new io/fabric/sdk/android/services/events/EventsHandler$1;
    local1.<init>(this, paramObject, paramBoolean);
    executeAsync(local1);
  }
  
  public void recordEventSync(Object paramObject)
  {
    EventsHandler.2 local2 = new io/fabric/sdk/android/services/events/EventsHandler$2;
    local2.<init>(this, paramObject);
    executeSync(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */