package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzt;

public abstract class ResultTransform
{
  public final PendingResult createFailedResult(Status paramStatus)
  {
    zzt localzzt = new com/google/android/gms/common/api/internal/zzt;
    localzzt.<init>(paramStatus);
    return localzzt;
  }
  
  public Status onFailure(Status paramStatus)
  {
    return paramStatus;
  }
  
  public abstract PendingResult onSuccess(Result paramResult);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\ResultTransform.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */