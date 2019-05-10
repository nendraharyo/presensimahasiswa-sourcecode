package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

public final class MediaItemStatus$Builder
{
  private final Bundle mBundle;
  
  public MediaItemStatus$Builder(int paramInt)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.mBundle = localBundle;
    long l = SystemClock.elapsedRealtime();
    setTimestamp(l);
    setPlaybackState(paramInt);
  }
  
  public MediaItemStatus$Builder(MediaItemStatus paramMediaItemStatus)
  {
    if (paramMediaItemStatus == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("status must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new android/os/Bundle;
    Bundle localBundle = MediaItemStatus.access$000(paramMediaItemStatus);
    ((Bundle)localObject).<init>(localBundle);
    this.mBundle = ((Bundle)localObject);
  }
  
  public MediaItemStatus build()
  {
    MediaItemStatus localMediaItemStatus = new android/support/v7/media/MediaItemStatus;
    Bundle localBundle = this.mBundle;
    localMediaItemStatus.<init>(localBundle, null);
    return localMediaItemStatus;
  }
  
  public Builder setContentDuration(long paramLong)
  {
    this.mBundle.putLong("contentDuration", paramLong);
    return this;
  }
  
  public Builder setContentPosition(long paramLong)
  {
    this.mBundle.putLong("contentPosition", paramLong);
    return this;
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    this.mBundle.putBundle("extras", paramBundle);
    return this;
  }
  
  public Builder setPlaybackState(int paramInt)
  {
    this.mBundle.putInt("playbackState", paramInt);
    return this;
  }
  
  public Builder setTimestamp(long paramLong)
  {
    this.mBundle.putLong("timestamp", paramLong);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaItemStatus$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */