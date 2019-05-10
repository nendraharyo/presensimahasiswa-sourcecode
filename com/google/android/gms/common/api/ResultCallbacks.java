package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;

public abstract class ResultCallbacks
  implements ResultCallback
{
  public abstract void onFailure(Status paramStatus);
  
  public final void onResult(Result paramResult)
  {
    Status localStatus = paramResult.getStatus();
    boolean bool = localStatus.isSuccess();
    if (bool) {
      onSuccess(paramResult);
    }
    for (;;)
    {
      return;
      onFailure(localStatus);
      zzb.zzc(paramResult);
    }
  }
  
  public abstract void onSuccess(Result paramResult);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\ResultCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */