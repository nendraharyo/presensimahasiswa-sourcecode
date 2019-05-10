package com.google.android.gms.tagmanager;

class zzde
  extends Number
  implements Comparable
{
  private double zzblB;
  private long zzblC;
  private boolean zzblD;
  
  private zzde(double paramDouble)
  {
    this.zzblB = paramDouble;
    this.zzblD = false;
  }
  
  private zzde(long paramLong)
  {
    this.zzblC = paramLong;
    this.zzblD = true;
  }
  
  public static zzde zza(Double paramDouble)
  {
    zzde localzzde = new com/google/android/gms/tagmanager/zzde;
    double d = paramDouble.doubleValue();
    localzzde.<init>(d);
    return localzzde;
  }
  
  public static zzde zzam(long paramLong)
  {
    zzde localzzde = new com/google/android/gms/tagmanager/zzde;
    localzzde.<init>(paramLong);
    return localzzde;
  }
  
  public static zzde zzgs(String paramString)
  {
    try
    {
      localzzde1 = new com/google/android/gms/tagmanager/zzde;
      long l = Long.parseLong(paramString);
      localzzde1.<init>(l);
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        zzde localzzde1;
        zzde localzzde2 = new com/google/android/gms/tagmanager/zzde;
        double d = Double.parseDouble(paramString);
        localzzde2.<init>(d);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        NumberFormatException localNumberFormatException3 = new java/lang/NumberFormatException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = paramString + " is not a valid TypedNumber";
        localNumberFormatException3.<init>((String)localObject);
        throw localNumberFormatException3;
      }
    }
    return localzzde1;
  }
  
  public byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public double doubleValue()
  {
    boolean bool = zzHv();
    long l;
    if (bool) {
      l = this.zzblC;
    }
    for (double d = l;; d = this.zzblB) {
      return d;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof zzde;
    if (bool)
    {
      paramObject = (zzde)paramObject;
      i = zza((zzde)paramObject);
      if (i != 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public float floatValue()
  {
    return (float)doubleValue();
  }
  
  public int hashCode()
  {
    Long localLong = new java/lang/Long;
    long l = longValue();
    localLong.<init>(l);
    return localLong.hashCode();
  }
  
  public int intValue()
  {
    return zzHx();
  }
  
  public long longValue()
  {
    return zzHw();
  }
  
  public short shortValue()
  {
    return zzHy();
  }
  
  public String toString()
  {
    boolean bool = zzHv();
    long l;
    if (bool) {
      l = this.zzblC;
    }
    double d;
    for (String str = Long.toString(l);; str = Double.toString(d))
    {
      return str;
      d = this.zzblB;
    }
  }
  
  public boolean zzHu()
  {
    boolean bool = zzHv();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean zzHv()
  {
    return this.zzblD;
  }
  
  public long zzHw()
  {
    boolean bool = zzHv();
    if (bool) {}
    double d;
    for (long l = this.zzblC;; l = d)
    {
      return l;
      d = this.zzblB;
    }
  }
  
  public int zzHx()
  {
    return (int)longValue();
  }
  
  public short zzHy()
  {
    return (short)(int)longValue();
  }
  
  public int zza(zzde paramzzde)
  {
    boolean bool = zzHv();
    Long localLong1;
    Long localLong2;
    if (bool)
    {
      bool = paramzzde.zzHv();
      if (bool)
      {
        localLong1 = new java/lang/Long;
        long l = this.zzblC;
        localLong1.<init>(l);
        l = paramzzde.zzblC;
        localLong2 = Long.valueOf(l);
      }
    }
    double d1;
    double d2;
    for (int i = localLong1.compareTo(localLong2);; i = Double.compare(d1, d2))
    {
      return i;
      d1 = doubleValue();
      d2 = paramzzde.doubleValue();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzde.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */