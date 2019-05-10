package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest$Builder
{
  private String zzLq;
  private long zzRD;
  private List zzaAF;
  private boolean zzaAQ;
  private String zzaBu;
  private boolean zzaBv;
  private List zzaBw;
  private long zzavV;
  private List zzawe;
  
  public SessionReadRequest$Builder()
  {
    this.zzRD = l;
    this.zzavV = l;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzawe = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaAF = localArrayList;
    this.zzaBv = false;
    this.zzaAQ = false;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaBw = localArrayList;
  }
  
  public SessionReadRequest build()
  {
    long l1 = 0L;
    boolean bool1 = true;
    long l2 = this.zzRD;
    boolean bool2 = l2 < l1;
    Object localObject;
    if (bool2)
    {
      bool2 = bool1;
      String str = "Invalid start time: %s";
      localObject = new Object[bool1];
      long l3 = this.zzRD;
      Long localLong = Long.valueOf(l3);
      localObject[0] = localLong;
      zzx.zzb(bool2, str, (Object[])localObject);
      l2 = this.zzavV;
      bool2 = l2 < l1;
      if (!bool2) {
        break label160;
      }
      l2 = this.zzavV;
      l3 = this.zzRD;
      bool2 = l2 < l3;
      if (!bool2) {
        break label160;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[bool1];
      localObject = Long.valueOf(this.zzavV);
      arrayOfObject[0] = localObject;
      zzx.zzb(bool2, "Invalid end time: %s", arrayOfObject);
      SessionReadRequest localSessionReadRequest = new com/google/android/gms/fitness/request/SessionReadRequest;
      localSessionReadRequest.<init>(this, null);
      return localSessionReadRequest;
      bool2 = false;
      localSessionReadRequest = null;
      break;
      label160:
      bool2 = false;
      localSessionReadRequest = null;
    }
  }
  
  public Builder enableServerQueries()
  {
    this.zzaAQ = true;
    return this;
  }
  
  public Builder excludePackage(String paramString)
  {
    zzx.zzb(paramString, "Attempting to use a null package name");
    List localList = this.zzaBw;
    boolean bool = localList.contains(paramString);
    if (!bool)
    {
      localList = this.zzaBw;
      localList.add(paramString);
    }
    return this;
  }
  
  public Builder read(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource, "Attempting to add a null data source");
    List localList = this.zzaAF;
    boolean bool = localList.contains(paramDataSource);
    if (!bool)
    {
      localList = this.zzaAF;
      localList.add(paramDataSource);
    }
    return this;
  }
  
  public Builder read(DataType paramDataType)
  {
    zzx.zzb(paramDataType, "Attempting to use a null data type");
    List localList = this.zzawe;
    boolean bool = localList.contains(paramDataType);
    if (!bool)
    {
      localList = this.zzawe;
      localList.add(paramDataType);
    }
    return this;
  }
  
  public Builder readSessionsFromAllApps()
  {
    this.zzaBv = true;
    return this;
  }
  
  public Builder setSessionId(String paramString)
  {
    this.zzLq = paramString;
    return this;
  }
  
  public Builder setSessionName(String paramString)
  {
    this.zzaBu = paramString;
    return this;
  }
  
  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    long l = paramTimeUnit.toMillis(paramLong1);
    this.zzRD = l;
    l = paramTimeUnit.toMillis(paramLong2);
    this.zzavV = l;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionReadRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */