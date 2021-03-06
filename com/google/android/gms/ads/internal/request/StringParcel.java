package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StringParcel
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  String zzxG;
  
  static
  {
    zzn localzzn = new com/google/android/gms/ads/internal/request/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  StringParcel(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzxG = paramString;
  }
  
  public StringParcel(String paramString)
  {
    this.mVersionCode = 1;
    this.zzxG = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public String zzgz()
  {
    return this.zzxG;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\StringParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */