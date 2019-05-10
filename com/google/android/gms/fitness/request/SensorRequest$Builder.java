package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

public class SensorRequest$Builder
{
  private long zzaBk;
  private long zzaBl;
  private long zzaBq;
  private boolean zzaBr;
  private DataType zzavT;
  private DataSource zzavU;
  private long zzaxo = -1;
  private int zzaxp;
  
  public SensorRequest$Builder()
  {
    this.zzaBl = l;
    this.zzaBk = l;
    this.zzaBr = false;
    this.zzaxp = 2;
    this.zzaBq = Long.MAX_VALUE;
  }
  
  public SensorRequest build()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = this.zzavU;
    boolean bool3;
    if (localObject1 == null)
    {
      localObject1 = this.zzavT;
      if (localObject1 == null) {}
    }
    else
    {
      bool3 = bool1;
    }
    for (;;)
    {
      Object localObject2 = "Must call setDataSource() or setDataType()";
      zzx.zza(bool3, localObject2);
      localObject1 = this.zzavT;
      if (localObject1 != null)
      {
        localObject1 = this.zzavU;
        if (localObject1 != null)
        {
          localObject1 = this.zzavT;
          localObject2 = this.zzavU.getDataType();
          bool3 = ((DataType)localObject1).equals(localObject2);
          if (!bool3) {
            break label83;
          }
        }
      }
      bool2 = bool1;
      label83:
      zzx.zza(bool2, "Specified data type is incompatible with specified data source");
      localObject1 = new com/google/android/gms/fitness/request/SensorRequest;
      ((SensorRequest)localObject1).<init>(this, null);
      return (SensorRequest)localObject1;
      bool3 = false;
      localObject1 = null;
    }
  }
  
  public Builder setAccuracyMode(int paramInt)
  {
    int i = SensorRequest.zzfB(paramInt);
    this.zzaxp = i;
    return this;
  }
  
  public Builder setDataSource(DataSource paramDataSource)
  {
    this.zzavU = paramDataSource;
    return this;
  }
  
  public Builder setDataType(DataType paramDataType)
  {
    this.zzavT = paramDataType;
    return this;
  }
  
  public Builder setFastestRate(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    if (paramInt >= 0) {}
    for (boolean bool2 = bool1;; bool2 = false)
    {
      zzx.zzb(bool2, "Cannot use a negative interval");
      this.zzaBr = bool1;
      long l = paramInt;
      l = paramTimeUnit.toMicros(l);
      this.zzaBl = l;
      return this;
    }
  }
  
  public Builder setMaxDeliveryLatency(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot use a negative delivery interval");
      long l = paramInt;
      l = paramTimeUnit.toMicros(l);
      this.zzaBk = l;
      return this;
    }
  }
  
  public Builder setSamplingRate(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = 0L;
    boolean bool = paramLong < l1;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      String str = "Cannot use a negative sampling interval";
      zzx.zzb(bool, str);
      l1 = paramTimeUnit.toMicros(paramLong);
      this.zzaxo = l1;
      bool = this.zzaBr;
      if (!bool)
      {
        l1 = this.zzaxo;
        long l2 = 2;
        l1 /= l2;
        this.zzaBl = l1;
      }
      return this;
    }
  }
  
  public Builder setTimeout(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    long l1 = 0L;
    boolean bool2 = paramLong < l1;
    if (bool2)
    {
      bool2 = bool1;
      String str = "Invalid time out value specified: %d";
      Object[] arrayOfObject = new Object[bool1];
      Long localLong = Long.valueOf(paramLong);
      arrayOfObject[0] = localLong;
      zzx.zzb(bool2, str, arrayOfObject);
      if (paramTimeUnit == null) {
        break label85;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Invalid time unit specified");
      long l2 = paramTimeUnit.toMicros(paramLong);
      this.zzaBq = l2;
      return this;
      bool2 = false;
      break;
      label85:
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SensorRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */