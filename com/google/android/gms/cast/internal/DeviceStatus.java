package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class DeviceStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private double zzabs;
  private boolean zzabt;
  private int zzadG;
  private int zzadH;
  private ApplicationMetadata zzadR;
  
  static
  {
    zzg localzzg = new com/google/android/gms/cast/internal/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  public DeviceStatus()
  {
    this(3, 0.0D / 0.0D, false, i, null, i);
  }
  
  DeviceStatus(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, ApplicationMetadata paramApplicationMetadata, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzabs = paramDouble;
    this.zzabt = paramBoolean;
    this.zzadG = paramInt2;
    this.zzadR = paramApplicationMetadata;
    this.zzadH = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof DeviceStatus;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (DeviceStatus)paramObject;
        double d1 = this.zzabs;
        double d2 = ((DeviceStatus)paramObject).zzabs;
        bool2 = d1 < d2;
        if (!bool2)
        {
          bool2 = this.zzabt;
          boolean bool4 = ((DeviceStatus)paramObject).zzabt;
          if (bool2 == bool4)
          {
            int i = this.zzadG;
            int k = ((DeviceStatus)paramObject).zzadG;
            if (i == k)
            {
              ApplicationMetadata localApplicationMetadata1 = this.zzadR;
              ApplicationMetadata localApplicationMetadata2 = ((DeviceStatus)paramObject).zzadR;
              boolean bool3 = zzf.zza(localApplicationMetadata1, localApplicationMetadata2);
              if (bool3)
              {
                int j = this.zzadH;
                k = ((DeviceStatus)paramObject).zzadH;
                if (j == k) {
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
  
  public ApplicationMetadata getApplicationMetadata()
  {
    return this.zzadR;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Double.valueOf(this.zzabs);
    arrayOfObject[0] = localObject;
    localObject = Boolean.valueOf(this.zzabt);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzadG);
    arrayOfObject[2] = localObject;
    localObject = this.zzadR;
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzadH);
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public double zzok()
  {
    return this.zzabs;
  }
  
  public int zzol()
  {
    return this.zzadG;
  }
  
  public int zzom()
  {
    return this.zzadH;
  }
  
  public boolean zzot()
  {
    return this.zzabt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\DeviceStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */