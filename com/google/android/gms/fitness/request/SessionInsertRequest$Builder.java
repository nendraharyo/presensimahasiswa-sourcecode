package com.google.android.gms.fitness.request;

import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest$Builder
{
  private List zzaBs;
  private List zzaBt;
  private Session zzavX;
  private List zzawg;
  
  public SessionInsertRequest$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzawg = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaBs = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaBt = localArrayList;
  }
  
  private void zzf(DataPoint paramDataPoint)
  {
    zzh(paramDataPoint);
    zzg(paramDataPoint);
  }
  
  private void zzg(DataPoint paramDataPoint)
  {
    Object localObject1 = this.zzavX;
    Object localObject2 = TimeUnit.NANOSECONDS;
    long l1 = ((Session)localObject1).getStartTime((TimeUnit)localObject2);
    localObject1 = this.zzavX;
    localObject2 = TimeUnit.NANOSECONDS;
    long l2 = ((Session)localObject1).getEndTime((TimeUnit)localObject2);
    localObject1 = TimeUnit.NANOSECONDS;
    long l3 = paramDataPoint.getStartTime((TimeUnit)localObject1);
    localObject1 = TimeUnit.NANOSECONDS;
    long l4 = paramDataPoint.getEndTime((TimeUnit)localObject1);
    long l5 = 0L;
    boolean bool = l3 < l5;
    if (bool)
    {
      l5 = 0L;
      bool = l4 < l5;
      if (bool)
      {
        localObject2 = TimeUnit.MILLISECONDS;
        bool = l4 < l2;
        if (bool)
        {
          localObject1 = TimeUnit.NANOSECONDS;
          l4 = zzns.zza(l4, (TimeUnit)localObject1, (TimeUnit)localObject2);
        }
        bool = l3 < l1;
        if (bool) {
          break label319;
        }
        bool = l4 < l2;
        if (bool) {
          break label319;
        }
        bool = true;
      }
    }
    for (;;)
    {
      String str = "Data point %s has start and end times outside session interval [%d, %d]";
      int i = 3;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramDataPoint;
      int j = 1;
      Object localObject3 = Long.valueOf(l1);
      arrayOfObject[j] = localObject3;
      int k = 2;
      Object localObject4 = Long.valueOf(l2);
      arrayOfObject[k] = localObject4;
      zzx.zza(bool, str, arrayOfObject);
      localObject1 = TimeUnit.NANOSECONDS;
      l1 = paramDataPoint.getEndTime((TimeUnit)localObject1);
      bool = l4 < l1;
      if (bool)
      {
        localObject1 = "Fitness";
        int m = 3;
        localObject4 = new Object[m];
        Object localObject5 = TimeUnit.NANOSECONDS;
        long l6 = paramDataPoint.getEndTime((TimeUnit)localObject5);
        localObject5 = Long.valueOf(l6);
        localObject4[0] = localObject5;
        localObject5 = Long.valueOf(l4);
        localObject4[1] = localObject5;
        int n = 2;
        localObject4[n] = localObject2;
        localObject2 = String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", (Object[])localObject4);
        Log.w((String)localObject1, (String)localObject2);
        localObject3 = TimeUnit.NANOSECONDS;
        localObject2 = paramDataPoint;
        paramDataPoint.setTimeInterval(l3, l4, (TimeUnit)localObject3);
      }
      return;
      label319:
      bool = false;
      localObject1 = null;
    }
  }
  
  private void zzh(DataPoint paramDataPoint)
  {
    int i = 3;
    int j = 2;
    boolean bool1 = true;
    Long localLong = null;
    Object localObject1 = this.zzavX;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    long l1 = ((Session)localObject1).getStartTime(localTimeUnit);
    localObject1 = this.zzavX;
    localTimeUnit = TimeUnit.NANOSECONDS;
    long l2 = ((Session)localObject1).getEndTime(localTimeUnit);
    localObject1 = TimeUnit.NANOSECONDS;
    long l3 = paramDataPoint.getTimestamp((TimeUnit)localObject1);
    long l4 = 0L;
    boolean bool2 = l3 < l4;
    if (bool2)
    {
      localTimeUnit = TimeUnit.MILLISECONDS;
      bool2 = l3 < l1;
      if (!bool2)
      {
        bool2 = l3 < l2;
        if (!bool2) {}
      }
      else
      {
        localObject1 = TimeUnit.NANOSECONDS;
        l3 = zzns.zza(l3, (TimeUnit)localObject1, localTimeUnit);
      }
      bool2 = l3 < l1;
      if (bool2) {
        break label315;
      }
      bool2 = l3 < l2;
      if (bool2) {
        break label315;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      String str1 = "Data point %s has time stamp outside session interval [%d, %d]";
      Object[] arrayOfObject1 = new Object[i];
      arrayOfObject1[0] = paramDataPoint;
      Object localObject2 = Long.valueOf(l1);
      arrayOfObject1[bool1] = localObject2;
      localObject2 = Long.valueOf(l2);
      arrayOfObject1[j] = localObject2;
      zzx.zza(bool2, str1, arrayOfObject1);
      localObject1 = TimeUnit.NANOSECONDS;
      l1 = paramDataPoint.getTimestamp((TimeUnit)localObject1);
      bool2 = l1 < l3;
      if (bool2)
      {
        localObject2 = "Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time";
        Object[] arrayOfObject2 = new Object[i];
        Object localObject3 = TimeUnit.NANOSECONDS;
        l2 = paramDataPoint.getTimestamp((TimeUnit)localObject3);
        localObject3 = Long.valueOf(l2);
        arrayOfObject2[0] = localObject3;
        localLong = Long.valueOf(l3);
        arrayOfObject2[bool1] = localLong;
        arrayOfObject2[j] = localTimeUnit;
        String str2 = String.format((String)localObject2, arrayOfObject2);
        Log.w("Fitness", str2);
        localObject1 = TimeUnit.NANOSECONDS;
        paramDataPoint.setTimestamp(l3, (TimeUnit)localObject1);
      }
      return;
      label315:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  private void zzvd()
  {
    Object localObject = this.zzawg;
    Iterator localIterator1 = ((List)localObject).iterator();
    boolean bool = localIterator1.hasNext();
    if (bool)
    {
      localObject = ((DataSet)localIterator1.next()).getDataPoints();
      Iterator localIterator2 = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator2.hasNext();
        if (!bool) {
          break;
        }
        localObject = (DataPoint)localIterator2.next();
        zzf((DataPoint)localObject);
      }
    }
    localObject = this.zzaBs;
    localIterator1 = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator1.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataPoint)localIterator1.next();
      zzf((DataPoint)localObject);
    }
  }
  
  public Builder addAggregateDataPoint(DataPoint paramDataPoint)
  {
    boolean bool1 = true;
    boolean bool2;
    DataSource localDataSource;
    List localList;
    if (paramDataPoint != null)
    {
      bool2 = bool1;
      zzx.zzb(bool2, "Must specify a valid aggregate data point.");
      localDataSource = paramDataPoint.getDataSource();
      localList = this.zzaBt;
      bool2 = localList.contains(localDataSource);
      if (bool2) {
        break label99;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = localDataSource;
      zzx.zza(bool2, "Data set/Aggregate data point for this data source %s is already added.", arrayOfObject);
      zznw.zze(paramDataPoint);
      this.zzaBt.add(localDataSource);
      this.zzaBs.add(paramDataPoint);
      return this;
      bool2 = false;
      localList = null;
      break;
      label99:
      bool2 = false;
      localList = null;
    }
  }
  
  public Builder addDataSet(DataSet paramDataSet)
  {
    boolean bool1 = true;
    boolean bool2;
    DataSource localDataSource;
    List localList;
    if (paramDataSet != null)
    {
      bool2 = bool1;
      zzx.zzb(bool2, "Must specify a valid data set.");
      localDataSource = paramDataSet.getDataSource();
      localList = this.zzaBt;
      bool2 = localList.contains(localDataSource);
      if (bool2) {
        break label123;
      }
      bool2 = bool1;
      label42:
      String str = "Data set for this data source %s is already added.";
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = localDataSource;
      zzx.zza(bool2, str, arrayOfObject);
      localList = paramDataSet.getDataPoints();
      bool2 = localList.isEmpty();
      if (bool2) {
        break label131;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "No data points specified in the input data set.");
      this.zzaBt.add(localDataSource);
      this.zzawg.add(paramDataSet);
      return this;
      bool2 = false;
      localList = null;
      break;
      label123:
      bool2 = false;
      localList = null;
      break label42;
      label131:
      bool1 = false;
    }
  }
  
  public SessionInsertRequest build()
  {
    boolean bool1 = true;
    Object localObject = this.zzavX;
    boolean bool2;
    if (localObject != null)
    {
      bool2 = bool1;
      zzx.zza(bool2, "Must specify a valid session.");
      localObject = this.zzavX;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      long l1 = ((Session)localObject).getEndTime(localTimeUnit);
      long l2 = 0L;
      bool2 = l1 < l2;
      if (!bool2) {
        break label79;
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "Must specify a valid end time, cannot insert a continuing session.");
      zzvd();
      localObject = new com/google/android/gms/fitness/request/SessionInsertRequest;
      ((SessionInsertRequest)localObject).<init>(this, null);
      return (SessionInsertRequest)localObject;
      bool2 = false;
      localObject = null;
      break;
      label79:
      bool1 = false;
    }
  }
  
  public Builder setSession(Session paramSession)
  {
    this.zzavX = paramSession;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionInsertRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */