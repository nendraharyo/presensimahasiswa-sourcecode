package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PackageStorageInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final String label;
  public final String packageName;
  public final int versionCode;
  public final long zzbta;
  
  static
  {
    zzbe localzzbe = new com/google/android/gms/wearable/internal/zzbe;
    localzzbe.<init>();
    CREATOR = localzzbe;
  }
  
  PackageStorageInfo(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    this.versionCode = paramInt;
    this.packageName = paramString1;
    this.label = paramString2;
    this.zzbta = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbe.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\PackageStorageInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */