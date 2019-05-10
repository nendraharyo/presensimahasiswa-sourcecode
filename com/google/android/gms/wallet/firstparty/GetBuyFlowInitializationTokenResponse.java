package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetBuyFlowInitializationTokenResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  byte[] zzbpR;
  
  static
  {
    zzc localzzc = new com/google/android/gms/wallet/firstparty/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  GetBuyFlowInitializationTokenResponse()
  {
    this(1, arrayOfByte);
  }
  
  GetBuyFlowInitializationTokenResponse(int paramInt, byte[] paramArrayOfByte)
  {
    this.mVersionCode = paramInt;
    this.zzbpR = paramArrayOfByte;
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
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\GetBuyFlowInitializationTokenResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */