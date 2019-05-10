package com.google.android.gms.cast;

import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;

class CastRemoteDisplayLocalService$1
  extends MediaRouter.Callback
{
  CastRemoteDisplayLocalService$1(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject = this.zzaaz;
    String str = "onRouteUnselected";
    CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject, str);
    localObject = CastRemoteDisplayLocalService.zza(this.zzaaz);
    if (localObject == null)
    {
      localObject = this.zzaaz;
      str = "onRouteUnselected, no device was selected";
      CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject, str);
    }
    for (;;)
    {
      return;
      localObject = CastDevice.getFromBundle(paramRouteInfo.getExtras()).getDeviceId();
      str = CastRemoteDisplayLocalService.zza(this.zzaaz).getDeviceId();
      boolean bool = ((String)localObject).equals(str);
      if (!bool)
      {
        localObject = this.zzaaz;
        str = "onRouteUnselected, device does not match";
        CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject, str);
      }
      else
      {
        CastRemoteDisplayLocalService.stopService();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */