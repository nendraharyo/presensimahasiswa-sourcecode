package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogicalFilter
  extends AbstractFilter
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private List zzaua;
  final Operator zzaug;
  final List zzauv;
  
  static
  {
    zzk localzzk = new com/google/android/gms/drive/query/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  LogicalFilter(int paramInt, Operator paramOperator, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaug = paramOperator;
    this.zzauv = paramList;
  }
  
  public LogicalFilter(Operator paramOperator, Filter paramFilter, Filter... paramVarArgs)
  {
    this.mVersionCode = 1;
    this.zzaug = paramOperator;
    Object localObject = new java/util/ArrayList;
    int i = paramVarArgs.length + 1;
    ((ArrayList)localObject).<init>(i);
    this.zzauv = ((List)localObject);
    localObject = this.zzauv;
    FilterHolder localFilterHolder1 = new com/google/android/gms/drive/query/internal/FilterHolder;
    localFilterHolder1.<init>(paramFilter);
    ((List)localObject).add(localFilterHolder1);
    localObject = new java/util/ArrayList;
    i = paramVarArgs.length + 1;
    ((ArrayList)localObject).<init>(i);
    this.zzaua = ((List)localObject);
    this.zzaua.add(paramFilter);
    i = paramVarArgs.length;
    int j = 0;
    localObject = null;
    while (j < i)
    {
      Filter localFilter = paramVarArgs[j];
      List localList = this.zzauv;
      FilterHolder localFilterHolder2 = new com/google/android/gms/drive/query/internal/FilterHolder;
      localFilterHolder2.<init>(localFilter);
      localList.add(localFilterHolder2);
      localList = this.zzaua;
      localList.add(localFilter);
      j += 1;
    }
  }
  
  public LogicalFilter(Operator paramOperator, Iterable paramIterable)
  {
    int i = 1;
    this.mVersionCode = i;
    this.zzaug = paramOperator;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaua = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzauv = ((List)localObject);
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      i = localIterator.hasNext();
      if (i == 0) {
        break;
      }
      localObject = (Filter)localIterator.next();
      this.zzaua.add(localObject);
      List localList = this.zzauv;
      FilterHolder localFilterHolder = new com/google/android/gms/drive/query/internal/FilterHolder;
      localFilterHolder.<init>((Filter)localObject);
      localList.add(localFilterHolder);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzauv;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = ((FilterHolder)localIterator.next()).getFilter().zza(paramzzf);
      localArrayList.add(localObject);
    }
    localObject = this.zzaug;
    return paramzzf.zzb((Operator)localObject, localArrayList);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\LogicalFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */