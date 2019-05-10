package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public abstract interface GeofencingApi
{
  public abstract PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent);
  
  public abstract PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, List paramList, PendingIntent paramPendingIntent);
  
  public abstract PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, List paramList);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\GeofencingApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */