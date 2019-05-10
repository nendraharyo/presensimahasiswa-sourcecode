package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class zzj$zza
  extends Handler
{
  zzj$zza(zzj paramzzj, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    switch (i)
    {
    default: 
      localObject1 = "GoogleApiClientImpl";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Unknown message id: ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      int j = paramMessage.what;
      localObject2 = j;
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaid;
      zzj.zzc((zzj)localObject1);
      continue;
      localObject1 = this.zzaid;
      zzj.zzb((zzj)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */