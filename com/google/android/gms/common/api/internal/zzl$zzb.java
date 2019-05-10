package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class zzl$zzb
  extends Handler
{
  zzl$zzb(zzl paramzzl, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject2;
    switch (i)
    {
    default: 
      localObject1 = "GACStateManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Unknown message id: ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      int j = paramMessage.what;
      localObject2 = j;
      Log.w((String)localObject1, (String)localObject2);
    case 1: 
      for (;;)
      {
        return;
        localObject1 = (zzl.zza)paramMessage.obj;
        localObject2 = this.zzaiu;
        ((zzl.zza)localObject1).zzd((zzl)localObject2);
      }
    }
    throw ((RuntimeException)paramMessage.obj);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzl$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */