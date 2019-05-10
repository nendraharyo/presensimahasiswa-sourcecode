package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zze
  extends zzbo.zzb
{
  public zzbo$zze(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(DeleteDataItemsResponse paramDeleteDataItemsResponse)
  {
    zzx.zzb localzzb = new com/google/android/gms/wearable/internal/zzx$zzb;
    Status localStatus = zzbk.zzgc(paramDeleteDataItemsResponse.statusCode);
    int i = paramDeleteDataItemsResponse.zzbsz;
    localzzb.<init>(localStatus, i);
    zzX(localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */