package android.support.v7.media;

import android.support.v4.media.d;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;

final class MediaRouter$GlobalMediaRouter$MediaSessionRecord
{
  private int mControlType;
  private int mMaxVolume;
  private final MediaSessionCompat mMsCompat;
  private d mVpCompat;
  
  public MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, Object paramObject)
  {
    MediaSessionCompat localMediaSessionCompat = MediaSessionCompat.obtain(MediaRouter.GlobalMediaRouter.access$1100(paramGlobalMediaRouter), paramObject);
    this.mMsCompat = localMediaSessionCompat;
  }
  
  public void clearVolumeHandling()
  {
    MediaSessionCompat localMediaSessionCompat = this.mMsCompat;
    int i = MediaRouter.GlobalMediaRouter.access$1400(this.this$0).playbackStream;
    localMediaSessionCompat.a(i);
    this.mVpCompat = null;
  }
  
  public void configureVolume(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = this.mVpCompat;
    if (localObject != null)
    {
      int i = this.mControlType;
      if (paramInt1 == i)
      {
        i = this.mMaxVolume;
        if (paramInt2 == i)
        {
          localObject = this.mVpCompat;
          ((d)localObject).setCurrentVolume(paramInt3);
        }
      }
    }
    for (;;)
    {
      return;
      localObject = new android/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord$1;
      ((MediaRouter.GlobalMediaRouter.MediaSessionRecord.1)localObject).<init>(this, paramInt1, paramInt2, paramInt3);
      this.mVpCompat = ((d)localObject);
      localObject = this.mMsCompat;
      d locald = this.mVpCompat;
      ((MediaSessionCompat)localObject).a(locald);
    }
  }
  
  public MediaSessionCompat.Token getToken()
  {
    return this.mMsCompat.b();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter$MediaSessionRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */