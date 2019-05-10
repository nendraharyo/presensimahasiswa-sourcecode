package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable
  implements SafeParcelable, CapabilityInfo
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  final int mVersionCode;
  private Set zzbrS;
  private final List zzbrV;
  private final Object zzpV;
  
  static
  {
    zzk localzzk = new com/google/android/gms/wearable/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  CapabilityInfoParcelable(int paramInt, String paramString, List paramList)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.mVersionCode = paramInt;
    this.mName = paramString;
    this.zzbrV = paramList;
    this.zzbrS = null;
    zzIH();
  }
  
  private void zzIH()
  {
    zzx.zzz(this.mName);
    zzx.zzz(this.zzbrV);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    Object localObject1;
    boolean bool2;
    do
    {
      for (;;)
      {
        return bool1;
        if (paramObject != null)
        {
          localObject1 = getClass();
          localObject2 = paramObject.getClass();
          if (localObject1 == localObject2) {}
        }
        else
        {
          bool1 = false;
          continue;
        }
        paramObject = (CapabilityInfoParcelable)paramObject;
        int i = this.mVersionCode;
        int j = ((CapabilityInfoParcelable)paramObject).mVersionCode;
        if (i == j) {
          break;
        }
        bool1 = false;
      }
      localObject1 = this.mName;
      if (localObject1 != null)
      {
        localObject1 = this.mName;
        localObject2 = ((CapabilityInfoParcelable)paramObject).mName;
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2) {}
      }
      else
      {
        do
        {
          bool1 = false;
          break;
          localObject1 = ((CapabilityInfoParcelable)paramObject).mName;
        } while (localObject1 != null);
      }
      localObject1 = this.zzbrV;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.zzbrV;
      Object localObject2 = ((CapabilityInfoParcelable)paramObject).zzbrV;
      bool2 = ((List)localObject1).equals(localObject2);
    } while (bool2);
    for (;;)
    {
      bool1 = false;
      break;
      localObject1 = ((CapabilityInfoParcelable)paramObject).zzbrV;
      if (localObject1 == null) {
        break;
      }
    }
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public Set getNodes()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzbrS;
      if (localObject2 == null)
      {
        localObject2 = new java/util/HashSet;
        List localList = this.zzbrV;
        ((HashSet)localObject2).<init>(localList);
        this.zzbrS = ((Set)localObject2);
      }
      localObject2 = this.zzbrS;
      return (Set)localObject2;
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    List localList1 = null;
    int j = this.mVersionCode;
    int k = j * 31;
    String str = this.mName;
    if (str != null)
    {
      str = this.mName;
      j = str.hashCode();
    }
    for (;;)
    {
      j = (j + k) * 31;
      List localList2 = this.zzbrV;
      if (localList2 != null)
      {
        localList1 = this.zzbrV;
        i = localList1.hashCode();
      }
      return j + i;
      j = 0;
      str = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("CapabilityInfo{");
    Object localObject = this.mName;
    localStringBuilder = localStringBuilder.append((String)localObject).append(", ");
    localObject = this.zzbrV;
    return localObject + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  public List zzII()
  {
    return this.zzbrV;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\CapabilityInfoParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */