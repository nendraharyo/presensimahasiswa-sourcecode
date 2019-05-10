package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzg
  extends zzbo.zzb
{
  public zzbo$zzg(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(GetCapabilityResponse paramGetCapabilityResponse)
  {
    zzj.zze localzze = new com/google/android/gms/wearable/internal/zzj$zze;
    Status localStatus = zzbk.zzgc(paramGetCapabilityResponse.statusCode);
    zzj.zzc localzzc = new com/google/android/gms/wearable/internal/zzj$zzc;
    CapabilityInfoParcelable localCapabilityInfoParcelable = paramGetCapabilityResponse.zzbsB;
    localzzc.<init>(localCapabilityInfoParcelable);
    localzze.<init>(localStatus, localzzc);
    zzX(localzze);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */