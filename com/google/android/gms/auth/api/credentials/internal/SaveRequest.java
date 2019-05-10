package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SaveRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Credential zzWu;
  
  static
  {
    zzk localzzk = new com/google/android/gms/auth/api/credentials/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  SaveRequest(int paramInt, Credential paramCredential)
  {
    this.mVersionCode = paramInt;
    this.zzWu = paramCredential;
  }
  
  public SaveRequest(Credential paramCredential)
  {
    this(1, paramCredential);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Credential getCredential()
  {
    return this.zzWu;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\SaveRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */