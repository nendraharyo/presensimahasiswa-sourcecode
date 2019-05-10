package com.google.android.gms.maps;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.zzd.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$3
  extends zzd.zza
{
  GoogleMap$3(GoogleMap paramGoogleMap, GoogleMap.InfoWindowAdapter paramInfoWindowAdapter) {}
  
  public zzd zzb(zzf paramzzf)
  {
    GoogleMap.InfoWindowAdapter localInfoWindowAdapter = this.zzaRw;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    return zze.zzC(localInfoWindowAdapter.getInfoWindow(localMarker));
  }
  
  public zzd zzc(zzf paramzzf)
  {
    GoogleMap.InfoWindowAdapter localInfoWindowAdapter = this.zzaRw;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    return zze.zzC(localInfoWindowAdapter.getInfoContents(localMarker));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */