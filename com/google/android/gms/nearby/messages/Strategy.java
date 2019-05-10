package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public class Strategy
  implements SafeParcelable
{
  public static final Strategy BLE_ONLY;
  public static final Parcelable.Creator CREATOR;
  public static final Strategy DEFAULT;
  public static final int DISCOVERY_MODE_BROADCAST = 1;
  public static final int DISCOVERY_MODE_DEFAULT = 3;
  public static final int DISCOVERY_MODE_SCAN = 2;
  public static final int DISTANCE_TYPE_DEFAULT = 0;
  public static final int DISTANCE_TYPE_EARSHOT = 1;
  public static final int TTL_SECONDS_DEFAULT = 300;
  public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
  public static final int TTL_SECONDS_MAX = 86400;
  public static final Strategy zzbbK = BLE_ONLY;
  final int mVersionCode;
  final int zzbbL;
  final int zzbbM;
  final int zzbbN;
  final boolean zzbbO;
  final int zzbbP;
  final int zzbbQ;
  
  static
  {
    Object localObject = new com/google/android/gms/nearby/messages/zzd;
    ((zzd)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new com/google/android/gms/nearby/messages/Strategy$Builder;
    ((Strategy.Builder)localObject).<init>();
    DEFAULT = ((Strategy.Builder)localObject).build();
    localObject = new com/google/android/gms/nearby/messages/Strategy$Builder;
    ((Strategy.Builder)localObject).<init>();
    BLE_ONLY = ((Strategy.Builder)localObject).zzjg(2).setTtlSeconds(-1 >>> 1).build();
  }
  
  Strategy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6)
  {
    this.mVersionCode = paramInt1;
    this.zzbbL = paramInt2;
    int j;
    if (paramInt2 == 0)
    {
      this.zzbbQ = paramInt6;
      this.zzbbN = paramInt4;
      this.zzbbO = paramBoolean;
      if (!paramBoolean) {
        break label117;
      }
      this.zzbbP = i;
      j = -1 >>> 1;
      this.zzbbM = j;
    }
    for (;;)
    {
      return;
      switch (paramInt2)
      {
      default: 
        j = 3;
        this.zzbbQ = j;
        break;
      case 2: 
        j = 1;
        this.zzbbQ = j;
        break;
      case 3: 
        this.zzbbQ = i;
        break;
        label117:
        this.zzbbM = paramInt3;
        switch (paramInt5)
        {
        default: 
          this.zzbbP = paramInt5;
          break;
        case -1: 
        case 0: 
        case 1: 
        case 6: 
          j = -1;
          this.zzbbP = j;
        }
        break;
      }
    }
  }
  
  private static String zzjd(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "UNKNOWN:";
      localObject = str + paramInt;
    }
    for (;;)
    {
      return (String)localObject;
      localObject = "DEFAULT";
      continue;
      localObject = "EARSHOT";
    }
  }
  
  private static String zzje(int paramInt)
  {
    int i = -1;
    Object localObject;
    if (paramInt == i) {
      localObject = "DEFAULT";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      int j = paramInt & 0x4;
      String str;
      if (j > 0)
      {
        str = "AUDIO";
        ((List)localObject).add(str);
      }
      j = paramInt & 0x2;
      if (j > 0)
      {
        str = "BLE";
        ((List)localObject).add(str);
      }
      boolean bool = ((List)localObject).isEmpty();
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "UNKNOWN:";
        localObject = str + paramInt;
      }
      else
      {
        localObject = localObject.toString();
      }
    }
  }
  
  private static String zzjf(int paramInt)
  {
    int i = 3;
    Object localObject;
    if (paramInt == i) {
      localObject = "DEFAULT";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      int j = paramInt & 0x1;
      String str;
      if (j > 0)
      {
        str = "BROADCAST";
        ((List)localObject).add(str);
      }
      j = paramInt & 0x2;
      if (j > 0)
      {
        str = "SCAN";
        ((List)localObject).add(str);
      }
      boolean bool = ((List)localObject).isEmpty();
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "UNKNOWN:";
        localObject = str + paramInt;
      }
      else
      {
        localObject = localObject.toString();
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Strategy;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (Strategy)paramObject;
        int i = this.mVersionCode;
        int j = ((Strategy)paramObject).mVersionCode;
        if (i == j)
        {
          i = this.zzbbQ;
          j = ((Strategy)paramObject).zzbbQ;
          if (i == j)
          {
            i = this.zzbbM;
            j = ((Strategy)paramObject).zzbbM;
            if (i == j)
            {
              i = this.zzbbN;
              j = ((Strategy)paramObject).zzbbN;
              if (i == j)
              {
                i = this.zzbbP;
                j = ((Strategy)paramObject).zzbbP;
                if (i == j) {
                  continue;
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.mVersionCode * 31;
    int j = this.zzbbQ;
    i = (i + j) * 31;
    j = this.zzbbM;
    i = (i + j) * 31;
    j = this.zzbbN;
    i = (i + j) * 31;
    j = this.zzbbP;
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Strategy{ttlSeconds=");
    int i = this.zzbbM;
    localStringBuilder = localStringBuilder.append(i).append(", distanceType=");
    String str = zzjd(this.zzbbN);
    localStringBuilder = localStringBuilder.append(str).append(", discoveryMedium=");
    str = zzje(this.zzbbP);
    localStringBuilder = localStringBuilder.append(str).append(", discoveryMode=");
    str = zzjf(this.zzbbQ);
    return str + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public int zzEr()
  {
    return this.zzbbP;
  }
  
  public int zzEs()
  {
    return this.zzbbQ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\Strategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */