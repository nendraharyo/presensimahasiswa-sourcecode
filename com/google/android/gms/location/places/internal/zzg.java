package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public abstract interface zzg
  extends IInterface
{
  public abstract void zza(AddPlaceRequest paramAddPlaceRequest, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(NearbyAlertRequest paramNearbyAlertRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent);
  
  public abstract void zza(PlaceReport paramPlaceReport, PlacesParams paramPlacesParams);
  
  public abstract void zza(PlaceRequest paramPlaceRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent);
  
  public abstract void zza(UserDataType paramUserDataType, LatLngBounds paramLatLngBounds, List paramList, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent);
  
  public abstract void zza(PlaceAlias paramPlaceAlias, PlacesParams paramPlacesParams, zza paramzza);
  
  public abstract void zza(PlaceAlias paramPlaceAlias, String paramString1, String paramString2, PlacesParams paramPlacesParams, zza paramzza);
  
  public abstract void zza(LatLng paramLatLng, PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(LatLng paramLatLng, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(LatLngBounds paramLatLngBounds, int paramInt, String paramString, PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(String paramString, int paramInt1, int paramInt2, int paramInt3, PlacesParams paramPlacesParams, zzh paramzzh);
  
  public abstract void zza(String paramString, int paramInt, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(String paramString, PlacesParams paramPlacesParams, zzh paramzzh);
  
  public abstract void zza(String paramString, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(List paramList, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zzb(PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zzb(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent);
  
  public abstract void zzb(String paramString, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zzb(List paramList, PlacesParams paramPlacesParams, zzi paramzzi);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */