package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus.zza;

abstract class zzqz$zza
  extends Plus.zza
{
  private zzqz$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public People.LoadPeopleResult zzbg(Status paramStatus)
  {
    zzqz.zza.1 local1 = new com/google/android/gms/internal/zzqz$zza$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */