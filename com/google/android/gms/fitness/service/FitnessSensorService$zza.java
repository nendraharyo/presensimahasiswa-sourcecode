package com.google.android.gms.fitness.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.internal.service.zzc.zza;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzow;
import java.util.List;

class FitnessSensorService$zza
  extends zzc.zza
{
  private final FitnessSensorService zzaBQ;
  
  private FitnessSensorService$zza(FitnessSensorService paramFitnessSensorService)
  {
    this.zzaBQ = paramFitnessSensorService;
  }
  
  public void zza(FitnessDataSourcesRequest paramFitnessDataSourcesRequest, zzoi paramzzoi)
  {
    this.zzaBQ.zzvr();
    Object localObject1 = this.zzaBQ;
    Object localObject2 = paramFitnessDataSourcesRequest.getDataTypes();
    localObject1 = ((FitnessSensorService)localObject1).onFindDataSources((List)localObject2);
    localObject2 = new com/google/android/gms/fitness/result/DataSourcesResult;
    Status localStatus = Status.zzagC;
    ((DataSourcesResult)localObject2).<init>((List)localObject1, localStatus);
    paramzzoi.zza((DataSourcesResult)localObject2);
  }
  
  public void zza(FitnessUnregistrationRequest paramFitnessUnregistrationRequest, zzow paramzzow)
  {
    this.zzaBQ.zzvr();
    Object localObject = this.zzaBQ;
    DataSource localDataSource = paramFitnessUnregistrationRequest.getDataSource();
    boolean bool = ((FitnessSensorService)localObject).onUnregister(localDataSource);
    if (bool)
    {
      localObject = Status.zzagC;
      paramzzow.zzp((Status)localObject);
    }
    for (;;)
    {
      return;
      localObject = new com/google/android/gms/common/api/Status;
      int i = 13;
      ((Status)localObject).<init>(i);
      paramzzow.zzp((Status)localObject);
    }
  }
  
  public void zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest, zzow paramzzow)
  {
    this.zzaBQ.zzvr();
    Object localObject = this.zzaBQ;
    boolean bool = ((FitnessSensorService)localObject).onRegister(paramFitnessSensorServiceRequest);
    if (bool)
    {
      localObject = Status.zzagC;
      paramzzow.zzp((Status)localObject);
    }
    for (;;)
    {
      return;
      localObject = new com/google/android/gms/common/api/Status;
      int i = 13;
      ((Status)localObject).<init>(i);
      paramzzow.zzp((Status)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\service\FitnessSensorService$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */