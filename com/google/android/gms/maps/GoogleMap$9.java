package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzv.zza;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;

class GoogleMap$9
  extends zzv.zza
{
  GoogleMap$9(GoogleMap paramGoogleMap, GoogleMap.OnPolylineClickListener paramOnPolylineClickListener) {}
  
  public void zza(IPolylineDelegate paramIPolylineDelegate)
  {
    GoogleMap.OnPolylineClickListener localOnPolylineClickListener = this.zzaRC;
    Polyline localPolyline = new com/google/android/gms/maps/model/Polyline;
    localPolyline.<init>(paramIPolylineDelegate);
    localOnPolylineClickListener.onPolylineClick(localPolyline);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */