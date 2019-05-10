package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ChannelReceiveFileResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  
  static
  {
    zzr localzzr = new com/google/android/gms/wearable/internal/zzr;
    localzzr.<init>();
    CREATOR = localzzr;
  }
  
  ChannelReceiveFileResponse(int paramInt1, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelReceiveFileResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */