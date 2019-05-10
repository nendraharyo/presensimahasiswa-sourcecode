package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zznr;
import java.util.Collections;
import java.util.List;

public class BleDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mVersionCode;
  private final String zzawc;
  private final List zzawd;
  private final List zzawe;
  
  static
  {
    zzb localzzb = new com/google/android/gms/fitness/data/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  BleDevice(int paramInt, String paramString1, String paramString2, List paramList1, List paramList2)
  {
    this.mVersionCode = paramInt;
    this.zzawc = paramString1;
    this.mName = paramString2;
    List localList = Collections.unmodifiableList(paramList1);
    this.zzawd = localList;
    localList = Collections.unmodifiableList(paramList2);
    this.zzawe = localList;
  }
  
  private boolean zza(BleDevice paramBleDevice)
  {
    Object localObject1 = this.mName;
    Object localObject2 = paramBleDevice.mName;
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzawc;
      localObject2 = paramBleDevice.zzawc;
      bool = ((String)localObject1).equals(localObject2);
      if (bool)
      {
        localObject1 = paramBleDevice.zzawd;
        localObject2 = this.zzawd;
        bool = zznr.zza((List)localObject1, (List)localObject2);
        if (bool)
        {
          localObject1 = this.zzawe;
          localObject2 = paramBleDevice.zzawe;
          bool = zznr.zza((List)localObject1, (List)localObject2);
          if (bool) {
            bool = true;
          }
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
    if (paramObject != this)
    {
      bool = paramObject instanceof BleDevice;
      if (!bool) {
        break label33;
      }
      paramObject = (BleDevice)paramObject;
      bool = zza((BleDevice)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String getAddress()
  {
    return this.zzawc;
  }
  
  public List getDataTypes()
  {
    return this.zzawe;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public List getSupportedProfiles()
  {
    return this.zzawd;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.mName;
    arrayOfObject[0] = localObject;
    localObject = this.zzawc;
    arrayOfObject[1] = localObject;
    localObject = this.zzawd;
    arrayOfObject[2] = localObject;
    localObject = this.zzawe;
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.mName;
    localzza = localzza.zzg("name", localObject);
    localObject = this.zzawc;
    localzza = localzza.zzg("address", localObject);
    localObject = this.zzawe;
    localzza = localzza.zzg("dataTypes", localObject);
    localObject = this.zzawd;
    return localzza.zzg("supportedProfiles", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\BleDevice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */