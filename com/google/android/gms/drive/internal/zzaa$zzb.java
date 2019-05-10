package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.FileUploadPreferences;

class zzaa$zzb
  implements DrivePreferencesApi.FileUploadPreferencesResult
{
  private final Status zzUX;
  private final FileUploadPreferences zzarw;
  
  private zzaa$zzb(zzaa paramzzaa, Status paramStatus, FileUploadPreferences paramFileUploadPreferences)
  {
    this.zzUX = paramStatus;
    this.zzarw = paramFileUploadPreferences;
  }
  
  public FileUploadPreferences getFileUploadPreferences()
  {
    return this.zzarw;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzaa$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */