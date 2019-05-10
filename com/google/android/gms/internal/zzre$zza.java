package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;

class zzre$zza
  implements SafetyNetApi.AttestationResult
{
  private final Status zzUX;
  private final AttestationData zzbgB;
  
  public zzre$zza(Status paramStatus, AttestationData paramAttestationData)
  {
    this.zzUX = paramStatus;
    this.zzbgB = paramAttestationData;
  }
  
  public String getJwsResult()
  {
    Object localObject = this.zzbgB;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbgB.getJwsResult()) {
      return (String)localObject;
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzre$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */