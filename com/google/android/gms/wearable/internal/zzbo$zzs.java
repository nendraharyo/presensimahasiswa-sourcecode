package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzs
  extends zzbo.zzb
{
  public zzbo$zzs(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(RemoveLocalCapabilityResponse paramRemoveLocalCapabilityResponse)
  {
    zzj.zza localzza = new com/google/android/gms/wearable/internal/zzj$zza;
    Status localStatus = zzbk.zzgc(paramRemoveLocalCapabilityResponse.statusCode);
    localzza.<init>(localStatus);
    zzX(localzza);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */