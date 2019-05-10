package com.google.android.gms.tagmanager;

class zzcs
  implements zzcd
{
  private final long zzSP;
  private final int zzSQ;
  private double zzSR;
  private final Object zzST;
  private long zzbkO;
  
  public zzcs()
  {
    this(60, 2000L);
  }
  
  public zzcs(int paramInt, long paramLong)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzST = localObject;
    this.zzSQ = paramInt;
    double d = this.zzSQ;
    this.zzSR = d;
    this.zzSP = paramLong;
  }
  
  public boolean zzlw()
  {
    double d1 = 1.0D;
    synchronized (this.zzST)
    {
      long l1 = System.currentTimeMillis();
      double d2 = this.zzSR;
      double d3 = this.zzSQ;
      boolean bool1 = d2 < d3;
      if (bool1)
      {
        long l2 = this.zzbkO;
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
      this.zzbkO = l1;
      double d5 = this.zzSR;
      boolean bool2 = d5 < d1;
      if (!bool2)
      {
        d5 = this.zzSR - d1;
        this.zzSR = d5;
        bool2 = true;
        return bool2;
      }
      String str = "No more tokens available.";
      zzbg.zzaK(str);
      bool2 = false;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */