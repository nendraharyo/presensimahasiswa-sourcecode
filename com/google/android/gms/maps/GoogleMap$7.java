package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzf.zza;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.internal.zzc;

class GoogleMap$7
  extends zzf.zza
{
  GoogleMap$7(GoogleMap paramGoogleMap, GoogleMap.OnGroundOverlayClickListener paramOnGroundOverlayClickListener) {}
  
  public void zza(zzc paramzzc)
  {
    GoogleMap.OnGroundOverlayClickListener localOnGroundOverlayClickListener = this.zzaRA;
    GroundOverlay localGroundOverlay = new com/google/android/gms/maps/model/GroundOverlay;
    localGroundOverlay.<init>(paramzzc);
    localOnGroundOverlayClickListener.onGroundOverlayClick(localGroundOverlay);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */