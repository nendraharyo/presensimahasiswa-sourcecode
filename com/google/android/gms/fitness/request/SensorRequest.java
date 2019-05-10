package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
  public static final int ACCURACY_MODE_DEFAULT = 2;
  public static final int ACCURACY_MODE_HIGH = 3;
  public static final int ACCURACY_MODE_LOW = 1;
  private final long zzaBk;
  private final long zzaBl;
  private final LocationRequest zzaBp;
  private final long zzaBq;
  private final DataType zzavT;
  private final DataSource zzavU;
  private final long zzaxo;
  private final int zzaxp;
  
  private SensorRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    this.zzaBp = paramLocationRequest;
    Object localObject = TimeUnit.MILLISECONDS;
    long l2 = paramLocationRequest.getInterval();
    long l3 = ((TimeUnit)localObject).toMicros(l2);
    this.zzaxo = l3;
    localObject = TimeUnit.MILLISECONDS;
    l2 = paramLocationRequest.getFastestInterval();
    l3 = ((TimeUnit)localObject).toMicros(l2);
    this.zzaBl = l3;
    l3 = this.zzaxo;
    this.zzaBk = l3;
    localObject = paramDataSource.getDataType();
    this.zzavT = ((DataType)localObject);
    int i = zza(paramLocationRequest);
    this.zzaxp = i;
    this.zzavU = paramDataSource;
    l3 = paramLocationRequest.getExpirationTime();
    boolean bool = l3 < l1;
    if (!bool) {}
    for (this.zzaBq = l1;; this.zzaBq = l3)
    {
      return;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      l1 = SystemClock.elapsedRealtime();
      l3 -= l1;
      l3 = localTimeUnit.toMicros(l3);
    }
  }
  
  private SensorRequest(SensorRequest.Builder paramBuilder)
  {
    Object localObject = SensorRequest.Builder.zza(paramBuilder);
    this.zzavU = ((DataSource)localObject);
    localObject = SensorRequest.Builder.zzb(paramBuilder);
    this.zzavT = ((DataType)localObject);
    long l = SensorRequest.Builder.zzc(paramBuilder);
    this.zzaxo = l;
    l = SensorRequest.Builder.zzd(paramBuilder);
    this.zzaBl = l;
    l = SensorRequest.Builder.zze(paramBuilder);
    this.zzaBk = l;
    int i = SensorRequest.Builder.zzf(paramBuilder);
    this.zzaxp = i;
    this.zzaBp = null;
    l = SensorRequest.Builder.zzg(paramBuilder);
    this.zzaBq = l;
  }
  
  public static SensorRequest fromLocationRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    SensorRequest localSensorRequest = new com/google/android/gms/fitness/request/SensorRequest;
    localSensorRequest.<init>(paramDataSource, paramLocationRequest);
    return localSensorRequest;
  }
  
  private static int zza(LocationRequest paramLocationRequest)
  {
    int i = paramLocationRequest.getPriority();
    switch (i)
    {
    default: 
      i = 2;
    }
    for (;;)
    {
      return i;
      i = 3;
      continue;
      i = 1;
    }
  }
  
  private boolean zza(SensorRequest paramSensorRequest)
  {
    Object localObject1 = this.zzavU;
    Object localObject2 = paramSensorRequest.zzavU;
    boolean bool1 = zzw.equal(localObject1, localObject2);
    boolean bool2;
    if (bool1)
    {
      localObject1 = this.zzavT;
      localObject2 = paramSensorRequest.zzavT;
      bool1 = zzw.equal(localObject1, localObject2);
      if (bool1)
      {
        long l1 = this.zzaxo;
        long l2 = paramSensorRequest.zzaxo;
        bool1 = l1 < l2;
        if (!bool1)
        {
          l1 = this.zzaBl;
          l2 = paramSensorRequest.zzaBl;
          bool1 = l1 < l2;
          if (!bool1)
          {
            l1 = this.zzaBk;
            l2 = paramSensorRequest.zzaBk;
            bool1 = l1 < l2;
            if (!bool1)
            {
              int i = this.zzaxp;
              int j = paramSensorRequest.zzaxp;
              if (i == j)
              {
                localObject1 = this.zzaBp;
                localObject2 = paramSensorRequest.zzaBp;
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  l1 = this.zzaBq;
                  l2 = paramSensorRequest.zzaBq;
                  bool2 = l1 < l2;
                  if (!bool2) {
                    bool2 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public static int zzfB(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      paramInt = 2;
    }
    return paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof SensorRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SensorRequest)paramObject;
      bool = zza((SensorRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int getAccuracyMode()
  {
    return this.zzaxp;
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
  }
  
  public long getFastestRate(TimeUnit paramTimeUnit)
  {
    long l = this.zzaBl;
    TimeUnit localTimeUnit = TimeUnit.MICROSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public long getMaxDeliveryLatency(TimeUnit paramTimeUnit)
  {
    long l = this.zzaBk;
    TimeUnit localTimeUnit = TimeUnit.MICROSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public long getSamplingRate(TimeUnit paramTimeUnit)
  {
    long l = this.zzaxo;
    TimeUnit localTimeUnit = TimeUnit.MICROSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = this.zzavT;
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaxo);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzaBl);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzaBk);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(this.zzaxp);
    arrayOfObject[5] = localObject;
    localObject = this.zzaBp;
    arrayOfObject[6] = localObject;
    localObject = Long.valueOf(this.zzaBq);
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzavU;
    localzza = localzza.zzg("dataSource", localObject);
    localObject = this.zzavT;
    localzza = localzza.zzg("dataType", localObject);
    localObject = Long.valueOf(this.zzaxo);
    localzza = localzza.zzg("samplingRateMicros", localObject);
    localObject = Long.valueOf(this.zzaBk);
    localzza = localzza.zzg("deliveryLatencyMicros", localObject);
    localObject = Long.valueOf(this.zzaBq);
    return localzza.zzg("timeOutMicros", localObject).toString();
  }
  
  public long zzvc()
  {
    return this.zzaBq;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SensorRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */