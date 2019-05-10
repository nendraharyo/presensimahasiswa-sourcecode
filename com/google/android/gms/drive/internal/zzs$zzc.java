package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;

abstract class zzs$zzc
  extends zzt
{
  zzs$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveApi.DriveContentsResult zzB(Status paramStatus)
  {
    zzs.zzb localzzb = new com/google/android/gms/drive/internal/zzs$zzb;
    localzzb.<init>(paramStatus, null);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */