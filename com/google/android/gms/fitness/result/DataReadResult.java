package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataReadResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBF;
  private int zzaBG;
  private final List zzaBH;
  private final List zzawg;
  private final List zzawq;
  
  static
  {
    zzc localzzc = new com/google/android/gms/fitness/result/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  DataReadResult(int paramInt1, List paramList1, Status paramStatus, List paramList2, int paramInt2, List paramList3, List paramList4)
  {
    this.mVersionCode = paramInt1;
    this.zzUX = paramStatus;
    this.zzaBG = paramInt2;
    this.zzawq = paramList3;
    this.zzaBH = paramList4;
    Object localObject1 = new java/util/ArrayList;
    int i = paramList1.size();
    ((ArrayList)localObject1).<init>(i);
    this.zzawg = ((List)localObject1);
    Iterator localIterator = paramList1.iterator();
    boolean bool;
    List localList;
    Object localObject2;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (RawDataSet)localIterator.next();
      localList = this.zzawg;
      localObject2 = new com/google/android/gms/fitness/data/DataSet;
      ((DataSet)localObject2).<init>((RawDataSet)localObject1, paramList3);
      localList.add(localObject2);
    }
    localObject1 = new java/util/ArrayList;
    i = paramList2.size();
    ((ArrayList)localObject1).<init>(i);
    this.zzaBF = ((List)localObject1);
    localIterator = paramList2.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (RawBucket)localIterator.next();
      localList = this.zzaBF;
      localObject2 = new com/google/android/gms/fitness/data/Bucket;
      ((Bucket)localObject2).<init>((RawBucket)localObject1, paramList3);
      localList.add(localObject2);
    }
  }
  
  public DataReadResult(List paramList1, List paramList2, Status paramStatus)
  {
    this.mVersionCode = 5;
    this.zzawg = paramList1;
    this.zzUX = paramStatus;
    this.zzaBF = paramList2;
    this.zzaBG = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzawq = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaBH = localArrayList;
  }
  
  public static DataReadResult zza(Status paramStatus, DataReadRequest paramDataReadRequest)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = paramDataReadRequest.getDataSources();
    Object localObject2 = ((List)localObject1).iterator();
    boolean bool;
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = DataSet.create((DataSource)((Iterator)localObject2).next());
      localArrayList.add(localObject1);
    }
    localObject1 = paramDataReadRequest.getDataTypes();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (DataType)((Iterator)localObject2).next();
      Object localObject3 = new com/google/android/gms/fitness/data/DataSource$Builder;
      ((DataSource.Builder)localObject3).<init>();
      localObject1 = ((DataSource.Builder)localObject3).setDataType((DataType)localObject1);
      int i = 1;
      localObject1 = ((DataSource.Builder)localObject1).setType(i);
      localObject3 = "Default";
      localObject1 = DataSet.create(((DataSource.Builder)localObject1).setName((String)localObject3).build());
      localArrayList.add(localObject1);
    }
    localObject1 = new com/google/android/gms/fitness/result/DataReadResult;
    localObject2 = Collections.emptyList();
    ((DataReadResult)localObject1).<init>(localArrayList, (List)localObject2, paramStatus);
    return (DataReadResult)localObject1;
  }
  
  private void zza(Bucket paramBucket, List paramList)
  {
    Object localObject1 = paramList.iterator();
    boolean bool2;
    do
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Bucket)((Iterator)localObject1).next();
      bool2 = ((Bucket)localObject2).zzb(paramBucket);
    } while (!bool2);
    localObject1 = paramBucket.getDataSets();
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool3 = localIterator.hasNext();
      if (!bool3) {
        break;
      }
      localObject1 = (DataSet)localIterator.next();
      List localList = ((Bucket)localObject2).getDataSets();
      zza((DataSet)localObject1, localList);
    }
    Object localObject2 = this.zzaBF;
    ((List)localObject2).add(paramBucket);
  }
  
  private void zza(DataSet paramDataSet, List paramList)
  {
    Object localObject = paramList.iterator();
    DataSet localDataSet;
    boolean bool2;
    do
    {
      boolean bool1 = ((Iterator)localObject).hasNext();
      if (!bool1) {
        break;
      }
      localDataSet = (DataSet)((Iterator)localObject).next();
      DataSource localDataSource1 = localDataSet.getDataSource();
      DataSource localDataSource2 = paramDataSet.getDataSource();
      bool2 = localDataSource1.equals(localDataSource2);
    } while (!bool2);
    localObject = paramDataSet.getDataPoints();
    localDataSet.zzb((Iterable)localObject);
    for (;;)
    {
      return;
      paramList.add(paramDataSet);
    }
  }
  
  private boolean zzc(DataReadResult paramDataReadResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramDataReadResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzawg;
      localObject2 = paramDataReadResult.zzawg;
      bool = zzw.equal(localObject1, localObject2);
      if (bool)
      {
        localObject1 = this.zzaBF;
        localObject2 = paramDataReadResult.zzaBF;
        bool = zzw.equal(localObject1, localObject2);
        if (bool) {
          bool = true;
        }
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
      bool = paramObject instanceof DataReadResult;
      if (!bool) {
        break label33;
      }
      paramObject = (DataReadResult)paramObject;
      bool = zzc((DataReadResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getBuckets()
  {
    return this.zzaBF;
  }
  
  public DataSet getDataSet(DataSource paramDataSource)
  {
    Object localObject = this.zzawg;
    Iterator localIterator = ((List)localObject).iterator();
    boolean bool2;
    do
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (DataSet)localIterator.next();
      DataSource localDataSource = ((DataSet)localObject).getDataSource();
      bool2 = paramDataSource.equals(localDataSource);
    } while (!bool2);
    for (;;)
    {
      return (DataSet)localObject;
      localObject = DataSet.create(paramDataSource);
    }
  }
  
  public DataSet getDataSet(DataType paramDataType)
  {
    Object localObject = this.zzawg;
    Iterator localIterator = ((List)localObject).iterator();
    boolean bool2;
    do
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (DataSet)localIterator.next();
      DataType localDataType = ((DataSet)localObject).getDataType();
      bool2 = paramDataType.equals(localDataType);
    } while (!bool2);
    for (;;)
    {
      return (DataSet)localObject;
      localObject = new com/google/android/gms/fitness/data/DataSource$Builder;
      ((DataSource.Builder)localObject).<init>();
      localObject = ((DataSource.Builder)localObject).setDataType(paramDataType);
      int i = 1;
      localObject = DataSet.create(((DataSource.Builder)localObject).setType(i).build());
    }
  }
  
  public List getDataSets()
  {
    return this.zzawg;
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
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzUX;
    arrayOfObject[0] = localObject;
    localObject = this.zzawg;
    arrayOfObject[1] = localObject;
    localObject = this.zzaBF;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    int i = 5;
    Object localObject1 = zzw.zzy(this);
    Object localObject2 = this.zzUX;
    zzw.zza localzza = ((zzw.zza)localObject1).zzg("status", localObject2);
    localObject2 = "dataSets";
    localObject1 = this.zzawg;
    int j = ((List)localObject1).size();
    String str;
    if (j > i)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      int k = this.zzawg.size();
      localObject1 = ((StringBuilder)localObject1).append(k);
      str = " data sets";
      localObject1 = str;
      localzza = localzza.zzg((String)localObject2, localObject1);
      localObject2 = "buckets";
      localObject1 = this.zzaBF;
      j = ((List)localObject1).size();
      if (j <= i) {
        break label173;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      k = this.zzaBF.size();
      localObject1 = ((StringBuilder)localObject1).append(k);
      str = " buckets";
    }
    label173:
    for (localObject1 = str;; localObject1 = this.zzaBF)
    {
      return localzza.zzg((String)localObject2, localObject1).toString();
      localObject1 = this.zzawg;
      break;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public void zzb(DataReadResult paramDataReadResult)
  {
    Object localObject = paramDataReadResult.getDataSets();
    Iterator localIterator = ((List)localObject).iterator();
    boolean bool;
    List localList;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataSet)localIterator.next();
      localList = this.zzawg;
      zza((DataSet)localObject, localList);
    }
    localObject = paramDataReadResult.getBuckets();
    localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Bucket)localIterator.next();
      localList = this.zzaBF;
      zza((Bucket)localObject, localList);
    }
  }
  
  List zzul()
  {
    return this.zzawq;
  }
  
  public int zzvj()
  {
    return this.zzaBG;
  }
  
  List zzvk()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzaBF.size();
    localArrayList.<init>(i);
    Object localObject = this.zzaBF;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Bucket)localIterator.next();
      RawBucket localRawBucket = new com/google/android/gms/fitness/data/RawBucket;
      List localList1 = this.zzawq;
      List localList2 = this.zzaBH;
      localRawBucket.<init>((Bucket)localObject, localList1, localList2);
      localArrayList.add(localRawBucket);
    }
    return localArrayList;
  }
  
  List zzvl()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzawg.size();
    localArrayList.<init>(i);
    Object localObject = this.zzawg;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataSet)localIterator.next();
      RawDataSet localRawDataSet = new com/google/android/gms/fitness/data/RawDataSet;
      List localList1 = this.zzawq;
      List localList2 = this.zzaBH;
      localRawDataSet.<init>((DataSet)localObject, localList1, localList2);
      localArrayList.add(localRawDataSet);
    }
    return localArrayList;
  }
  
  List zzvm()
  {
    return this.zzaBH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\DataReadResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */