package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GeneratePasswordRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final PasswordSpecification zzVM;
  
  static
  {
    zzh localzzh = new com/google/android/gms/auth/api/credentials/internal/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  GeneratePasswordRequest(int paramInt, PasswordSpecification paramPasswordSpecification)
  {
    this.mVersionCode = paramInt;
    this.zzVM = paramPasswordSpecification;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public PasswordSpecification zzmr()
  {
    return this.zzVM;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\GeneratePasswordRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */