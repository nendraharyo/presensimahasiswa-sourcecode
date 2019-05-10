package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveResource.MetadataResult;

abstract class zzab$zzd
  extends zzt
{
  private zzab$zzd(zzab paramzzab, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveResource.MetadataResult zzH(Status paramStatus)
  {
    zzab.zzc localzzc = new com/google/android/gms/drive/internal/zzab$zzc;
    localzzc.<init>(paramStatus, null);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */