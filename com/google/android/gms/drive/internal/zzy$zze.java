package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;

class zzy$zze
  implements DriveFolder.DriveFolderResult
{
  private final Status zzUX;
  private final DriveFolder zzars;
  
  public zzy$zze(Status paramStatus, DriveFolder paramDriveFolder)
  {
    this.zzUX = paramStatus;
    this.zzars = paramDriveFolder;
  }
  
  public DriveFolder getDriveFolder()
  {
    return this.zzars;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */