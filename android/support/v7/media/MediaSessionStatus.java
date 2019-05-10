package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.h.o;

public final class MediaSessionStatus
{
  private static final String KEY_EXTRAS = "extras";
  private static final String KEY_QUEUE_PAUSED = "queuePaused";
  private static final String KEY_SESSION_STATE = "sessionState";
  private static final String KEY_TIMESTAMP = "timestamp";
  public static final int SESSION_STATE_ACTIVE = 0;
  public static final int SESSION_STATE_ENDED = 1;
  public static final int SESSION_STATE_INVALIDATED = 2;
  private final Bundle mBundle;
  
  private MediaSessionStatus(Bundle paramBundle)
  {
    this.mBundle = paramBundle;
  }
  
  public static MediaSessionStatus fromBundle(Bundle paramBundle)
  {
    MediaSessionStatus localMediaSessionStatus;
    if (paramBundle != null)
    {
      localMediaSessionStatus = new android/support/v7/media/MediaSessionStatus;
      localMediaSessionStatus.<init>(paramBundle);
    }
    for (;;)
    {
      return localMediaSessionStatus;
      localMediaSessionStatus = null;
    }
  }
  
  private static String sessionStateToString(int paramInt)
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
      str = "active";
      continue;
      str = "ended";
      continue;
      str = "invalidated";
    }
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public Bundle getExtras()
  {
    return this.mBundle.getBundle("extras");
  }
  
  public int getSessionState()
  {
    return this.mBundle.getInt("sessionState", 2);
  }
  
  public long getTimestamp()
  {
    return this.mBundle.getLong("timestamp");
  }
  
  public boolean isQueuePaused()
  {
    return this.mBundle.getBoolean("queuePaused");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("MediaSessionStatus{ ");
    localStringBuilder1.append("timestamp=");
    long l1 = SystemClock.elapsedRealtime();
    long l2 = getTimestamp();
    o.a(l1 - l2, localStringBuilder1);
    localStringBuilder1.append(" ms ago");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(", sessionState=");
    Object localObject = sessionStateToString(getSessionState());
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", queuePaused=");
    boolean bool = isQueuePaused();
    localStringBuilder2.append(bool);
    localStringBuilder2 = localStringBuilder1.append(", extras=");
    localObject = getExtras();
    localStringBuilder2.append(localObject);
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaSessionStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */