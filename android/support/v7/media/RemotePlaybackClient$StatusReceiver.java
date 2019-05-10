package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

final class RemotePlaybackClient$StatusReceiver
  extends BroadcastReceiver
{
  public static final String ACTION_ITEM_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED";
  public static final String ACTION_SESSION_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED";
  
  private RemotePlaybackClient$StatusReceiver(RemotePlaybackClient paramRemotePlaybackClient) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = "android.media.intent.extra.SESSION_ID";
    String str1 = paramIntent.getStringExtra((String)localObject1);
    boolean bool1;
    Object localObject2;
    Object localObject3;
    if (str1 != null)
    {
      localObject1 = RemotePlaybackClient.access$700(this.this$0);
      bool1 = str1.equals(localObject1);
      if (bool1) {}
    }
    else
    {
      localObject1 = "RemotePlaybackClient";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Discarding spurious status callback with missing or invalid session id: sessionId=";
      localObject2 = (String)localObject3 + str1;
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject3 = MediaSessionStatus.fromBundle(paramIntent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
      localObject1 = paramIntent.getAction();
      localObject2 = "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED";
      boolean bool2 = ((String)localObject1).equals(localObject2);
      String str2;
      if (bool2)
      {
        localObject1 = "android.media.intent.extra.ITEM_ID";
        str2 = paramIntent.getStringExtra((String)localObject1);
        if (str2 == null)
        {
          localObject1 = "RemotePlaybackClient";
          localObject2 = "Discarding spurious status callback with missing item id.";
          Log.w((String)localObject1, (String)localObject2);
        }
        else
        {
          localObject1 = paramIntent.getBundleExtra("android.media.intent.extra.ITEM_STATUS");
          MediaItemStatus localMediaItemStatus = MediaItemStatus.fromBundle((Bundle)localObject1);
          if (localMediaItemStatus == null)
          {
            localObject1 = "RemotePlaybackClient";
            localObject2 = "Discarding spurious status callback with missing item status.";
            Log.w((String)localObject1, (String)localObject2);
          }
          else
          {
            bool1 = RemotePlaybackClient.access$300();
            if (bool1)
            {
              localObject1 = "RemotePlaybackClient";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("Received item status callback: sessionId=").append(str1).append(", sessionStatus=").append(localObject3).append(", itemId=").append(str2);
              String str3 = ", itemStatus=";
              localObject2 = str3 + localMediaItemStatus;
              Log.d((String)localObject1, (String)localObject2);
            }
            localObject1 = RemotePlaybackClient.access$800(this.this$0);
            if (localObject1 != null)
            {
              localObject1 = RemotePlaybackClient.access$800(this.this$0);
              localObject2 = paramIntent.getExtras();
              ((RemotePlaybackClient.StatusCallback)localObject1).onItemStatusChanged((Bundle)localObject2, str1, (MediaSessionStatus)localObject3, str2, localMediaItemStatus);
            }
          }
        }
      }
      else
      {
        localObject2 = "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED";
        bool1 = ((String)localObject1).equals(localObject2);
        if (bool1) {
          if (localObject3 == null)
          {
            localObject1 = "RemotePlaybackClient";
            localObject2 = "Discarding spurious media status callback with missing session status.";
            Log.w((String)localObject1, (String)localObject2);
          }
          else
          {
            bool1 = RemotePlaybackClient.access$300();
            if (bool1)
            {
              localObject1 = "RemotePlaybackClient";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("Received session status callback: sessionId=").append(str1);
              str2 = ", sessionStatus=";
              localObject2 = str2 + localObject3;
              Log.d((String)localObject1, (String)localObject2);
            }
            localObject1 = RemotePlaybackClient.access$800(this.this$0);
            if (localObject1 != null)
            {
              localObject1 = RemotePlaybackClient.access$800(this.this$0);
              localObject2 = paramIntent.getExtras();
              ((RemotePlaybackClient.StatusCallback)localObject1).onSessionStatusChanged((Bundle)localObject2, str1, (MediaSessionStatus)localObject3);
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemotePlaybackClient$StatusReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */