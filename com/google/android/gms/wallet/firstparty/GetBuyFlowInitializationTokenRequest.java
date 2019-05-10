package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetBuyFlowInitializationTokenRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  byte[] zzbpP;
  byte[] zzbpQ;
  
  static
  {
    zzb localzzb = new com/google/android/gms/wallet/firstparty/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  GetBuyFlowInitializationTokenRequest()
  {
    this(1, null, null);
  }
  
  GetBuyFlowInitializationTokenRequest(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.mVersionCode = paramInt;
    this.zzbpP = paramArrayOfByte1;
    this.zzbpQ = paramArrayOfByte2;
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
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\GetBuyFlowInitializationTokenRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */