package android.support.v7.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;

final class RegisteredMediaRouteProvider$ReceiveHandler
  extends Handler
{
  private final WeakReference mConnectionRef;
  
  public RegisteredMediaRouteProvider$ReceiveHandler(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramConnection);
    this.mConnectionRef = localWeakReference;
  }
  
  private boolean processMessage(RegisteredMediaRouteProvider.Connection paramConnection, int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    }
    do
    {
      bool = false;
      str = null;
      for (;;)
      {
        return bool;
        paramConnection.onGenericFailure(paramInt2);
        continue;
        paramConnection.onGenericSuccess(paramInt2);
        continue;
        if (paramObject != null)
        {
          bool = paramObject instanceof Bundle;
          if (!bool) {
            break;
          }
        }
        paramObject = (Bundle)paramObject;
        bool = paramConnection.onRegistered(paramInt2, paramInt3, (Bundle)paramObject);
        continue;
        if (paramObject != null)
        {
          bool = paramObject instanceof Bundle;
          if (!bool) {
            break;
          }
        }
        paramObject = (Bundle)paramObject;
        bool = paramConnection.onDescriptorChanged((Bundle)paramObject);
        continue;
        if (paramObject != null)
        {
          bool = paramObject instanceof Bundle;
          if (!bool) {
            break;
          }
        }
        paramObject = (Bundle)paramObject;
        bool = paramConnection.onControlRequestSucceeded(paramInt2, (Bundle)paramObject);
      }
      if (paramObject == null) {
        break;
      }
      bool = paramObject instanceof Bundle;
    } while (!bool);
    if (paramBundle == null) {
      bool = false;
    }
    for (String str = null;; str = paramBundle.getString("error"))
    {
      paramObject = (Bundle)paramObject;
      bool = paramConnection.onControlRequestFailed(paramInt2, str, (Bundle)paramObject);
      break;
    }
  }
  
  public void dispose()
  {
    this.mConnectionRef.clear();
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = this.mConnectionRef;
    Object localObject2 = (RegisteredMediaRouteProvider.Connection)((WeakReference)localObject1).get();
    if (localObject2 != null)
    {
      int i = paramMessage.what;
      int j = paramMessage.arg1;
      int k = paramMessage.arg2;
      Object localObject3 = paramMessage.obj;
      Bundle localBundle = paramMessage.peekData();
      localObject1 = this;
      boolean bool = processMessage((RegisteredMediaRouteProvider.Connection)localObject2, i, j, k, localObject3, localBundle);
      if (!bool)
      {
        bool = RegisteredMediaRouteProvider.access$800();
        if (bool)
        {
          localObject1 = "MediaRouteProviderProxy";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "Unhandled message from server: ";
          localObject2 = str + paramMessage;
          Log.d((String)localObject1, (String)localObject2);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RegisteredMediaRouteProvider$ReceiveHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */