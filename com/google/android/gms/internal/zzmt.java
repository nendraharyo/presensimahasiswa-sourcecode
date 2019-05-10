package com.google.android.gms.internal;

import android.os.SystemClock;

public final class zzmt
  implements zzmq
{
  private static zzmt zzaoa;
  
  public static zzmq zzsc()
  {
    synchronized (zzmt.class)
    {
      zzmt localzzmt = zzaoa;
      if (localzzmt == null)
      {
        localzzmt = new com/google/android/gms/internal/zzmt;
        localzzmt.<init>();
        zzaoa = localzzmt;
      }
      localzzmt = zzaoa;
      return localzzmt;
    }
  }
  
  public long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }
  
  public long elapsedRealtime()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public long nanoTime()
  {
    return System.nanoTime();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */