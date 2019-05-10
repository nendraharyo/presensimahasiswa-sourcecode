package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class NotifyTransactionStatusRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  int status;
  String zzboo;
  String zzbpz;
  
  static
  {
    zzn localzzn = new com/google/android/gms/wallet/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  NotifyTransactionStatusRequest()
  {
    this.mVersionCode = 1;
  }
  
  NotifyTransactionStatusRequest(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.zzboo = paramString1;
    this.status = paramInt2;
    this.zzbpz = paramString2;
  }
  
  public static NotifyTransactionStatusRequest.Builder newBuilder()
  {
    NotifyTransactionStatusRequest.Builder localBuilder = new com/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;
    NotifyTransactionStatusRequest localNotifyTransactionStatusRequest = new com/google/android/gms/wallet/NotifyTransactionStatusRequest;
    localNotifyTransactionStatusRequest.<init>();
    localNotifyTransactionStatusRequest.getClass();
    localBuilder.<init>(localNotifyTransactionStatusRequest, null);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDetailedReason()
  {
    return this.zzbpz;
  }
  
  public String getGoogleTransactionId()
  {
    return this.zzboo;
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\NotifyTransactionStatusRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */