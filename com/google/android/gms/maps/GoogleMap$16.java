package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzq.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$16
  extends zzq.zza
{
  GoogleMap$16(GoogleMap paramGoogleMap, GoogleMap.OnMarkerDragListener paramOnMarkerDragListener) {}
  
  public void zze(zzf paramzzf)
  {
    GoogleMap.OnMarkerDragListener localOnMarkerDragListener = this.zzaRL;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    localOnMarkerDragListener.onMarkerDragStart(localMarker);
  }
  
  public void zzf(zzf paramzzf)
  {
    GoogleMap.OnMarkerDragListener localOnMarkerDragListener = this.zzaRL;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    localOnMarkerDragListener.onMarkerDragEnd(localMarker);
  }
  
  public void zzg(zzf paramzzf)
  {
    GoogleMap.OnMarkerDragListener localOnMarkerDragListener = this.zzaRL;
    Marker localMarker = new com/google/android/gms/maps/model/Marker;
    localMarker.<init>(paramzzf);
    localOnMarkerDragListener.onMarkerDrag(localMarker);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */