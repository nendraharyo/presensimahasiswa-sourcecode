package com.google.android.gms.internal;

import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zzlq$zzb
  extends zza.zza
{
  public zzlq$zzb(zzlq paramzzlq, GoogleApiClient paramGoogleApiClient)
  {
    super(localzzc, paramGoogleApiClient);
  }
  
  protected CastRemoteDisplay.CastRemoteDisplaySessionResult zzt(Status paramStatus)
  {
    zzlq.zzc localzzc = new com/google/android/gms/internal/zzlq$zzc;
    localzzc.<init>(paramStatus);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlq$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */