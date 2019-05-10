package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class Scope
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final String zzagB;
  
  static
  {
    zzb localzzb = new com/google/android/gms/common/api/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  Scope(int paramInt, String paramString)
  {
    zzx.zzh(paramString, "scopeUri must not be null or empty");
    this.mVersionCode = paramInt;
    this.zzagB = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof Scope;
      String str1;
      if (!bool)
      {
        bool = false;
        str1 = null;
      }
      else
      {
        str1 = this.zzagB;
        paramObject = (Scope)paramObject;
        String str2 = ((Scope)paramObject).zzagB;
        bool = str1.equals(str2);
      }
    }
  }
  
  public int hashCode()
  {
    return this.zzagB.hashCode();
  }
  
  public String toString()
  {
    return this.zzagB;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzpb()
  {
    return this.zzagB;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Scope.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */