package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DataReadRequest$Builder
{
  private long zzRD;
  private List zzaAF;
  private List zzaAK;
  private List zzaAL;
  private long zzaAM;
  private DataSource zzaAN;
  private int zzaAO;
  private boolean zzaAP;
  private boolean zzaAQ;
  private List zzaAS;
  private long zzavV;
  private List zzawe;
  private int zzawh;
  
  public DataReadRequest$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzawe = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAF = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAK = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAL = localArrayList;
    this.zzawh = 0;
    this.zzaAM = 0L;
    this.zzaAO = 0;
    this.zzaAP = false;
    this.zzaAQ = false;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAS = localArrayList;
  }
  
  public Builder aggregate(DataSource paramDataSource, DataType paramDataType)
  {
    boolean bool1 = true;
    zzx.zzb(paramDataSource, "Attempting to add a null data source");
    Object localObject = this.zzaAF;
    boolean bool2 = ((List)localObject).contains(paramDataSource);
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      zzx.zza(bool2, "Cannot add the same data source for aggregated and detailed");
      localObject = paramDataSource.getDataType();
      boolean bool3 = DataType.AGGREGATE_INPUT_TYPES.contains(localObject);
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = localObject;
      zzx.zzb(bool3, "Unsupported input data type specified for aggregation: %s", arrayOfObject);
      List localList = DataType.getAggregatesForInput((DataType)localObject);
      bool3 = localList.contains(paramDataType);
      String str = "Invalid output aggregate data type specified: %s -> %s";
      int i = 2;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = localObject;
      arrayOfObject[bool1] = paramDataType;
      zzx.zzb(bool3, str, arrayOfObject);
      localObject = this.zzaAL;
      bool2 = ((List)localObject).contains(paramDataSource);
      if (!bool2)
      {
        localObject = this.zzaAL;
        ((List)localObject).add(paramDataSource);
      }
      return this;
      bool2 = false;
      localObject = null;
    }
  }
  
  public Builder aggregate(DataType paramDataType1, DataType paramDataType2)
  {
    boolean bool1 = true;
    zzx.zzb(paramDataType1, "Attempting to use a null data type");
    List localList = this.zzawe;
    boolean bool2 = localList.contains(paramDataType1);
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      zzx.zza(bool2, "Cannot add the same data type as aggregated and detailed");
      bool2 = DataType.AGGREGATE_INPUT_TYPES.contains(paramDataType1);
      Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = paramDataType1;
      zzx.zzb(bool2, "Unsupported input data type specified for aggregation: %s", arrayOfObject);
      bool2 = DataType.getAggregatesForInput(paramDataType1).contains(paramDataType2);
      String str = "Invalid output aggregate data type specified: %s -> %s";
      int i = 2;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = paramDataType1;
      arrayOfObject[bool1] = paramDataType2;
      zzx.zzb(bool2, str, arrayOfObject);
      localList = this.zzaAK;
      bool2 = localList.contains(paramDataType1);
      if (!bool2)
      {
        localList = this.zzaAK;
        localList.add(paramDataType1);
      }
      return this;
      bool2 = false;
      localList = null;
    }
  }
  
  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit)
  {
    int i = 1;
    int j = this.zzawh;
    Object localObject;
    if (j == 0)
    {
      j = i;
      String str = "Bucketing strategy already set to %s";
      localObject = new Object[i];
      int m = this.zzawh;
      Integer localInteger = Integer.valueOf(m);
      localObject[0] = localInteger;
      zzx.zzb(j, str, (Object[])localObject);
      if (paramInt <= 0) {
        break label119;
      }
    }
    int k;
    label119:
    for (j = i;; k = 0)
    {
      Object[] arrayOfObject = new Object[i];
      localObject = Integer.valueOf(paramInt);
      arrayOfObject[0] = localObject;
      zzx.zzb(j, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject);
      this.zzawh = 4;
      long l = paramInt;
      l = paramTimeUnit.toMillis(l);
      this.zzaAM = l;
      return this;
      k = 0;
      break;
    }
  }
  
  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    int i = 1;
    int j = this.zzawh;
    Object localObject;
    if (j == 0)
    {
      j = i;
      localObject = "Bucketing strategy already set to %s";
      Object[] arrayOfObject1 = new Object[i];
      int k = this.zzawh;
      Integer localInteger = Integer.valueOf(k);
      arrayOfObject1[0] = localInteger;
      zzx.zzb(j, (String)localObject, arrayOfObject1);
      if (paramInt <= 0) {
        break label192;
      }
      j = i;
      label65:
      localObject = "Must specify a valid minimum duration for an activity segment: %d";
      arrayOfObject1 = new Object[i];
      localInteger = Integer.valueOf(paramInt);
      arrayOfObject1[0] = localInteger;
      zzx.zzb(j, (String)localObject, arrayOfObject1);
      if (paramDataSource == null) {
        break label201;
      }
      j = i;
    }
    for (;;)
    {
      zzx.zzb(j, "Invalid activity data source specified");
      DataType localDataType = paramDataSource.getDataType();
      localObject = DataType.TYPE_ACTIVITY_SEGMENT;
      boolean bool = localDataType.equals(localObject);
      Object[] arrayOfObject2 = new Object[i];
      arrayOfObject2[0] = paramDataSource;
      zzx.zzb(bool, "Invalid activity data source specified: %s", arrayOfObject2);
      this.zzaAN = paramDataSource;
      this.zzawh = 4;
      long l = paramInt;
      l = paramTimeUnit.toMillis(l);
      this.zzaAM = l;
      return this;
      bool = false;
      localDataType = null;
      break;
      label192:
      bool = false;
      localDataType = null;
      break label65;
      label201:
      bool = false;
      localDataType = null;
    }
  }
  
  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit)
  {
    int i = 1;
    int j = this.zzawh;
    Object localObject;
    if (j == 0)
    {
      j = i;
      String str = "Bucketing strategy already set to %s";
      localObject = new Object[i];
      int m = this.zzawh;
      Integer localInteger = Integer.valueOf(m);
      localObject[0] = localInteger;
      zzx.zzb(j, str, (Object[])localObject);
      if (paramInt <= 0) {
        break label119;
      }
    }
    int k;
    label119:
    for (j = i;; k = 0)
    {
      Object[] arrayOfObject = new Object[i];
      localObject = Integer.valueOf(paramInt);
      arrayOfObject[0] = localObject;
      zzx.zzb(j, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject);
      this.zzawh = 3;
      long l = paramInt;
      l = paramTimeUnit.toMillis(l);
      this.zzaAM = l;
      return this;
      k = 0;
      break;
    }
  }
  
  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    int i = 1;
    int j = this.zzawh;
    Object localObject;
    if (j == 0)
    {
      j = i;
      localObject = "Bucketing strategy already set to %s";
      Object[] arrayOfObject1 = new Object[i];
      int k = this.zzawh;
      Integer localInteger = Integer.valueOf(k);
      arrayOfObject1[0] = localInteger;
      zzx.zzb(j, (String)localObject, arrayOfObject1);
      if (paramInt <= 0) {
        break label192;
      }
      j = i;
      label65:
      localObject = "Must specify a valid minimum duration for an activity segment: %d";
      arrayOfObject1 = new Object[i];
      localInteger = Integer.valueOf(paramInt);
      arrayOfObject1[0] = localInteger;
      zzx.zzb(j, (String)localObject, arrayOfObject1);
      if (paramDataSource == null) {
        break label201;
      }
      j = i;
    }
    for (;;)
    {
      zzx.zzb(j, "Invalid activity data source specified");
      DataType localDataType = paramDataSource.getDataType();
      localObject = DataType.TYPE_ACTIVITY_SEGMENT;
      boolean bool = localDataType.equals(localObject);
      Object[] arrayOfObject2 = new Object[i];
      arrayOfObject2[0] = paramDataSource;
      zzx.zzb(bool, "Invalid activity data source specified: %s", arrayOfObject2);
      this.zzaAN = paramDataSource;
      this.zzawh = 3;
      long l = paramInt;
      l = paramTimeUnit.toMillis(l);
      this.zzaAM = l;
      return this;
      bool = false;
      localDataType = null;
      break;
      label192:
      bool = false;
      localDataType = null;
      break label65;
      label201:
      bool = false;
      localDataType = null;
    }
  }
  
  public Builder bucketBySession(int paramInt, TimeUnit paramTimeUnit)
  {
    int i = 1;
    int j = this.zzawh;
    Object localObject;
    if (j == 0)
    {
      j = i;
      String str = "Bucketing strategy already set to %s";
      localObject = new Object[i];
      int m = this.zzawh;
      Integer localInteger = Integer.valueOf(m);
      localObject[0] = localInteger;
      zzx.zzb(j, str, (Object[])localObject);
      if (paramInt <= 0) {
        break label119;
      }
    }
    int k;
    label119:
    for (j = i;; k = 0)
    {
      Object[] arrayOfObject = new Object[i];
      localObject = Integer.valueOf(paramInt);
      arrayOfObject[0] = localObject;
      zzx.zzb(j, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject);
      this.zzawh = 2;
      long l = paramInt;
      l = paramTimeUnit.toMillis(l);
      this.zzaAM = l;
      return this;
      k = 0;
      break;
    }
  }
  
  public Builder bucketByTime(int paramInt, TimeUnit paramTimeUnit)
  {
    int i = 1;
    int j = this.zzawh;
    Object[] arrayOfObject;
    Integer localInteger;
    if (j == 0)
    {
      j = i;
      String str = "Bucketing strategy already set to %s";
      arrayOfObject = new Object[i];
      int m = this.zzawh;
      localInteger = Integer.valueOf(m);
      arrayOfObject[0] = localInteger;
      zzx.zzb(j, str, arrayOfObject);
      if (paramInt <= 0) {
        break label119;
      }
    }
    int k;
    label119:
    for (j = i;; k = 0)
    {
      arrayOfObject = new Object[i];
      localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      zzx.zzb(j, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject);
      this.zzawh = i;
      long l = paramInt;
      l = paramTimeUnit.toMillis(l);
      this.zzaAM = l;
      return this;
      k = 0;
      break;
    }
  }
  
  public DataReadRequest build()
  {
    long l1 = 0L;
    boolean bool1 = true;
    Object localObject = this.zzaAF;
    boolean bool2 = ((List)localObject).isEmpty();
    if (bool2)
    {
      localObject = this.zzawe;
      bool2 = ((List)localObject).isEmpty();
      if (bool2)
      {
        localObject = this.zzaAL;
        bool2 = ((List)localObject).isEmpty();
        if (bool2)
        {
          localObject = this.zzaAK;
          bool2 = ((List)localObject).isEmpty();
          if (bool2) {
            break label334;
          }
        }
      }
    }
    bool2 = bool1;
    String str = "Must add at least one data source (aggregated or detailed)";
    zzx.zza(bool2, str);
    long l2 = this.zzRD;
    bool2 = l2 < l1;
    label118:
    label200:
    label281:
    int i;
    if (bool2)
    {
      bool2 = bool1;
      str = "Invalid start time: %s";
      Object[] arrayOfObject = new Object[bool1];
      long l3 = this.zzRD;
      Long localLong = Long.valueOf(l3);
      arrayOfObject[0] = localLong;
      zzx.zza(bool2, str, arrayOfObject);
      l2 = this.zzavV;
      bool2 = l2 < l1;
      if (!bool2) {
        break label352;
      }
      l2 = this.zzavV;
      l3 = this.zzRD;
      bool2 = l2 < l3;
      if (!bool2) {
        break label352;
      }
      bool2 = bool1;
      str = "Invalid end time: %s";
      arrayOfObject = new Object[bool1];
      l3 = this.zzavV;
      localLong = Long.valueOf(l3);
      arrayOfObject[0] = localLong;
      zzx.zza(bool2, str, arrayOfObject);
      localObject = this.zzaAL;
      bool2 = ((List)localObject).isEmpty();
      if (!bool2) {
        break label361;
      }
      localObject = this.zzaAK;
      bool2 = ((List)localObject).isEmpty();
      if (!bool2) {
        break label361;
      }
      bool2 = bool1;
      if (bool2)
      {
        int j = this.zzawh;
        if (j == 0) {}
      }
      else
      {
        if (bool2) {
          break label370;
        }
        i = this.zzawh;
        if (i == 0) {
          break label370;
        }
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "Must specify a valid bucketing strategy while requesting aggregation");
      localObject = new com/google/android/gms/fitness/request/DataReadRequest;
      ((DataReadRequest)localObject).<init>(this, null);
      return (DataReadRequest)localObject;
      label334:
      i = 0;
      localObject = null;
      break;
      i = 0;
      localObject = null;
      break label118;
      label352:
      i = 0;
      localObject = null;
      break label200;
      label361:
      i = 0;
      localObject = null;
      break label281;
      label370:
      bool1 = false;
    }
  }
  
  public Builder enableServerQueries()
  {
    this.zzaAQ = true;
    return this;
  }
  
  public Builder read(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource, "Attempting to add a null data source");
    List localList = this.zzaAL;
    boolean bool = localList.contains(paramDataSource);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      String str = "Cannot add the same data source as aggregated and detailed";
      zzx.zzb(bool, str);
      localList = this.zzaAF;
      bool = localList.contains(paramDataSource);
      if (!bool)
      {
        localList = this.zzaAF;
        localList.add(paramDataSource);
      }
      return this;
      bool = false;
      localList = null;
    }
  }
  
  public Builder read(DataType paramDataType)
  {
    zzx.zzb(paramDataType, "Attempting to use a null data type");
    List localList = this.zzaAK;
    boolean bool = localList.contains(paramDataType);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      String str = "Cannot add the same data type as aggregated and detailed";
      zzx.zza(bool, str);
      localList = this.zzawe;
      bool = localList.contains(paramDataType);
      if (!bool)
      {
        localList = this.zzawe;
        localList.add(paramDataType);
      }
      return this;
      bool = false;
      localList = null;
    }
  }
  
  public Builder setLimit(int paramInt)
  {
    boolean bool1 = true;
    if (paramInt > 0) {}
    for (boolean bool2 = bool1;; bool2 = false)
    {
      Object[] arrayOfObject = new Object[bool1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      zzx.zzb(bool2, "Invalid limit %d is specified", arrayOfObject);
      this.zzaAO = paramInt;
      return this;
    }
  }
  
  public Builder setTimeRange(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    long l = paramTimeUnit.toMillis(paramLong1);
    this.zzRD = l;
    l = paramTimeUnit.toMillis(paramLong2);
    this.zzavV = l;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataReadRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */