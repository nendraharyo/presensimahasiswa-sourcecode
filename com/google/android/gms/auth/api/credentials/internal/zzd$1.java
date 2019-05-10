package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzd$1
  extends zze
{
  zzd$1(zzd paramzzd, GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzj paramzzj)
  {
    zzd.1.1 local1 = new com/google/android/gms/auth/api/credentials/internal/zzd$1$1;
    local1.<init>(this);
    CredentialRequest localCredentialRequest = this.zzWv;
    paramzzj.zza(local1, localCredentialRequest);
  }
  
  protected CredentialRequestResult zzi(Status paramStatus)
  {
    return zzc.zzh(paramStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */