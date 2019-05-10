package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;

abstract class zzaa$zzc
  extends zzt
{
  public zzaa$zzc(zzaa paramzzaa, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected DrivePreferencesApi.FileUploadPreferencesResult zzG(Status paramStatus)
  {
    zzaa.zzb localzzb = new com/google/android/gms/drive/internal/zzaa$zzb;
    zzaa localzzaa = this.zzaru;
    localzzb.<init>(localzzaa, paramStatus, null, null);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzaa$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */