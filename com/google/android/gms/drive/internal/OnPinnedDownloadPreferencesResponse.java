package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnPinnedDownloadPreferencesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final ParcelableTransferPreferences zzasu;
  
  static
  {
    zzbf localzzbf = new com/google/android/gms/drive/internal/zzbf;
    localzzbf.<init>();
    CREATOR = localzzbf;
  }
  
  OnPinnedDownloadPreferencesResponse(int paramInt, ParcelableTransferPreferences paramParcelableTransferPreferences)
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
    zzbf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnPinnedDownloadPreferencesResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */