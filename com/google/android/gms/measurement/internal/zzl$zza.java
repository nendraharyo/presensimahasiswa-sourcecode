package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlz;

public final class zzl$zza
{
  private final Object zzSA;
  private final zzlz zzSB;
  private Object zzSC;
  private final String zzvs;
  
  private zzl$zza(String paramString, zzlz paramzzlz, Object paramObject)
  {
    zzx.zzz(paramzzlz);
    this.zzSB = paramzzlz;
    this.zzSA = paramObject;
    this.zzvs = paramString;
  }
  
  static zza zzD(String paramString, int paramInt)
  {
    return zzo(paramString, paramInt, paramInt);
  }
  
  static zza zzN(String paramString1, String paramString2)
  {
    return zzl(paramString1, paramString2, paramString2);
  }
  
  static zza zzb(String paramString, long paramLong1, long paramLong2)
  {
    zza localzza = new com/google/android/gms/measurement/internal/zzl$zza;
    Object localObject = Long.valueOf(paramLong2);
    localObject = zzlz.zza(paramString, (Long)localObject);
    Long localLong = Long.valueOf(paramLong1);
    localzza.<init>(paramString, (zzlz)localObject, localLong);
    return localzza;
  }
  
  static zza zzb(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    zza localzza = new com/google/android/gms/measurement/internal/zzl$zza;
    zzlz localzzlz = zzlz.zzk(paramString, paramBoolean2);
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    localzza.<init>(paramString, localzzlz, localBoolean);
    return localzza;
  }
  
  static zza zze(String paramString, long paramLong)
  {
    return zzb(paramString, paramLong, paramLong);
  }
  
  static zza zzl(String paramString1, String paramString2, String paramString3)
  {
    zza localzza = new com/google/android/gms/measurement/internal/zzl$zza;
    zzlz localzzlz = zzlz.zzv(paramString1, paramString3);
    localzza.<init>(paramString1, localzzlz, paramString2);
    return localzza;
  }
  
  static zza zzm(String paramString, boolean paramBoolean)
  {
    return zzb(paramString, paramBoolean, paramBoolean);
  }
  
  static zza zzo(String paramString, int paramInt1, int paramInt2)
  {
    zza localzza = new com/google/android/gms/measurement/internal/zzl$zza;
    Object localObject = Integer.valueOf(paramInt2);
    localObject = zzlz.zza(paramString, (Integer)localObject);
    Integer localInteger = Integer.valueOf(paramInt1);
    localzza.<init>(paramString, (zzlz)localObject, localInteger);
    return localzza;
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
  
  public Object get(Object paramObject)
  {
    Object localObject = this.zzSC;
    if (localObject != null) {
      paramObject = this.zzSC;
    }
    for (;;)
    {
      return paramObject;
      if (paramObject == null)
      {
        boolean bool = zzd.zzakE;
        if (bool)
        {
          bool = zzlz.isInitialized();
          if (bool)
          {
            localObject = this.zzSB;
            paramObject = ((zzlz)localObject).zzpX();
            continue;
          }
        }
        paramObject = this.zzSA;
      }
    }
  }
  
  public String getKey()
  {
    return this.zzvs;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */