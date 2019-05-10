package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDeviceUsagePreferenceResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final FileUploadPreferencesImpl zzasg;
  
  static
  {
    zzax localzzax = new com/google/android/gms/drive/internal/zzax;
    localzzax.<init>();
    CREATOR = localzzax;
  }
  
  OnDeviceUsagePreferenceResponse(int paramInt, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    this.mVersionCode = paramInt;
    this.zzasg = paramFileUploadPreferencesImpl;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzax.zza(this, paramParcel, paramInt);
  }
  
  public FileUploadPreferencesImpl zztp()
  {
    return this.zzasg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnDeviceUsagePreferenceResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */