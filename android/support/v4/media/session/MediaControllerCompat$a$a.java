package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

class MediaControllerCompat$a$a
  extends Handler
{
  boolean a = false;
  
  MediaControllerCompat$a$a(MediaControllerCompat.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool1 = this.a;
    if (!bool1) {}
    for (;;)
    {
      return;
      int i = paramMessage.what;
      MediaControllerCompat.a locala;
      Object localObject;
      int j;
      switch (i)
      {
      case 10: 
      default: 
        break;
      case 1: 
        locala = this.b;
        localObject = (String)paramMessage.obj;
        Bundle localBundle = paramMessage.getData();
        locala.onSessionEvent((String)localObject, localBundle);
        break;
      case 2: 
        locala = this.b;
        localObject = (PlaybackStateCompat)paramMessage.obj;
        locala.onPlaybackStateChanged((PlaybackStateCompat)localObject);
        break;
      case 3: 
        locala = this.b;
        localObject = (MediaMetadataCompat)paramMessage.obj;
        locala.onMetadataChanged((MediaMetadataCompat)localObject);
        break;
      case 5: 
        locala = this.b;
        localObject = (List)paramMessage.obj;
        locala.onQueueChanged((List)localObject);
        break;
      case 6: 
        locala = this.b;
        localObject = (CharSequence)paramMessage.obj;
        locala.onQueueTitleChanged((CharSequence)localObject);
        break;
      case 11: 
        locala = this.b;
        localObject = (Boolean)paramMessage.obj;
        boolean bool2 = ((Boolean)localObject).booleanValue();
        locala.onCaptioningEnabledChanged(bool2);
        break;
      case 9: 
        locala = this.b;
        localObject = (Integer)paramMessage.obj;
        j = ((Integer)localObject).intValue();
        locala.onRepeatModeChanged(j);
        break;
      case 12: 
        locala = this.b;
        localObject = (Integer)paramMessage.obj;
        j = ((Integer)localObject).intValue();
        locala.onShuffleModeChanged(j);
        break;
      case 7: 
        locala = this.b;
        localObject = (Bundle)paramMessage.obj;
        locala.onExtrasChanged((Bundle)localObject);
        break;
      case 4: 
        locala = this.b;
        localObject = (MediaControllerCompat.f)paramMessage.obj;
        locala.onAudioInfoChanged((MediaControllerCompat.f)localObject);
        break;
      case 8: 
        localObject = this.b;
        ((MediaControllerCompat.a)localObject).onSessionDestroyed();
        break;
      case 13: 
        localObject = this.b;
        ((MediaControllerCompat.a)localObject).onSessionReady();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */