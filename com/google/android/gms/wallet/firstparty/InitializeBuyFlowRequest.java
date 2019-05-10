package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class InitializeBuyFlowRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  byte[][] zzbpV;
  
  static
  {
    zzf localzzf = new com/google/android/gms/wallet/firstparty/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  InitializeBuyFlowRequest(int paramInt, byte[][] paramArrayOfByte)
  {
    this.mVersionCode = paramInt;
    this.zzbpV = paramArrayOfByte;
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
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\InitializeBuyFlowRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */