package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class zziv$zza
{
  public final int count;
  public final String name;
  public final double zzMs;
  public final double zzMt;
  public final double zzMu;
  
  public zziv$zza(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    this.name = paramString;
    this.zzMt = paramDouble1;
    this.zzMs = paramDouble2;
    this.zzMu = paramDouble3;
    this.count = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof zza;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (zza)paramObject;
      String str1 = this.name;
      String str2 = ((zza)paramObject).name;
      bool2 = zzw.equal(str1, str2);
      if (bool2)
      {
        double d1 = this.zzMs;
        double d2 = ((zza)paramObject).zzMs;
        bool2 = d1 < d2;
        if (!bool2)
        {
          d1 = this.zzMt;
          d2 = ((zza)paramObject).zzMt;
          bool2 = d1 < d2;
          if (!bool2)
          {
            int i = this.count;
            int j = ((zza)paramObject).count;
            if (i == j)
            {
              d1 = this.zzMu;
              d2 = ((zza)paramObject).zzMu;
              i = Double.compare(d1, d2);
              if (i == 0) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.name;
    arrayOfObject[0] = localObject;
    localObject = Double.valueOf(this.zzMs);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(this.zzMt);
    arrayOfObject[2] = localObject;
    localObject = Double.valueOf(this.zzMu);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.count);
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.name;
    localzza = localzza.zzg("name", localObject);
    localObject = Double.valueOf(this.zzMt);
    localzza = localzza.zzg("minBound", localObject);
    localObject = Double.valueOf(this.zzMs);
    localzza = localzza.zzg("maxBound", localObject);
    localObject = Double.valueOf(this.zzMu);
    localzza = localzza.zzg("percent", localObject);
    localObject = Integer.valueOf(this.count);
    return localzza.zzg("count", localObject).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziv$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */