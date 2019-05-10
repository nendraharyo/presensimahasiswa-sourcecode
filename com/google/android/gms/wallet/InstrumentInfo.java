package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InstrumentInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private String zzboI;
  private String zzboJ;
  
  static
  {
    zzh localzzh = new com/google/android/gms/wallet/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  InstrumentInfo(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzboI = paramString1;
    this.zzboJ = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getInstrumentDetails()
  {
    return this.zzboJ;
  }
  
  public String getInstrumentType()
  {
    return this.zzboI;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\InstrumentInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */