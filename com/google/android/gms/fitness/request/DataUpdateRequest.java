package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.concurrent.TimeUnit;

public class DataUpdateRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final long zzRD;
  private final zzow zzaAD;
  private final long zzavV;
  private final DataSet zzaxn;
  
  static
  {
    zzm localzzm = new com/google/android/gms/fitness/request/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  DataUpdateRequest(int paramInt, long paramLong1, long paramLong2, DataSet paramDataSet, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.zzaxn = paramDataSet;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public DataUpdateRequest(long paramLong1, long paramLong2, DataSet paramDataSet, IBinder paramIBinder)
  {
    this.mVersionCode = 1;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.zzaxn = paramDataSet;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  private DataUpdateRequest(DataUpdateRequest.Builder paramBuilder)
  {
    this(l1, l2, localDataSet, null);
  }
  
  public DataUpdateRequest(DataUpdateRequest paramDataUpdateRequest, IBinder paramIBinder)
  {
    this(l1, l2, localDataSet, paramIBinder);
  }
  
  private boolean zzb(DataUpdateRequest paramDataUpdateRequest)
  {
    long l1 = this.zzRD;
    long l2 = paramDataUpdateRequest.zzRD;
    boolean bool = l1 < l2;
    DataSet localDataSet1;
    if (!bool)
    {
      l1 = this.zzavV;
      l2 = paramDataUpdateRequest.zzavV;
      bool = l1 < l2;
      if (!bool)
      {
        localDataSet1 = this.zzaxn;
        DataSet localDataSet2 = paramDataUpdateRequest.zzaxn;
        bool = zzw.equal(localDataSet1, localDataSet2);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataSet1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataUpdateRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataUpdateRequest)paramObject;
      bool = zzb((DataUpdateRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAD;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAD.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public DataSet getDataSet()
  {
    return this.zzaxn;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzavV;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzRD;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Long.valueOf(this.zzRD);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzavV);
    arrayOfObject[1] = localObject;
    localObject = this.zzaxn;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.zzRD);
    localzza = localzza.zzg("startTimeMillis", localObject);
    localObject = Long.valueOf(this.zzavV);
    localzza = localzza.zzg("endTimeMillis", localObject);
    localObject = this.zzaxn;
    return localzza.zzg("dataSet", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return this.zzRD;
  }
  
  public long zzud()
  {
    return this.zzavV;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataUpdateRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */