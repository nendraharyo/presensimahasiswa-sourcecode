package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetInstrumentsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  String[] zzbpT;
  byte[][] zzbpU;
  
  static
  {
    zze localzze = new com/google/android/gms/wallet/firstparty/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  GetInstrumentsResponse()
  {
    this(1, arrayOfString, arrayOfByte);
  }
  
  GetInstrumentsResponse(int paramInt, String[] paramArrayOfString, byte[][] paramArrayOfByte)
  {
    this.mVersionCode = paramInt;
    this.zzbpT = paramArrayOfString;
    this.zzbpU = paramArrayOfByte;
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
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\GetInstrumentsResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */