package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzo.zza;

class MapView$zza$1
  extends zzo.zza
{
  MapView$zza$1(MapView.zza paramzza, OnMapReadyCallback paramOnMapReadyCallback) {}
  
  public void zza(IGoogleMapDelegate paramIGoogleMapDelegate)
  {
    OnMapReadyCallback localOnMapReadyCallback = this.zzaSf;
    GoogleMap localGoogleMap = new com/google/android/gms/maps/GoogleMap;
    localGoogleMap.<init>(paramIGoogleMapDelegate);
    localOnMapReadyCallback.onMapReady(localGoogleMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\MapView$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */