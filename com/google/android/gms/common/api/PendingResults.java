package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.zzr;
import com.google.android.gms.common.api.internal.zzv;
import com.google.android.gms.common.internal.zzx;

public final class PendingResults
{
  public static PendingResult canceledPendingResult()
  {
    zzv localzzv = new com/google/android/gms/common/api/internal/zzv;
    Looper localLooper = Looper.getMainLooper();
    localzzv.<init>(localLooper);
    localzzv.cancel();
    return localzzv;
  }
  
  public static PendingResult canceledPendingResult(Result paramResult)
  {
    zzx.zzb(paramResult, "Result must not be null");
    Object localObject = paramResult.getStatus();
    int i = ((Status)localObject).getStatusCode();
    int k = 16;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      zzx.zzb(i, "Status code must be CommonStatusCodes.CANCELED");
      localObject = new com/google/android/gms/common/api/PendingResults$zza;
      ((PendingResults.zza)localObject).<init>(paramResult);
      ((PendingResults.zza)localObject).cancel();
      return (PendingResult)localObject;
      int j = 0;
      localObject = null;
    }
  }
  
  public static OptionalPendingResult immediatePendingResult(Result paramResult)
  {
    zzx.zzb(paramResult, "Result must not be null");
    PendingResults.zzc localzzc = new com/google/android/gms/common/api/PendingResults$zzc;
    localzzc.<init>(null);
    localzzc.zza(paramResult);
    zzr localzzr = new com/google/android/gms/common/api/internal/zzr;
    localzzr.<init>(localzzc);
    return localzzr;
  }
  
  public static PendingResult immediatePendingResult(Status paramStatus)
  {
    zzx.zzb(paramStatus, "Result must not be null");
    zzv localzzv = new com/google/android/gms/common/api/internal/zzv;
    Looper localLooper = Looper.getMainLooper();
    localzzv.<init>(localLooper);
    localzzv.zza(paramStatus);
    return localzzv;
  }
  
  public static PendingResult zza(Result paramResult, GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(paramResult, "Result must not be null");
    Object localObject = paramResult.getStatus();
    boolean bool = ((Status)localObject).isSuccess();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "Status code must not be SUCCESS");
      localObject = new com/google/android/gms/common/api/PendingResults$zzb;
      ((PendingResults.zzb)localObject).<init>(paramGoogleApiClient, paramResult);
      ((PendingResults.zzb)localObject).zza(paramResult);
      return (PendingResult)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public static PendingResult zza(Status paramStatus, GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(paramStatus, "Result must not be null");
    zzv localzzv = new com/google/android/gms/common/api/internal/zzv;
    localzzv.<init>(paramGoogleApiClient);
    localzzv.zza(paramStatus);
    return localzzv;
  }
  
  public static OptionalPendingResult zzb(Result paramResult, GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(paramResult, "Result must not be null");
    PendingResults.zzc localzzc = new com/google/android/gms/common/api/PendingResults$zzc;
    localzzc.<init>(paramGoogleApiClient);
    localzzc.zza(paramResult);
    zzr localzzr = new com/google/android/gms/common/api/internal/zzr;
    localzzr.<init>(localzzc);
    return localzzr;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\PendingResults.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */