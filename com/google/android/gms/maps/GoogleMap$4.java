package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.zzs.zza;

class GoogleMap$4
  extends zzs.zza
{
  GoogleMap$4(GoogleMap paramGoogleMap, GoogleMap.OnMyLocationChangeListener paramOnMyLocationChangeListener) {}
  
  public void zzq(zzd paramzzd)
  {
    GoogleMap.OnMyLocationChangeListener localOnMyLocationChangeListener = this.zzaRx;
    Location localLocation = (Location)zze.zzp(paramzzd);
    localOnMyLocationChangeListener.onMyLocationChange(localLocation);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */