package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class ApplicationStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private String zzadp;
  
  static
  {
    zza localzza = new com/google/android/gms/cast/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public ApplicationStatus()
  {
    this(1, null);
  }
  
  ApplicationStatus(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzadp = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof ApplicationStatus;
      String str1;
      if (!bool)
      {
        bool = false;
        str1 = null;
      }
      else
      {
        paramObject = (ApplicationStatus)paramObject;
        str1 = this.zzadp;
        String str2 = ((ApplicationStatus)paramObject).zzadp;
        bool = zzf.zza(str1, str2);
      }
    }
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    String str = this.zzadp;
    arrayOfObject[0] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public String zzoe()
  {
    return this.zzadp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\ApplicationStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */