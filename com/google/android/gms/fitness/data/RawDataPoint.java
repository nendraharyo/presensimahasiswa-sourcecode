package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawDataPoint
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final long zzawj;
  public final long zzawk;
  public final Value[] zzawl;
  public final long zzawn;
  public final long zzawo;
  public final int zzaxg;
  public final int zzaxh;
  
  static
  {
    zzo localzzo = new com/google/android/gms/fitness/data/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  public RawDataPoint(int paramInt1, long paramLong1, long paramLong2, Value[] paramArrayOfValue, int paramInt2, int paramInt3, long paramLong3, long paramLong4)
  {
    this.mVersionCode = paramInt1;
    this.zzawj = paramLong1;
    this.zzawk = paramLong2;
    this.zzaxg = paramInt2;
    this.zzaxh = paramInt3;
    this.zzawn = paramLong3;
    this.zzawo = paramLong4;
    this.zzawl = paramArrayOfValue;
  }
  
  RawDataPoint(DataPoint paramDataPoint, List paramList)
  {
    this.mVersionCode = 4;
    Object localObject = TimeUnit.NANOSECONDS;
    long l = paramDataPoint.getTimestamp((TimeUnit)localObject);
    this.zzawj = l;
    localObject = TimeUnit.NANOSECONDS;
    l = paramDataPoint.getStartTime((TimeUnit)localObject);
    this.zzawk = l;
    localObject = paramDataPoint.zzuf();
    this.zzawl = ((Value[])localObject);
    int i = zzt.zza(paramDataPoint.getDataSource(), paramList);
    this.zzaxg = i;
    i = zzt.zza(paramDataPoint.getOriginalDataSource(), paramList);
    this.zzaxh = i;
    l = paramDataPoint.zzug();
    this.zzawn = l;
    l = paramDataPoint.zzuh();
    this.zzawo = l;
  }
  
  private boolean zza(RawDataPoint paramRawDataPoint)
  {
    long l1 = this.zzawj;
    long l2 = paramRawDataPoint.zzawj;
    boolean bool1 = l1 < l2;
    Value[] arrayOfValue1;
    boolean bool2;
    if (!bool1)
    {
      l1 = this.zzawk;
      l2 = paramRawDataPoint.zzawk;
      bool1 = l1 < l2;
      if (!bool1)
      {
        arrayOfValue1 = this.zzawl;
        Value[] arrayOfValue2 = paramRawDataPoint.zzawl;
        bool1 = Arrays.equals(arrayOfValue1, arrayOfValue2);
        if (bool1)
        {
          int i = this.zzaxg;
          int j = paramRawDataPoint.zzaxg;
          if (i == j)
          {
            i = this.zzaxh;
            j = paramRawDataPoint.zzaxh;
            if (i == j)
            {
              l1 = this.zzawn;
              l2 = paramRawDataPoint.zzawn;
              bool2 = l1 < l2;
              if (!bool2) {
                bool2 = true;
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
      arrayOfValue1 = null;
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
      bool = paramObject instanceof RawDataPoint;
      if (!bool) {
        break label33;
      }
      paramObject = (RawDataPoint)paramObject;
      bool = zza((RawDataPoint)paramObject);
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
    Object[] arrayOfObject = new Object[2];
    Long localLong = Long.valueOf(this.zzawj);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(this.zzawk);
    arrayOfObject[1] = localLong;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Arrays.toString(this.zzawl);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzawk);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzawj);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzaxg);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzaxh);
    arrayOfObject[4] = localObject;
    return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\RawDataPoint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */