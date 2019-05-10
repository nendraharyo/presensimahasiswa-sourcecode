package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

class zzs$zzd
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzs$zzd(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzs.zze localzze = new com/google/android/gms/drive/internal/zzs$zze;
    localzze.<init>(paramStatus, null);
    localzzb.zzs(localzze);
  }
  
  public void zza(OnDriveIdResponse paramOnDriveIdResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzs.zze localzze = new com/google/android/gms/drive/internal/zzs$zze;
    Status localStatus = Status.zzagC;
    DriveId localDriveId = paramOnDriveIdResponse.getDriveId();
    localzze.<init>(localStatus, localDriveId);
    localzzb.zzs(localzze);
  }
  
  public void zza(OnMetadataResponse paramOnMetadataResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzs.zze localzze = new com/google/android/gms/drive/internal/zzs$zze;
    Status localStatus = Status.zzagC;
    Object localObject = new com/google/android/gms/drive/internal/zzp;
    MetadataBundle localMetadataBundle = paramOnMetadataResponse.zztw();
    ((zzp)localObject).<init>(localMetadataBundle);
    localObject = ((zzp)localObject).getDriveId();
    localzze.<init>(localStatus, (DriveId)localObject);
    localzzb.zzs(localzze);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */