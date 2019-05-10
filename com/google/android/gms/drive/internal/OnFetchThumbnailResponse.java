package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnFetchThumbnailResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final ParcelFileDescriptor zzasr;
  
  static
  {
    zzbb localzzbb = new com/google/android/gms/drive/internal/zzbb;
    localzzbb.<init>();
    CREATOR = localzzbb;
  }
  
  OnFetchThumbnailResponse(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.mVersionCode = paramInt;
    this.zzasr = paramParcelFileDescriptor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = paramInt | 0x1;
    zzbb.zza(this, paramParcel, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnFetchThumbnailResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */