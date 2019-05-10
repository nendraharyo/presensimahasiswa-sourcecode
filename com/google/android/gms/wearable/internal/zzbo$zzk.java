package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzk
  extends zzbo.zzb
{
  public zzbo$zzk(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(GetDataItemResponse paramGetDataItemResponse)
  {
    zzx.zza localzza = new com/google/android/gms/wearable/internal/zzx$zza;
    Status localStatus = zzbk.zzgc(paramGetDataItemResponse.statusCode);
    DataItemParcelable localDataItemParcelable = paramGetDataItemResponse.zzbsJ;
    localzza.<init>(localStatus, localDataItemParcelable);
    zzX(localzza);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */