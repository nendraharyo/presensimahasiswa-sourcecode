package com.google.android.gms.common.api;

class Batch$1
  implements PendingResult.zza
{
  Batch$1(Batch paramBatch) {}
  
  public void zzu(Status paramStatus)
  {
    Batch localBatch1 = this.zzagd;
    for (;;)
    {
      boolean bool3;
      synchronized (Batch.zza(localBatch1))
      {
        localBatch1 = this.zzagd;
        boolean bool1 = localBatch1.isCanceled();
        if (bool1) {
          return;
        }
        bool1 = paramStatus.isCanceled();
        if (bool1)
        {
          localBatch1 = this.zzagd;
          bool3 = true;
          Batch.zza(localBatch1, bool3);
          localBatch1 = this.zzagd;
          Batch.zzb(localBatch1);
          localBatch1 = this.zzagd;
          int i = Batch.zzc(localBatch1);
          if (i == 0)
          {
            localBatch1 = this.zzagd;
            bool2 = Batch.zzd(localBatch1);
            if (!bool2) {
              break;
            }
            localBatch1 = this.zzagd;
            Batch.zze(localBatch1);
          }
        }
      }
      bool2 = paramStatus.isSuccess();
      if (!bool2)
      {
        localObject2 = this.zzagd;
        bool3 = true;
        Batch.zzb((Batch)localObject2, bool3);
      }
    }
    Object localObject2 = this.zzagd;
    boolean bool2 = Batch.zzf((Batch)localObject2);
    if (bool2)
    {
      localObject2 = new com/google/android/gms/common/api/Status;
      int j = 13;
      ((Status)localObject2).<init>(j);
    }
    for (;;)
    {
      Batch localBatch2 = this.zzagd;
      BatchResult localBatchResult = new com/google/android/gms/common/api/BatchResult;
      Object localObject4 = this.zzagd;
      localObject4 = Batch.zzg((Batch)localObject4);
      localBatchResult.<init>((Status)localObject2, (PendingResult[])localObject4);
      localBatch2.zza(localBatchResult);
      break;
      localObject2 = Status.zzagC;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Batch$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */