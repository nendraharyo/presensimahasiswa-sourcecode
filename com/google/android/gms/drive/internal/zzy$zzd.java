package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;

abstract class zzy$zzd
  extends zzt
{
  zzy$zzd(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveFolder.DriveFileResult zzE(Status paramStatus)
  {
    zzy.zzc localzzc = new com/google/android/gms/drive/internal/zzy$zzc;
    localzzc.<init>(paramStatus, null);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */