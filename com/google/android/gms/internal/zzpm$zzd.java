package com.google.android.gms.internal;

public final class zzpm$zzd
  extends zzso
{
  public boolean zzaMv;
  public long zzaMw;
  public double zzaMx;
  public zzpm.zzc zzaMy;
  public String zzamJ;
  
  public zzpm$zzd()
  {
    zzyv();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    zzsq localzzsq1 = null;
    if (paramObject == this) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof zzd;
      if (bool3)
      {
        paramObject = (zzd)paramObject;
        bool3 = this.zzaMv;
        boolean bool4 = ((zzd)paramObject).zzaMv;
        if (bool3 == bool4)
        {
          Object localObject1 = this.zzamJ;
          if (localObject1 == null)
          {
            localObject1 = ((zzd)paramObject).zzamJ;
            if (localObject1 != null) {
              continue;
            }
            label73:
            long l1 = this.zzaMw;
            long l2 = ((zzd)paramObject).zzaMw;
            bool3 = l1 < l2;
            if (bool3) {
              continue;
            }
            double d1 = this.zzaMx;
            l1 = Double.doubleToLongBits(d1);
            double d2 = ((zzd)paramObject).zzaMx;
            l2 = Double.doubleToLongBits(d2);
            bool3 = l1 < l2;
            if (bool3) {
              continue;
            }
            localObject1 = this.zzaMy;
            if (localObject1 != null) {
              break label249;
            }
            localObject1 = ((zzd)paramObject).zzaMy;
            if (localObject1 != null) {
              continue;
            }
          }
          label249:
          do
          {
            localObject1 = this.zzbuj;
            if (localObject1 != null)
            {
              localObject1 = this.zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break label278;
              }
            }
            localObject1 = ((zzd)paramObject).zzbuj;
            if (localObject1 != null)
            {
              localObject1 = ((zzd)paramObject).zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject1 = this.zzamJ;
            Object localObject2 = ((zzd)paramObject).zzamJ;
            bool3 = ((String)localObject1).equals(localObject2);
            if (bool3) {
              break label73;
            }
            break;
            localObject1 = this.zzaMy;
            localObject2 = ((zzd)paramObject).zzaMy;
            bool3 = ((zzpm.zzc)localObject1).equals(localObject2);
          } while (bool3);
          continue;
          label278:
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zzd)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 32;
    int j = 0;
    zzsq localzzsq1 = null;
    Object localObject = getClass().getName();
    int k = (((String)localObject).hashCode() + 527) * 31;
    boolean bool2 = this.zzaMv;
    int m;
    if (bool2)
    {
      m = 1231;
      m += k;
      k = m * 31;
      localObject = this.zzamJ;
      if (localObject != null) {
        break label237;
      }
      m = 0;
      localObject = null;
      label77:
      m = (m + k) * 31;
      long l1 = this.zzaMw;
      long l2 = this.zzaMw >>> i;
      k = (int)(l1 ^ l2);
      m += k;
      double d = this.zzaMx;
      l1 = Double.doubleToLongBits(d);
      m *= 31;
      l2 = l1 >>> i;
      l1 ^= l2;
      k = (int)l1;
      m += k;
      k = m * 31;
      localObject = this.zzaMy;
      if (localObject != null) {
        break label253;
      }
      m = 0;
      localObject = null;
      label185:
      m = (m + k) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool1 = localzzsq2.isEmpty();
        if (!bool1) {
          break label269;
        }
      }
    }
    for (;;)
    {
      return m + j;
      m = 1237;
      break;
      label237:
      localObject = this.zzamJ;
      m = ((String)localObject).hashCode();
      break label77;
      label253:
      localObject = this.zzaMy;
      m = ((zzpm.zzc)localObject).hashCode();
      break label185;
      label269:
      localzzsq1 = this.zzbuj;
      j = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = this.zzaMv;
    if (i != 0)
    {
      i = 1;
      boolean bool4 = this.zzaMv;
      paramzzsn.zze(i, bool4);
    }
    Object localObject1 = this.zzamJ;
    Object localObject2 = "";
    boolean bool1 = ((String)localObject1).equals(localObject2);
    if (!bool1)
    {
      int j = 2;
      localObject2 = this.zzamJ;
      paramzzsn.zzn(j, (String)localObject2);
    }
    long l1 = this.zzaMw;
    long l2 = 0L;
    double d1 = 0.0D;
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      int k = 3;
      l2 = this.zzaMw;
      paramzzsn.zzb(k, l2);
    }
    double d2 = this.zzaMx;
    l1 = Double.doubleToLongBits(d2);
    d1 = 0.0D;
    l2 = Double.doubleToLongBits(d1);
    boolean bool3 = l1 < l2;
    int m;
    if (bool3)
    {
      m = 4;
      d1 = this.zzaMx;
      paramzzsn.zza(m, d1);
    }
    localObject1 = this.zzaMy;
    if (localObject1 != null)
    {
      m = 5;
      localObject2 = this.zzaMy;
      paramzzsn.zza(m, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzd zzs(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      boolean bool;
      Object localObject;
      switch (i)
      {
      default: 
        bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        bool = paramzzsm.zzJc();
        this.zzaMv = bool;
        break;
      case 18: 
        localObject = paramzzsm.readString();
        this.zzamJ = ((String)localObject);
        break;
      case 24: 
        long l = paramzzsm.zzJa();
        this.zzaMw = l;
        break;
      case 33: 
        double d = paramzzsm.readDouble();
        this.zzaMx = d;
        break;
      case 42: 
        localObject = this.zzaMy;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzpm$zzc;
          ((zzpm.zzc)localObject).<init>();
          this.zzaMy = ((zzpm.zzc)localObject);
        }
        localObject = this.zzaMy;
        paramzzsm.zza((zzsu)localObject);
      }
    }
  }
  
  public zzd zzyv()
  {
    this.zzaMv = false;
    this.zzamJ = "";
    this.zzaMw = 0L;
    this.zzaMx = 0.0D;
    this.zzaMy = null;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    boolean bool1 = this.zzaMv;
    if (bool1)
    {
      boolean bool5 = this.zzaMv;
      int j = zzsn.zzf(1, bool5);
      i += j;
    }
    Object localObject1 = this.zzamJ;
    Object localObject2 = "";
    boolean bool2 = ((String)localObject1).equals(localObject2);
    if (!bool2)
    {
      localObject2 = this.zzamJ;
      int k = zzsn.zzo(2, (String)localObject2);
      i += k;
    }
    long l1 = this.zzaMw;
    long l2 = 0L;
    double d1 = 0.0D;
    boolean bool3 = l1 < l2;
    if (bool3)
    {
      l1 = this.zzaMw;
      int m = zzsn.zzd(3, l1);
      i += m;
    }
    double d2 = this.zzaMx;
    l1 = Double.doubleToLongBits(d2);
    d1 = 0.0D;
    l2 = Double.doubleToLongBits(d1);
    boolean bool4 = l1 < l2;
    int n;
    if (bool4)
    {
      d2 = this.zzaMx;
      n = zzsn.zzb(4, d2);
      i += n;
    }
    localObject1 = this.zzaMy;
    if (localObject1 != null)
    {
      localObject2 = this.zzaMy;
      n = zzsn.zzc(5, (zzsu)localObject2);
      i += n;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpm$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */