package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public class zziv$zzb
{
  private final List zzMv;
  private final List zzMw;
  private final List zzMx;
  
  public zziv$zzb()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzMv = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzMw = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzMx = localArrayList;
  }
  
  public zzb zza(String paramString, double paramDouble1, double paramDouble2)
  {
    int i = 0;
    Object localObject = null;
    label145:
    int j;
    for (int k = 0;; k = j)
    {
      localObject = this.zzMv;
      i = ((List)localObject).size();
      double d1;
      double d2;
      boolean bool;
      if (k < i)
      {
        d1 = ((Double)this.zzMx.get(k)).doubleValue();
        localObject = (Double)this.zzMw.get(k);
        d2 = ((Double)localObject).doubleValue();
        bool = paramDouble1 < d1;
        if (!bool) {
          break label145;
        }
      }
      do
      {
        this.zzMv.add(k, paramString);
        localObject = this.zzMx;
        Double localDouble = Double.valueOf(paramDouble1);
        ((List)localObject).add(k, localDouble);
        localObject = this.zzMw;
        localDouble = Double.valueOf(paramDouble2);
        ((List)localObject).add(k, localDouble);
        return this;
        bool = d1 < paramDouble1;
        if (bool) {
          break;
        }
        bool = paramDouble2 < d2;
      } while (bool);
      j = k + 1;
    }
  }
  
  public zziv zzhA()
  {
    zziv localzziv = new com/google/android/gms/internal/zziv;
    localzziv.<init>(this, null);
    return localzziv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziv$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */