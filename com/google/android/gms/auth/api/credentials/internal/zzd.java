package com.google.android.gms.auth.api.credentials.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;

public final class zzd
  implements CredentialsApi
{
  private PasswordSpecification zza(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = Auth.zzVu;
    localObject = ((zzf)paramGoogleApiClient.zza((Api.zzc)localObject)).zzmD();
    if (localObject != null)
    {
      PasswordSpecification localPasswordSpecification = ((Auth.AuthCredentialsOptions)localObject).zzmr();
      if (localPasswordSpecification == null) {}
    }
    for (localObject = ((Auth.AuthCredentialsOptions)localObject).zzmr();; localObject = PasswordSpecification.zzWl) {
      return (PasswordSpecification)localObject;
    }
  }
  
  public PendingResult delete(GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    zzd.3 local3 = new com/google/android/gms/auth/api/credentials/internal/zzd$3;
    local3.<init>(this, paramGoogleApiClient, paramCredential);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult disableAutoSignIn(GoogleApiClient paramGoogleApiClient)
  {
    zzd.4 local4 = new com/google/android/gms/auth/api/credentials/internal/zzd$4;
    local4.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingIntent getHintPickerIntent(GoogleApiClient paramGoogleApiClient, HintRequest paramHintRequest)
  {
    zzx.zzb(paramGoogleApiClient, "client must not be null");
    zzx.zzb(paramHintRequest, "request must not be null");
    Object localObject = Auth.CREDENTIALS_API;
    zzx.zzb(paramGoogleApiClient.zza((Api)localObject), "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
    localObject = paramGoogleApiClient.getContext();
    PasswordSpecification localPasswordSpecification = zza(paramGoogleApiClient);
    localObject = zzb.zza((Context)localObject, paramHintRequest, localPasswordSpecification);
    return PendingIntent.getActivity(paramGoogleApiClient.getContext(), 2000, (Intent)localObject, 268435456);
  }
  
  public PendingResult request(GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest)
  {
    zzd.1 local1 = new com/google/android/gms/auth/api/credentials/internal/zzd$1;
    local1.<init>(this, paramGoogleApiClient, paramCredentialRequest);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult save(GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    zzd.2 local2 = new com/google/android/gms/auth/api/credentials/internal/zzd$2;
    local2.<init>(this, paramGoogleApiClient, paramCredential);
    return paramGoogleApiClient.zzb(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */