package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

public final class MediaSessionStatus$Builder
{
  private final Bundle mBundle;
  
  public MediaSessionStatus$Builder(int paramInt)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.mBundle = localBundle;
    long l = SystemClock.elapsedRealtime();
    setTimestamp(l);
    setSessionState(paramInt);
  }
  
  public MediaSessionStatus$Builder(MediaSessionStatus paramMediaSessionStatus)
  {
    if (paramMediaSessionStatus == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("status must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new android/os/Bundle;
    Bundle localBundle = MediaSessionStatus.access$000(paramMediaSessionStatus);
    ((Bundle)localObject).<init>(localBundle);
    this.mBundle = ((Bundle)localObject);
  }
  
  public MediaSessionStatus build()
  {
    MediaSessionStatus localMediaSessionStatus = new android/support/v7/media/MediaSessionStatus;
    Bundle localBundle = this.mBundle;
    localMediaSessionStatus.<init>(localBundle, null);
    return localMediaSessionStatus;
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    this.mBundle.putBundle("extras", paramBundle);
    return this;
  }
  
  public Builder setQueuePaused(boolean paramBoolean)
  {
    this.mBundle.putBoolean("queuePaused", paramBoolean);
    return this;
  }
  
  public Builder setSessionState(int paramInt)
  {
    this.mBundle.putInt("sessionState", paramInt);
    return this;
  }
  
  public Builder setTimestamp(long paramLong)
  {
    this.mBundle.putLong("timestamp", paramLong);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaSessionStatus$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */