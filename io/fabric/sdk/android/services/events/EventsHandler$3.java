package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

class EventsHandler$3
  implements Runnable
{
  EventsHandler$3(EventsHandler paramEventsHandler) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.this$0;
      localObject = ((EventsHandler)localObject).strategy;
      ((EventsStrategy)localObject).sendEvents();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Context localContext = this.this$0.context;
        String str = "Failed to send events files.";
        CommonUtils.logControlledError(localContext, str, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsHandler$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */