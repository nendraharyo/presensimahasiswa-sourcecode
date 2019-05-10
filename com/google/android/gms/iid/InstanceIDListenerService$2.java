package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

class InstanceIDListenerService$2
  extends BroadcastReceiver
{
  InstanceIDListenerService$2(InstanceIDListenerService paramInstanceIDListenerService) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = "InstanceID";
    int i = 3;
    boolean bool = Log.isLoggable(str, i);
    if (bool)
    {
      paramIntent.getStringExtra("registration_id");
      str = "InstanceID";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Received GSF callback using dynamic receiver: ");
      Bundle localBundle = paramIntent.getExtras();
      localObject = localBundle;
      Log.d(str, (String)localObject);
    }
    this.zzaNc.zzp(paramIntent);
    this.zzaNc.stop();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\InstanceIDListenerService$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */