package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

class EventsHandler$2
  implements Runnable
{
  EventsHandler$2(EventsHandler paramEventsHandler, Object paramObject) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject1 = ((EventsHandler)localObject1).strategy;
      localObject2 = this.val$event;
      ((EventsStrategy)localObject1).recordEvent(localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = this.this$0.context;
        String str = "Crashlytics failed to record event";
        CommonUtils.logControlledError((Context)localObject2, str, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsHandler$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */