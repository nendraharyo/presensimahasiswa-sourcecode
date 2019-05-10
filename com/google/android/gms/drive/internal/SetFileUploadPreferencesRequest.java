package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetFileUploadPreferencesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final FileUploadPreferencesImpl zzasg;
  
  static
  {
    zzbr localzzbr = new com/google/android/gms/drive/internal/zzbr;
    localzzbr.<init>();
    CREATOR = localzzbr;
  }
  
  SetFileUploadPreferencesRequest(int paramInt, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    this.mVersionCode = paramInt;
    this.zzasg = paramFileUploadPreferencesImpl;
  }
  
  public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    this(1, paramFileUploadPreferencesImpl);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbr.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\SetFileUploadPreferencesRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */