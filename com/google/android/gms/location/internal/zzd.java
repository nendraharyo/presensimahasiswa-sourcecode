package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class zzd
  implements FusedLocationProviderApi
{
  public PendingResult flushLocations(GoogleApiClient paramGoogleApiClient)
  {
    zzd.5 local5 = new com/google/android/gms/location/internal/zzd$5;
    local5.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public Location getLastLocation(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject1 = LocationServices.zzi(paramGoogleApiClient);
    try
    {
      localObject1 = ((zzl)localObject1).getLastLocation();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (Location)localObject1;
  }
  
  public LocationAvailability getLocationAvailability(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject1 = LocationServices.zzi(paramGoogleApiClient);
    try
    {
      localObject1 = ((zzl)localObject1).zzyO();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (LocationAvailability)localObject1;
  }
  
  public PendingResult removeLocationUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    zzd.10 local10 = new com/google/android/gms/location/internal/zzd$10;
    local10.<init>(this, paramGoogleApiClient, paramPendingIntent);
    return paramGoogleApiClient.zzb(local10);
  }
  
  public PendingResult removeLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationCallback paramLocationCallback)
  {
    zzd.2 local2 = new com/google/android/gms/location/internal/zzd$2;
    local2.<init>(this, paramGoogleApiClient, paramLocationCallback);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult removeLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationListener paramLocationListener)
  {
    zzd.9 local9 = new com/google/android/gms/location/internal/zzd$9;
    local9.<init>(this, paramGoogleApiClient, paramLocationListener);
    return paramGoogleApiClient.zzb(local9);
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    zzd.8 local8 = new com/google/android/gms/location/internal/zzd$8;
    local8.<init>(this, paramGoogleApiClient, paramLocationRequest, paramPendingIntent);
    return paramGoogleApiClient.zzb(local8);
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationCallback paramLocationCallback, Looper paramLooper)
  {
    zzd.7 local7 = new com/google/android/gms/location/internal/zzd$7;
    local7.<init>(this, paramGoogleApiClient, paramLocationRequest, paramLocationCallback, paramLooper);
    return paramGoogleApiClient.zzb(local7);
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    zzd.1 local1 = new com/google/android/gms/location/internal/zzd$1;
    local1.<init>(this, paramGoogleApiClient, paramLocationRequest, paramLocationListener);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    zzd.6 local6 = new com/google/android/gms/location/internal/zzd$6;
    local6.<init>(this, paramGoogleApiClient, paramLocationRequest, paramLocationListener, paramLooper);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult setMockLocation(GoogleApiClient paramGoogleApiClient, Location paramLocation)
  {
    zzd.4 local4 = new com/google/android/gms/location/internal/zzd$4;
    local4.<init>(this, paramGoogleApiClient, paramLocation);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult setMockMode(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    zzd.3 local3 = new com/google/android/gms/location/internal/zzd$3;
    local3.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zzb(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */