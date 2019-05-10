package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzi.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$2
  extends zzi.zza
{
  GoogleMap$2(GoogleMap paramGoogleMap, GoogleMap.OnInfoWindowCloseListener paramOnInfoWindowCloseListener) {}
  
  public void zza(zzf paramzzf)
  {
    GoogleMap.OnInfoWindowCloseListener localOnInfoWindowCloseListener = this.zzaRv;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    localOnInfoWindowCloseListener.onInfoWindowClose(localMarker);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */