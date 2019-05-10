package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BleDevicesResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBE;
  
  static
  {
    zza localzza = new com/google/android/gms/fitness/result/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  BleDevicesResult(int paramInt, List paramList, Status paramStatus)
  {
    this.mVersionCode = paramInt;
    List localList = Collections.unmodifiableList(paramList);
    this.zzaBE = localList;
    this.zzUX = paramStatus;
  }
  
  public BleDevicesResult(List paramList, Status paramStatus)
  {
    this.mVersionCode = 3;
    List localList = Collections.unmodifiableList(paramList);
    this.zzaBE = localList;
    this.zzUX = paramStatus;
  }
  
  public static BleDevicesResult zzQ(Status paramStatus)
  {
    BleDevicesResult localBleDevicesResult = new com/google/android/gms/fitness/result/BleDevicesResult;
    List localList = Collections.emptyList();
    localBleDevicesResult.<init>(localList, paramStatus);
    return localBleDevicesResult;
  }
  
  private boolean zzb(BleDevicesResult paramBleDevicesResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramBleDevicesResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaBE;
      localObject2 = paramBleDevicesResult.zzaBE;
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
      bool = paramObject instanceof BleDevicesResult;
      if (!bool) {
        break label33;
      }
      paramObject = (BleDevicesResult)paramObject;
      bool = zzb((BleDevicesResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getClaimedBleDevices()
  {
    return this.zzaBE;
  }
  
  public List getClaimedBleDevices(DataType paramDataType)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzaBE;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (BleDevice)localIterator.next();
      List localList = ((BleDevice)localObject).getDataTypes();
      boolean bool2 = localList.contains(paramDataType);
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
    localObject = this.zzaBE;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaBE;
    return localzza.zzg("bleDevices", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\BleDevicesResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */