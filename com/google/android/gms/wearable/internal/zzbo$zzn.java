package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzn
  extends zzbo.zzb
{
  public zzbo$zzn(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(GetLocalNodeResponse paramGetLocalNodeResponse)
  {
    zzbb.zzb localzzb = new com/google/android/gms/wearable/internal/zzbb$zzb;
    Status localStatus = zzbk.zzgc(paramGetLocalNodeResponse.statusCode);
    NodeParcelable localNodeParcelable = paramGetLocalNodeResponse.zzbsL;
    localzzb.<init>(localStatus, localNodeParcelable);
    zzX(localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */