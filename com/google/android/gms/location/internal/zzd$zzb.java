package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzd$zzb
  extends zzg.zza
{
  private final zza.zzb zzamC;
  
  public zzd$zzb(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void zza(FusedLocationProviderResult paramFusedLocationProviderResult)
  {
    zza.zzb localzzb = this.zzamC;
    Status localStatus = paramFusedLocationProviderResult.getStatus();
    localzzb.zzs(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */