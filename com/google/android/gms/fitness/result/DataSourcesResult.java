package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataSourcesResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaAF;
  
  static
  {
    zze localzze = new com/google/android/gms/fitness/result/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  DataSourcesResult(int paramInt, List paramList, Status paramStatus)
  {
    this.mVersionCode = paramInt;
    List localList = Collections.unmodifiableList(paramList);
    this.zzaAF = localList;
    this.zzUX = paramStatus;
  }
  
  public DataSourcesResult(List paramList, Status paramStatus)
  {
    this.mVersionCode = 3;
    List localList = Collections.unmodifiableList(paramList);
    this.zzaAF = localList;
    this.zzUX = paramStatus;
  }
  
  public static DataSourcesResult zzR(Status paramStatus)
  {
    DataSourcesResult localDataSourcesResult = new com/google/android/gms/fitness/result/DataSourcesResult;
    List localList = Collections.emptyList();
    localDataSourcesResult.<init>(localList, paramStatus);
    return localDataSourcesResult;
  }
  
  private boolean zzb(DataSourcesResult paramDataSourcesResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramDataSourcesResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaAF;
      localObject2 = paramDataSourcesResult.zzaAF;
      bool = zzw.equal(localObject1, localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
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
      bool = paramObject instanceof DataSourcesResult;
      if (!bool) {
        break label33;
      }
      paramObject = (DataSourcesResult)paramObject;
      bool = zzb((DataSourcesResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getDataSources()
  {
    return this.zzaAF;
  }
  
  public List getDataSources(DataType paramDataType)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzaAF;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (DataSource)localIterator.next();
      DataType localDataType = ((DataSource)localObject).getDataType();
      boolean bool2 = localDataType.equals(paramDataType);
      if (bool2) {
        localArrayList.add(localObject);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzUX;
    arrayOfObject[0] = localObject;
    localObject = this.zzaAF;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaAF;
    return localzza.zzg("dataSets", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\DataSourcesResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */