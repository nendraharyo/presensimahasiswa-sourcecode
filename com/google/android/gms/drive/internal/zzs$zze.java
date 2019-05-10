package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveId;

class zzs$zze
  implements DriveApi.DriveIdResult
{
  private final Status zzUX;
  private final DriveId zzaoz;
  
  public zzs$zze(Status paramStatus, DriveId paramDriveId)
  {
    this.zzUX = paramStatus;
    this.zzaoz = paramDriveId;
  }
  
  public DriveId getDriveId()
  {
    return this.zzaoz;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */