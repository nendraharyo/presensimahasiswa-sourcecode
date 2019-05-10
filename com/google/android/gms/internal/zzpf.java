package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzl;
import com.google.android.gms.fitness.data.zzl.zza;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;

public class zzpf
  implements SensorsApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, zzk paramzzk, PendingIntent paramPendingIntent, zzpf.zza paramzza)
  {
    zzpf.4 local4 = new com/google/android/gms/internal/zzpf$4;
    local4.<init>(this, paramGoogleApiClient, paramzza, paramzzk, paramPendingIntent);
    return paramGoogleApiClient.zzb(local4);
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, zzk paramzzk, PendingIntent paramPendingIntent)
  {
    zzpf.2 local2 = new com/google/android/gms/internal/zzpf$2;
    local2.<init>(this, paramGoogleApiClient, paramSensorRequest, paramzzk, paramPendingIntent);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent)
  {
    return zza(paramGoogleApiClient, paramSensorRequest, null, paramPendingIntent);
  }
  
  public PendingResult add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, OnDataPointListener paramOnDataPointListener)
  {
    zzl localzzl = zzl.zza.zzuu().zza(paramOnDataPointListener);
    return zza(paramGoogleApiClient, paramSensorRequest, localzzl, null);
  }
  
  public PendingResult findDataSources(GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest)
  {
    zzpf.1 local1 = new com/google/android/gms/internal/zzpf$1;
    local1.<init>(this, paramGoogleApiClient, paramDataSourcesRequest);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult remove(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return zza(paramGoogleApiClient, null, paramPendingIntent, null);
  }
  
  public PendingResult remove(GoogleApiClient paramGoogleApiClient, OnDataPointListener paramOnDataPointListener)
  {
    Object localObject = zzl.zza.zzuu().zzb(paramOnDataPointListener);
    if (localObject == null) {}
    zzpf.3 local3;
    for (localObject = PendingResults.zza(Status.zzagC, paramGoogleApiClient);; localObject = zza(paramGoogleApiClient, (zzk)localObject, null, local3))
    {
      return (PendingResult)localObject;
      local3 = new com/google/android/gms/internal/zzpf$3;
      local3.<init>(this, paramOnDataPointListener);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */