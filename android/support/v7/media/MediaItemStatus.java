package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.h.o;

public final class MediaItemStatus
{
  public static final String EXTRA_HTTP_RESPONSE_HEADERS = "android.media.status.extra.HTTP_RESPONSE_HEADERS";
  public static final String EXTRA_HTTP_STATUS_CODE = "android.media.status.extra.HTTP_STATUS_CODE";
  private static final String KEY_CONTENT_DURATION = "contentDuration";
  private static final String KEY_CONTENT_POSITION = "contentPosition";
  private static final String KEY_EXTRAS = "extras";
  private static final String KEY_PLAYBACK_STATE = "playbackState";
  private static final String KEY_TIMESTAMP = "timestamp";
  public static final int PLAYBACK_STATE_BUFFERING = 3;
  public static final int PLAYBACK_STATE_CANCELED = 5;
  public static final int PLAYBACK_STATE_ERROR = 7;
  public static final int PLAYBACK_STATE_FINISHED = 4;
  public static final int PLAYBACK_STATE_INVALIDATED = 6;
  public static final int PLAYBACK_STATE_PAUSED = 2;
  public static final int PLAYBACK_STATE_PENDING = 0;
  public static final int PLAYBACK_STATE_PLAYING = 1;
  private final Bundle mBundle;
  
  private MediaItemStatus(Bundle paramBundle)
  {
    this.mBundle = paramBundle;
  }
  
  public static MediaItemStatus fromBundle(Bundle paramBundle)
  {
    MediaItemStatus localMediaItemStatus;
    if (paramBundle != null)
    {
      localMediaItemStatus = new android/support/v7/media/MediaItemStatus;
      localMediaItemStatus.<init>(paramBundle);
    }
    for (;;)
    {
      return localMediaItemStatus;
      localMediaItemStatus = null;
    }
  }
  
  private static String playbackStateToString(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = Integer.toString(paramInt);
    }
    for (;;)
    {
      return str;
      str = "pending";
      continue;
      str = "buffering";
      continue;
      str = "playing";
      continue;
      str = "paused";
      continue;
      str = "finished";
      continue;
      str = "canceled";
      continue;
      str = "invalidated";
      continue;
      str = "error";
    }
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public long getContentDuration()
  {
    return this.mBundle.getLong("contentDuration", -1);
  }
  
  public long getContentPosition()
  {
    return this.mBundle.getLong("contentPosition", -1);
  }
  
  public Bundle getExtras()
  {
    return this.mBundle.getBundle("extras");
  }
  
  public int getPlaybackState()
  {
    return this.mBundle.getInt("playbackState", 7);
  }
  
  public long getTimestamp()
  {
    return this.mBundle.getLong("timestamp");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("MediaItemStatus{ ");
    localStringBuilder1.append("timestamp=");
    long l1 = SystemClock.elapsedRealtime();
    long l2 = getTimestamp();
    o.a(l1 - l2, localStringBuilder1);
    localStringBuilder1.append(" ms ago");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(", playbackState=");
    Object localObject = playbackStateToString(getPlaybackState());
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", contentPosition=");
    l1 = getContentPosition();
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", contentDuration=");
    l1 = getContentDuration();
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", extras=");
    localObject = getExtras();
    localStringBuilder2.append(localObject);
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaItemStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */