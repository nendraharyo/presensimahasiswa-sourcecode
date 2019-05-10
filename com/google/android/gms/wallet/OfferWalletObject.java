package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject.zza;

public final class OfferWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  CommonWalletObject zzboB;
  String zzbpB;
  String zzio;
  
  static
  {
    zzo localzzo = new com/google/android/gms/wallet/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  OfferWalletObject()
  {
    this.mVersionCode = 3;
  }
  
  OfferWalletObject(int paramInt, String paramString1, String paramString2, CommonWalletObject paramCommonWalletObject)
  {
    this.mVersionCode = paramInt;
    this.zzbpB = paramString2;
    int i = 3;
    CommonWalletObject localCommonWalletObject;
    if (paramInt < i) {
      localCommonWalletObject = CommonWalletObject.zzIr().zzgK(paramString1).zzIs();
    }
    for (this.zzboB = localCommonWalletObject;; this.zzboB = paramCommonWalletObject) {
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getId()
  {
    return this.zzboB.getId();
  }
  
  public String getRedemptionCode()
  {
    return this.zzbpB;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\OfferWalletObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */