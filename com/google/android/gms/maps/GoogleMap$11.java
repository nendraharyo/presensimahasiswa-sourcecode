package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.ILocationSourceDelegate.zza;
import com.google.android.gms.maps.internal.zzk;

class GoogleMap$11
  extends ILocationSourceDelegate.zza
{
  GoogleMap$11(GoogleMap paramGoogleMap, LocationSource paramLocationSource) {}
  
  public void activate(zzk paramzzk)
  {
    LocationSource localLocationSource = this.zzaRE;
    GoogleMap.11.1 local1 = new com/google/android/gms/maps/GoogleMap$11$1;
    local1.<init>(this, paramzzk);
    localLocationSource.activate(local1);
  }
  
  public void deactivate()
  {
    this.zzaRE.deactivate();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$11.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */