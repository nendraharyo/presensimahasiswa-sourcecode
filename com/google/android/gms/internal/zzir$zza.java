package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzir$zza
  extends BroadcastReceiver
{
  private zzir$zza(zzir paramzzir) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = "android.intent.action.USER_PRESENT";
    String str = paramIntent.getAction();
    boolean bool1 = ((String)localObject).equals(str);
    boolean bool2;
    if (bool1)
    {
      localObject = this.zzMf;
      bool2 = true;
      zzir.zza((zzir)localObject, bool2);
    }
    for (;;)
    {
      return;
      localObject = "android.intent.action.SCREEN_OFF";
      str = paramIntent.getAction();
      bool1 = ((String)localObject).equals(str);
      if (bool1)
      {
        localObject = this.zzMf;
        bool2 = false;
        str = null;
        zzir.zza((zzir)localObject, false);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzir$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */