package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet$Builder
{
  private MaskedWallet$Builder(MaskedWallet paramMaskedWallet) {}
  
  public MaskedWallet build()
  {
    return this.zzbpk;
  }
  
  public Builder setBillingAddress(Address paramAddress)
  {
    this.zzbpk.zzbos = paramAddress;
    return this;
  }
  
  public Builder setBuyerBillingAddress(UserAddress paramUserAddress)
  {
    this.zzbpk.zzbov = paramUserAddress;
    return this;
  }
  
  public Builder setBuyerShippingAddress(UserAddress paramUserAddress)
  {
    this.zzbpk.zzbow = paramUserAddress;
    return this;
  }
  
  public Builder setEmail(String paramString)
  {
    this.zzbpk.zzbor = paramString;
    return this;
  }
  
  public Builder setGoogleTransactionId(String paramString)
  {
    this.zzbpk.zzboo = paramString;
    return this;
  }
  
  public Builder setInstrumentInfos(InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.zzbpk.zzbox = paramArrayOfInstrumentInfo;
    return this;
  }
  
  public Builder setMerchantTransactionId(String paramString)
  {
    this.zzbpk.zzbop = paramString;
    return this;
  }
  
  public Builder setPaymentDescriptions(String[] paramArrayOfString)
  {
    this.zzbpk.zzbou = paramArrayOfString;
    return this;
  }
  
  public Builder setShippingAddress(Address paramAddress)
  {
    this.zzbpk.zzbot = paramAddress;
    return this;
  }
  
  public Builder zza(LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject)
  {
    this.zzbpk.zzbpi = paramArrayOfLoyaltyWalletObject;
    return this;
  }
  
  public Builder zza(OfferWalletObject[] paramArrayOfOfferWalletObject)
  {
    this.zzbpk.zzbpj = paramArrayOfOfferWalletObject;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\MaskedWallet$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */