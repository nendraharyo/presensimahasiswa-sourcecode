package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String zzboo;
  String zzbop;
  Cart zzboz;
  
  static
  {
    zzf localzzf = new com/google/android/gms/wallet/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  FullWalletRequest()
  {
    this.mVersionCode = 1;
  }
  
  FullWalletRequest(int paramInt, String paramString1, String paramString2, Cart paramCart)
  {
    this.mVersionCode = paramInt;
    this.zzboo = paramString1;
    this.zzbop = paramString2;
    this.zzboz = paramCart;
  }
  
  public static FullWalletRequest.Builder newBuilder()
  {
    FullWalletRequest.Builder localBuilder = new com/google/android/gms/wallet/FullWalletRequest$Builder;
    FullWalletRequest localFullWalletRequest = new com/google/android/gms/wallet/FullWalletRequest;
    localFullWalletRequest.<init>();
    localFullWalletRequest.getClass();
    localBuilder.<init>(localFullWalletRequest, null);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Cart getCart()
  {
    return this.zzboz;
  }
  
  public String getGoogleTransactionId()
  {
    return this.zzboo;
  }
  
  public String getMerchantTransactionId()
  {
    return this.zzbop;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\FullWalletRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */