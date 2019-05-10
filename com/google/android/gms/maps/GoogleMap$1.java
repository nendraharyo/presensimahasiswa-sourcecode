package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzg.zza;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.internal.zzd;

class GoogleMap$1
  extends zzg.zza
{
  GoogleMap$1(GoogleMap paramGoogleMap, GoogleMap.OnIndoorStateChangeListener paramOnIndoorStateChangeListener) {}
  
  public void onIndoorBuildingFocused()
  {
    this.zzaRt.onIndoorBuildingFocused();
  }
  
  public void zza(zzd paramzzd)
  {
    GoogleMap.OnIndoorStateChangeListener localOnIndoorStateChangeListener = this.zzaRt;
    IndoorBuilding localIndoorBuilding = new com/google/android/gms/maps/model/IndoorBuilding;
    localIndoorBuilding.<init>(paramzzd);
    localOnIndoorStateChangeListener.onIndoorLevelActivated(localIndoorBuilding);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */