package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

class MediaControllerCompat$a$c
  extends a.a
{
  private final WeakReference a;
  
  MediaControllerCompat$a$c(MediaControllerCompat.a parama)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(parama);
    this.a = localWeakReference;
  }
  
  public void a()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 8;
      locala.postToHandler(i, null, null);
    }
  }
  
  public void a(int paramInt)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 9;
      Integer localInteger = Integer.valueOf(paramInt);
      locala.postToHandler(i, localInteger, null);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 7;
      locala.postToHandler(i, paramBundle, null);
    }
  }
  
  public void a(MediaMetadataCompat paramMediaMetadataCompat)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 3;
      locala.postToHandler(i, paramMediaMetadataCompat, null);
    }
  }
  
  public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
  {
    Object localObject1 = this.a.get();
    Object localObject2 = localObject1;
    localObject2 = (MediaControllerCompat.a)localObject1;
    int i;
    if (localObject2 != null)
    {
      if (paramParcelableVolumeInfo == null) {
        break label83;
      }
      localObject1 = new android/support/v4/media/session/MediaControllerCompat$f;
      i = paramParcelableVolumeInfo.a;
      int j = paramParcelableVolumeInfo.b;
      int k = paramParcelableVolumeInfo.c;
      int m = paramParcelableVolumeInfo.d;
      int n = paramParcelableVolumeInfo.e;
      ((MediaControllerCompat.f)localObject1).<init>(i, j, k, m, n);
    }
    for (;;)
    {
      i = 4;
      ((MediaControllerCompat.a)localObject2).postToHandler(i, localObject1, null);
      return;
      label83:
      localObject1 = null;
    }
  }
  
  public void a(PlaybackStateCompat paramPlaybackStateCompat)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 2;
      locala.postToHandler(i, paramPlaybackStateCompat, null);
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 6;
      locala.postToHandler(i, paramCharSequence, null);
    }
  }
  
  public void a(String paramString, Bundle paramBundle)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 1;
      locala.postToHandler(i, paramString, paramBundle);
    }
  }
  
  public void a(List paramList)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 5;
      locala.postToHandler(i, paramList, null);
    }
  }
  
  public void a(boolean paramBoolean) {}
  
  public void b()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 13;
      locala.postToHandler(i, null, null);
    }
  }
  
  public void b(int paramInt)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 12;
      Integer localInteger = Integer.valueOf(paramInt);
      locala.postToHandler(i, localInteger, null);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)this.a.get();
    if (locala != null)
    {
      int i = 11;
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      locala.postToHandler(i, localBoolean, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$a$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */