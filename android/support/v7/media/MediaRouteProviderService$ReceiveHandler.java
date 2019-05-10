package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

final class MediaRouteProviderService$ReceiveHandler
  extends Handler
{
  private final WeakReference mServiceRef;
  
  public MediaRouteProviderService$ReceiveHandler(MediaRouteProviderService paramMediaRouteProviderService)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramMediaRouteProviderService);
    this.mServiceRef = localWeakReference;
  }
  
  private boolean processMessage(int paramInt1, Messenger paramMessenger, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    int i = 0;
    MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest = null;
    MediaRouteProviderService localMediaRouteProviderService = (MediaRouteProviderService)this.mServiceRef.get();
    if (localMediaRouteProviderService != null) {
      switch (paramInt1)
      {
      }
    }
    boolean bool2;
    boolean bool3;
    do
    {
      for (;;)
      {
        return i;
        i = MediaRouteProviderService.access$1200(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3);
        continue;
        i = MediaRouteProviderService.access$1300(localMediaRouteProviderService, paramMessenger, paramInt2);
        continue;
        String str = paramBundle.getString("routeId");
        if (str != null)
        {
          i = MediaRouteProviderService.access$1400(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3, str);
          continue;
          i = MediaRouteProviderService.access$1500(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3);
          continue;
          i = MediaRouteProviderService.access$1600(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3);
          continue;
          if (paramBundle == null) {}
          for (;;)
          {
            boolean bool1 = MediaRouteProviderService.access$1700(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3, i);
            break;
            str = "unselectReason";
            int j = paramBundle.getInt(str, 0);
          }
          str = "volume";
          int k = -1;
          int m = paramBundle.getInt(str, k);
          if (m >= 0)
          {
            bool2 = MediaRouteProviderService.access$1800(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3, m);
            continue;
            str = "volume";
            m = paramBundle.getInt(str, 0);
            if (m != 0)
            {
              bool2 = MediaRouteProviderService.access$1900(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3, m);
              continue;
              bool3 = paramObject instanceof Intent;
              if (bool3)
              {
                paramObject = (Intent)paramObject;
                bool2 = MediaRouteProviderService.access$2000(localMediaRouteProviderService, paramMessenger, paramInt2, paramInt3, (Intent)paramObject);
              }
            }
          }
        }
      }
      if (paramObject == null) {
        break;
      }
      bool3 = paramObject instanceof Bundle;
    } while (!bool3);
    paramObject = (Bundle)paramObject;
    localMediaRouteDiscoveryRequest = MediaRouteDiscoveryRequest.fromBundle((Bundle)paramObject);
    if (localMediaRouteDiscoveryRequest != null)
    {
      bool3 = localMediaRouteDiscoveryRequest.isValid();
      if (!bool3) {}
    }
    for (;;)
    {
      bool2 = MediaRouteProviderService.access$2100(localMediaRouteProviderService, paramMessenger, paramInt2, localMediaRouteDiscoveryRequest);
      break;
      bool2 = false;
      localMediaRouteDiscoveryRequest = null;
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    Messenger localMessenger = paramMessage.replyTo;
    boolean bool = MediaRouteProviderProtocol.isValidRemoteMessenger(localMessenger);
    Object localObject2;
    Object localObject4;
    if (bool)
    {
      int i = paramMessage.what;
      int j = paramMessage.arg1;
      int k = paramMessage.arg2;
      Object localObject1 = paramMessage.obj;
      Bundle localBundle = paramMessage.peekData();
      localObject2 = this;
      bool = processMessage(i, localMessenger, j, k, localObject1, localBundle);
      if (!bool)
      {
        bool = MediaRouteProviderService.access$200();
        if (bool)
        {
          localObject2 = "MediaRouteProviderSrv";
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          String str1 = MediaRouteProviderService.access$1000(localMessenger);
          localObject3 = ((StringBuilder)localObject3).append(str1);
          str1 = ": Message failed, what=";
          localObject4 = ((StringBuilder)localObject3).append(str1).append(i).append(", requestId=").append(j);
          localObject3 = ", arg=";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject3).append(k).append(", obj=").append(localObject1);
          String str2 = ", data=";
          localObject4 = str2 + localBundle;
          Log.d((String)localObject2, (String)localObject4);
        }
        MediaRouteProviderService.access$1100(localMessenger, j);
      }
    }
    for (;;)
    {
      return;
      bool = MediaRouteProviderService.access$200();
      if (bool)
      {
        localObject2 = "MediaRouteProviderSrv";
        localObject4 = "Ignoring message without valid reply messenger.";
        Log.d((String)localObject2, (String)localObject4);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProviderService$ReceiveHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */