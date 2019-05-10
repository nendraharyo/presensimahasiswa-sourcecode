package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zznw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class DataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final DataType zzavT;
  private final DataSource zzavU;
  private boolean zzawi = false;
  private final List zzawp;
  private final List zzawq;
  
  static
  {
    zze localzze = new com/google/android/gms/fitness/data/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  DataSet(int paramInt, DataSource paramDataSource, DataType paramDataType, List paramList1, List paramList2, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzavU = paramDataSource;
    Object localObject = paramDataSource.getDataType();
    this.zzavT = ((DataType)localObject);
    this.zzawi = paramBoolean;
    localObject = new java/util/ArrayList;
    int i = paramList1.size();
    ((ArrayList)localObject).<init>(i);
    this.zzawp = ((List)localObject);
    int j = 2;
    if (paramInt >= j) {}
    for (;;)
    {
      this.zzawq = paramList2;
      Iterator localIterator = paramList1.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (RawDataPoint)localIterator.next();
        List localList1 = this.zzawp;
        DataPoint localDataPoint = new com/google/android/gms/fitness/data/DataPoint;
        List localList2 = this.zzawq;
        localDataPoint.<init>(localList2, (RawDataPoint)localObject);
        localList1.add(localDataPoint);
      }
      paramList2 = Collections.singletonList(paramDataSource);
    }
  }
  
  public DataSet(DataSource paramDataSource)
  {
    this.mVersionCode = 3;
    Object localObject = (DataSource)zzx.zzz(paramDataSource);
    this.zzavU = ((DataSource)localObject);
    localObject = paramDataSource.getDataType();
    this.zzavT = ((DataType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzawp = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzawq = ((List)localObject);
    localObject = this.zzawq;
    DataSource localDataSource = this.zzavU;
    ((List)localObject).add(localDataSource);
  }
  
  public DataSet(RawDataSet paramRawDataSet, List paramList)
  {
    this.mVersionCode = 3;
    int i = paramRawDataSet.zzaxg;
    Object localObject1 = (DataSource)zzb(paramList, i);
    this.zzavU = ((DataSource)localObject1);
    localObject1 = this.zzavU.getDataType();
    this.zzavT = ((DataType)localObject1);
    this.zzawq = paramList;
    boolean bool = paramRawDataSet.zzawi;
    this.zzawi = bool;
    localObject1 = paramRawDataSet.zzaxj;
    Object localObject2 = new java/util/ArrayList;
    int j = ((List)localObject1).size();
    ((ArrayList)localObject2).<init>(j);
    this.zzawp = ((List)localObject2);
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (RawDataPoint)((Iterator)localObject2).next();
      List localList1 = this.zzawp;
      DataPoint localDataPoint = new com/google/android/gms/fitness/data/DataPoint;
      List localList2 = this.zzawq;
      localDataPoint.<init>(localList2, (RawDataPoint)localObject1);
      localList1.add(localDataPoint);
    }
  }
  
  public static DataSet create(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource, "DataSource should be specified");
    DataSet localDataSet = new com/google/android/gms/fitness/data/DataSet;
    localDataSet.<init>(paramDataSource);
    return localDataSet;
  }
  
  private boolean zza(DataSet paramDataSet)
  {
    Object localObject1 = getDataType();
    Object localObject2 = paramDataSet.getDataType();
    boolean bool1 = zzw.equal(localObject1, localObject2);
    if (bool1)
    {
      localObject1 = this.zzavU;
      localObject2 = paramDataSet.zzavU;
      bool1 = zzw.equal(localObject1, localObject2);
      if (bool1)
      {
        localObject1 = this.zzawp;
        localObject2 = paramDataSet.zzawp;
        bool1 = zzw.equal(localObject1, localObject2);
        if (bool1)
        {
          bool1 = this.zzawi;
          boolean bool2 = paramDataSet.zzawi;
          if (bool1 == bool2) {
            bool1 = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private static Object zzb(List paramList, int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      i = paramList.size();
      if (paramInt >= i) {}
    }
    for (Object localObject = paramList.get(paramInt);; localObject = null)
    {
      return localObject;
      i = 0;
    }
  }
  
  public void add(DataPoint paramDataPoint)
  {
    DataSource localDataSource1 = paramDataPoint.getDataSource();
    String str1 = localDataSource1.getStreamIdentifier();
    String str2 = this.zzavU.getStreamIdentifier();
    boolean bool = str1.equals(str2);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localDataSource1;
    DataSource localDataSource2 = this.zzavU;
    arrayOfObject[1] = localDataSource2;
    zzx.zzb(bool, "Conflicting data sources found %s vs %s", arrayOfObject);
    paramDataPoint.zzui();
    zznw.zze(paramDataPoint);
    zzb(paramDataPoint);
  }
  
  public void addAll(Iterable paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      DataPoint localDataPoint = (DataPoint)localIterator.next();
      add(localDataPoint);
    }
  }
  
  public DataPoint createDataPoint()
  {
    return DataPoint.create(this.zzavU);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataSet;
      if (!bool) {
        break label33;
      }
      paramObject = (DataSet)paramObject;
      bool = zza((DataSet)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getDataPoints()
  {
    return Collections.unmodifiableList(this.zzawp);
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  public DataType getDataType()
  {
    return this.zzavU.getDataType();
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    DataSource localDataSource = this.zzavU;
    arrayOfObject[0] = localDataSource;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isEmpty()
  {
    return this.zzawp.isEmpty();
  }
  
  public String toString()
  {
    int i = 2;
    int j = 1;
    Object localObject1 = zzuk();
    String str = "DataSet{%s %s}";
    Object[] arrayOfObject1 = new Object[i];
    Object localObject2 = this.zzavU.toDebugString();
    arrayOfObject1[0] = localObject2;
    localObject2 = this.zzawp;
    int k = ((List)localObject2).size();
    int m = 10;
    if (k < m) {}
    for (;;)
    {
      arrayOfObject1[j] = localObject1;
      return String.format(str, arrayOfObject1);
      localObject2 = "%d data points, first 5: %s";
      Object[] arrayOfObject2 = new Object[i];
      Integer localInteger = Integer.valueOf(this.zzawp.size());
      arrayOfObject2[0] = localInteger;
      i = 5;
      localObject1 = ((List)localObject1).subList(0, i);
      arrayOfObject2[j] = localObject1;
      localObject1 = String.format((String)localObject2, arrayOfObject2);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public void zzb(DataPoint paramDataPoint)
  {
    this.zzawp.add(paramDataPoint);
    DataSource localDataSource = paramDataPoint.getOriginalDataSource();
    if (localDataSource != null)
    {
      List localList = this.zzawq;
      boolean bool = localList.contains(localDataSource);
      if (!bool)
      {
        localList = this.zzawq;
        localList.add(localDataSource);
      }
    }
  }
  
  public void zzb(Iterable paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      DataPoint localDataPoint = (DataPoint)localIterator.next();
      zzb(localDataPoint);
    }
  }
  
  public boolean zzuc()
  {
    return this.zzawi;
  }
  
  List zzuk()
  {
    List localList = this.zzawq;
    return zzv(localList);
  }
  
  List zzul()
  {
    return this.zzawq;
  }
  
  List zzv(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzawp.size();
    localArrayList.<init>(i);
    Object localObject = this.zzawp;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataPoint)localIterator.next();
      RawDataPoint localRawDataPoint = new com/google/android/gms/fitness/data/RawDataPoint;
      localRawDataPoint.<init>((DataPoint)localObject, paramList);
      localArrayList.add(localRawDataPoint);
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\DataSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */