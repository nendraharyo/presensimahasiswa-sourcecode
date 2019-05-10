package android.support.v4.media.session;

import android.media.session.PlaybackState;
import java.util.List;

class e
{
  public static int a(Object paramObject)
  {
    return ((PlaybackState)paramObject).getState();
  }
  
  public static long b(Object paramObject)
  {
    return ((PlaybackState)paramObject).getPosition();
  }
  
  public static long c(Object paramObject)
  {
    return ((PlaybackState)paramObject).getBufferedPosition();
  }
  
  public static float d(Object paramObject)
  {
    return ((PlaybackState)paramObject).getPlaybackSpeed();
  }
  
  public static long e(Object paramObject)
  {
    return ((PlaybackState)paramObject).getActions();
  }
  
  public static CharSequence f(Object paramObject)
  {
    return ((PlaybackState)paramObject).getErrorMessage();
  }
  
  public static long g(Object paramObject)
  {
    return ((PlaybackState)paramObject).getLastPositionUpdateTime();
  }
  
  public static List h(Object paramObject)
  {
    return ((PlaybackState)paramObject).getCustomActions();
  }
  
  public static long i(Object paramObject)
  {
    return ((PlaybackState)paramObject).getActiveQueueItemId();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */