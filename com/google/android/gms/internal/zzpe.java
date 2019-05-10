package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.data.Subscription.zza;

public class zzpe
  implements RecordingApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    zzpe.3 local3 = new com/google/android/gms/internal/zzpe$3;
    local3.<init>(this, paramGoogleApiClient, paramSubscription);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult listSubscriptions(GoogleApiClient paramGoogleApiClient)
  {
    zzpe.1 local1 = new com/google/android/gms/internal/zzpe$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult listSubscriptions(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    zzpe.2 local2 = new com/google/android/gms/internal/zzpe$2;
    local2.<init>(this, paramGoogleApiClient, paramDataType);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    Object localObject = new com/google/android/gms/fitness/data/Subscription$zza;
    ((Subscription.zza)localObject).<init>();
    localObject = ((Subscription.zza)localObject).zzb(paramDataSource).zzuz();
    return zza(paramGoogleApiClient, (Subscription)localObject);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    Object localObject = new com/google/android/gms/fitness/data/Subscription$zza;
    ((Subscription.zza)localObject).<init>();
    localObject = ((Subscription.zza)localObject).zzb(paramDataType).zzuz();
    return zza(paramGoogleApiClient, (Subscription)localObject);
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    zzpe.5 local5 = new com/google/android/gms/internal/zzpe$5;
    local5.<init>(this, paramGoogleApiClient, paramDataSource);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    zzpe.4 local4 = new com/google/android/gms/internal/zzpe$4;
    local4.<init>(this, paramGoogleApiClient, paramDataType);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    Object localObject = paramSubscription.getDataType();
    if (localObject == null) {
      localObject = paramSubscription.getDataSource();
    }
    for (localObject = unsubscribe(paramGoogleApiClient, (DataSource)localObject);; localObject = unsubscribe(paramGoogleApiClient, (DataType)localObject))
    {
      return (PendingResult)localObject;
      localObject = paramSubscription.getDataType();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */