package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TextModuleData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  String body;
  private final int mVersionCode;
  String zzbqO;
  
  static
  {
    zzf localzzf = new com/google/android/gms/wallet/wobs/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  TextModuleData()
  {
    this.mVersionCode = 1;
  }
  
  TextModuleData(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzbqO = paramString1;
    this.body = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\TextModuleData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */