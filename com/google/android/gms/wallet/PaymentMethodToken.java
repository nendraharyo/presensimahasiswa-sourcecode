package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PaymentMethodToken
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzbaW;
  int zzbpC;
  
  static
  {
    zzp localzzp = new com/google/android/gms/wallet/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  private PaymentMethodToken()
  {
    this.mVersionCode = 1;
  }
  
  PaymentMethodToken(int paramInt1, int paramInt2, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.zzbpC = paramInt2;
    this.zzbaW = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getPaymentMethodTokenizationType()
  {
    return this.zzbpC;
  }
  
  public String getToken()
  {
    return this.zzbaW;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\PaymentMethodToken.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */