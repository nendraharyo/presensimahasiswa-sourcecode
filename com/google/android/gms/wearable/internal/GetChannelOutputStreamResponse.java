package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetChannelOutputStreamResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int statusCode;
  public final int versionCode;
  public final ParcelFileDescriptor zzbsC;
  
  static
  {
    zzak localzzak = new com/google/android/gms/wearable/internal/zzak;
    localzzak.<init>();
    CREATOR = localzzak;
  }
  
  GetChannelOutputStreamResponse(int paramInt1, int paramInt2, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.zzbsC = paramParcelFileDescriptor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzak.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\GetChannelOutputStreamResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */