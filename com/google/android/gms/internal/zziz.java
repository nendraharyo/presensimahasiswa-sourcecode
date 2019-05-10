package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;

public class zziz
{
  private long zzMJ;
  private long zzMK = Long.MIN_VALUE;
  private Object zzpV;
  
  public zziz(long paramLong)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzMJ = paramLong;
  }
  
  public boolean tryAcquire()
  {
    synchronized (this.zzpV)
    {
      zzmq localzzmq = zzr.zzbG();
      long l1 = localzzmq.elapsedRealtime();
      long l2 = this.zzMK;
      long l3 = this.zzMJ;
      l2 += l3;
      boolean bool = l2 < l1;
      if (bool)
      {
        bool = false;
        localzzmq = null;
        return bool;
      }
      this.zzMK = l1;
      bool = true;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */