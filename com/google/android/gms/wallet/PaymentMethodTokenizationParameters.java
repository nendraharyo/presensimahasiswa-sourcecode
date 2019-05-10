package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PaymentMethodTokenizationParameters
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  int zzbpC;
  Bundle zzbpD;
  
  static
  {
    zzq localzzq = new com/google/android/gms/wallet/zzq;
    localzzq.<init>();
    CREATOR = localzzq;
  }
  
  private PaymentMethodTokenizationParameters()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.zzbpD = localBundle;
    this.mVersionCode = 1;
  }
  
  PaymentMethodTokenizationParameters(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.zzbpD = localBundle;
    this.mVersionCode = paramInt1;
    this.zzbpC = paramInt2;
    this.zzbpD = paramBundle;
  }
  
  public static PaymentMethodTokenizationParameters.Builder newBuilder()
  {
    PaymentMethodTokenizationParameters.Builder localBuilder = new com/google/android/gms/wallet/PaymentMethodTokenizationParameters$Builder;
    PaymentMethodTokenizationParameters localPaymentMethodTokenizationParameters = new com/google/android/gms/wallet/PaymentMethodTokenizationParameters;
    localPaymentMethodTokenizationParameters.<init>();
    localPaymentMethodTokenizationParameters.getClass();
    localBuilder.<init>(localPaymentMethodTokenizationParameters, null);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bundle getParameters()
  {
    Bundle localBundle1 = new android/os/Bundle;
    Bundle localBundle2 = this.zzbpD;
    localBundle1.<init>(localBundle2);
    return localBundle1;
  }
  
  public int getPaymentMethodTokenizationType()
  {
    return this.zzbpC;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\PaymentMethodTokenizationParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */