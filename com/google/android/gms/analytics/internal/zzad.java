package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzmq;

public class zzad
{
  private final long zzSP;
  private final int zzSQ;
  private double zzSR;
  private long zzSS;
  private final Object zzST;
  private final String zzSU;
  private final zzmq zzqW;
  
  public zzad(int paramInt, long paramLong, String paramString, zzmq paramzzmq)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzST = localObject;
    this.zzSQ = paramInt;
    double d = this.zzSQ;
    this.zzSR = d;
    this.zzSP = paramLong;
    this.zzSU = paramString;
    this.zzqW = paramzzmq;
  }
  
  public zzad(String paramString, zzmq paramzzmq)
  {
    this(60, 2000L, paramString, paramzzmq);
  }
  
  public boolean zzlw()
  {
    double d1 = 1.0D;
    synchronized (this.zzST)
    {
      Object localObject2 = this.zzqW;
      long l1 = ((zzmq)localObject2).currentTimeMillis();
      double d2 = this.zzSR;
      double d3 = this.zzSQ;
      boolean bool1 = d2 < d3;
      if (bool1)
      {
        long l2 = this.zzSS;
        l2 = l1 - l2;
        d2 = l2;
        d3 = this.zzSP;
        d2 /= d3;
        d3 = 0.0D;
        bool1 = d2 < d3;
        if (bool1)
        {
          int i = this.zzSQ;
          d3 = i;
          double d4 = this.zzSR;
          d2 += d4;
          d2 = Math.min(d3, d2);
          this.zzSR = d2;
        }
      }
      this.zzSS = l1;
      double d5 = this.zzSR;
      boolean bool2 = d5 < d1;
      if (!bool2)
      {
        d5 = this.zzSR - d1;
        this.zzSR = d5;
        bool2 = true;
        return bool2;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Excessive ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = this.zzSU;
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = " detected; call ignored.";
      localObject2 = ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      zzae.zzaK((String)localObject2);
      bool2 = false;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */