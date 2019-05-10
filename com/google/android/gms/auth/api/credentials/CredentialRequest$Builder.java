package com.google.android.gms.auth.api.credentials;

public final class CredentialRequest$Builder
{
  private boolean zzWd;
  private String[] zzWe;
  private CredentialPickerConfig zzWf;
  private CredentialPickerConfig zzWg;
  
  public CredentialRequest build()
  {
    Object localObject = this.zzWe;
    if (localObject == null)
    {
      bool = false;
      localObject = new String[0];
      this.zzWe = ((String[])localObject);
    }
    boolean bool = this.zzWd;
    if (!bool)
    {
      localObject = this.zzWe;
      int i = localObject.length;
      if (i == 0)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("At least one authentication method must be specified");
        throw ((Throwable)localObject);
      }
    }
    localObject = new com/google/android/gms/auth/api/credentials/CredentialRequest;
    ((CredentialRequest)localObject).<init>(this, null);
    return (CredentialRequest)localObject;
  }
  
  public Builder setAccountTypes(String... paramVarArgs)
  {
    if (paramVarArgs == null) {
      paramVarArgs = new String[0];
    }
    this.zzWe = paramVarArgs;
    return this;
  }
  
  public Builder setCredentialHintPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    this.zzWg = paramCredentialPickerConfig;
    return this;
  }
  
  public Builder setCredentialPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    this.zzWf = paramCredentialPickerConfig;
    return this;
  }
  
  public Builder setPasswordLoginSupported(boolean paramBoolean)
  {
    this.zzWd = paramBoolean;
    return this;
  }
  
  public Builder setSupportsPasswordLogin(boolean paramBoolean)
  {
    return setPasswordLoginSupported(paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\CredentialRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */