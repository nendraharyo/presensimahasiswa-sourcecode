package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class AppIdentifier
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzaxk;
  
  static
  {
    zza localzza = new com/google/android/gms/nearby/connection/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  AppIdentifier(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    String str = zzx.zzh(paramString, "Missing application identifier value");
    this.zzaxk = str;
  }
  
  public AppIdentifier(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getIdentifier()
  {
    return this.zzaxk;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\connection\AppIdentifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */