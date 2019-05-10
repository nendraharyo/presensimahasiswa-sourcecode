package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzx;

public final class zzq
{
  private volatile Object mListener;
  private final zzq.zza zzaiw;
  
  zzq(Looper paramLooper, Object paramObject)
  {
    Object localObject = new com/google/android/gms/common/api/internal/zzq$zza;
    ((zzq.zza)localObject).<init>(this, paramLooper);
    this.zzaiw = ((zzq.zza)localObject);
    localObject = zzx.zzb(paramObject, "Listener must not be null");
    this.mListener = localObject;
  }
  
  public void clear()
  {
    this.mListener = null;
  }
  
  public void zza(zzq.zzb paramzzb)
  {
    zzx.zzb(paramzzb, "Notifier must not be null");
    Message localMessage = this.zzaiw.obtainMessage(1, paramzzb);
    this.zzaiw.sendMessage(localMessage);
  }
  
  void zzb(zzq.zzb paramzzb)
  {
    Object localObject = this.mListener;
    if (localObject == null) {
      paramzzb.zzpr();
    }
    for (;;)
    {
      return;
      try
      {
        paramzzb.zzt(localObject);
      }
      catch (RuntimeException localRuntimeException)
      {
        paramzzb.zzpr();
        throw localRuntimeException;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */