package android.support.v7.app;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.a;
import android.support.v4.media.session.PlaybackStateCompat;

final class MediaRouteControllerDialog$MediaControllerCallback
  extends MediaControllerCompat.a
{
  private MediaRouteControllerDialog$MediaControllerCallback(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this.this$0;
    if (paramMediaMetadataCompat == null) {}
    for (MediaDescriptionCompat localMediaDescriptionCompat = null;; localMediaDescriptionCompat = paramMediaMetadataCompat.a())
    {
      MediaRouteControllerDialog.access$1102(localMediaRouteControllerDialog, localMediaDescriptionCompat);
      MediaRouteControllerDialog.access$700(this.this$0);
      return;
    }
  }
  
  public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
  {
    MediaRouteControllerDialog.access$1002(this.this$0, paramPlaybackStateCompat);
    MediaRouteControllerDialog.access$700(this.this$0);
  }
  
  public void onSessionDestroyed()
  {
    Object localObject = MediaRouteControllerDialog.access$800(this.this$0);
    if (localObject != null)
    {
      localObject = MediaRouteControllerDialog.access$800(this.this$0);
      MediaControllerCallback localMediaControllerCallback = MediaRouteControllerDialog.access$900(this.this$0);
      ((MediaControllerCompat)localObject).b(localMediaControllerCallback);
      localObject = this.this$0;
      localMediaControllerCallback = null;
      MediaRouteControllerDialog.access$802((MediaRouteControllerDialog)localObject, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteControllerDialog$MediaControllerCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */