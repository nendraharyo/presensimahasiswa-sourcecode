package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;

abstract class zzs$zzh
  extends zzt
{
  zzs$zzh(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveApi.MetadataBufferResult zzD(Status paramStatus)
  {
    zzs.zzg localzzg = new com/google/android/gms/drive/internal/zzs$zzg;
    localzzg.<init>(paramStatus, null, false);
    return localzzg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */