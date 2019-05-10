package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzh.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$17
  extends zzh.zza
{
  GoogleMap$17(GoogleMap paramGoogleMap, GoogleMap.OnInfoWindowClickListener paramOnInfoWindowClickListener) {}
  
  public void zzh(zzf paramzzf)
  {
    GoogleMap.OnInfoWindowClickListener localOnInfoWindowClickListener = this.zzaRM;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    localOnInfoWindowClickListener.onInfoWindowClick(localMarker);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$17.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */