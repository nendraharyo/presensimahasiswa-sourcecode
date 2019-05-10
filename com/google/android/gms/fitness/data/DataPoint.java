package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzns;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final DataSource zzavU;
  private long zzawj;
  private long zzawk;
  private final Value[] zzawl;
  private DataSource zzawm;
  private long zzawn;
  private long zzawo;
  
  static
  {
    zzd localzzd = new com/google/android/gms/fitness/data/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  DataPoint(int paramInt, DataSource paramDataSource1, long paramLong1, long paramLong2, Value[] paramArrayOfValue, DataSource paramDataSource2, long paramLong3, long paramLong4)
  {
    this.mVersionCode = paramInt;
    this.zzavU = paramDataSource1;
    this.zzawm = paramDataSource2;
    this.zzawj = paramLong1;
    this.zzawk = paramLong2;
    this.zzawl = paramArrayOfValue;
    this.zzawn = paramLong3;
    this.zzawo = paramLong4;
  }
  
  private DataPoint(DataSource paramDataSource)
  {
    this.mVersionCode = 4;
    Object localObject = (DataSource)zzx.zzb(paramDataSource, "Data source cannot be null");
    this.zzavU = ((DataSource)localObject);
    List localList = paramDataSource.getDataType().getFields();
    localObject = new Value[localList.size()];
    this.zzawl = ((Value[])localObject);
    boolean bool = false;
    localObject = null;
    Iterator localIterator = localList.iterator();
    int j = 0;
    localList = null;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Field)localIterator.next();
      Value[] arrayOfValue = this.zzawl;
      Value localValue = new com/google/android/gms/fitness/data/Value;
      int i = ((Field)localObject).getFormat();
      localValue.<init>(i);
      arrayOfValue[j] = localValue;
      i = j + 1;
      j = i;
    }
  }
  
  public DataPoint(DataSource paramDataSource1, DataSource paramDataSource2, RawDataPoint paramRawDataPoint)
  {
    this(4, paramDataSource1, l1, l2, arrayOfValue, paramDataSource2, l3, l4);
  }
  
  DataPoint(List paramList, RawDataPoint paramRawDataPoint)
  {
    this(localDataSource1, localDataSource2, paramRawDataPoint);
  }
  
  public static DataPoint create(DataSource paramDataSource)
  {
    DataPoint localDataPoint = new com/google/android/gms/fitness/data/DataPoint;
    localDataPoint.<init>(paramDataSource);
    return localDataPoint;
  }
  
  public static DataPoint extract(Intent paramIntent)
  {
    if (paramIntent == null) {}
    Parcelable.Creator localCreator;
    for (DataPoint localDataPoint = null;; localDataPoint = (DataPoint)zzc.zza(paramIntent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", localCreator))
    {
      return localDataPoint;
      localCreator = CREATOR;
    }
  }
  
  private static long zza(Long paramLong, long paramLong1)
  {
    if (paramLong != null) {
      paramLong1 = paramLong.longValue();
    }
    return paramLong1;
  }
  
  private static DataSource zza(List paramList, int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      i = paramList.size();
      if (paramInt >= i) {}
    }
    for (DataSource localDataSource = (DataSource)paramList.get(paramInt);; localDataSource = null)
    {
      return localDataSource;
      i = 0;
    }
  }
  
  private boolean zza(DataPoint paramDataPoint)
  {
    Object localObject1 = this.zzavU;
    Object localObject2 = paramDataPoint.zzavU;
    boolean bool = zzw.equal(localObject1, localObject2);
    if (bool)
    {
      long l1 = this.zzawj;
      long l2 = paramDataPoint.zzawj;
      bool = l1 < l2;
      if (!bool)
      {
        l1 = this.zzawk;
        l2 = paramDataPoint.zzawk;
        bool = l1 < l2;
        if (!bool)
        {
          localObject1 = this.zzawl;
          localObject2 = paramDataPoint.zzawl;
          bool = Arrays.equals((Object[])localObject1, (Object[])localObject2);
          if (bool)
          {
            localObject1 = getOriginalDataSource();
            localObject2 = paramDataPoint.getOriginalDataSource();
            bool = zzw.equal(localObject1, localObject2);
            if (bool) {
              bool = true;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  private void zzeO(int paramInt)
  {
    boolean bool1 = true;
    Integer localInteger1 = null;
    DataType localDataType = getDataType();
    List localList = localDataType.getFields();
    int i = localList.size();
    boolean bool2;
    if (paramInt == i) {
      bool2 = bool1;
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[3];
      Integer localInteger2 = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger2;
      localInteger1 = Integer.valueOf(i);
      arrayOfObject[bool1] = localInteger1;
      arrayOfObject[2] = localList;
      zzx.zzb(bool2, "Attempting to insert %s values, but needed %s: %s", arrayOfObject);
      return;
      bool2 = false;
      localDataType = null;
    }
  }
  
  private boolean zzue()
  {
    DataType localDataType1 = getDataType();
    DataType localDataType2 = DataType.TYPE_LOCATION_SAMPLE;
    boolean bool;
    if (localDataType1 == localDataType2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataType1 = null;
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
      bool = paramObject instanceof DataPoint;
      if (!bool) {
        break label33;
      }
      paramObject = (DataPoint)paramObject;
      bool = zza((DataPoint)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  public DataType getDataType()
  {
    return this.zzavU.getDataType();
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzawj;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public DataSource getOriginalDataSource()
  {
    DataSource localDataSource = this.zzawm;
    if (localDataSource != null) {}
    for (localDataSource = this.zzawm;; localDataSource = this.zzavU) {
      return localDataSource;
    }
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzawk;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public long getTimestamp(TimeUnit paramTimeUnit)
  {
    long l = this.zzawj;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public long getTimestampNanos()
  {
    return this.zzawj;
  }
  
  public Value getValue(Field paramField)
  {
    int i = getDataType().indexOf(paramField);
    return this.zzawl[i];
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzawj);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzawk);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public DataPoint setFloatValues(float... paramVarArgs)
  {
    int i = paramVarArgs.length;
    zzeO(i);
    i = 0;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      Value localValue = this.zzawl[i];
      float f = paramVarArgs[i];
      localValue.setFloat(f);
      i += 1;
    }
    return this;
  }
  
  public DataPoint setIntValues(int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    zzeO(i);
    i = 0;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      Value localValue = this.zzawl[i];
      int k = paramVarArgs[i];
      localValue.setInt(k);
      i += 1;
    }
    return this;
  }
  
  public DataPoint setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    long l = paramTimeUnit.toNanos(paramLong1);
    this.zzawk = l;
    l = paramTimeUnit.toNanos(paramLong2);
    this.zzawj = l;
    return this;
  }
  
  public DataPoint setTimestamp(long paramLong, TimeUnit paramTimeUnit)
  {
    long l = paramTimeUnit.toNanos(paramLong);
    this.zzawj = l;
    boolean bool = zzue();
    if (bool)
    {
      bool = zzns.zza(paramTimeUnit);
      if (bool)
      {
        String str1 = "Fitness";
        String str2 = "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.";
        Log.w(str1, str2);
        l = this.zzawj;
        TimeUnit localTimeUnit1 = TimeUnit.NANOSECONDS;
        TimeUnit localTimeUnit2 = TimeUnit.MILLISECONDS;
        l = zzns.zza(l, localTimeUnit1, localTimeUnit2);
        this.zzawj = l;
      }
    }
    return this;
  }
  
  public String toString()
  {
    String str = "DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}";
    Object[] arrayOfObject = new Object[7];
    Object localObject1 = Arrays.toString(this.zzawl);
    arrayOfObject[0] = localObject1;
    localObject1 = Long.valueOf(this.zzawk);
    arrayOfObject[1] = localObject1;
    localObject1 = Long.valueOf(this.zzawj);
    arrayOfObject[2] = localObject1;
    localObject1 = Long.valueOf(this.zzawn);
    arrayOfObject[3] = localObject1;
    long l = this.zzawo;
    localObject1 = Long.valueOf(l);
    arrayOfObject[4] = localObject1;
    int i = 5;
    localObject1 = this.zzavU.toDebugString();
    arrayOfObject[i] = localObject1;
    int j = 6;
    Object localObject2 = this.zzawm;
    if (localObject2 != null) {}
    for (localObject2 = this.zzawm.toDebugString();; localObject2 = "N/A")
    {
      arrayOfObject[j] = localObject2;
      return String.format(str, arrayOfObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public Value[] zzuf()
  {
    return this.zzawl;
  }
  
  public long zzug()
  {
    return this.zzawn;
  }
  
  public long zzuh()
  {
    return this.zzawo;
  }
  
  public void zzui()
  {
    boolean bool1 = true;
    Object localObject = getDataSource();
    String str = getDataType().getName();
    localObject = ((DataSource)localObject).getDataType().getName();
    boolean bool2 = str.equals(localObject);
    str = "Conflicting data types found %s vs %s";
    int i = 2;
    Object[] arrayOfObject1 = new Object[i];
    DataType localDataType = getDataType();
    arrayOfObject1[0] = localDataType;
    localDataType = getDataType();
    arrayOfObject1[bool1] = localDataType;
    zzx.zzb(bool2, str, arrayOfObject1);
    long l1 = this.zzawj;
    long l2 = 0L;
    bool2 = l1 < l2;
    if (bool2)
    {
      bool2 = bool1;
      str = "Data point does not have the timestamp set: %s";
      arrayOfObject1 = new Object[bool1];
      arrayOfObject1[0] = this;
      zzx.zzb(bool2, str, arrayOfObject1);
      l1 = this.zzawk;
      l2 = this.zzawj;
      bool2 = l1 < l2;
      if (bool2) {
        break label180;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      Object[] arrayOfObject2 = new Object[bool1];
      arrayOfObject2[0] = this;
      zzx.zzb(bool2, "Data point with start time greater than end time found: %s", arrayOfObject2);
      return;
      bool2 = false;
      localObject = null;
      break;
      label180:
      bool2 = false;
      localObject = null;
    }
  }
  
  public long zzuj()
  {
    return this.zzawk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\DataPoint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */