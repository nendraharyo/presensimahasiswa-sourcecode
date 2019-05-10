package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzc
  implements CredentialRequestResult
{
  private final Status zzUX;
  private final Credential zzWu;
  
  public zzc(Status paramStatus, Credential paramCredential)
  {
    this.zzUX = paramStatus;
    this.zzWu = paramCredential;
  }
  
  public static zzc zzh(Status paramStatus)
  {
    zzc localzzc = new com/google/android/gms/auth/api/credentials/internal/zzc;
    localzzc.<init>(paramStatus, null);
    return localzzc;
  }
  
  public Credential getCredential()
  {
    return this.zzWu;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */