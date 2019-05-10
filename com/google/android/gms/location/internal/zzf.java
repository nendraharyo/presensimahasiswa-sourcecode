package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.Builder;
import java.util.List;

public class zzf
  implements GeofencingApi
{
  public PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent)
  {
    zzf.1 local1 = new com/google/android/gms/location/internal/zzf$1;
    local1.<init>(this, paramGoogleApiClient, paramGeofencingRequest, paramPendingIntent);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, List paramList, PendingIntent paramPendingIntent)
  {
    Object localObject = new com/google/android/gms/location/GeofencingRequest$Builder;
    ((GeofencingRequest.Builder)localObject).<init>();
    ((GeofencingRequest.Builder)localObject).addGeofences(paramList);
    ((GeofencingRequest.Builder)localObject).setInitialTrigger(5);
    localObject = ((GeofencingRequest.Builder)localObject).build();
    return addGeofences(paramGoogleApiClient, (GeofencingRequest)localObject, paramPendingIntent);
  }
  
  public PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    zzf.2 local2 = new com/google/android/gms/location/internal/zzf$2;
    local2.<init>(this, paramGoogleApiClient, paramPendingIntent);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    zzf.3 local3 = new com/google/android/gms/location/internal/zzf$3;
    local3.<init>(this, paramGoogleApiClient, paramList);
    return paramGoogleApiClient.zzb(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */