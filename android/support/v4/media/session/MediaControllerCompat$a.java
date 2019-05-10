package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public abstract class MediaControllerCompat$a
  implements IBinder.DeathRecipient
{
  private final Object mCallbackObj;
  MediaControllerCompat.a.a mHandler;
  boolean mHasExtraCallback;
  
  public MediaControllerCompat$a()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/media/session/MediaControllerCompat$a$b;
      ((MediaControllerCompat.a.b)localObject).<init>(this);
      localObject = c.a((c.a)localObject);
    }
    for (this.mCallbackObj = localObject;; this.mCallbackObj = localObject)
    {
      return;
      localObject = new android/support/v4/media/session/MediaControllerCompat$a$c;
      ((MediaControllerCompat.a.c)localObject).<init>(this);
    }
  }
  
  public void binderDied()
  {
    onSessionDestroyed();
  }
  
  public void onAudioInfoChanged(MediaControllerCompat.f paramf) {}
  
  public void onCaptioningEnabledChanged(boolean paramBoolean) {}
  
  public void onExtrasChanged(Bundle paramBundle) {}
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat) {}
  
  public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat) {}
  
  public void onQueueChanged(List paramList) {}
  
  public void onQueueTitleChanged(CharSequence paramCharSequence) {}
  
  public void onRepeatModeChanged(int paramInt) {}
  
  public void onSessionDestroyed() {}
  
  public void onSessionEvent(String paramString, Bundle paramBundle) {}
  
  public void onSessionReady() {}
  
  public void onShuffleModeChanged(int paramInt) {}
  
  void postToHandler(int paramInt, Object paramObject, Bundle paramBundle)
  {
    Object localObject = this.mHandler;
    if (localObject != null)
    {
      localObject = this.mHandler.obtainMessage(paramInt, paramObject);
      ((Message)localObject).setData(paramBundle);
      ((Message)localObject).sendToTarget();
    }
  }
  
  void setHandler(Handler paramHandler)
  {
    MediaControllerCompat.a.a locala;
    boolean bool;
    Looper localLooper;
    if (paramHandler == null)
    {
      locala = this.mHandler;
      if (locala != null)
      {
        locala = this.mHandler;
        bool = false;
        localLooper = null;
        locala.a = false;
        locala = this.mHandler;
        locala.removeCallbacksAndMessages(null);
        this.mHandler = null;
      }
    }
    for (;;)
    {
      return;
      locala = new android/support/v4/media/session/MediaControllerCompat$a$a;
      localLooper = paramHandler.getLooper();
      locala.<init>(this, localLooper);
      this.mHandler = locala;
      locala = this.mHandler;
      bool = true;
      locala.a = bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */