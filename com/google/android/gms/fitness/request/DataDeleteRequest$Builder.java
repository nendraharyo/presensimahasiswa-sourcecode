package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest$Builder
{
  private long zzRD;
  private List zzaAF;
  private List zzaAG;
  private boolean zzaAH;
  private boolean zzaAI;
  private long zzavV;
  private List zzawe;
  
  public DataDeleteRequest$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAF = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzawe = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAG = localArrayList;
    this.zzaAH = false;
    this.zzaAI = false;
  }
  
  private void zzuN()
  {
    boolean bool1 = true;
    Object localObject = this.zzaAG;
    boolean bool2 = ((List)localObject).isEmpty();
    if (bool2) {}
    Iterator localIterator;
    do
    {
      return;
      localObject = this.zzaAG;
      localIterator = ((List)localObject).iterator();
      bool2 = localIterator.hasNext();
    } while (!bool2);
    localObject = (Session)localIterator.next();
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    long l1 = ((Session)localObject).getStartTime(localTimeUnit);
    long l2 = this.zzRD;
    boolean bool3 = l1 < l2;
    if (!bool3)
    {
      localTimeUnit = TimeUnit.MILLISECONDS;
      l1 = ((Session)localObject).getEndTime(localTimeUnit);
      l2 = this.zzavV;
      bool3 = l1 < l2;
      if (!bool3) {
        bool3 = bool1;
      }
    }
    for (;;)
    {
      String str = "Session %s is outside the time interval [%d, %d]";
      int j = 3;
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = localObject;
      localObject = Long.valueOf(this.zzRD);
      arrayOfObject[bool1] = localObject;
      int i = 2;
      l2 = this.zzavV;
      Long localLong = Long.valueOf(l2);
      arrayOfObject[i] = localLong;
      zzx.zza(bool3, str, arrayOfObject);
      break;
      bool3 = false;
      localTimeUnit = null;
    }
  }
  
  public Builder addDataSource(DataSource paramDataSource)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzaAH;
    if (!bool2)
    {
      bool2 = bool1;
      String str = "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()";
      zzx.zzb(bool2, str);
      if (paramDataSource == null) {
        break label77;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Must specify a valid data source");
      List localList = this.zzaAF;
      bool2 = localList.contains(paramDataSource);
      if (!bool2)
      {
        localList = this.zzaAF;
        localList.add(paramDataSource);
      }
      return this;
      bool2 = false;
      localList = null;
      break;
      label77:
      bool1 = false;
    }
  }
  
  public Builder addDataType(DataType paramDataType)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzaAH;
    if (!bool2)
    {
      bool2 = bool1;
      String str = "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()";
      zzx.zzb(bool2, str);
      if (paramDataType == null) {
        break label77;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Must specify a valid data type");
      List localList = this.zzawe;
      bool2 = localList.contains(paramDataType);
      if (!bool2)
      {
        localList = this.zzawe;
        localList.add(paramDataType);
      }
      return this;
      bool2 = false;
      localList = null;
      break;
      label77:
      bool1 = false;
    }
  }
  
  public Builder addSession(Session paramSession)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzaAI;
    label29:
    TimeUnit localTimeUnit;
    if (!bool2)
    {
      bool2 = bool1;
      String str = "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()";
      zzx.zzb(bool2, str);
      if (paramSession == null) {
        break label92;
      }
      bool2 = bool1;
      str = "Must specify a valid session";
      zzx.zzb(bool2, str);
      localTimeUnit = TimeUnit.MILLISECONDS;
      long l1 = paramSession.getEndTime(localTimeUnit);
      long l2 = 0L;
      bool2 = l1 < l2;
      if (!bool2) {
        break label100;
      }
    }
    for (;;)
    {
      zzx.zzb(bool1, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
      this.zzaAG.add(paramSession);
      return this;
      bool2 = false;
      localTimeUnit = null;
      break;
      label92:
      bool2 = false;
      localTimeUnit = null;
      break label29;
      label100:
      bool1 = false;
    }
  }
  
  public DataDeleteRequest build()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    long l1 = this.zzRD;
    long l2 = 0L;
    boolean bool3 = l1 < l2;
    Object localObject1;
    Object localObject2;
    label113:
    boolean bool4;
    if (bool3)
    {
      l1 = this.zzavV;
      l2 = this.zzRD;
      bool3 = l1 < l2;
      if (bool3)
      {
        bool3 = bool1;
        localObject1 = "Must specify a valid time interval";
        zzx.zza(bool3, localObject1);
        bool3 = this.zzaAH;
        if (!bool3)
        {
          localObject2 = this.zzaAF;
          bool3 = ((List)localObject2).isEmpty();
          if (bool3)
          {
            localObject2 = this.zzawe;
            bool3 = ((List)localObject2).isEmpty();
            if (bool3) {
              break label193;
            }
          }
        }
        bool3 = bool1;
        bool4 = this.zzaAI;
        if (!bool4)
        {
          localObject1 = this.zzaAG;
          bool4 = ((List)localObject1).isEmpty();
          if (bool4) {
            break label202;
          }
        }
        bool4 = bool1;
      }
    }
    for (;;)
    {
      if ((bool3) || (bool4)) {
        bool2 = bool1;
      }
      zzx.zza(bool2, "No data or session marked for deletion");
      zzuN();
      localObject2 = new com/google/android/gms/fitness/request/DataDeleteRequest;
      ((DataDeleteRequest)localObject2).<init>(this, null);
      return (DataDeleteRequest)localObject2;
      bool3 = false;
      localObject2 = null;
      break;
      label193:
      bool3 = false;
      localObject2 = null;
      break label113;
      label202:
      bool4 = false;
      localObject1 = null;
    }
  }
  
  public Builder deleteAllData()
  {
    zzx.zzb(this.zzawe.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
    zzx.zzb(this.zzaAF.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
    this.zzaAH = true;
    return this;
  }
  
  public Builder deleteAllSessions()
  {
    zzx.zzb(this.zzaAG.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
    this.zzaAI = true;
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
      if (!bool2) {
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataDeleteRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */