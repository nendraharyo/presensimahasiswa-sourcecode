package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class HintRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final String[] zzWe;
  private final CredentialPickerConfig zzWh;
  private final boolean zzWi;
  private final boolean zzWj;
  
  static
  {
    zzd localzzd = new com/google/android/gms/auth/api/credentials/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  HintRequest(int paramInt, CredentialPickerConfig paramCredentialPickerConfig, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString)
  {
    this.mVersionCode = paramInt;
    Object localObject = (CredentialPickerConfig)zzx.zzz(paramCredentialPickerConfig);
    this.zzWh = ((CredentialPickerConfig)localObject);
    this.zzWi = paramBoolean1;
    this.zzWj = paramBoolean2;
    localObject = (String[])zzx.zzz(paramArrayOfString);
    this.zzWe = ((String[])localObject);
  }
  
  private HintRequest(HintRequest.Builder paramBuilder)
  {
    this(1, localCredentialPickerConfig, bool1, bool2, arrayOfString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String[] getAccountTypes()
  {
    return this.zzWe;
  }
  
  public CredentialPickerConfig getHintPickerConfig()
  {
    return this.zzWh;
  }
  
  public boolean isEmailAddressIdentifierSupported()
  {
    return this.zzWi;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzmy()
  {
    return this.zzWj;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\HintRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */