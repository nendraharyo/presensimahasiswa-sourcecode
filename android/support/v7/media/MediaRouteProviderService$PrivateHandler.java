package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

final class MediaRouteProviderService$PrivateHandler
  extends Handler
{
  private MediaRouteProviderService$PrivateHandler(MediaRouteProviderService paramMediaRouteProviderService) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      MediaRouteProviderService localMediaRouteProviderService = this.this$0;
      Messenger localMessenger = (Messenger)paramMessage.obj;
      MediaRouteProviderService.access$500(localMediaRouteProviderService, localMessenger);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProviderService$PrivateHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */