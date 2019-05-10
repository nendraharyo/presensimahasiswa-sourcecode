package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;

public class StartBleScanRequest$Builder
{
  private DataType[] zzaAY;
  private zzq zzaBA;
  private int zzaBB;
  
  public StartBleScanRequest$Builder()
  {
    DataType[] arrayOfDataType = new DataType[0];
    this.zzaAY = arrayOfDataType;
    this.zzaBB = 10;
  }
  
  public StartBleScanRequest build()
  {
    Object localObject = this.zzaBA;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Must set BleScanCallback");
      localObject = new com/google/android/gms/fitness/request/StartBleScanRequest;
      ((StartBleScanRequest)localObject).<init>(this, null);
      return (StartBleScanRequest)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public Builder setBleScanCallback(BleScanCallback paramBleScanCallback)
  {
    zza localzza = zza.zza.zzuJ().zza(paramBleScanCallback);
    zza(localzza);
    return this;
  }
  
  public Builder setDataTypes(DataType... paramVarArgs)
  {
    this.zzaAY = paramVarArgs;
    return this;
  }
  
  public Builder setTimeoutSecs(int paramInt)
  {
    boolean bool1 = true;
    int i;
    if (paramInt > 0)
    {
      boolean bool2 = bool1;
      String str = "Stop time must be greater than zero";
      zzx.zzb(bool2, str);
      i = 60;
      if (paramInt > i) {
        break label44;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Stop time must be less than 1 minute");
      this.zzaBB = paramInt;
      return this;
      i = 0;
      break;
      label44:
      bool1 = false;
    }
  }
  
  public Builder zza(zzq paramzzq)
  {
    this.zzaBA = paramzzq;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\StartBleScanRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */