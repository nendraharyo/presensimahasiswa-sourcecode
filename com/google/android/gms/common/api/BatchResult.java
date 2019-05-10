package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.TimeUnit;

public final class BatchResult
  implements Result
{
  private final Status zzUX;
  private final PendingResult[] zzagc;
  
  BatchResult(Status paramStatus, PendingResult[] paramArrayOfPendingResult)
  {
    this.zzUX = paramStatus;
    this.zzagc = paramArrayOfPendingResult;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public Result take(BatchResultToken paramBatchResultToken)
  {
    int i = paramBatchResultToken.mId;
    Object localObject1 = this.zzagc;
    int k = localObject1.length;
    if (i < k) {
      i = 1;
    }
    for (;;)
    {
      zzx.zzb(i, "The result token does not belong to this batch");
      Object localObject2 = this.zzagc;
      int m = paramBatchResultToken.mId;
      localObject2 = localObject2[m];
      localObject1 = TimeUnit.MILLISECONDS;
      return ((PendingResult)localObject2).await(0L, (TimeUnit)localObject1);
      int j = 0;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\BatchResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */