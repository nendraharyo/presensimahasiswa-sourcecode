package android.support.v7.media;

import android.support.v4.media.d;

class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1
  extends d
{
  MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(MediaRouter.GlobalMediaRouter.MediaSessionRecord paramMediaSessionRecord, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public void onAdjustVolume(int paramInt)
  {
    MediaRouter.GlobalMediaRouter.CallbackHandler localCallbackHandler = MediaRouter.GlobalMediaRouter.access$1300(this.this$1.this$0);
    MediaRouter.GlobalMediaRouter.MediaSessionRecord.1.2 local2 = new android/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2;
    local2.<init>(this, paramInt);
    localCallbackHandler.post(local2);
  }
  
  public void onSetVolumeTo(int paramInt)
  {
    MediaRouter.GlobalMediaRouter.CallbackHandler localCallbackHandler = MediaRouter.GlobalMediaRouter.access$1300(this.this$1.this$0);
    MediaRouter.GlobalMediaRouter.MediaSessionRecord.1.1 local1 = new android/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1;
    local1.<init>(this, paramInt);
    localCallbackHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */