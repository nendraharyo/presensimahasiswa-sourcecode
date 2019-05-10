package com.google.android.gms.wallet;

public final class FullWalletRequest$Builder
{
  private FullWalletRequest$Builder(FullWalletRequest paramFullWalletRequest) {}
  
  public FullWalletRequest build()
  {
    return this.zzboA;
  }
  
  public Builder setCart(Cart paramCart)
  {
    this.zzboA.zzboz = paramCart;
    return this;
  }
  
  public Builder setGoogleTransactionId(String paramString)
  {
    this.zzboA.zzboo = paramString;
    return this;
  }
  
  public Builder setMerchantTransactionId(String paramString)
  {
    this.zzboA.zzbop = paramString;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\FullWalletRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */