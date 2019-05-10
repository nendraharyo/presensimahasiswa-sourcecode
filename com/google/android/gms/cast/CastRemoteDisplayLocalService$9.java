package com.google.android.gms.cast;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class CastRemoteDisplayLocalService$9
  implements ResultCallback
{
  CastRemoteDisplayLocalService$9(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void zza(CastRemoteDisplay.CastRemoteDisplaySessionResult paramCastRemoteDisplaySessionResult)
  {
    Object localObject = paramCastRemoteDisplaySessionResult.getStatus();
    boolean bool = ((Status)localObject).isSuccess();
    String str;
    if (!bool)
    {
      localObject = this.zzaaz;
      str = "Unable to stop the remote display, result unsuccessful";
      CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject, str);
    }
    for (;;)
    {
      CastRemoteDisplayLocalService.zzb(this.zzaaz, null);
      return;
      localObject = this.zzaaz;
      str = "remote display stopped";
      CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject, str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */