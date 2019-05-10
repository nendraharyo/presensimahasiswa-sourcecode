package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetPinnedDownloadPreferencesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final ParcelableTransferPreferences zzasu;
  
  static
  {
    zzbs localzzbs = new com/google/android/gms/drive/internal/zzbs;
    localzzbs.<init>();
    CREATOR = localzzbs;
  }
  
  SetPinnedDownloadPreferencesRequest(int paramInt, ParcelableTransferPreferences paramParcelableTransferPreferences)
  {
    this.mVersionCode = paramInt;
    this.zzasu = paramParcelableTransferPreferences;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbs.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\SetPinnedDownloadPreferencesRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */