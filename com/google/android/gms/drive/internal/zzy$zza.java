package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.DriveId;

class zzy$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzy$zza(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzy.zzc localzzc = new com/google/android/gms/drive/internal/zzy$zzc;
    localzzc.<init>(paramStatus, null);
    localzzb.zzs(localzzc);
  }
  
  public void zza(OnDriveIdResponse paramOnDriveIdResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzy.zzc localzzc = new com/google/android/gms/drive/internal/zzy$zzc;
    Status localStatus = Status.zzagC;
    zzw localzzw = new com/google/android/gms/drive/internal/zzw;
    DriveId localDriveId = paramOnDriveIdResponse.getDriveId();
    localzzw.<init>(localDriveId);
    localzzc.<init>(localStatus, localzzw);
    localzzb.zzs(localzzc);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */