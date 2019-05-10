package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;

public class DataSourcesRequest$Builder
{
  private boolean zzaAW;
  private DataType[] zzaAY;
  private int[] zzaAZ;
  
  public DataSourcesRequest$Builder()
  {
    Object localObject = new DataType[0];
    this.zzaAY = ((DataType[])localObject);
    localObject = new int[2];
    Object tmp19_18 = localObject;
    tmp19_18[0] = 0;
    tmp19_18[1] = 1;
    this.zzaAZ = ((int[])localObject);
    this.zzaAW = false;
  }
  
  public DataSourcesRequest build()
  {
    int i = 1;
    Object localObject = this.zzaAY;
    int j = localObject.length;
    int k;
    if (j > 0)
    {
      j = i;
      String str = "Must add at least one data type";
      zzx.zza(j, str);
      localObject = this.zzaAZ;
      k = localObject.length;
      if (k <= 0) {
        break label63;
      }
    }
    for (;;)
    {
      zzx.zza(i, "Must add at least one data source type");
      localObject = new com/google/android/gms/fitness/request/DataSourcesRequest;
      ((DataSourcesRequest)localObject).<init>(this, null);
      return (DataSourcesRequest)localObject;
      k = 0;
      localObject = null;
      break;
      label63:
      i = 0;
    }
  }
  
  public Builder setDataSourceTypes(int... paramVarArgs)
  {
    this.zzaAZ = paramVarArgs;
    return this;
  }
  
  public Builder setDataTypes(DataType... paramVarArgs)
  {
    this.zzaAY = paramVarArgs;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataSourcesRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */