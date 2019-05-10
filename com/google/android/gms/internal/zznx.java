package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class zznx
{
  private static final double zzazE;
  private static final double zzazF;
  private static final zznx zzazI;
  private final Map zzazG;
  private final Map zzazH;
  
  static
  {
    long l = 1L;
    double d1 = 1000.0D;
    double d2 = TimeUnit.SECONDS.toNanos(l);
    zzazE = d1 / d2;
    d2 = TimeUnit.SECONDS.toNanos(l);
    zzazF = d1 / d2;
    zznx localzznx = new com/google/android/gms/internal/zznx;
    localzznx.<init>();
    zzazI = localzznx;
  }
  
  private zznx()
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    String str1 = zznt.zzaxF.name;
    Object localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(-90.0D, 90.0D, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxG.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(-180.0D, 180.0D, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxH.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(d3, 10000.0D, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxE.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    double d4 = d1;
    ((zznx.zza)localObject2).<init>(d3, d1, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxI.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(-100000.0D, 100000.0D, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxP.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    d4 = d2;
    ((zznx.zza)localObject2).<init>(d3, d2, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxx.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(d3, d2, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxA.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(d3, 9.223372036854776E18D, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxM.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(d3, 10.0D, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxN.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    d4 = d1;
    ((zznx.zza)localObject2).<init>(d3, d1, null);
    ((Map)localObject1).put(str1, localObject2);
    str1 = zznt.zzaxQ.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    ((zznx.zza)localObject2).<init>(d3, 200000.0D, null);
    ((Map)localObject1).put(str1, localObject2);
    localObject1 = Collections.unmodifiableMap((Map)localObject1);
    this.zzazH = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    String str2 = zznt.zzaxz.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    d4 = zzazE;
    ((zznx.zza)localObject2).<init>(d3, d4, null);
    localObject2 = zzf(str2, localObject2);
    ((Map)localObject1).put("com.google.step_count.delta", localObject2);
    str2 = zznt.zzaxT.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    d4 = zzazF;
    ((zznx.zza)localObject2).<init>(d3, d4, null);
    localObject2 = zzf(str2, localObject2);
    ((Map)localObject1).put("com.google.calories.consumed", localObject2);
    str2 = zznt.zzaxT.name;
    localObject2 = new com/google/android/gms/internal/zznx$zza;
    d4 = zzazF;
    ((zznx.zza)localObject2).<init>(d3, d4, null);
    localObject2 = zzf(str2, localObject2);
    ((Map)localObject1).put("com.google.calories.expended", localObject2);
    localObject1 = Collections.unmodifiableMap((Map)localObject1);
    this.zzazG = ((Map)localObject1);
  }
  
  private static Map zzf(Object paramObject1, Object paramObject2)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put(paramObject1, paramObject2);
    return localHashMap;
  }
  
  public static zznx zzuG()
  {
    return zzazI;
  }
  
  public zznx.zza zzC(String paramString1, String paramString2)
  {
    Object localObject = (Map)this.zzazG.get(paramString1);
    if (localObject != null) {}
    for (localObject = (zznx.zza)((Map)localObject).get(paramString2);; localObject = null) {
      return (zznx.zza)localObject;
    }
  }
  
  public zznx.zza zzdE(String paramString)
  {
    return (zznx.zza)this.zzazH.get(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */