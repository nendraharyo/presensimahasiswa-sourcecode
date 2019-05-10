package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSubscriptionsResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBM;
  
  static
  {
    zzh localzzh = new com/google/android/gms/fitness/result/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  ListSubscriptionsResult(int paramInt, List paramList, Status paramStatus)
  {
    this.mVersionCode = paramInt;
    this.zzaBM = paramList;
    this.zzUX = paramStatus;
  }
  
  public ListSubscriptionsResult(List paramList, Status paramStatus)
  {
    this.mVersionCode = 3;
    Object localObject = Collections.unmodifiableList(paramList);
    this.zzaBM = ((List)localObject);
    localObject = (Status)zzx.zzb(paramStatus, "status");
    this.zzUX = ((Status)localObject);
  }
  
  public static ListSubscriptionsResult zzT(Status paramStatus)
  {
    ListSubscriptionsResult localListSubscriptionsResult = new com/google/android/gms/fitness/result/ListSubscriptionsResult;
    List localList = Collections.emptyList();
    localListSubscriptionsResult.<init>(localList, paramStatus);
    return localListSubscriptionsResult;
  }
  
  private boolean zzb(ListSubscriptionsResult paramListSubscriptionsResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramListSubscriptionsResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaBM;
      localObject2 = paramListSubscriptionsResult.zzaBM;
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
      bool = paramObject instanceof ListSubscriptionsResult;
      if (!bool) {
        break label33;
      }
      paramObject = (ListSubscriptionsResult)paramObject;
      bool = zzb((ListSubscriptionsResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public List getSubscriptions()
  {
    return this.zzaBM;
  }
  
  public List getSubscriptions(DataType paramDataType)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzaBM;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Subscription)localIterator.next();
      DataType localDataType = ((Subscription)localObject).zzuy();
      boolean bool2 = paramDataType.equals(localDataType);
      if (bool2) {
        localArrayList.add(localObject);
      }
    }
    return Collections.unmodifiableList(localArrayList);
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
    localObject = this.zzaBM;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaBM;
    return localzza.zzg("subscriptions", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\ListSubscriptionsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */