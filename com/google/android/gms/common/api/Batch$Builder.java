package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.List;

public final class Batch$Builder
{
  private GoogleApiClient zzaaj;
  private List zzage;
  
  public Batch$Builder(GoogleApiClient paramGoogleApiClient)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzage = localArrayList;
    this.zzaaj = paramGoogleApiClient;
  }
  
  public BatchResultToken add(PendingResult paramPendingResult)
  {
    BatchResultToken localBatchResultToken = new com/google/android/gms/common/api/BatchResultToken;
    int i = this.zzage.size();
    localBatchResultToken.<init>(i);
    this.zzage.add(paramPendingResult);
    return localBatchResultToken;
  }
  
  public Batch build()
  {
    Batch localBatch = new com/google/android/gms/common/api/Batch;
    List localList = this.zzage;
    GoogleApiClient localGoogleApiClient = this.zzaaj;
    localBatch.<init>(localList, localGoogleApiClient, null);
    return localBatch;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Batch$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */