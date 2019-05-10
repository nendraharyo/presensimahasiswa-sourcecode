package com.google.android.gms.cast;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class CastRemoteDisplayLocalService$4
  implements ServiceConnection
{
  CastRemoteDisplayLocalService$4(String paramString, CastDevice paramCastDevice, CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings, Context paramContext, CastRemoteDisplayLocalService.Callbacks paramCallbacks) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramIBinder = (CastRemoteDisplayLocalService.zza)paramIBinder;
    Object localObject1 = paramIBinder.zznM();
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = this.zzZI;
      localObject3 = this.zzaaA;
      CastRemoteDisplayLocalService.NotificationSettings localNotificationSettings = this.zzaaB;
      Context localContext = this.zzaaC;
      CastRemoteDisplayLocalService.Callbacks localCallbacks = this.zzaaD;
      boolean bool = CastRemoteDisplayLocalService.zza((CastRemoteDisplayLocalService)localObject1, (String)localObject2, (CastDevice)localObject3, localNotificationSettings, localContext, this, localCallbacks);
      if (bool) {}
    }
    else
    {
      localObject1 = CastRemoteDisplayLocalService.zznI();
      localObject3 = new Object[0];
      ((zzl)localObject1).zzc("Connected but unable to get the service instance", (Object[])localObject3);
      localObject1 = this.zzaaD;
      localObject2 = new com/google/android/gms/common/api/Status;
      int i = 2200;
      ((Status)localObject2).<init>(i);
      ((CastRemoteDisplayLocalService.Callbacks)localObject1).onRemoteDisplaySessionError((Status)localObject2);
      localObject1 = CastRemoteDisplayLocalService.zznJ();
      ((AtomicBoolean)localObject1).set(false);
    }
    try
    {
      localObject1 = this.zzaaC;
      ((Context)localObject1).unbindService(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        zzl localzzl = CastRemoteDisplayLocalService.zznI();
        localObject2 = "No need to unbind service, already unbound";
        localObject3 = new Object[0];
        localzzl.zzb((String)localObject2, (Object[])localObject3);
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object localObject1 = CastRemoteDisplayLocalService.zznI();
    Object[] arrayOfObject = new Object[0];
    ((zzl)localObject1).zzb("onServiceDisconnected", arrayOfObject);
    localObject1 = this.zzaaD;
    Object localObject2 = new com/google/android/gms/common/api/Status;
    int i = 2201;
    String str = "Service Disconnected";
    ((Status)localObject2).<init>(i, str);
    ((CastRemoteDisplayLocalService.Callbacks)localObject1).onRemoteDisplaySessionError((Status)localObject2);
    localObject1 = CastRemoteDisplayLocalService.zznJ();
    ((AtomicBoolean)localObject1).set(false);
    try
    {
      localObject1 = this.zzaaC;
      ((Context)localObject1).unbindService(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        zzl localzzl = CastRemoteDisplayLocalService.zznI();
        localObject2 = "No need to unbind service, already unbound";
        arrayOfObject = new Object[0];
        localzzl.zzb((String)localObject2, arrayOfObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */