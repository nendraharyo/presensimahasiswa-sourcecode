package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzaa.zza;

class StreetViewPanoramaFragment$zza$1
  extends zzaa.zza
{
  StreetViewPanoramaFragment$zza$1(StreetViewPanoramaFragment.zza paramzza, OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback) {}
  
  public void zza(IStreetViewPanoramaDelegate paramIStreetViewPanoramaDelegate)
  {
    OnStreetViewPanoramaReadyCallback localOnStreetViewPanoramaReadyCallback = this.zzaSA;
    StreetViewPanorama localStreetViewPanorama = new com/google/android/gms/maps/StreetViewPanorama;
    localStreetViewPanorama.<init>(paramIStreetViewPanoramaDelegate);
    localOnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(localStreetViewPanorama);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanoramaFragment$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */