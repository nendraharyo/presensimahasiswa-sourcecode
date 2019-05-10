package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DisconnectRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  
  static
  {
    zzr localzzr = new com/google/android/gms/drive/internal/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  public DisconnectRequest()
  {
    this(1);
  }
  
  DisconnectRequest(int paramInt)
  {
    this.mVersionCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\DisconnectRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */