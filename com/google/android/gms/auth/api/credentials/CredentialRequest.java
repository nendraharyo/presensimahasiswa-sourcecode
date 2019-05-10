package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class CredentialRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final boolean zzWd;
  private final String[] zzWe;
  private final CredentialPickerConfig zzWf;
  private final CredentialPickerConfig zzWg;
  
  static
  {
    zzc localzzc = new com/google/android/gms/auth/api/credentials/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  CredentialRequest(int paramInt, boolean paramBoolean, String[] paramArrayOfString, CredentialPickerConfig paramCredentialPickerConfig1, CredentialPickerConfig paramCredentialPickerConfig2)
  {
    this.mVersionCode = paramInt;
    this.zzWd = paramBoolean;
    Object localObject = (String[])zzx.zzz(paramArrayOfString);
    this.zzWe = ((String[])localObject);
    if (paramCredentialPickerConfig1 == null)
    {
      localObject = new com/google/android/gms/auth/api/credentials/CredentialPickerConfig$Builder;
      ((CredentialPickerConfig.Builder)localObject).<init>();
      paramCredentialPickerConfig1 = ((CredentialPickerConfig.Builder)localObject).build();
    }
    this.zzWf = paramCredentialPickerConfig1;
    if (paramCredentialPickerConfig2 == null)
    {
      localObject = new com/google/android/gms/auth/api/credentials/CredentialPickerConfig$Builder;
      ((CredentialPickerConfig.Builder)localObject).<init>();
      paramCredentialPickerConfig2 = ((CredentialPickerConfig.Builder)localObject).build();
    }
    this.zzWg = paramCredentialPickerConfig2;
  }
  
  private CredentialRequest(CredentialRequest.Builder paramBuilder)
  {
    this(2, bool, arrayOfString, localCredentialPickerConfig1, localCredentialPickerConfig2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String[] getAccountTypes()
  {
    return this.zzWe;
  }
  
  public CredentialPickerConfig getCredentialHintPickerConfig()
  {
    return this.zzWg;
  }
  
  public CredentialPickerConfig getCredentialPickerConfig()
  {
    return this.zzWf;
  }
  
  public boolean getSupportsPasswordLogin()
  {
    return isPasswordLoginSupported();
  }
  
  public boolean isPasswordLoginSupported()
  {
    return this.zzWd;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\CredentialRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */