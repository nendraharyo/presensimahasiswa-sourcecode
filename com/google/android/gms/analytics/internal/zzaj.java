package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

class zzaj
{
  private long zzCv;
  private final zzmq zzqW;
  
  public zzaj(zzmq paramzzmq)
  {
    zzx.zzz(paramzzmq);
    this.zzqW = paramzzmq;
  }
  
  public zzaj(zzmq paramzzmq, long paramLong)
  {
    zzx.zzz(paramzzmq);
    this.zzqW = paramzzmq;
    this.zzCv = paramLong;
  }
  
  public void clear()
  {
    this.zzCv = 0L;
  }
  
  public void start()
  {
    long l = this.zzqW.elapsedRealtime();
    this.zzCv = l;
  }
  
  public boolean zzv(long paramLong)
  {
    boolean bool1 = true;
    long l1 = this.zzCv;
    long l2 = 0L;
    boolean bool2 = l1 < l2;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      zzmq localzzmq = this.zzqW;
      l1 = localzzmq.elapsedRealtime();
      l2 = this.zzCv;
      l1 -= l2;
      bool2 = l1 < paramLong;
      if (!bool2) {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzaj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */