package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class InstanceIDListenerService$1
  extends Handler
{
  InstanceIDListenerService$1(InstanceIDListenerService paramInstanceIDListenerService, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    InstanceIDListenerService localInstanceIDListenerService = this.zzaNc;
    int i = MessengerCompat.zzc(paramMessage);
    InstanceIDListenerService.zza(localInstanceIDListenerService, paramMessage, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\InstanceIDListenerService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */