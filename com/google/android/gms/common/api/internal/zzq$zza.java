package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzx;

final class zzq$zza
  extends Handler
{
  public zzq$zza(zzq paramzzq, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = 1;
    int j = paramMessage.what;
    if (j == i) {}
    for (;;)
    {
      zzx.zzac(i);
      zzq localzzq = this.zzaix;
      zzq.zzb localzzb = (zzq.zzb)paramMessage.obj;
      localzzq.zzb(localzzb);
      return;
      i = 0;
      localzzb = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */