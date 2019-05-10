package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetInstrumentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  int[] zzbpS;
  
  static
  {
    zzd localzzd = new com/google/android/gms/wallet/firstparty/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  GetInstrumentsRequest()
  {
    this(1, null);
  }
  
  GetInstrumentsRequest(int paramInt, int[] paramArrayOfInt)
  {
    this.mVersionCode = paramInt;
    this.zzbpS = paramArrayOfInt;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\firstparty\GetInstrumentsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */