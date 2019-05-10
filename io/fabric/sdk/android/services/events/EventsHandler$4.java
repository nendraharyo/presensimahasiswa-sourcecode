package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

class EventsHandler$4
  implements Runnable
{
  EventsHandler$4(EventsHandler paramEventsHandler) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject1 = ((EventsHandler)localObject1).strategy;
      localObject2 = this.this$0;
      localObject3 = this.this$0;
      localObject3 = ((EventsHandler)localObject3).getDisabledEventsStrategy();
      ((EventsHandler)localObject2).strategy = ((EventsStrategy)localObject3);
      ((EventsStrategy)localObject1).deleteAllEvents();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = this.this$0.context;
        Object localObject3 = "Failed to disable events.";
        CommonUtils.logControlledError((Context)localObject2, (String)localObject3, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsHandler$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */