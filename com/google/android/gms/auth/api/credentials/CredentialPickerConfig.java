package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CredentialPickerConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final boolean mShowCancelButton;
  final int mVersionCode;
  private final boolean zzWb;
  private final boolean zzWc;
  
  static
  {
    zzb localzzb = new com/google/android/gms/auth/api/credentials/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  CredentialPickerConfig(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.mVersionCode = paramInt;
    this.zzWb = paramBoolean1;
    this.mShowCancelButton = paramBoolean2;
    this.zzWc = paramBoolean3;
  }
  
  private CredentialPickerConfig(CredentialPickerConfig.Builder paramBuilder)
  {
    this(1, bool1, bool2, bool3);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean isForNewAccount()
  {
    return this.zzWc;
  }
  
  public boolean shouldShowAddAccountButton()
  {
    return this.zzWb;
  }
  
  public boolean shouldShowCancelButton()
  {
    return this.mShowCancelButton;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\CredentialPickerConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */