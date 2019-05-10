package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class UserAttributeParcel
  implements SafeParcelable
{
  public static final zzah CREATOR;
  public final String name;
  public final int versionCode;
  public final String zzaVW;
  public final long zzaZm;
  public final Long zzaZn;
  public final Float zzaZo;
  public final String zzamJ;
  
  static
  {
    zzah localzzah = new com/google/android/gms/measurement/internal/zzah;
    localzzah.<init>();
    CREATOR = localzzah;
  }
  
  UserAttributeParcel(int paramInt, String paramString1, long paramLong, Long paramLong1, Float paramFloat, String paramString2, String paramString3)
  {
    this.versionCode = paramInt;
    this.name = paramString1;
    this.zzaZm = paramLong;
    this.zzaZn = paramLong1;
    this.zzaZo = paramFloat;
    this.zzamJ = paramString2;
    this.zzaVW = paramString3;
  }
  
  UserAttributeParcel(zzai paramzzai)
  {
    this(str1, l, localObject, str2);
  }
  
  UserAttributeParcel(String paramString1, long paramLong, Object paramObject, String paramString2)
  {
    zzx.zzcM(paramString1);
    int i = 1;
    this.versionCode = i;
    this.name = paramString1;
    this.zzaZm = paramLong;
    this.zzaVW = paramString2;
    if (paramObject == null)
    {
      this.zzaZn = null;
      this.zzaZo = null;
      this.zzamJ = null;
    }
    for (;;)
    {
      return;
      i = paramObject instanceof Long;
      if (i != 0)
      {
        paramObject = (Long)paramObject;
        this.zzaZn = ((Long)paramObject);
        this.zzaZo = null;
        this.zzamJ = null;
      }
      else
      {
        i = paramObject instanceof Float;
        if (i != 0)
        {
          this.zzaZn = null;
          paramObject = (Float)paramObject;
          this.zzaZo = ((Float)paramObject);
          this.zzamJ = null;
        }
        else
        {
          i = paramObject instanceof String;
          if (i == 0) {
            break;
          }
          this.zzaZn = null;
          this.zzaZo = null;
          paramObject = (String)paramObject;
          this.zzamJ = ((String)paramObject);
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("User attribute given of un-supported type");
    throw localIllegalArgumentException;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object getValue()
  {
    Object localObject = this.zzaZn;
    if (localObject != null) {
      localObject = this.zzaZn;
    }
    for (;;)
    {
      return localObject;
      localObject = this.zzaZo;
      if (localObject != null)
      {
        localObject = this.zzaZo;
      }
      else
      {
        localObject = this.zzamJ;
        if (localObject != null) {
          localObject = this.zzamJ;
        } else {
          localObject = null;
        }
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzah.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\UserAttributeParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */