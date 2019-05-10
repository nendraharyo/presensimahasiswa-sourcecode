package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.ActivityRecognitionApi;

public class zza
  implements ActivityRecognitionApi
{
  public PendingResult removeActivityUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    zza.2 local2 = new com/google/android/gms/location/internal/zza$2;
    local2.<init>(this, paramGoogleApiClient, paramPendingIntent);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult requestActivityUpdates(GoogleApiClient paramGoogleApiClient, long paramLong, PendingIntent paramPendingIntent)
  {
    zza.1 local1 = new com/google/android/gms/location/internal/zza$1;
    local1.<init>(this, paramGoogleApiClient, paramLong, paramPendingIntent);
    return paramGoogleApiClient.zzb(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */