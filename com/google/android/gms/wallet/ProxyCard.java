package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzbpF;
  String zzbpG;
  int zzbpH;
  int zzbpI;
  
  static
  {
    zzr localzzr = new com/google/android/gms/wallet/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzbpF = paramString1;
    this.zzbpG = paramString2;
    this.zzbpH = paramInt2;
    this.zzbpI = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCvn()
  {
    return this.zzbpG;
  }
  
  public int getExpirationMonth()
  {
    return this.zzbpH;
  }
  
  public int getExpirationYear()
  {
    return this.zzbpI;
  }
  
  public String getPan()
  {
    return this.zzbpF;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\ProxyCard.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */