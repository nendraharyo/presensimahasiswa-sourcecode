package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class MaskedWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzboi;
  String zzbop;
  Cart zzboz;
  boolean zzbpl;
  boolean zzbpm;
  boolean zzbpn;
  String zzbpo;
  String zzbpp;
  boolean zzbpq;
  boolean zzbpr;
  CountrySpecification[] zzbps;
  boolean zzbpt;
  boolean zzbpu;
  ArrayList zzbpv;
  PaymentMethodTokenizationParameters zzbpw;
  ArrayList zzbpx;
  
  static
  {
    zzm localzzm = new com/google/android/gms/wallet/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  MaskedWalletRequest()
  {
    this.mVersionCode = 3;
    this.zzbpt = bool;
    this.zzbpu = bool;
  }
  
  MaskedWalletRequest(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, String paramString3, String paramString4, Cart paramCart, boolean paramBoolean4, boolean paramBoolean5, CountrySpecification[] paramArrayOfCountrySpecification, boolean paramBoolean6, boolean paramBoolean7, ArrayList paramArrayList1, PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters, ArrayList paramArrayList2)
  {
    this.mVersionCode = paramInt;
    this.zzbop = paramString1;
    this.zzbpl = paramBoolean1;
    this.zzbpm = paramBoolean2;
    this.zzbpn = paramBoolean3;
    this.zzbpo = paramString2;
    this.zzboi = paramString3;
    this.zzbpp = paramString4;
    this.zzboz = paramCart;
    this.zzbpq = paramBoolean4;
    this.zzbpr = paramBoolean5;
    this.zzbps = paramArrayOfCountrySpecification;
    this.zzbpt = paramBoolean6;
    this.zzbpu = paramBoolean7;
    this.zzbpv = paramArrayList1;
    this.zzbpw = paramPaymentMethodTokenizationParameters;
    this.zzbpx = paramArrayList2;
  }
  
  public static MaskedWalletRequest.Builder newBuilder()
  {
    MaskedWalletRequest.Builder localBuilder = new com/google/android/gms/wallet/MaskedWalletRequest$Builder;
    MaskedWalletRequest localMaskedWalletRequest = new com/google/android/gms/wallet/MaskedWalletRequest;
    localMaskedWalletRequest.<init>();
    localMaskedWalletRequest.getClass();
    localBuilder.<init>(localMaskedWalletRequest, null);
    return localBuilder;
  }
  
  public boolean allowDebitCard()
  {
    return this.zzbpu;
  }
  
  public boolean allowPrepaidCard()
  {
    return this.zzbpt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ArrayList getAllowedCardNetworks()
  {
    return this.zzbpx;
  }
  
  public ArrayList getAllowedCountrySpecificationsForShipping()
  {
    return this.zzbpv;
  }
  
  public CountrySpecification[] getAllowedShippingCountrySpecifications()
  {
    return this.zzbps;
  }
  
  public Cart getCart()
  {
    return this.zzboz;
  }
  
  public String getCurrencyCode()
  {
    return this.zzboi;
  }
  
  public String getEstimatedTotalPrice()
  {
    return this.zzbpo;
  }
  
  public String getMerchantName()
  {
    return this.zzbpp;
  }
  
  public String getMerchantTransactionId()
  {
    return this.zzbop;
  }
  
  public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters()
  {
    return this.zzbpw;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean isBillingAgreement()
  {
    return this.zzbpr;
  }
  
  public boolean isPhoneNumberRequired()
  {
    return this.zzbpl;
  }
  
  public boolean isShippingAddressRequired()
  {
    return this.zzbpm;
  }
  
  public boolean useMinimalBillingAddress()
  {
    return this.zzbpn;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\MaskedWalletRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */