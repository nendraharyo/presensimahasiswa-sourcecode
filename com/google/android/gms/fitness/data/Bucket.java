package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int TYPE_ACTIVITY_SEGMENT = 4;
  public static final int TYPE_ACTIVITY_TYPE = 3;
  public static final int TYPE_SESSION = 2;
  public static final int TYPE_TIME = 1;
  private final int mVersionCode;
  private final long zzRD;
  private final long zzavV;
  private final Session zzavX;
  private final int zzawf;
  private final List zzawg;
  private final int zzawh;
  private boolean zzawi = false;
  
  static
  {
    zzc localzzc = new com/google/android/gms/fitness/data/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  Bucket(int paramInt1, long paramLong1, long paramLong2, Session paramSession, int paramInt2, List paramList, int paramInt3, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.zzavX = paramSession;
    this.zzawf = paramInt2;
    this.zzawg = paramList;
    this.zzawh = paramInt3;
    this.zzawi = paramBoolean;
  }
  
  public Bucket(RawBucket paramRawBucket, List paramList)
  {
    this(2, l1, l2, localSession, i, localList, j, bool);
  }
  
  private static List zza(Collection paramCollection, List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramCollection.size();
    localArrayList.<init>(i);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      RawDataSet localRawDataSet = (RawDataSet)localIterator.next();
      DataSet localDataSet = new com/google/android/gms/fitness/data/DataSet;
      localDataSet.<init>(localRawDataSet, paramList);
      localArrayList.add(localDataSet);
    }
    return localArrayList;
  }
  
  private boolean zza(Bucket paramBucket)
  {
    long l1 = this.zzRD;
    long l2 = paramBucket.zzRD;
    boolean bool1 = l1 < l2;
    List localList1;
    boolean bool3;
    if (!bool1)
    {
      l1 = this.zzavV;
      l2 = paramBucket.zzavV;
      bool1 = l1 < l2;
      if (!bool1)
      {
        int i = this.zzawf;
        int k = paramBucket.zzawf;
        if (i == k)
        {
          localList1 = this.zzawg;
          List localList2 = paramBucket.zzawg;
          boolean bool2 = zzw.equal(localList1, localList2);
          if (bool2)
          {
            int j = this.zzawh;
            k = paramBucket.zzawh;
            if (j == k)
            {
              bool3 = this.zzawi;
              boolean bool4 = paramBucket.zzawi;
              if (bool3 == bool4) {
                bool3 = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool3;
      bool3 = false;
      localList1 = null;
    }
  }
  
  public static String zzeM(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "bug";
    }
    for (;;)
    {
      return str;
      str = "time";
      continue;
      str = "type";
      continue;
      str = "segment";
      continue;
      str = "session";
      continue;
      str = "unknown";
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
      bool = paramObject instanceof Bucket;
      if (!bool) {
        break label33;
      }
      paramObject = (Bucket)paramObject;
      bool = zza((Bucket)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String getActivity()
  {
    return FitnessActivities.getName(this.zzawf);
  }
  
  public int getBucketType()
  {
    return this.zzawh;
  }
  
  public DataSet getDataSet(DataType paramDataType)
  {
    Object localObject = this.zzawg;
    Iterator localIterator = ((List)localObject).iterator();
    boolean bool1;
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (DataSet)localIterator.next();
      DataType localDataType = ((DataSet)localObject).getDataType();
      bool2 = localDataType.equals(paramDataType);
    } while (!bool2);
    for (;;)
    {
      return (DataSet)localObject;
      bool1 = false;
      localObject = null;
    }
  }
  
  public List getDataSets()
  {
    return this.zzawg;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzavV;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public Session getSession()
  {
    return this.zzavX;
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
    Object[] arrayOfObject = new Object[4];
    Object localObject = Long.valueOf(this.zzRD);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzavV);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzawf);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzawh);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.zzRD);
    localzza = localzza.zzg("startTime", localObject);
    localObject = Long.valueOf(this.zzavV);
    localzza = localzza.zzg("endTime", localObject);
    localObject = Integer.valueOf(this.zzawf);
    localzza = localzza.zzg("activity", localObject);
    localObject = this.zzawg;
    localzza = localzza.zzg("dataSets", localObject);
    localObject = zzeM(this.zzawh);
    localzza = localzza.zzg("bucketType", localObject);
    localObject = Boolean.valueOf(this.zzawi);
    return localzza.zzg("serverHasMoreData", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzb(Bucket paramBucket)
  {
    long l1 = this.zzRD;
    long l2 = paramBucket.zzRD;
    boolean bool = l1 < l2;
    if (!bool)
    {
      l1 = this.zzavV;
      l2 = paramBucket.zzavV;
      bool = l1 < l2;
      if (!bool)
      {
        i = this.zzawf;
        int k = paramBucket.zzawf;
        if (i == k)
        {
          i = this.zzawh;
          int m = paramBucket.zzawh;
          if (i != m) {}
        }
      }
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public long zzlO()
  {
    return this.zzRD;
  }
  
  public int zzub()
  {
    return this.zzawf;
  }
  
  public boolean zzuc()
  {
    boolean bool1 = true;
    boolean bool2 = this.zzawi;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      Object localObject = this.zzawg;
      Iterator localIterator = ((List)localObject).iterator();
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (DataSet)localIterator.next();
        bool2 = ((DataSet)localObject).zzuc();
      } while (!bool2);
      bool2 = bool1;
      continue;
      bool2 = false;
      localObject = null;
    }
  }
  
  public long zzud()
  {
    return this.zzavV;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Bucket.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */