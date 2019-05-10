package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;

class MediaRouteProviderService$1
  extends MediaRouter.ControlRequestCallback
{
  MediaRouteProviderService$1(MediaRouteProviderService paramMediaRouteProviderService, MediaRouteProviderService.ClientRecord paramClientRecord, int paramInt1, Intent paramIntent, Messenger paramMessenger, int paramInt2) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    int i = 4;
    boolean bool = MediaRouteProviderService.access$200();
    Object localObject3;
    if (bool)
    {
      localObject1 = "MediaRouteProviderSrv";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = this.val$client;
      localObject2 = ((StringBuilder)localObject2).append(localObject3).append(": Route control request failed").append(", controllerId=");
      int k = this.val$controllerId;
      localObject2 = ((StringBuilder)localObject2).append(k).append(", intent=");
      localObject3 = this.val$intent;
      localObject2 = ((StringBuilder)localObject2).append(localObject3).append(", error=").append(paramString);
      localObject3 = ", data=";
      localObject2 = (String)localObject3 + paramBundle;
      Log.d((String)localObject1, (String)localObject2);
    }
    Object localObject1 = this.this$0;
    Object localObject2 = this.val$messenger;
    int j = MediaRouteProviderService.access$300((MediaRouteProviderService)localObject1, (Messenger)localObject2);
    Bundle localBundle;
    int m;
    if (j >= 0)
    {
      if (paramString == null) {
        break label199;
      }
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("error", paramString);
      localObject1 = this.val$messenger;
      m = this.val$requestId;
      localObject3 = paramBundle;
      MediaRouteProviderService.access$400((Messenger)localObject1, i, m, 0, paramBundle, localBundle);
    }
    for (;;)
    {
      return;
      label199:
      localObject1 = this.val$messenger;
      m = this.val$requestId;
      localBundle = null;
      localObject3 = paramBundle;
      MediaRouteProviderService.access$400((Messenger)localObject1, i, m, 0, paramBundle, null);
    }
  }
  
  public void onResult(Bundle paramBundle)
  {
    boolean bool = MediaRouteProviderService.access$200();
    int j;
    if (bool)
    {
      localObject1 = "MediaRouteProviderSrv";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = this.val$client;
      localObject2 = ((StringBuilder)localObject2).append(localObject3).append(": Route control request succeeded").append(", controllerId=");
      j = this.val$controllerId;
      localObject2 = ((StringBuilder)localObject2).append(j).append(", intent=");
      localObject3 = this.val$intent;
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = ", data=";
      localObject2 = (String)localObject3 + paramBundle;
      Log.d((String)localObject1, (String)localObject2);
    }
    Object localObject1 = this.this$0;
    Object localObject2 = this.val$messenger;
    int i = MediaRouteProviderService.access$300((MediaRouteProviderService)localObject1, (Messenger)localObject2);
    if (i >= 0)
    {
      localObject1 = this.val$messenger;
      int k = 3;
      j = this.val$requestId;
      MediaRouteProviderService.access$400((Messenger)localObject1, k, j, 0, paramBundle, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProviderService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */