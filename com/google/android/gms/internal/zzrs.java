package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zzrs
{
  private static zzag.zza zza(int paramInt, zzaf.zzf paramzzf, zzag.zza[] paramArrayOfzza, Set paramSet)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = Integer.valueOf(paramInt);
    boolean bool = paramSet.contains(localObject2);
    if (bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Value cycle detected.  Current value reference: ").append(paramInt).append(".").append("  Previous value references: ").append(paramSet);
      localObject3 = ".";
      localObject2 = (String)localObject3;
      zzgC((String)localObject2);
    }
    localObject2 = (zzag.zza)zza(paramzzf.zziI, paramInt, "values");
    Object localObject3 = paramArrayOfzza[paramInt];
    if (localObject3 != null)
    {
      localObject2 = paramArrayOfzza[paramInt];
      return (zzag.zza)localObject2;
    }
    localObject3 = null;
    Object localObject4 = Integer.valueOf(paramInt);
    paramSet.add(localObject4);
    int j = ((zzag.zza)localObject2).type;
    switch (j)
    {
    }
    for (;;)
    {
      if (localObject3 == null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = "Invalid value: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject2 = localObject2;
        zzgC((String)localObject2);
      }
      paramArrayOfzza[paramInt] = localObject3;
      localObject2 = Integer.valueOf(paramInt);
      paramSet.remove(localObject2);
      localObject2 = localObject3;
      break;
      localObject4 = zzp((zzag.zza)localObject2);
      localObject3 = zzo((zzag.zza)localObject2);
      int k = ((zzaf.zzh)localObject4).zzjj.length;
      Object localObject5 = new zzag.zza[k];
      ((zzag.zza)localObject3).zzjy = ((zzag.zza[])localObject5);
      int[] arrayOfInt = ((zzaf.zzh)localObject4).zzjj;
      int m = arrayOfInt.length;
      j = 0;
      localObject4 = null;
      int n;
      zzag.zza[] arrayOfzza1;
      while (i < m)
      {
        n = arrayOfInt[i];
        arrayOfzza1 = ((zzag.zza)localObject3).zzjy;
        k = j + 1;
        localObject6 = zza(n, paramzzf, paramArrayOfzza, paramSet);
        arrayOfzza1[j] = localObject6;
        i += 1;
        j = k;
      }
      localObject3 = zzo((zzag.zza)localObject2);
      zzaf.zzh localzzh = zzp((zzag.zza)localObject2);
      localObject4 = localzzh.zzjk;
      j = localObject4.length;
      localObject5 = localzzh.zzjl;
      k = localObject5.length;
      if (j != k)
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Uneven map keys (");
        k = localzzh.zzjk.length;
        localObject4 = ((StringBuilder)localObject4).append(k).append(") and map values (");
        k = localzzh.zzjl.length;
        localObject4 = ((StringBuilder)localObject4).append(k);
        localObject5 = ")";
        localObject4 = (String)localObject5;
        zzgC((String)localObject4);
      }
      localObject4 = new zzag.zza[localzzh.zzjk.length];
      ((zzag.zza)localObject3).zzjz = ((zzag.zza[])localObject4);
      localObject4 = new zzag.zza[localzzh.zzjk.length];
      ((zzag.zza)localObject3).zzjA = ((zzag.zza[])localObject4);
      Object localObject6 = localzzh.zzjk;
      int i1 = localObject6.length;
      j = 0;
      localObject4 = null;
      k = 0;
      localObject5 = null;
      while (j < i1)
      {
        int i2 = localObject6[j];
        zzag.zza[] arrayOfzza2 = ((zzag.zza)localObject3).zzjz;
        int i3 = k + 1;
        zzag.zza localzza = zza(i2, paramzzf, paramArrayOfzza, paramSet);
        arrayOfzza2[k] = localzza;
        j += 1;
        k = i3;
      }
      arrayOfInt = localzzh.zzjl;
      m = arrayOfInt.length;
      j = 0;
      localObject4 = null;
      while (i < m)
      {
        n = arrayOfInt[i];
        arrayOfzza1 = ((zzag.zza)localObject3).zzjA;
        k = j + 1;
        localObject6 = zza(n, paramzzf, paramArrayOfzza, paramSet);
        arrayOfzza1[j] = localObject6;
        i += 1;
        j = k;
      }
      localObject3 = zzo((zzag.zza)localObject2);
      i = zzp((zzag.zza)localObject2).zzjo;
      localObject1 = zzdf.zzg(zza(i, paramzzf, paramArrayOfzza, paramSet));
      ((zzag.zza)localObject3).zzjB = ((String)localObject1);
      continue;
      localObject3 = zzo((zzag.zza)localObject2);
      localObject4 = zzp((zzag.zza)localObject2);
      k = ((zzaf.zzh)localObject4).zzjn.length;
      localObject5 = new zzag.zza[k];
      ((zzag.zza)localObject3).zzjF = ((zzag.zza[])localObject5);
      arrayOfInt = ((zzaf.zzh)localObject4).zzjn;
      m = arrayOfInt.length;
      j = 0;
      localObject4 = null;
      while (i < m)
      {
        n = arrayOfInt[i];
        arrayOfzza1 = ((zzag.zza)localObject3).zzjF;
        k = j + 1;
        localObject6 = zza(n, paramzzf, paramArrayOfzza, paramSet);
        arrayOfzza1[j] = localObject6;
        i += 1;
        j = k;
      }
      localObject3 = localObject2;
    }
  }
  
  private static zzrs.zza zza(zzaf.zzb paramzzb, zzaf.zzf paramzzf, zzag.zza[] paramArrayOfzza, int paramInt)
  {
    zzrs.zzb localzzb = zzrs.zza.zzHH();
    int[] arrayOfInt = paramzzb.zzit;
    int i = arrayOfInt.length;
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    if (k < i)
    {
      localObject1 = Integer.valueOf(arrayOfInt[k]);
      Object localObject2 = paramzzf.zziJ;
      j = ((Integer)localObject1).intValue();
      localObject1 = (zzaf.zze)zza((Object[])localObject2, j, "properties");
      localObject2 = paramzzf.zziH;
      int m = ((zzaf.zze)localObject1).key;
      String str1 = "keys";
      localObject2 = (String)zza((Object[])localObject2, m, str1);
      j = ((zzaf.zze)localObject1).value;
      localObject1 = (zzag.zza)zza(paramArrayOfzza, j, "values");
      String str2 = zzae.zzgU.toString();
      boolean bool = str2.equals(localObject2);
      if (bool) {
        localzzb.zzq((zzag.zza)localObject1);
      }
      for (;;)
      {
        j = k + 1;
        k = j;
        break;
        localzzb.zzb((String)localObject2, (zzag.zza)localObject1);
      }
    }
    return localzzb.zzHJ();
  }
  
  private static zzrs.zze zza(zzaf.zzg paramzzg, List paramList1, List paramList2, List paramList3, zzaf.zzf paramzzf)
  {
    int i = 0;
    Object localObject1 = null;
    zzrs.zzf localzzf = zzrs.zze.zzHO();
    int[] arrayOfInt1 = paramzzg.zziX;
    int j = arrayOfInt1.length;
    int k = 0;
    int[] arrayOfInt2 = null;
    while (k < j)
    {
      m = Integer.valueOf(arrayOfInt1[k]).intValue();
      localzza = (zzrs.zza)paramList3.get(m);
      localzzf.zzd(localzza);
      m = k + 1;
      k = m;
    }
    arrayOfInt1 = paramzzg.zziY;
    j = arrayOfInt1.length;
    k = 0;
    arrayOfInt2 = null;
    while (k < j)
    {
      m = Integer.valueOf(arrayOfInt1[k]).intValue();
      localzza = (zzrs.zza)paramList3.get(m);
      localzzf.zze(localzza);
      m = k + 1;
      k = m;
    }
    arrayOfInt1 = paramzzg.zziZ;
    j = arrayOfInt1.length;
    k = 0;
    arrayOfInt2 = null;
    while (k < j)
    {
      m = Integer.valueOf(arrayOfInt1[k]).intValue();
      localzza = (zzrs.zza)paramList1.get(m);
      localzzf.zzf(localzza);
      m = k + 1;
      k = m;
    }
    arrayOfInt2 = paramzzg.zzjb;
    int n = arrayOfInt2.length;
    int m = 0;
    zzrs.zza localzza = null;
    Object localObject2;
    zzag.zza[] arrayOfzza;
    while (m < n)
    {
      localObject2 = Integer.valueOf(arrayOfInt2[m]);
      arrayOfzza = paramzzf.zziI;
      j = ((Integer)localObject2).intValue();
      localObject2 = arrayOfzza[j].zzjx;
      localzzf.zzgE((String)localObject2);
      m += 1;
    }
    arrayOfInt1 = paramzzg.zzja;
    j = arrayOfInt1.length;
    k = 0;
    arrayOfInt2 = null;
    while (k < j)
    {
      m = Integer.valueOf(arrayOfInt1[k]).intValue();
      localzza = (zzrs.zza)paramList1.get(m);
      localzzf.zzg(localzza);
      m = k + 1;
      k = m;
    }
    arrayOfInt2 = paramzzg.zzjc;
    n = arrayOfInt2.length;
    m = 0;
    localzza = null;
    while (m < n)
    {
      localObject2 = Integer.valueOf(arrayOfInt2[m]);
      arrayOfzza = paramzzf.zziI;
      j = ((Integer)localObject2).intValue();
      localObject2 = arrayOfzza[j].zzjx;
      localzzf.zzgF((String)localObject2);
      m += 1;
    }
    arrayOfInt1 = paramzzg.zzjd;
    j = arrayOfInt1.length;
    k = 0;
    arrayOfInt2 = null;
    while (k < j)
    {
      m = Integer.valueOf(arrayOfInt1[k]).intValue();
      localzza = (zzrs.zza)paramList2.get(m);
      localzzf.zzh(localzza);
      m = k + 1;
      k = m;
    }
    arrayOfInt2 = paramzzg.zzjf;
    n = arrayOfInt2.length;
    m = 0;
    localzza = null;
    while (m < n)
    {
      localObject2 = Integer.valueOf(arrayOfInt2[m]);
      arrayOfzza = paramzzf.zziI;
      j = ((Integer)localObject2).intValue();
      localObject2 = arrayOfzza[j].zzjx;
      localzzf.zzgG((String)localObject2);
      m += 1;
    }
    arrayOfInt1 = paramzzg.zzje;
    j = arrayOfInt1.length;
    k = 0;
    arrayOfInt2 = null;
    while (k < j)
    {
      m = Integer.valueOf(arrayOfInt1[k]).intValue();
      localzza = (zzrs.zza)paramList2.get(m);
      localzzf.zzi(localzza);
      m = k + 1;
      k = m;
    }
    arrayOfInt2 = paramzzg.zzjg;
    n = arrayOfInt2.length;
    m = 0;
    localzza = null;
    while (m < n)
    {
      localObject1 = Integer.valueOf(arrayOfInt2[m]);
      localObject2 = paramzzf.zziI;
      i = ((Integer)localObject1).intValue();
      localObject1 = localObject2[i].zzjx;
      localzzf.zzgH((String)localObject1);
      m += 1;
    }
    return localzzf.zzHZ();
  }
  
  private static Object zza(Object[] paramArrayOfObject, int paramInt, String paramString)
  {
    if (paramInt >= 0)
    {
      int i = paramArrayOfObject.length;
      if (paramInt < i) {}
    }
    else
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Index out of bounds detected: ").append(paramInt);
      String str = " in ";
      localObject = str + paramString;
      zzgC((String)localObject);
    }
    return paramArrayOfObject[paramInt];
  }
  
  public static zzrs.zzc zzb(zzaf.zzf paramzzf)
  {
    int i = 0;
    zzag.zza[] arrayOfzza = new zzag.zza[paramzzf.zziI.length];
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      localObject2 = paramzzf.zziI;
      int k = localObject2.length;
      if (j >= k) {
        break;
      }
      localObject2 = new java/util/HashSet;
      ((HashSet)localObject2).<init>(0);
      zza(j, paramzzf, arrayOfzza, (Set)localObject2);
      j += 1;
    }
    Object localObject2 = zzrs.zzc.zzHK();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    j = 0;
    localObject1 = null;
    for (;;)
    {
      localObject3 = paramzzf.zziL;
      int m = localObject3.length;
      if (j >= m) {
        break;
      }
      localObject3 = zza(paramzzf.zziL[j], paramzzf, arrayOfzza, j);
      localArrayList.add(localObject3);
      j += 1;
    }
    Object localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    j = 0;
    localObject1 = null;
    for (;;)
    {
      localObject4 = paramzzf.zziM;
      int n = localObject4.length;
      if (j >= n) {
        break;
      }
      localObject4 = zza(paramzzf.zziM[j], paramzzf, arrayOfzza, j);
      ((List)localObject3).add(localObject4);
      j += 1;
    }
    Object localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    j = 0;
    localObject1 = null;
    Object localObject5;
    for (;;)
    {
      localObject5 = paramzzf.zziK;
      int i1 = localObject5.length;
      if (j >= i1) {
        break;
      }
      localObject5 = zza(paramzzf.zziK[j], paramzzf, arrayOfzza, j);
      ((zzrs.zzd)localObject2).zzc((zzrs.zza)localObject5);
      ((List)localObject4).add(localObject5);
      j += 1;
    }
    localObject1 = paramzzf.zziN;
    int i2 = localObject1.length;
    while (i < i2)
    {
      localObject5 = zza(localObject1[i], localArrayList, (List)localObject4, (List)localObject3, paramzzf);
      ((zzrs.zzd)localObject2).zzb((zzrs.zze)localObject5);
      i += 1;
    }
    localObject1 = paramzzf.version;
    ((zzrs.zzd)localObject2).zzgD((String)localObject1);
    j = paramzzf.zziV;
    ((zzrs.zzd)localObject2).zzko(j);
    return ((zzrs.zzd)localObject2).zzHN();
  }
  
  public static void zzb(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int i = 1024;
    byte[] arrayOfByte = new byte[i];
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        return;
      }
      k = 0;
      paramOutputStream.write(arrayOfByte, 0, j);
    }
  }
  
  private static void zzgC(String paramString)
  {
    zzbg.e(paramString);
    zzrs.zzg localzzg = new com/google/android/gms/internal/zzrs$zzg;
    localzzg.<init>(paramString);
    throw localzzg;
  }
  
  public static zzag.zza zzo(zzag.zza paramzza)
  {
    zzag.zza localzza = new com/google/android/gms/internal/zzag$zza;
    localzza.<init>();
    int i = paramzza.type;
    localzza.type = i;
    int[] arrayOfInt = (int[])paramzza.zzjG.clone();
    localzza.zzjG = arrayOfInt;
    boolean bool = paramzza.zzjH;
    if (bool)
    {
      bool = paramzza.zzjH;
      localzza.zzjH = bool;
    }
    return localzza;
  }
  
  private static zzaf.zzh zzp(zzag.zza paramzza)
  {
    Object localObject = zzaf.zzh.zzjh;
    localObject = (zzaf.zzh)paramzza.zza((zzsp)localObject);
    if (localObject == null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Expected a ServingValue and didn't get one. Value is: ";
      localObject = str + paramzza;
      zzgC((String)localObject);
    }
    localObject = zzaf.zzh.zzjh;
    return (zzaf.zzh)paramzza.zza((zzsp)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */