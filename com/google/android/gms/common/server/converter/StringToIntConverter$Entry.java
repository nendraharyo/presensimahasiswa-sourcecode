package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StringToIntConverter$Entry
  implements SafeParcelable
{
  public static final zzc CREATOR;
  final int versionCode;
  final String zzamJ;
  final int zzamK;
  
  static
  {
    zzc localzzc = new com/google/android/gms/common/server/converter/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  StringToIntConverter$Entry(int paramInt1, String paramString, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.zzamJ = paramString;
    this.zzamK = paramInt2;
  }
  
  StringToIntConverter$Entry(String paramString, int paramInt)
  {
    this.versionCode = 1;
    this.zzamJ = paramString;
    this.zzamK = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\converter\StringToIntConverter$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */