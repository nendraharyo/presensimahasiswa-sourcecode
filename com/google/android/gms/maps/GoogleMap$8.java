package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzu.zza;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.internal.zzg;

class GoogleMap$8
  extends zzu.zza
{
  GoogleMap$8(GoogleMap paramGoogleMap, GoogleMap.OnPolygonClickListener paramOnPolygonClickListener) {}
  
  public void zza(zzg paramzzg)
  {
    GoogleMap.OnPolygonClickListener localOnPolygonClickListener = this.zzaRB;
    Polygon localPolygon = new com/google/android/gms/maps/model/Polygon;
    localPolygon.<init>(paramzzg);
    localOnPolygonClickListener.onPolygonClick(localPolygon);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */