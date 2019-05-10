package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsApi;

public class zzq
  implements SettingsApi
{
  public PendingResult checkLocationSettings(GoogleApiClient paramGoogleApiClient, LocationSettingsRequest paramLocationSettingsRequest)
  {
    return zza(paramGoogleApiClient, paramLocationSettingsRequest, null);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, LocationSettingsRequest paramLocationSettingsRequest, String paramString)
  {
    zzq.1 local1 = new com/google/android/gms/location/internal/zzq$1;
    local1.<init>(this, paramGoogleApiClient, paramLocationSettingsRequest, paramString);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */