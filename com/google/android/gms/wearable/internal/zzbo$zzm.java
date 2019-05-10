package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzm
  extends zzbo.zzb
{
  public zzbo$zzm(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(GetFdForAssetResponse paramGetFdForAssetResponse)
  {
    zzx.zzc localzzc = new com/google/android/gms/wearable/internal/zzx$zzc;
    Status localStatus = zzbk.zzgc(paramGetFdForAssetResponse.statusCode);
    ParcelFileDescriptor localParcelFileDescriptor = paramGetFdForAssetResponse.zzbsK;
    localzzc.<init>(localStatus, localParcelFileDescriptor);
    zzX(localzzc);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */