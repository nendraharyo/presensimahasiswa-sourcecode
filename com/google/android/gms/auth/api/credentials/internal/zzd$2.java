package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzd$2
  extends zze
{
  zzd$2(zzd paramzzd, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzj paramzzj)
  {
    zzd.zza localzza = new com/google/android/gms/auth/api/credentials/internal/zzd$zza;
    localzza.<init>(this);
    SaveRequest localSaveRequest = new com/google/android/gms/auth/api/credentials/internal/SaveRequest;
    Credential localCredential = this.zzWy;
    localSaveRequest.<init>(localCredential);
    paramzzj.zza(localzza, localSaveRequest);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */