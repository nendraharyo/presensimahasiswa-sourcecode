package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public class zzrs$zza
{
  private final zzag.zza zzbkI;
  private final Map zzbmi;
  
  private zzrs$zza(Map paramMap, zzag.zza paramzza)
  {
    this.zzbmi = paramMap;
    this.zzbkI = paramzza;
  }
  
  public static zzrs.zzb zzHH()
  {
    zzrs.zzb localzzb = new com/google/android/gms/internal/zzrs$zzb;
    localzzb.<init>(null);
    return localzzb;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Properties: ");
    Object localObject = zzHI();
    localStringBuilder = localStringBuilder.append(localObject).append(" pushAfterEvaluate: ");
    localObject = this.zzbkI;
    return (String)localObject;
  }
  
  public Map zzHI()
  {
    return Collections.unmodifiableMap(this.zzbmi);
  }
  
  public zzag.zza zzHh()
  {
    return this.zzbkI;
  }
  
  public void zza(String paramString, zzag.zza paramzza)
  {
    this.zzbmi.put(paramString, paramzza);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrs$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */