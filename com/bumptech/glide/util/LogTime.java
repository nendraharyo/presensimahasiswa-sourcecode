package com.bumptech.glide.util;

import android.os.Build.VERSION;
import android.os.SystemClock;

public final class LogTime
{
  private static final double MILLIS_MULTIPLIER;
  
  static
  {
    double d1 = 1.0D;
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j)
    {
      double d2 = 6.0D;
      double d3 = Math.pow(10.0D, d2);
      d1 /= d3;
    }
    MILLIS_MULTIPLIER = d1;
  }
  
  public static double getElapsedMillis(long paramLong)
  {
    double d1 = getLogTime() - paramLong;
    double d2 = MILLIS_MULTIPLIER;
    return d1 * d2;
  }
  
  public static long getLogTime()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j) {}
    for (long l = SystemClock.elapsedRealtimeNanos();; l = SystemClock.uptimeMillis()) {
      return l;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\LogTime.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */