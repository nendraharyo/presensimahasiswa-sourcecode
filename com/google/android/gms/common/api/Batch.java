package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;
import java.util.List;

public final class Batch
  extends zzb
{
  private int zzafZ;
  private boolean zzaga;
  private boolean zzagb;
  private final PendingResult[] zzagc;
  private final Object zzpV;
  
  private Batch(List paramList, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    this.zzpV = localObject1;
    int i = paramList.size();
    this.zzafZ = i;
    localObject1 = new PendingResult[this.zzafZ];
    this.zzagc = ((PendingResult[])localObject1);
    boolean bool = paramList.isEmpty();
    Object localObject2;
    if (bool)
    {
      localObject1 = new com/google/android/gms/common/api/BatchResult;
      localStatus = Status.zzagC;
      localObject2 = this.zzagc;
      ((BatchResult)localObject1).<init>(localStatus, (PendingResult[])localObject2);
      zza((Result)localObject1);
      return;
    }
    bool = false;
    localObject1 = null;
    int k = 0;
    Status localStatus = null;
    for (;;)
    {
      int j = paramList.size();
      if (k >= j) {
        break;
      }
      localObject1 = (PendingResult)paramList.get(k);
      this.zzagc[k] = localObject1;
      localObject2 = new com/google/android/gms/common/api/Batch$1;
      ((Batch.1)localObject2).<init>(this);
      ((PendingResult)localObject1).zza((PendingResult.zza)localObject2);
      j = k + 1;
      k = j;
    }
  }
  
  public void cancel()
  {
    super.cancel();
    PendingResult[] arrayOfPendingResult = this.zzagc;
    int i = arrayOfPendingResult.length;
    int j = 0;
    while (j < i)
    {
      PendingResult localPendingResult = arrayOfPendingResult[j];
      localPendingResult.cancel();
      j += 1;
    }
  }
  
  public BatchResult createFailedResult(Status paramStatus)
  {
    BatchResult localBatchResult = new com/google/android/gms/common/api/BatchResult;
    PendingResult[] arrayOfPendingResult = this.zzagc;
    localBatchResult.<init>(paramStatus, arrayOfPendingResult);
    return localBatchResult;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Batch.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */