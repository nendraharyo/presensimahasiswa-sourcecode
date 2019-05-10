package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

class RemotePlaybackClient$1
  extends MediaRouter.ControlRequestCallback
{
  RemotePlaybackClient$1(RemotePlaybackClient paramRemotePlaybackClient, String paramString1, String paramString2, Intent paramIntent, RemotePlaybackClient.ItemActionCallback paramItemActionCallback) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    RemotePlaybackClient localRemotePlaybackClient = this.this$0;
    Intent localIntent = this.val$intent;
    RemotePlaybackClient.ItemActionCallback localItemActionCallback = this.val$callback;
    RemotePlaybackClient.access$600(localRemotePlaybackClient, localIntent, localItemActionCallback, paramString, paramBundle);
  }
  
  public void onResult(Bundle paramBundle)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramBundle != null)
    {
      localObject1 = this.val$sessionId;
      localObject2 = paramBundle.getString("android.media.intent.extra.SESSION_ID");
      localObject3 = RemotePlaybackClient.access$100((String)localObject1, (String)localObject2);
      MediaSessionStatus localMediaSessionStatus = MediaSessionStatus.fromBundle(paramBundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
      localObject1 = this.val$itemId;
      localObject2 = paramBundle.getString("android.media.intent.extra.ITEM_ID");
      String str1 = RemotePlaybackClient.access$100((String)localObject1, (String)localObject2);
      MediaItemStatus localMediaItemStatus = MediaItemStatus.fromBundle(paramBundle.getBundle("android.media.intent.extra.ITEM_STATUS"));
      localObject1 = this.this$0;
      RemotePlaybackClient.access$200((RemotePlaybackClient)localObject1, (String)localObject3);
      if ((localObject3 != null) && (str1 != null) && (localMediaItemStatus != null))
      {
        boolean bool = RemotePlaybackClient.access$300();
        if (bool)
        {
          localObject1 = "RemotePlaybackClient";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Received result from ");
          String str2 = this.val$intent.getAction();
          localObject2 = ((StringBuilder)localObject2).append(str2).append(": data=");
          str2 = RemotePlaybackClient.access$400(paramBundle);
          localObject2 = ((StringBuilder)localObject2).append(str2).append(", sessionId=").append((String)localObject3).append(", sessionStatus=").append(localMediaSessionStatus).append(", itemId=").append(str1);
          str2 = ", itemStatus=";
          localObject2 = str2 + localMediaItemStatus;
          Log.d((String)localObject1, (String)localObject2);
        }
        localObject1 = this.val$callback;
        localObject2 = paramBundle;
        ((RemotePlaybackClient.ItemActionCallback)localObject1).onResult(paramBundle, (String)localObject3, localMediaSessionStatus, str1, localMediaItemStatus);
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.this$0;
      localObject2 = this.val$intent;
      localObject3 = this.val$callback;
      RemotePlaybackClient.access$500((RemotePlaybackClient)localObject1, (Intent)localObject2, (RemotePlaybackClient.ActionCallback)localObject3, paramBundle);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemotePlaybackClient$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */