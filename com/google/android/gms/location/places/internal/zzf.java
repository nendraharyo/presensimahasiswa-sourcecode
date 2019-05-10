package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;

public abstract interface zzf
  extends IInterface
{
  public abstract void zza(NearbyAlertRequest paramNearbyAlertRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
  
  public abstract void zza(PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(PlaceReport paramPlaceReport, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(PlaceRequest paramPlaceRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
  
  public abstract void zza(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
  
  public abstract void zzb(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */