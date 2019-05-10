package com.google.android.gms.cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.internal.zzl;

final class CastRemoteDisplayLocalService$zzb
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getAction();
    String str = "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT";
    boolean bool = ((String)localObject).equals(str);
    if (bool)
    {
      localObject = CastRemoteDisplayLocalService.zznI();
      str = "disconnecting";
      Object[] arrayOfObject = new Object[0];
      ((zzl)localObject).zzb(str, arrayOfObject);
      CastRemoteDisplayLocalService.stopService();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */