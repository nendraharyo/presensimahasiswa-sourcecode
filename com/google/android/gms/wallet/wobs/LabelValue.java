package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LabelValue
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  String label;
  private final int mVersionCode;
  String value;
  
  static
  {
    zzb localzzb = new com/google/android/gms/wallet/wobs/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  LabelValue()
  {
    this.mVersionCode = 1;
  }
  
  LabelValue(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.label = paramString1;
    this.value = paramString2;
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
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\LabelValue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */