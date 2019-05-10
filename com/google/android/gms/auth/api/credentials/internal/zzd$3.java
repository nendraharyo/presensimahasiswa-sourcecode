package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzd$3
  extends zze
{
  zzd$3(zzd paramzzd, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzj paramzzj)
  {
    zzd.zza localzza = new com/google/android/gms/auth/api/credentials/internal/zzd$zza;
    localzza.<init>(this);
    DeleteRequest localDeleteRequest = new com/google/android/gms/auth/api/credentials/internal/DeleteRequest;
    Credential localCredential = this.zzWy;
    localDeleteRequest.<init>(localCredential);
    paramzzj.zza(localzza, localDeleteRequest);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzd$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */