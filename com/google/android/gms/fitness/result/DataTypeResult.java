package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataType;

public class DataTypeResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final DataType zzavT;
  
  static
  {
    zzg localzzg = new com/google/android/gms/fitness/result/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  DataTypeResult(int paramInt, Status paramStatus, DataType paramDataType)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzavT = paramDataType;
  }
  
  public DataTypeResult(Status paramStatus, DataType paramDataType)
  {
    this.mVersionCode = 2;
    this.zzUX = paramStatus;
    this.zzavT = paramDataType;
  }
  
  public static DataTypeResult zzS(Status paramStatus)
  {
    DataTypeResult localDataTypeResult = new com/google/android/gms/fitness/result/DataTypeResult;
    localDataTypeResult.<init>(paramStatus, null);
    return localDataTypeResult;
  }
  
  private boolean zzb(DataTypeResult paramDataTypeResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramDataTypeResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzavT;
      localObject2 = paramDataTypeResult.zzavT;
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
      bool = paramObject instanceof DataTypeResult;
      if (!bool) {
        break label33;
      }
      paramObject = (DataTypeResult)paramObject;
      bool = zzb((DataTypeResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
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
    localObject = this.zzavT;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzavT;
    return localzza.zzg("dataType", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\DataTypeResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */