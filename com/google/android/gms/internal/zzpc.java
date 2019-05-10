package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import java.util.List;

public class zzpc
  implements HistoryApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet, boolean paramBoolean)
  {
    zzx.zzb(paramDataSet, "Must set the data set");
    Object localObject = paramDataSet.getDataPoints();
    boolean bool = ((List)localObject).isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Cannot use an empty data set");
      zzx.zzb(paramDataSet.getDataSource().zzum(), "Must set the app package name for the data source");
      localObject = new com/google/android/gms/internal/zzpc$1;
      ((zzpc.1)localObject).<init>(this, paramGoogleApiClient, paramDataSet, paramBoolean);
      return paramGoogleApiClient.zza((zza.zza)localObject);
      bool = false;
      localObject = null;
    }
  }
  
  public PendingResult deleteData(GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest)
  {
    zzpc.2 local2 = new com/google/android/gms/internal/zzpc$2;
    local2.<init>(this, paramGoogleApiClient, paramDataDeleteRequest);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult insertData(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet)
  {
    return zza(paramGoogleApiClient, paramDataSet, false);
  }
  
  public PendingResult readDailyTotal(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    zzpc.5 local5 = new com/google/android/gms/internal/zzpc$5;
    local5.<init>(this, paramGoogleApiClient, paramDataType);
    return paramGoogleApiClient.zza(local5);
  }
  
  public PendingResult readData(GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest)
  {
    zzpc.4 local4 = new com/google/android/gms/internal/zzpc$4;
    local4.<init>(this, paramGoogleApiClient, paramDataReadRequest);
    return paramGoogleApiClient.zza(local4);
  }
  
  public PendingResult updateData(GoogleApiClient paramGoogleApiClient, DataUpdateRequest paramDataUpdateRequest)
  {
    zzx.zzb(paramDataUpdateRequest.getDataSet(), "Must set the data set");
    zzx.zza(paramDataUpdateRequest.zzlO(), "Must set a non-zero value for startTimeMillis/startTime");
    zzx.zza(paramDataUpdateRequest.zzud(), "Must set a non-zero value for endTimeMillis/endTime");
    zzpc.3 local3 = new com/google/android/gms/internal/zzpc$3;
    local3.<init>(this, paramGoogleApiClient, paramDataUpdateRequest);
    return paramGoogleApiClient.zza(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */