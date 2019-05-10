package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlz;

public final class zzy$zza
{
  private final Object zzSA;
  private final zzlz zzSB;
  private Object zzSC;
  
  private zzy$zza(zzlz paramzzlz, Object paramObject)
  {
    zzx.zzz(paramzzlz);
    this.zzSB = paramzzlz;
    this.zzSA = paramObject;
  }
  
  static zza zza(String paramString, float paramFloat)
  {
    return zza(paramString, paramFloat, paramFloat);
  }
  
  static zza zza(String paramString, float paramFloat1, float paramFloat2)
  {
    zza localzza = new com/google/android/gms/analytics/internal/zzy$zza;
    Object localObject = Float.valueOf(paramFloat2);
    localObject = zzlz.zza(paramString, (Float)localObject);
    Float localFloat = Float.valueOf(paramFloat1);
    localzza.<init>((zzlz)localObject, localFloat);
    return localzza;
  }
  
  static zza zza(String paramString, int paramInt1, int paramInt2)
  {
    zza localzza = new com/google/android/gms/analytics/internal/zzy$zza;
    Object localObject = Integer.valueOf(paramInt2);
    localObject = zzlz.zza(paramString, (Integer)localObject);
    Integer localInteger = Integer.valueOf(paramInt1);
    localzza.<init>((zzlz)localObject, localInteger);
    return localzza;
  }
  
  static zza zza(String paramString, long paramLong1, long paramLong2)
  {
    zza localzza = new com/google/android/gms/analytics/internal/zzy$zza;
    Object localObject = Long.valueOf(paramLong2);
    localObject = zzlz.zza(paramString, (Long)localObject);
    Long localLong = Long.valueOf(paramLong1);
    localzza.<init>((zzlz)localObject, localLong);
    return localzza;
  }
  
  static zza zza(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    zza localzza = new com/google/android/gms/analytics/internal/zzy$zza;
    zzlz localzzlz = zzlz.zzk(paramString, paramBoolean2);
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    localzza.<init>(localzzlz, localBoolean);
    return localzza;
  }
  
  static zza zzb(String paramString, long paramLong)
  {
    return zza(paramString, paramLong, paramLong);
  }
  
  static zza zzd(String paramString, int paramInt)
  {
    return zza(paramString, paramInt, paramInt);
  }
  
  static zza zze(String paramString1, String paramString2, String paramString3)
  {
    zza localzza = new com/google/android/gms/analytics/internal/zzy$zza;
    zzlz localzzlz = zzlz.zzv(paramString1, paramString3);
    localzza.<init>(localzzlz, paramString2);
    return localzza;
  }
  
  static zza zzg(String paramString, boolean paramBoolean)
  {
    return zza(paramString, paramBoolean, paramBoolean);
  }
  
  static zza zzl(String paramString1, String paramString2)
  {
    return zze(paramString1, paramString2, paramString2);
  }
  
  public Object get()
  {
    Object localObject = this.zzSC;
    if (localObject != null) {
      localObject = this.zzSC;
    }
    for (;;)
    {
      return localObject;
      boolean bool = zzd.zzakE;
      if (bool)
      {
        bool = zzlz.isInitialized();
        if (bool)
        {
          localObject = this.zzSB.zzpX();
          continue;
        }
      }
      localObject = this.zzSA;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzy$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */