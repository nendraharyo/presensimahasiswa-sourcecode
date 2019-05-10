package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CreateWalletObjectsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  LoyaltyWalletObject zzbol;
  OfferWalletObject zzbom;
  GiftCardWalletObject zzbon;
  
  static
  {
    zzd localzzd = new com/google/android/gms/wallet/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  CreateWalletObjectsRequest()
  {
    this.mVersionCode = 3;
  }
  
  CreateWalletObjectsRequest(int paramInt, LoyaltyWalletObject paramLoyaltyWalletObject, OfferWalletObject paramOfferWalletObject, GiftCardWalletObject paramGiftCardWalletObject)
  {
    this.mVersionCode = paramInt;
    this.zzbol = paramLoyaltyWalletObject;
    this.zzbom = paramOfferWalletObject;
    this.zzbon = paramGiftCardWalletObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\CreateWalletObjectsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */