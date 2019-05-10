package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.Plus.zza;

abstract class zzqy$zza
  extends Plus.zza
{
  private zzqy$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Moments.LoadMomentsResult zzbf(Status paramStatus)
  {
    zzqy.zza.1 local1 = new com/google/android/gms/internal/zzqy$zza$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqy$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */