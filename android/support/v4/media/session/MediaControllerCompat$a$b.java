package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

class MediaControllerCompat$a$b
  implements c.a
{
  private final WeakReference a;
  
  MediaControllerCompat$a$b(MediaControllerCompat.a parama)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(parama);
    this.a = localWeakReference;
  }
  
  public void a()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null) {
      locala.onSessionDestroyed();
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Object localObject1 = this.a.get();
    Object localObject2 = localObject1;
    localObject2 = (MediaControllerCompat.a)localObject1;
    if (localObject2 != null)
    {
      localObject1 = new android/support/v4/media/session/MediaControllerCompat$f;
      ((MediaControllerCompat.f)localObject1).<init>(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      ((MediaControllerCompat.a)localObject2).onAudioInfoChanged((MediaControllerCompat.f)localObject1);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null) {
      locala.onExtrasChanged(paramBundle);
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null) {
      locala.onQueueTitleChanged(paramCharSequence);
    }
  }
  
  public void a(Object paramObject)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      boolean bool = locala.mHasExtraCallback;
      if (!bool) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      PlaybackStateCompat localPlaybackStateCompat = PlaybackStateCompat.a(paramObject);
      locala.onPlaybackStateChanged(localPlaybackStateCompat);
    }
  }
  
  public void a(String paramString, Bundle paramBundle)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      boolean bool = locala.mHasExtraCallback;
      if (!bool) {
        break label43;
      }
      int i = Build.VERSION.SDK_INT;
      int j = 23;
      if (i >= j) {
        break label43;
      }
    }
    for (;;)
    {
      return;
      label43:
      locala.onSessionEvent(paramString, paramBundle);
    }
  }
  
  public void a(List paramList)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      List localList = MediaSessionCompat.QueueItem.a(paramList);
      locala.onQueueChanged(localList);
    }
  }
  
  public void b(Object paramObject)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      MediaMetadataCompat localMediaMetadataCompat = MediaMetadataCompat.a(paramObject);
      locala.onMetadataChanged(localMediaMetadataCompat);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */