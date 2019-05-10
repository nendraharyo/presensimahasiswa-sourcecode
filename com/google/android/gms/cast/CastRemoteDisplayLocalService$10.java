package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;

class CastRemoteDisplayLocalService$10
  implements GoogleApiClient.ConnectionCallbacks
{
  CastRemoteDisplayLocalService$10(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onConnected(Bundle paramBundle)
  {
    CastRemoteDisplayLocalService.zza(this.zzaaz, "onConnected");
    CastRemoteDisplayLocalService.zzf(this.zzaaz);
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzl localzzl = CastRemoteDisplayLocalService.zznI();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    String str = String.format("[Instance: %s] ConnectionSuspended %d", arrayOfObject);
    arrayOfObject = new Object[0];
    localzzl.zzf(str, arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */