package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzboo;
  String zzbop;
  String zzbor;
  Address zzbos;
  Address zzbot;
  String[] zzbou;
  UserAddress zzbov;
  UserAddress zzbow;
  InstrumentInfo[] zzbox;
  LoyaltyWalletObject[] zzbpi;
  OfferWalletObject[] zzbpj;
  
  static
  {
    zzl localzzl = new com/google/android/gms/wallet/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  private MaskedWallet()
  {
    this.mVersionCode = 2;
  }
  
  MaskedWallet(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Address paramAddress1, Address paramAddress2, LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject, OfferWalletObject[] paramArrayOfOfferWalletObject, UserAddress paramUserAddress1, UserAddress paramUserAddress2, InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.mVersionCode = paramInt;
    this.zzboo = paramString1;
    this.zzbop = paramString2;
    this.zzbou = paramArrayOfString;
    this.zzbor = paramString3;
    this.zzbos = paramAddress1;
    this.zzbot = paramAddress2;
    this.zzbpi = paramArrayOfLoyaltyWalletObject;
    this.zzbpj = paramArrayOfOfferWalletObject;
    this.zzbov = paramUserAddress1;
    this.zzbow = paramUserAddress2;
    this.zzbox = paramArrayOfInstrumentInfo;
  }
  
  public static MaskedWallet.Builder newBuilderFrom(MaskedWallet paramMaskedWallet)
  {
    zzx.zzz(paramMaskedWallet);
    MaskedWallet.Builder localBuilder = zzIl();
    Object localObject = paramMaskedWallet.getGoogleTransactionId();
    localBuilder = localBuilder.setGoogleTransactionId((String)localObject);
    localObject = paramMaskedWallet.getMerchantTransactionId();
    localBuilder = localBuilder.setMerchantTransactionId((String)localObject);
    localObject = paramMaskedWallet.getPaymentDescriptions();
    localBuilder = localBuilder.setPaymentDescriptions((String[])localObject);
    localObject = paramMaskedWallet.getInstrumentInfos();
    localBuilder = localBuilder.setInstrumentInfos((InstrumentInfo[])localObject);
    localObject = paramMaskedWallet.getEmail();
    localBuilder = localBuilder.setEmail((String)localObject);
    localObject = paramMaskedWallet.zzIm();
    localBuilder = localBuilder.zza((LoyaltyWalletObject[])localObject);
    localObject = paramMaskedWallet.zzIn();
    localBuilder = localBuilder.zza((OfferWalletObject[])localObject);
    localObject = paramMaskedWallet.getBuyerBillingAddress();
    localBuilder = localBuilder.setBuyerBillingAddress((UserAddress)localObject);
    localObject = paramMaskedWallet.getBuyerShippingAddress();
    return localBuilder.setBuyerShippingAddress((UserAddress)localObject);
  }
  
  public static MaskedWallet.Builder zzIl()
  {
    MaskedWallet.Builder localBuilder = new com/google/android/gms/wallet/MaskedWallet$Builder;
    MaskedWallet localMaskedWallet = new com/google/android/gms/wallet/MaskedWallet;
    localMaskedWallet.<init>();
    localMaskedWallet.getClass();
    localBuilder.<init>(localMaskedWallet, null);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Address getBillingAddress()
  {
    return this.zzbos;
  }
  
  public UserAddress getBuyerBillingAddress()
  {
    return this.zzbov;
  }
  
  public UserAddress getBuyerShippingAddress()
  {
    return this.zzbow;
  }
  
  public String getEmail()
  {
    return this.zzbor;
  }
  
  public String getGoogleTransactionId()
  {
    return this.zzboo;
  }
  
  public InstrumentInfo[] getInstrumentInfos()
  {
    return this.zzbox;
  }
  
  public String getMerchantTransactionId()
  {
    return this.zzbop;
  }
  
  public String[] getPaymentDescriptions()
  {
    return this.zzbou;
  }
  
  public Address getShippingAddress()
  {
    return this.zzbot;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public LoyaltyWalletObject[] zzIm()
  {
    return this.zzbpi;
  }
  
  public OfferWalletObject[] zzIn()
  {
    return this.zzbpj;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\MaskedWallet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */