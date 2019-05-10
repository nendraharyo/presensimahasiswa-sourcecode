package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.internal.zzx;

public final class HintRequest$Builder
{
  private String[] zzWe;
  private CredentialPickerConfig zzWh;
  private boolean zzWi;
  private boolean zzWj;
  
  public HintRequest$Builder()
  {
    Object localObject = new com/google/android/gms/auth/api/credentials/CredentialPickerConfig$Builder;
    ((CredentialPickerConfig.Builder)localObject).<init>();
    localObject = ((CredentialPickerConfig.Builder)localObject).build();
    this.zzWh = ((CredentialPickerConfig)localObject);
  }
  
  public HintRequest build()
  {
    Object localObject = this.zzWe;
    if (localObject == null)
    {
      bool = false;
      localObject = new String[0];
      this.zzWe = ((String[])localObject);
    }
    boolean bool = this.zzWi;
    if (!bool)
    {
      bool = this.zzWj;
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
    }
    localObject = new com/google/android/gms/auth/api/credentials/HintRequest;
    ((HintRequest)localObject).<init>(this, null);
    return (HintRequest)localObject;
  }
  
  public Builder setAccountTypes(String... paramVarArgs)
  {
    if (paramVarArgs == null) {
      paramVarArgs = new String[0];
    }
    this.zzWe = paramVarArgs;
    return this;
  }
  
  public Builder setEmailAddressIdentifierSupported(boolean paramBoolean)
  {
    this.zzWi = paramBoolean;
    return this;
  }
  
  public Builder setHintPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    CredentialPickerConfig localCredentialPickerConfig = (CredentialPickerConfig)zzx.zzz(paramCredentialPickerConfig);
    this.zzWh = localCredentialPickerConfig;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\HintRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */