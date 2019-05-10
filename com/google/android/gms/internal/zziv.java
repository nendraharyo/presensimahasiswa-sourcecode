package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public class zziv
{
  private final String[] zzMn;
  private final double[] zzMo;
  private final double[] zzMp;
  private final int[] zzMq;
  private int zzMr;
  
  private zziv(zziv.zzb paramzzb)
  {
    int i = zziv.zzb.zza(paramzzb).size();
    Object localObject = zziv.zzb.zzb(paramzzb);
    String[] arrayOfString = new String[i];
    localObject = (String[])((List)localObject).toArray(arrayOfString);
    this.zzMn = ((String[])localObject);
    localObject = zziv.zzb.zza(paramzzb);
    localObject = zzk((List)localObject);
    this.zzMo = ((double[])localObject);
    localObject = zziv.zzb.zzc(paramzzb);
    localObject = zzk((List)localObject);
    this.zzMp = ((double[])localObject);
    localObject = new int[i];
    this.zzMq = ((int[])localObject);
    this.zzMr = 0;
  }
  
  private double[] zzk(List paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    int i = 0;
    Double localDouble = null;
    for (int j = 0;; j = i)
    {
      i = arrayOfDouble.length;
      if (j >= i) {
        break;
      }
      localDouble = (Double)paramList.get(j);
      double d = localDouble.doubleValue();
      arrayOfDouble[j] = d;
      i = j + 1;
    }
    return arrayOfDouble;
  }
  
  public List getBuckets()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzMn.length;
    localArrayList.<init>(i);
    i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.zzMn;
      i = localObject.length;
      if (j >= i) {
        break;
      }
      localObject = new com/google/android/gms/internal/zziv$zza;
      String str = this.zzMn[j];
      double[] arrayOfDouble1 = this.zzMp;
      double d1 = arrayOfDouble1[j];
      double[] arrayOfDouble2 = this.zzMo;
      double d2 = arrayOfDouble2[j];
      int[] arrayOfInt1 = this.zzMq;
      int k = arrayOfInt1[j];
      double d3 = k;
      double d4 = this.zzMr;
      d3 /= d4;
      int[] arrayOfInt2 = this.zzMq;
      int m = arrayOfInt2[j];
      ((zziv.zza)localObject).<init>(str, d1, d2, d3, m);
      localArrayList.add(localObject);
      i = j + 1;
    }
    return localArrayList;
  }
  
  public void zza(double paramDouble)
  {
    int i = this.zzMr + 1;
    this.zzMr = i;
    i = 0;
    for (;;)
    {
      Object localObject = this.zzMp;
      int j = localObject.length;
      if (i < j)
      {
        localObject = this.zzMp;
        double d = localObject[i];
        boolean bool = d < paramDouble;
        if (!bool)
        {
          localObject = this.zzMo;
          d = localObject[i];
          bool = paramDouble < d;
          if (bool)
          {
            localObject = this.zzMq;
            int k = localObject[i] + 1;
            localObject[i] = k;
          }
        }
        localObject = this.zzMp;
        d = localObject[i];
        bool = paramDouble < d;
        if (!bool) {}
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */