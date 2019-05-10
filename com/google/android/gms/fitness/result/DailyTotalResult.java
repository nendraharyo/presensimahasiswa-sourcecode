package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;

public class DailyTotalResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final DataSet zzaxn;
  
  static
  {
    zzb localzzb = new com/google/android/gms/fitness/result/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  DailyTotalResult(int paramInt, Status paramStatus, DataSet paramDataSet)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzaxn = paramDataSet;
  }
  
  public DailyTotalResult(DataSet paramDataSet, Status paramStatus)
  {
    this.mVersionCode = 1;
    this.zzUX = paramStatus;
    this.zzaxn = paramDataSet;
  }
  
  public static DailyTotalResult zza(Status paramStatus, DataType paramDataType)
  {
    Object localObject = new com/google/android/gms/fitness/data/DataSource$Builder;
    ((DataSource.Builder)localObject).<init>();
    localObject = ((DataSource.Builder)localObject).setDataType(paramDataType).setType(1).build();
    DailyTotalResult localDailyTotalResult = new com/google/android/gms/fitness/result/DailyTotalResult;
    localObject = DataSet.create((DataSource)localObject);
    localDailyTotalResult.<init>((DataSet)localObject, paramStatus);
    return localDailyTotalResult;
  }
  
  private boolean zzb(DailyTotalResult paramDailyTotalResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramDailyTotalResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaxn;
      localObject2 = paramDailyTotalResult.zzaxn;
      bool = zzw.equal(localObject1, localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
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
      bool = paramObject instanceof DailyTotalResult;
      if (!bool) {
        break label33;
      }
      paramObject = (DailyTotalResult)paramObject;
      bool = zzb((DailyTotalResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public DataSet getTotal()
  {
    return this.zzaxn;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzUX;
    arrayOfObject[0] = localObject;
    localObject = this.zzaxn;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaxn;
    return localzza.zzg("dataPoint", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\DailyTotalResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */