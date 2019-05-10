package com.google.android.gms.cast;

import android.content.Context;
import android.content.ServiceConnection;
import android.view.Display;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

class CastRemoteDisplayLocalService$8
  implements ResultCallback
{
  CastRemoteDisplayLocalService$8(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void zza(CastRemoteDisplay.CastRemoteDisplaySessionResult paramCastRemoteDisplaySessionResult)
  {
    Object[] arrayOfObject = null;
    Object localObject1 = paramCastRemoteDisplaySessionResult.getStatus();
    boolean bool = ((Status)localObject1).isSuccess();
    if (!bool)
    {
      localObject1 = CastRemoteDisplayLocalService.zznI();
      ??? = "Connection was not successful";
      localObject5 = new Object[0];
      ((zzl)localObject1).zzc((String)???, (Object[])localObject5);
      localObject1 = this.zzaaz;
      CastRemoteDisplayLocalService.zzc((CastRemoteDisplayLocalService)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = CastRemoteDisplayLocalService.zznI();
      localObject5 = new Object[0];
      ((zzl)localObject1).zzb("startRemoteDisplay successful", (Object[])localObject5);
      synchronized (CastRemoteDisplayLocalService.zznK())
      {
        localObject1 = CastRemoteDisplayLocalService.zznL();
        if (localObject1 == null)
        {
          localObject1 = CastRemoteDisplayLocalService.zznI();
          localObject5 = "Remote Display started but session already cancelled";
          arrayOfObject = null;
          arrayOfObject = new Object[0];
          ((zzl)localObject1).zzb((String)localObject5, arrayOfObject);
          localObject1 = this.zzaaz;
          CastRemoteDisplayLocalService.zzc((CastRemoteDisplayLocalService)localObject1);
        }
      }
    }
    Object localObject3 = paramCastRemoteDisplaySessionResult.getPresentationDisplay();
    if (localObject3 != null)
    {
      ??? = this.zzaaz;
      CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)???, (Display)localObject3);
    }
    for (;;)
    {
      CastRemoteDisplayLocalService.zznJ().set(false);
      localObject3 = CastRemoteDisplayLocalService.zzd(this.zzaaz);
      if (localObject3 == null) {
        break;
      }
      localObject3 = CastRemoteDisplayLocalService.zze(this.zzaaz);
      if (localObject3 == null) {
        break;
      }
      try
      {
        localObject3 = this.zzaaz;
        localObject3 = CastRemoteDisplayLocalService.zzd((CastRemoteDisplayLocalService)localObject3);
        ??? = this.zzaaz;
        ??? = CastRemoteDisplayLocalService.zze((CastRemoteDisplayLocalService)???);
        ((Context)localObject3).unbindService((ServiceConnection)???);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          zzl localzzl = CastRemoteDisplayLocalService.zznI();
          ??? = "No need to unbind service, already unbound";
          localObject5 = new Object[0];
          localzzl.zzb((String)???, (Object[])localObject5);
        }
      }
      CastRemoteDisplayLocalService.zza(this.zzaaz, null);
      localObject3 = this.zzaaz;
      CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject3, null);
      break;
      localObject3 = CastRemoteDisplayLocalService.zznI();
      ??? = "Cast Remote Display session created without display";
      localObject5 = new Object[0];
      ((zzl)localObject3).zzc((String)???, (Object[])localObject5);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */