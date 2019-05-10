package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.Map;

final class zzbo$zzf
  extends zzbo.zzb
{
  public zzbo$zzf(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(GetAllCapabilitiesResponse paramGetAllCapabilitiesResponse)
  {
    zzj.zzd localzzd = new com/google/android/gms/wearable/internal/zzj$zzd;
    Status localStatus = zzbk.zzgc(paramGetAllCapabilitiesResponse.statusCode);
    Map localMap = zzbo.zzH(paramGetAllCapabilitiesResponse.zzbsA);
    localzzd.<init>(localStatus, localMap);
    zzX(localzzd);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */