package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzk;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class GoogleMap$11$1
  implements LocationSource.OnLocationChangedListener
{
  GoogleMap$11$1(GoogleMap.11 param11, zzk paramzzk) {}
  
  public void onLocationChanged(Location paramLocation)
  {
    try
    {
      zzk localzzk = this.zzaRF;
      localzzk.zzd(paramLocation);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$11$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */