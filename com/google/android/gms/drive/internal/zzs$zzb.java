package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveContents;

class zzs$zzb
  implements Releasable, DriveApi.DriveContentsResult
{
  private final Status zzUX;
  private final DriveContents zzaoC;
  
  public zzs$zzb(Status paramStatus, DriveContents paramDriveContents)
  {
    this.zzUX = paramStatus;
    this.zzaoC = paramDriveContents;
  }
  
  public DriveContents getDriveContents()
  {
    return this.zzaoC;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    DriveContents localDriveContents = this.zzaoC;
    if (localDriveContents != null)
    {
      localDriveContents = this.zzaoC;
      localDriveContents.zzsy();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */