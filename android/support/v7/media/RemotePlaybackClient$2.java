package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

class RemotePlaybackClient$2
  extends MediaRouter.ControlRequestCallback
{
  RemotePlaybackClient$2(RemotePlaybackClient paramRemotePlaybackClient, String paramString, Intent paramIntent, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    RemotePlaybackClient localRemotePlaybackClient = this.this$0;
    Intent localIntent = this.val$intent;
    RemotePlaybackClient.SessionActionCallback localSessionActionCallback = this.val$callback;
    RemotePlaybackClient.access$600(localRemotePlaybackClient, localIntent, localSessionActionCallback, paramString, paramBundle);
  }
  
  public void onResult(Bundle paramBundle)
  {
    Object localObject1;
    Object localObject3;
    Object localObject4;
    boolean bool1;
    Object localObject5;
    if (paramBundle != null)
    {
      localObject1 = this.val$sessionId;
      localObject3 = paramBundle.getString("android.media.intent.extra.SESSION_ID");
      localObject3 = RemotePlaybackClient.access$100((String)localObject1, (String)localObject3);
      localObject1 = MediaSessionStatus.fromBundle(paramBundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
      localObject4 = this.this$0;
      RemotePlaybackClient.access$200((RemotePlaybackClient)localObject4, (String)localObject3);
      if (localObject3 != null)
      {
        bool1 = RemotePlaybackClient.access$300();
        if (bool1)
        {
          localObject4 = "RemotePlaybackClient";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("Received result from ");
          String str = this.val$intent.getAction();
          localObject5 = ((StringBuilder)localObject5).append(str).append(": data=");
          str = RemotePlaybackClient.access$400(paramBundle);
          localObject5 = ((StringBuilder)localObject5).append(str).append(", sessionId=").append((String)localObject3);
          str = ", sessionStatus=";
          localObject5 = str + localObject1;
          Log.d((String)localObject4, (String)localObject5);
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject4 = this.val$callback;
        ((RemotePlaybackClient.SessionActionCallback)localObject4).onResult(paramBundle, (String)localObject3, (MediaSessionStatus)localObject1);
        boolean bool2;
        return;
      }
      finally
      {
        localObject4 = this.val$intent.getAction();
        localObject5 = "android.media.intent.action.END_SESSION";
        bool1 = ((String)localObject4).equals(localObject5);
        if (bool1)
        {
          localObject4 = RemotePlaybackClient.access$700(this.this$0);
          boolean bool3 = ((String)localObject3).equals(localObject4);
          if (bool3)
          {
            localObject3 = this.this$0;
            ((RemotePlaybackClient)localObject3).setSessionId(null);
          }
        }
      }
      RemotePlaybackClient localRemotePlaybackClient = this.this$0;
      localObject3 = this.val$intent;
      localObject4 = this.val$callback;
      RemotePlaybackClient.access$500(localRemotePlaybackClient, (Intent)localObject3, (RemotePlaybackClient.ActionCallback)localObject4, paramBundle);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemotePlaybackClient$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */