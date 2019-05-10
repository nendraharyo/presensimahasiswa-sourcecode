package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

public class zzpb
  implements ConfigApi
{
  public PendingResult createCustomDataType(GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    zzpb.1 local1 = new com/google/android/gms/internal/zzpb$1;
    local1.<init>(this, paramGoogleApiClient, paramDataTypeCreateRequest);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public PendingResult disableFit(GoogleApiClient paramGoogleApiClient)
  {
    zzpb.3 local3 = new com/google/android/gms/internal/zzpb$3;
    local3.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult readDataType(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzpb.2 local2 = new com/google/android/gms/internal/zzpb$2;
    local2.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */