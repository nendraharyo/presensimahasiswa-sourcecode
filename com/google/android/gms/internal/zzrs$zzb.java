package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzrs$zzb
{
  private zzag.zza zzbkI;
  private final Map zzbmi;
  
  private zzrs$zzb()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzbmi = localHashMap;
  }
  
  public zzrs.zza zzHJ()
  {
    zzrs.zza localzza = new com/google/android/gms/internal/zzrs$zza;
    Map localMap = this.zzbmi;
    zzag.zza localzza1 = this.zzbkI;
    localzza.<init>(localMap, localzza1, null);
    return localzza;
  }
  
  public zzb zzb(String paramString, zzag.zza paramzza)
  {
    this.zzbmi.put(paramString, paramzza);
    return this;
  }
  
  public zzb zzq(zzag.zza paramzza)
  {
    this.zzbkI = paramzza;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrs$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */