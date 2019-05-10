package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.Message;

final class MessengerCompat$zza
  extends zzb.zza
{
  Handler handler;
  
  MessengerCompat$zza(MessengerCompat paramMessengerCompat, Handler paramHandler)
  {
    this.handler = paramHandler;
  }
  
  public void send(Message paramMessage)
  {
    int i = Binder.getCallingUid();
    paramMessage.arg2 = i;
    this.handler.dispatchMessage(paramMessage);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\MessengerCompat$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */