package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;

abstract class zzre$zzb
  extends zzrb
{
  protected zzrc zzbgC;
  
  public zzre$zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    zzre.zzb.1 local1 = new com/google/android/gms/internal/zzre$zzb$1;
    local1.<init>(this);
    this.zzbgC = local1;
  }
  
  protected SafetyNetApi.AttestationResult zzbh(Status paramStatus)
  {
    zzre.zza localzza = new com/google/android/gms/internal/zzre$zza;
    localzza.<init>(paramStatus, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzre$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */