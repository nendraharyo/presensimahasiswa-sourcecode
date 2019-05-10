package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

public final class RawDataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final boolean zzawi;
  public final int zzaxg;
  public final int zzaxi;
  public final List zzaxj;
  
  static
  {
    zzp localzzp = new com/google/android/gms/fitness/data/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  public RawDataSet(int paramInt1, int paramInt2, int paramInt3, List paramList, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzaxg = paramInt2;
    this.zzaxi = paramInt3;
    this.zzaxj = paramList;
    this.zzawi = paramBoolean;
  }
  
  public RawDataSet(DataSet paramDataSet, List paramList1, List paramList2)
  {
    this.mVersionCode = 3;
    List localList = paramDataSet.zzv(paramList1);
    this.zzaxj = localList;
    boolean bool = paramDataSet.zzuc();
    this.zzawi = bool;
    int i = zzt.zza(paramDataSet.getDataSource(), paramList1);
    this.zzaxg = i;
    i = zzt.zza(paramDataSet.getDataType(), paramList2);
    this.zzaxi = i;
  }
  
  private boolean zza(RawDataSet paramRawDataSet)
  {
    int i = this.zzaxg;
    int j = paramRawDataSet.zzaxg;
    boolean bool1;
    List localList1;
    if (i == j)
    {
      bool1 = this.zzawi;
      boolean bool2 = paramRawDataSet.zzawi;
      if (bool1 == bool2)
      {
        localList1 = this.zzaxj;
        List localList2 = paramRawDataSet.zzaxj;
        bool1 = zzw.equal(localList1, localList2);
        if (bool1) {
          bool1 = true;
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localList1 = null;
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
      bool = paramObject instanceof RawDataSet;
      if (!bool) {
        break label33;
      }
      paramObject = (RawDataSet)paramObject;
      bool = zza((RawDataSet)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(this.zzaxg);
    arrayOfObject[0] = localInteger;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Integer.valueOf(this.zzaxg);
    arrayOfObject[0] = localObject;
    localObject = this.zzaxj;
    arrayOfObject[1] = localObject;
    return String.format("RawDataSet{%s@[%s]}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\RawDataSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */