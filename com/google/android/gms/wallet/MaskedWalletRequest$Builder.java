package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest$Builder
{
  private MaskedWalletRequest$Builder(MaskedWalletRequest paramMaskedWalletRequest) {}
  
  public Builder addAllowedCardNetwork(int paramInt)
  {
    Object localObject1 = this.zzbpy.zzbpx;
    if (localObject1 == null)
    {
      localObject1 = this.zzbpy;
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      ((MaskedWalletRequest)localObject1).zzbpx = ((ArrayList)localObject2);
    }
    localObject1 = this.zzbpy.zzbpx;
    Object localObject2 = Integer.valueOf(paramInt);
    ((ArrayList)localObject1).add(localObject2);
    return this;
  }
  
  public Builder addAllowedCardNetworks(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      Object localObject = this.zzbpy.zzbpx;
      if (localObject == null)
      {
        localObject = this.zzbpy;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        ((MaskedWalletRequest)localObject).zzbpx = localArrayList;
      }
      localObject = this.zzbpy.zzbpx;
      ((ArrayList)localObject).addAll(paramCollection);
    }
    return this;
  }
  
  public Builder addAllowedCountrySpecificationForShipping(CountrySpecification paramCountrySpecification)
  {
    Object localObject = this.zzbpy.zzbpv;
    if (localObject == null)
    {
      localObject = this.zzbpy;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      ((MaskedWalletRequest)localObject).zzbpv = localArrayList;
    }
    this.zzbpy.zzbpv.add(paramCountrySpecification);
    return this;
  }
  
  public Builder addAllowedCountrySpecificationsForShipping(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      Object localObject = this.zzbpy.zzbpv;
      if (localObject == null)
      {
        localObject = this.zzbpy;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        ((MaskedWalletRequest)localObject).zzbpv = localArrayList;
      }
      localObject = this.zzbpy.zzbpv;
      ((ArrayList)localObject).addAll(paramCollection);
    }
    return this;
  }
  
  public MaskedWalletRequest build()
  {
    return this.zzbpy;
  }
  
  public Builder setAllowDebitCard(boolean paramBoolean)
  {
    this.zzbpy.zzbpu = paramBoolean;
    return this;
  }
  
  public Builder setAllowPrepaidCard(boolean paramBoolean)
  {
    this.zzbpy.zzbpt = paramBoolean;
    return this;
  }
  
  public Builder setCart(Cart paramCart)
  {
    this.zzbpy.zzboz = paramCart;
    return this;
  }
  
  public Builder setCurrencyCode(String paramString)
  {
    this.zzbpy.zzboi = paramString;
    return this;
  }
  
  public Builder setEstimatedTotalPrice(String paramString)
  {
    this.zzbpy.zzbpo = paramString;
    return this;
  }
  
  public Builder setIsBillingAgreement(boolean paramBoolean)
  {
    this.zzbpy.zzbpr = paramBoolean;
    return this;
  }
  
  public Builder setMerchantName(String paramString)
  {
    this.zzbpy.zzbpp = paramString;
    return this;
  }
  
  public Builder setMerchantTransactionId(String paramString)
  {
    this.zzbpy.zzbop = paramString;
    return this;
  }
  
  public Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters)
  {
    this.zzbpy.zzbpw = paramPaymentMethodTokenizationParameters;
    return this;
  }
  
  public Builder setPhoneNumberRequired(boolean paramBoolean)
  {
    this.zzbpy.zzbpl = paramBoolean;
    return this;
  }
  
  public Builder setShippingAddressRequired(boolean paramBoolean)
  {
    this.zzbpy.zzbpm = paramBoolean;
    return this;
  }
  
  public Builder setUseMinimalBillingAddress(boolean paramBoolean)
  {
    this.zzbpy.zzbpn = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\MaskedWalletRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */