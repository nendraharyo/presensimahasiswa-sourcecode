package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

class c$b
  extends MediaController.Callback
{
  protected final c.a a;
  
  public c$b(c.a parama)
  {
    this.a = parama;
  }
  
  public void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
  {
    c.a locala = this.a;
    int i = paramPlaybackInfo.getPlaybackType();
    int j = c.c.b(paramPlaybackInfo);
    int k = paramPlaybackInfo.getVolumeControl();
    int m = paramPlaybackInfo.getMaxVolume();
    int n = paramPlaybackInfo.getCurrentVolume();
    locala.a(i, j, k, m, n);
  }
  
  public void onExtrasChanged(Bundle paramBundle)
  {
    this.a.a(paramBundle);
  }
  
  public void onMetadataChanged(MediaMetadata paramMediaMetadata)
  {
    this.a.b(paramMediaMetadata);
  }
  
  public void onPlaybackStateChanged(PlaybackState paramPlaybackState)
  {
    this.a.a(paramPlaybackState);
  }
  
  public void onQueueChanged(List paramList)
  {
    this.a.a(paramList);
  }
  
  public void onQueueTitleChanged(CharSequence paramCharSequence)
  {
    this.a.a(paramCharSequence);
  }
  
  public void onSessionDestroyed()
  {
    this.a.a();
  }
  
  public void onSessionEvent(String paramString, Bundle paramBundle)
  {
    this.a.a(paramString, paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */