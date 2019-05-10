package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.concurrent.TimeUnit;

public class DataUpdateNotification
  implements SafeParcelable
{
  public static final String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
  public static final Parcelable.Creator CREATOR;
  public static final String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
  public static final int OPERATION_DELETE = 2;
  public static final int OPERATION_INSERT = 1;
  public static final int OPERATION_UPDATE = 3;
  final int mVersionCode;
  private final DataType zzavT;
  private final DataSource zzavU;
  private final long zzawF;
  private final long zzawG;
  private final int zzawH;
  
  static
  {
    zzh localzzh = new com/google/android/gms/fitness/data/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  DataUpdateNotification(int paramInt1, long paramLong1, long paramLong2, int paramInt2, DataSource paramDataSource, DataType paramDataType)
  {
    this.mVersionCode = paramInt1;
    this.zzawF = paramLong1;
    this.zzawG = paramLong2;
    this.zzawH = paramInt2;
    this.zzavU = paramDataSource;
    this.zzavT = paramDataType;
  }
  
  public static DataUpdateNotification getDataUpdateNotification(Intent paramIntent)
  {
    Parcelable.Creator localCreator = CREATOR;
    return (DataUpdateNotification)zzc.zza(paramIntent, "vnd.google.fitness.data_udpate_notification", localCreator);
  }
  
  private boolean zza(DataUpdateNotification paramDataUpdateNotification)
  {
    long l1 = this.zzawF;
    long l2 = paramDataUpdateNotification.zzawF;
    boolean bool1 = l1 < l2;
    Object localObject1;
    boolean bool2;
    if (!bool1)
    {
      l1 = this.zzawG;
      l2 = paramDataUpdateNotification.zzawG;
      bool1 = l1 < l2;
      if (!bool1)
      {
        int i = this.zzawH;
        int j = paramDataUpdateNotification.zzawH;
        if (i == j)
        {
          localObject1 = this.zzavU;
          Object localObject2 = paramDataUpdateNotification.zzavU;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.zzavT;
            localObject2 = paramDataUpdateNotification.zzavT;
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2) {
              bool2 = true;
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
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataUpdateNotification;
      if (!bool) {
        break label33;
      }
      paramObject = (DataUpdateNotification)paramObject;
      bool = zza((DataUpdateNotification)paramObject);
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
    return this.zzavT;
  }
  
  public int getOperationType()
  {
    return this.zzawH;
  }
  
  public long getUpdateEndTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzawG;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public long getUpdateStartTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzawF;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Long.valueOf(this.zzawF);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzawG);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzawH);
    arrayOfObject[2] = localObject;
    localObject = this.zzavU;
    arrayOfObject[3] = localObject;
    localObject = this.zzavT;
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.zzawF);
    localzza = localzza.zzg("updateStartTimeNanos", localObject);
    localObject = Long.valueOf(this.zzawG);
    localzza = localzza.zzg("updateEndTimeNanos", localObject);
    localObject = Integer.valueOf(this.zzawH);
    localzza = localzza.zzg("operationType", localObject);
    localObject = this.zzavU;
    localzza = localzza.zzg("dataSource", localObject);
    localObject = this.zzavT;
    return localzza.zzg("dataType", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public long zzup()
  {
    return this.zzawF;
  }
  
  public long zzuq()
  {
    return this.zzawG;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\DataUpdateNotification.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */