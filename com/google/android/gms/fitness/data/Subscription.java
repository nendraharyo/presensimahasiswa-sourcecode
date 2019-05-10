package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class Subscription
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final DataType zzavT;
  private final DataSource zzavU;
  private final long zzaxo;
  private final int zzaxp;
  
  static
  {
    zzs localzzs = new com/google/android/gms/fitness/data/zzs;
    localzzs.<init>();
    CREATOR = localzzs;
  }
  
  Subscription(int paramInt1, DataSource paramDataSource, DataType paramDataType, long paramLong, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzavU = paramDataSource;
    this.zzavT = paramDataType;
    this.zzaxo = paramLong;
    this.zzaxp = paramInt2;
  }
  
  private Subscription(Subscription.zza paramzza)
  {
    this.mVersionCode = 1;
    Object localObject = Subscription.zza.zza(paramzza);
    this.zzavT = ((DataType)localObject);
    localObject = Subscription.zza.zzb(paramzza);
    this.zzavU = ((DataSource)localObject);
    long l = Subscription.zza.zzc(paramzza);
    this.zzaxo = l;
    int i = Subscription.zza.zzd(paramzza);
    this.zzaxp = i;
  }
  
  private boolean zza(Subscription paramSubscription)
  {
    Object localObject1 = this.zzavU;
    Object localObject2 = paramSubscription.zzavU;
    boolean bool = zzw.equal(localObject1, localObject2);
    int i;
    if (bool)
    {
      localObject1 = this.zzavT;
      localObject2 = paramSubscription.zzavT;
      bool = zzw.equal(localObject1, localObject2);
      if (bool)
      {
        long l1 = this.zzaxo;
        long l2 = paramSubscription.zzaxo;
        bool = l1 < l2;
        if (!bool)
        {
          i = this.zzaxp;
          int k = paramSubscription.zzaxp;
          if (i == k) {
            i = 1;
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
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
      bool = paramObject instanceof Subscription;
      if (!bool) {
        break label33;
      }
      paramObject = (Subscription)paramObject;
      bool = zza((Subscription)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int getAccuracyMode()
  {
    return this.zzaxp;
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = this.zzavU;
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaxo);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzaxp);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toDebugString()
  {
    String str = "Subscription{%s}";
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    Object localObject = this.zzavU;
    if (localObject == null) {}
    for (localObject = this.zzavT.getName();; localObject = this.zzavU.toDebugString())
    {
      arrayOfObject[0] = localObject;
      return String.format(str, arrayOfObject);
    }
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzavU;
    localzza = localzza.zzg("dataSource", localObject);
    localObject = this.zzavT;
    localzza = localzza.zzg("dataType", localObject);
    localObject = Long.valueOf(this.zzaxo);
    localzza = localzza.zzg("samplingIntervalMicros", localObject);
    localObject = Integer.valueOf(this.zzaxp);
    return localzza.zzg("accuracyMode", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
  
  public long zzux()
  {
    return this.zzaxo;
  }
  
  public DataType zzuy()
  {
    DataType localDataType = this.zzavT;
    if (localDataType == null) {}
    for (localDataType = this.zzavU.getDataType();; localDataType = this.zzavT) {
      return localDataType;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Subscription.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */