package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OpenChannelResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final ChannelImpl zzbsc;
  
  static
  {
    zzbd localzzbd = new com/google/android/gms/wearable/internal/zzbd;
    localzzbd.<init>();
    CREATOR = localzzbd;
  }
  
  OpenChannelResponse(int paramInt1, int paramInt2, ChannelImpl paramChannelImpl)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsc = paramChannelImpl;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\OpenChannelResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */