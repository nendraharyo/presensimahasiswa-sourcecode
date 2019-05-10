package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class IsReadyToPayRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  
  static
  {
    zzi localzzi = new com/google/android/gms/wallet/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  IsReadyToPayRequest()
  {
    this.mVersionCode = 1;
  }
  
  IsReadyToPayRequest(int paramInt)
  {
    this.mVersionCode = paramInt;
  }
  
  public static IsReadyToPayRequest.zza zzIj()
  {
    IsReadyToPayRequest.zza localzza = new com/google/android/gms/wallet/IsReadyToPayRequest$zza;
    IsReadyToPayRequest localIsReadyToPayRequest = new com/google/android/gms/wallet/IsReadyToPayRequest;
    localIsReadyToPayRequest.<init>();
    localIsReadyToPayRequest.getClass();
    localzza.<init>(localIsReadyToPayRequest, null);
    return localzza;
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
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\IsReadyToPayRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */