package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.DriveId;

class zzy$zzb
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzy$zzb(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzy.zze localzze = new com/google/android/gms/drive/internal/zzy$zze;
    localzze.<init>(paramStatus, null);
    localzzb.zzs(localzze);
  }
  
  public void zza(OnDriveIdResponse paramOnDriveIdResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzy.zze localzze = new com/google/android/gms/drive/internal/zzy$zze;
    Status localStatus = Status.zzagC;
    zzy localzzy = new com/google/android/gms/drive/internal/zzy;
    DriveId localDriveId = paramOnDriveIdResponse.getDriveId();
    localzzy.<init>(localDriveId);
    localzze.<init>(localStatus, localzzy);
    localzzb.zzs(localzze);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */