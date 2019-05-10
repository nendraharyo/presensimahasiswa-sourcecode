package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzlr;

final class CastRemoteDisplay$1
  extends Api.zza
{
  public zzlr zza(Context paramContext, Looper paramLooper, zzf paramzzf, CastRemoteDisplay.CastRemoteDisplayOptions paramCastRemoteDisplayOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzlr localzzlr = new com/google/android/gms/internal/zzlr;
    CastDevice localCastDevice = paramCastRemoteDisplayOptions.zzZL;
    CastRemoteDisplay.CastRemoteDisplaySessionCallbacks localCastRemoteDisplaySessionCallbacks = paramCastRemoteDisplayOptions.zzaad;
    localzzlr.<init>(paramContext, paramLooper, paramzzf, localCastDevice, localCastRemoteDisplaySessionCallbacks, paramConnectionCallbacks, paramOnConnectionFailedListener);
    return localzzlr;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplay$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */