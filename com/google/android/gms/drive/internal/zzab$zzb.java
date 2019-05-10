package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

class zzab$zzb
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzab$zzb(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzab.zzc localzzc = new com/google/android/gms/drive/internal/zzab$zzc;
    localzzc.<init>(paramStatus, null);
    localzzb.zzs(localzzc);
  }
  
  public void zza(OnMetadataResponse paramOnMetadataResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzab.zzc localzzc = new com/google/android/gms/drive/internal/zzab$zzc;
    Status localStatus = Status.zzagC;
    zzp localzzp = new com/google/android/gms/drive/internal/zzp;
    MetadataBundle localMetadataBundle = paramOnMetadataResponse.zztw();
    localzzp.<init>(localMetadataBundle);
    localzzc.<init>(localStatus, localzzp);
    localzzb.zzs(localzzc);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */