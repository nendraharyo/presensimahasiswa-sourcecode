package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

abstract class zzql$zzb
  extends zzql.zza
{
  private zzql$zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Connections.StartAdvertisingResult zzbc(Status paramStatus)
  {
    zzql.zzb.1 local1 = new com/google/android/gms/internal/zzql$zzb$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzql$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */