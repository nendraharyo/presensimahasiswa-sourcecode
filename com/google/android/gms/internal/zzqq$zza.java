package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

abstract class zzqq$zza
  extends zzqq.zzc
{
  public zzqq$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected PanoramaApi.PanoramaResult zzbd(Status paramStatus)
  {
    zzqs localzzqs = new com/google/android/gms/internal/zzqs;
    localzzqs.<init>(paramStatus, null);
    return localzzqs;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */