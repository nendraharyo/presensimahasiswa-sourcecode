package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult;

abstract class zzre$zzc
  extends zzrb
{
  protected zzrc zzbgC;
  
  public zzre$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    zzre.zzc.1 local1 = new com/google/android/gms/internal/zzre$zzc$1;
    local1.<init>(this);
    this.zzbgC = local1;
  }
  
  protected SafetyNetApi.SafeBrowsingResult zzbi(Status paramStatus)
  {
    zzre.zzd localzzd = new com/google/android/gms/internal/zzre$zzd;
    localzzd.<init>(paramStatus, null);
    return localzzd;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzre$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */