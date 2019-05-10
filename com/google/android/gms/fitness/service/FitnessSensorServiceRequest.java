package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int UNSPECIFIED = 255;
  private final int mVersionCode;
  private final long zzaBR;
  private final long zzaBS;
  private final zzk zzaBh;
  private final DataSource zzavU;
  
  static
  {
    zza localzza = new com/google/android/gms/fitness/service/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  FitnessSensorServiceRequest(int paramInt, DataSource paramDataSource, IBinder paramIBinder, long paramLong1, long paramLong2)
  {
    this.mVersionCode = paramInt;
    this.zzavU = paramDataSource;
    zzk localzzk = zzk.zza.zzbt(paramIBinder);
    this.zzaBh = localzzk;
    this.zzaBR = paramLong1;
    this.zzaBS = paramLong2;
  }
  
  private boolean zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest)
  {
    DataSource localDataSource1 = this.zzavU;
    DataSource localDataSource2 = paramFitnessSensorServiceRequest.zzavU;
    boolean bool = zzw.equal(localDataSource1, localDataSource2);
    if (bool)
    {
      long l1 = this.zzaBR;
      long l2 = paramFitnessSensorServiceRequest.zzaBR;
      bool = l1 < l2;
      if (!bool)
      {
        l1 = this.zzaBS;
        l2 = paramFitnessSensorServiceRequest.zzaBS;
        bool = l1 < l2;
        if (!bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataSource1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof FitnessSensorServiceRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (FitnessSensorServiceRequest)paramObject;
      bool = zza((FitnessSensorServiceRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public long getBatchInterval(TimeUnit paramTimeUnit)
  {
    long l = this.zzaBS;
    TimeUnit localTimeUnit = TimeUnit.MICROSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  public SensorEventDispatcher getDispatcher()
  {
    zzb localzzb = new com/google/android/gms/fitness/service/zzb;
    zzk localzzk = this.zzaBh;
    localzzb.<init>(localzzk);
    return localzzb;
  }
  
  public long getSamplingRate(TimeUnit paramTimeUnit)
  {
    long l1 = -1;
    long l2 = this.zzaBR;
    boolean bool = l2 < l1;
    if (!bool) {}
    for (;;)
    {
      return l1;
      l1 = this.zzaBR;
      TimeUnit localTimeUnit = TimeUnit.MICROSECONDS;
      l1 = paramTimeUnit.convert(l1, localTimeUnit);
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaBR);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaBS);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    DataSource localDataSource = this.zzavU;
    arrayOfObject[0] = localDataSource;
    return String.format("FitnessSensorServiceRequest{%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public long zzux()
  {
    return this.zzaBR;
  }
  
  IBinder zzvb()
  {
    return this.zzaBh.asBinder();
  }
  
  public long zzvs()
  {
    return this.zzaBS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\service\FitnessSensorServiceRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */