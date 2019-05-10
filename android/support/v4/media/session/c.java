package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

class c
{
  public static Object a(Context paramContext, Object paramObject)
  {
    MediaController localMediaController = new android/media/session/MediaController;
    paramObject = (MediaSession.Token)paramObject;
    localMediaController.<init>(paramContext, (MediaSession.Token)paramObject);
    return localMediaController;
  }
  
  public static Object a(c.a parama)
  {
    c.b localb = new android/support/v4/media/session/c$b;
    localb.<init>(parama);
    return localb;
  }
  
  public static Object a(Object paramObject)
  {
    return ((MediaController)paramObject).getTransportControls();
  }
  
  public static void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (MediaController)paramObject1;
    paramObject2 = (MediaController.Callback)paramObject2;
    ((MediaController)paramObject1).unregisterCallback((MediaController.Callback)paramObject2);
  }
  
  public static void a(Object paramObject1, Object paramObject2, Handler paramHandler)
  {
    paramObject1 = (MediaController)paramObject1;
    paramObject2 = (MediaController.Callback)paramObject2;
    ((MediaController)paramObject1).registerCallback((MediaController.Callback)paramObject2, paramHandler);
  }
  
  public static void a(Object paramObject, String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    ((MediaController)paramObject).sendCommand(paramString, paramBundle, paramResultReceiver);
  }
  
  public static Object b(Object paramObject)
  {
    return ((MediaController)paramObject).getPlaybackState();
  }
  
  public static Object c(Object paramObject)
  {
    return ((MediaController)paramObject).getMetadata();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */