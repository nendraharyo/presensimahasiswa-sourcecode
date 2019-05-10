package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzj.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$18
  extends zzj.zza
{
  GoogleMap$18(GoogleMap paramGoogleMap, GoogleMap.OnInfoWindowLongClickListener paramOnInfoWindowLongClickListener) {}
  
  public void zzi(zzf paramzzf)
  {
    GoogleMap.OnInfoWindowLongClickListener localOnInfoWindowLongClickListener = this.zzaRN;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    localOnInfoWindowLongClickListener.onInfoWindowLongClick(localMarker);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$18.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */