package com.google.android.gms.wallet;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;

public final class PaymentMethodTokenizationParameters$Builder
{
  private PaymentMethodTokenizationParameters$Builder(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters) {}
  
  public Builder addParameter(String paramString1, String paramString2)
  {
    zzx.zzh(paramString1, "Tokenization parameter name must not be empty");
    zzx.zzh(paramString2, "Tokenization parameter value must not be empty");
    this.zzbpE.zzbpD.putString(paramString1, paramString2);
    return this;
  }
  
  public PaymentMethodTokenizationParameters build()
  {
    return this.zzbpE;
  }
  
  public Builder setPaymentMethodTokenizationType(int paramInt)
  {
    this.zzbpE.zzbpC = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\PaymentMethodTokenizationParameters$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */