package com.google.android.gms.auth.api.credentials;

public class CredentialPickerConfig$Builder
{
  private boolean mShowCancelButton = true;
  private boolean zzWb = false;
  private boolean zzWc = false;
  
  public CredentialPickerConfig build()
  {
    CredentialPickerConfig localCredentialPickerConfig = new com/google/android/gms/auth/api/credentials/CredentialPickerConfig;
    localCredentialPickerConfig.<init>(this, null);
    return localCredentialPickerConfig;
  }
  
  public Builder setForNewAccount(boolean paramBoolean)
  {
    this.zzWc = paramBoolean;
    return this;
  }
  
  public Builder setShowAddAccountButton(boolean paramBoolean)
  {
    this.zzWb = paramBoolean;
    return this;
  }
  
  public Builder setShowCancelButton(boolean paramBoolean)
  {
    this.mShowCancelButton = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\CredentialPickerConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */