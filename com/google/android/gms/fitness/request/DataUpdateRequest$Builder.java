package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataUpdateRequest$Builder
{
  private long zzRD;
  private long zzavV;
  private DataSet zzaxn;
  
  private void zzuV()
  {
    long l1 = 0L;
    boolean bool1 = true;
    zzx.zza(this.zzRD, "Must set a non-zero value for startTimeMillis/startTime");
    long l2 = this.zzavV;
    zzx.zza(l2, "Must set a non-zero value for endTimeMillis/endTime");
    zzx.zzb(this.zzaxn, "Must set the data set");
    Object localObject1 = this.zzaxn.getDataPoints();
    Iterator localIterator = ((List)localObject1).iterator();
    boolean bool2 = localIterator.hasNext();
    if (bool2)
    {
      localObject1 = (DataPoint)localIterator.next();
      Object localObject2 = TimeUnit.MILLISECONDS;
      l2 = ((DataPoint)localObject1).getStartTime((TimeUnit)localObject2);
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      long l3 = ((DataPoint)localObject1).getEndTime(localTimeUnit);
      bool2 = l2 < l3;
      if (!bool2)
      {
        bool2 = l2 < l1;
        long l4;
        if (bool2)
        {
          l4 = this.zzRD;
          bool2 = l2 < l4;
          if (bool2) {}
        }
        else
        {
          bool2 = l2 < l1;
          if (bool2)
          {
            l4 = this.zzavV;
            bool2 = l2 < l4;
            if (bool2) {}
          }
          else
          {
            l4 = this.zzavV;
            bool2 = l3 < l4;
            if (!bool2)
            {
              l4 = this.zzRD;
              bool2 = l3 < l4;
              if (!bool2) {
                break label317;
              }
            }
          }
        }
      }
      bool2 = bool1;
      label219:
      if (!bool2) {
        bool2 = bool1;
      }
      for (;;)
      {
        String str = "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d";
        int i = 4;
        Object[] arrayOfObject = new Object[i];
        localObject2 = Long.valueOf(l2);
        arrayOfObject[0] = localObject2;
        localObject2 = Long.valueOf(l3);
        arrayOfObject[bool1] = localObject2;
        Long localLong = Long.valueOf(this.zzRD);
        arrayOfObject[2] = localLong;
        int j = 3;
        l3 = this.zzavV;
        localLong = Long.valueOf(l3);
        arrayOfObject[j] = localLong;
        zzx.zza(bool2, str, arrayOfObject);
        break;
        label317:
        bool2 = false;
        localObject1 = null;
        break label219;
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public DataUpdateRequest build()
  {
    zzuV();
    DataUpdateRequest localDataUpdateRequest = new com/google/android/gms/fitness/request/DataUpdateRequest;
    localDataUpdateRequest.<init>(this, null);
    return localDataUpdateRequest;
  }
  
  public Builder setDataSet(DataSet paramDataSet)
  {
    zzx.zzb(paramDataSet, "Must set the data set");
    this.zzaxn = paramDataSet;
    return this;
  }
  
  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    boolean bool1 = true;
    long l1 = 0L;
    boolean bool2 = paramLong1 < l1;
    Object localObject;
    if (bool2)
    {
      bool2 = bool1;
      String str = "Invalid start time :%d";
      localObject = new Object[bool1];
      Long localLong = Long.valueOf(paramLong1);
      localObject[0] = localLong;
      zzx.zzb(bool2, str, (Object[])localObject);
      bool2 = paramLong2 < paramLong1;
      if (bool2) {
        break label131;
      }
    }
    label131:
    for (bool2 = bool1;; bool2 = false)
    {
      Object[] arrayOfObject = new Object[bool1];
      localObject = Long.valueOf(paramLong2);
      arrayOfObject[0] = localObject;
      zzx.zzb(bool2, "Invalid end time :%d", arrayOfObject);
      long l2 = paramTimeUnit.toMillis(paramLong1);
      this.zzRD = l2;
      l2 = paramTimeUnit.toMillis(paramLong2);
      this.zzavV = l2;
      return this;
      bool2 = false;
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataUpdateRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */