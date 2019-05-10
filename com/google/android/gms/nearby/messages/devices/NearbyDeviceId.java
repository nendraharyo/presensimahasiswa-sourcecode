package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class NearbyDeviceId
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final NearbyDeviceId zzbcl;
  final int mVersionCode;
  private final int zzabB;
  final byte[] zzbbY;
  private final zzb zzbcm;
  private final zzd zzbcn;
  
  static
  {
    Object localObject = new com/google/android/gms/nearby/messages/devices/zzh;
    ((zzh)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new com/google/android/gms/nearby/messages/devices/NearbyDeviceId;
    ((NearbyDeviceId)localObject).<init>();
    zzbcl = (NearbyDeviceId)localObject;
  }
  
  private NearbyDeviceId()
  {
    this(i, i, null);
  }
  
  NearbyDeviceId(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.mVersionCode = paramInt1;
    this.zzabB = paramInt2;
    this.zzbbY = paramArrayOfByte;
    int i = 2;
    zzb localzzb;
    if (paramInt2 == i)
    {
      localzzb = new com/google/android/gms/nearby/messages/devices/zzb;
      localzzb.<init>(paramArrayOfByte);
    }
    for (;;)
    {
      this.zzbcm = localzzb;
      i = 3;
      if (paramInt2 == i)
      {
        localzzd = new com/google/android/gms/nearby/messages/devices/zzd;
        localzzd.<init>(paramArrayOfByte);
      }
      this.zzbcn = localzzd;
      return;
      i = 0;
      localzzb = null;
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
      boolean bool2 = paramObject instanceof NearbyDeviceId;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (NearbyDeviceId)paramObject;
        Object localObject1 = Integer.valueOf(this.zzabB);
        int i = ((NearbyDeviceId)paramObject).zzabB;
        Object localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzbbY;
          localObject2 = ((NearbyDeviceId)paramObject).zzbbY;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Integer.valueOf(this.zzabB);
    arrayOfObject[0] = localObject;
    localObject = this.zzbbY;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = "NearbyDeviceId{";
    localStringBuilder = localStringBuilder.append((String)localObject1);
    int i = this.zzabB;
    switch (i)
    {
    }
    for (;;)
    {
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localObject1 = localStringBuilder.append("eddystoneUid=");
      Object localObject2 = this.zzbcm;
      ((StringBuilder)localObject1).append(localObject2);
      continue;
      localObject1 = localStringBuilder.append("iBeaconId=");
      localObject2 = this.zzbcn;
      ((StringBuilder)localObject1).append(localObject2);
      continue;
      localObject1 = "UNKNOWN";
      localStringBuilder.append((String)localObject1);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\NearbyDeviceId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */