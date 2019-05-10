package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzmq;

class zzbe
  implements zzcd
{
  private final long zzSP;
  private final int zzSQ;
  private double zzSR;
  private long zzSS;
  private final Object zzST;
  private final String zzSU;
  private final long zzbjt;
  private final zzmq zzqW;
  
  public zzbe(int paramInt, long paramLong1, long paramLong2, String paramString, zzmq paramzzmq)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzST = localObject;
    this.zzSQ = paramInt;
    double d = this.zzSQ;
    this.zzSR = d;
    this.zzSP = paramLong1;
    this.zzbjt = paramLong2;
    this.zzSU = paramString;
    this.zzqW = paramzzmq;
  }
  
  public boolean zzlw()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    double d1 = 1.0D;
    for (;;)
    {
      synchronized (this.zzST)
      {
        localObject4 = this.zzqW;
        long l1 = ((zzmq)localObject4).currentTimeMillis();
        long l2 = this.zzSS;
        l2 = l1 - l2;
        long l3 = this.zzbjt;
        boolean bool2 = l2 < l3;
        if (bool2)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          str = "Excessive ";
          localObject4 = ((StringBuilder)localObject4).append(str);
          str = this.zzSU;
          localObject4 = ((StringBuilder)localObject4).append(str);
          str = " detected; call ignored.";
          localObject4 = ((StringBuilder)localObject4).append(str);
          localObject4 = ((StringBuilder)localObject4).toString();
          zzbg.zzaK((String)localObject4);
          return bool1;
        }
        double d2 = this.zzSR;
        int i = this.zzSQ;
        double d3 = i;
        bool2 = d2 < d3;
        if (bool2)
        {
          l2 = this.zzSS;
          l2 = l1 - l2;
          d2 = l2;
          d3 = this.zzSP;
          d2 /= d3;
          l3 = 0L;
          d3 = 0.0D;
          boolean bool3 = d2 < d3;
          if (bool3)
          {
            int j = this.zzSQ;
            d3 = j;
            double d4 = this.zzSR;
            d2 += d4;
            d2 = Math.min(d3, d2);
            this.zzSR = d2;
          }
        }
        this.zzSS = l1;
        double d5 = this.zzSR;
        boolean bool4 = d5 < d1;
        if (!bool4)
        {
          d5 = this.zzSR - d1;
          this.zzSR = d5;
          bool1 = true;
        }
      }
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      String str = "Excessive ";
      localObject4 = ((StringBuilder)localObject4).append(str);
      str = this.zzSU;
      localObject4 = ((StringBuilder)localObject4).append(str);
      str = " detected; call ignored.";
      localObject4 = ((StringBuilder)localObject4).append(str);
      localObject4 = ((StringBuilder)localObject4).toString();
      zzbg.zzaK((String)localObject4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzbe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */