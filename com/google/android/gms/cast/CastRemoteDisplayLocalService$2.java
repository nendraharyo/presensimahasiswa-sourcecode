package com.google.android.gms.cast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

class CastRemoteDisplayLocalService$2
  implements GoogleApiClient.OnConnectionFailedListener
{
  CastRemoteDisplayLocalService$2(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = this.zzaaz;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Connection failed: " + paramConnectionResult;
    CastRemoteDisplayLocalService.zzb(localCastRemoteDisplayLocalService, (String)localObject);
    CastRemoteDisplayLocalService.zzc(this.zzaaz);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */