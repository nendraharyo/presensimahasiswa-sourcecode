package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;

class zzy$zzc
  implements DriveFolder.DriveFileResult
{
  private final Status zzUX;
  private final DriveFile zzarr;
  
  public zzy$zzc(Status paramStatus, DriveFile paramDriveFile)
  {
    this.zzUX = paramStatus;
    this.zzarr = paramDriveFile;
  }
  
  public DriveFile getDriveFile()
  {
    return this.zzarr;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */