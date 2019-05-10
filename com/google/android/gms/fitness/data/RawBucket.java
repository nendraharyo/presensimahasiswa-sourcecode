package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawBucket
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final long zzRD;
  public final long zzavV;
  public final Session zzavX;
  public final List zzawg;
  public final int zzawh;
  public final boolean zzawi;
  public final int zzaxf;
  
  static
  {
    zzn localzzn = new com/google/android/gms/fitness/data/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  public RawBucket(int paramInt1, long paramLong1, long paramLong2, Session paramSession, int paramInt2, List paramList, int paramInt3, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.zzavX = paramSession;
    this.zzaxf = paramInt2;
    this.zzawg = paramList;
    this.zzawh = paramInt3;
    this.zzawi = paramBoolean;
  }
  
  public RawBucket(Bucket paramBucket, List paramList1, List paramList2)
  {
    this.mVersionCode = 2;
    Object localObject1 = TimeUnit.MILLISECONDS;
    long l = paramBucket.getStartTime((TimeUnit)localObject1);
    this.zzRD = l;
    localObject1 = TimeUnit.MILLISECONDS;
    l = paramBucket.getEndTime((TimeUnit)localObject1);
    this.zzavV = l;
    localObject1 = paramBucket.getSession();
    this.zzavX = ((Session)localObject1);
    int i = paramBucket.zzub();
    this.zzaxf = i;
    i = paramBucket.getBucketType();
    this.zzawh = i;
    boolean bool = paramBucket.zzuc();
    this.zzawi = bool;
    localObject1 = paramBucket.getDataSets();
    Object localObject2 = new java/util/ArrayList;
    int j = ((List)localObject1).size();
    ((ArrayList)localObject2).<init>(j);
    this.zzawg = ((List)localObject2);
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (DataSet)((Iterator)localObject2).next();
      List localList = this.zzawg;
      RawDataSet localRawDataSet = new com/google/android/gms/fitness/data/RawDataSet;
      localRawDataSet.<init>((DataSet)localObject1, paramList1, paramList2);
      localList.add(localRawDataSet);
    }
  }
  
  private boolean zza(RawBucket paramRawBucket)
  {
    long l1 = this.zzRD;
    long l2 = paramRawBucket.zzRD;
    boolean bool1 = l1 < l2;
    List localList1;
    boolean bool3;
    if (!bool1)
    {
      l1 = this.zzavV;
      l2 = paramRawBucket.zzavV;
      bool1 = l1 < l2;
      if (!bool1)
      {
        int i = this.zzaxf;
        int k = paramRawBucket.zzaxf;
        if (i == k)
        {
          localList1 = this.zzawg;
          List localList2 = paramRawBucket.zzawg;
          boolean bool2 = zzw.equal(localList1, localList2);
          if (bool2)
          {
            int j = this.zzawh;
            k = paramRawBucket.zzawh;
            if (j == k)
            {
              bool3 = this.zzawi;
              boolean bool4 = paramRawBucket.zzawi;
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
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof RawBucket;
      if (!bool) {
        break label33;
      }
      paramObject = (RawBucket)paramObject;
      bool = zza((RawBucket)paramObject);
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
    Object[] arrayOfObject = new Object[3];
    Object localObject = Long.valueOf(this.zzRD);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzavV);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzawh);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.zzRD);
    localzza = localzza.zzg("startTime", localObject);
    localObject = Long.valueOf(this.zzavV);
    localzza = localzza.zzg("endTime", localObject);
    localObject = Integer.valueOf(this.zzaxf);
    localzza = localzza.zzg("activity", localObject);
    localObject = this.zzawg;
    localzza = localzza.zzg("dataSets", localObject);
    localObject = Integer.valueOf(this.zzawh);
    localzza = localzza.zzg("bucketType", localObject);
    localObject = Boolean.valueOf(this.zzawi);
    return localzza.zzg("serverHasMoreData", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\RawBucket.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */