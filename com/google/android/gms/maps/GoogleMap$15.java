package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzp.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$15
  extends zzp.zza
{
  GoogleMap$15(GoogleMap paramGoogleMap, GoogleMap.OnMarkerClickListener paramOnMarkerClickListener) {}
  
  public boolean zzd(zzf paramzzf)
  {
    GoogleMap.OnMarkerClickListener localOnMarkerClickListener = this.zzaRK;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    return localOnMarkerClickListener.onMarkerClick(localMarker);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */