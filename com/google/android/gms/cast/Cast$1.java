package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;

final class Cast$1
  extends Api.zza
{
  public zze zza(Context paramContext, Looper paramLooper, zzf paramzzf, Cast.CastOptions paramCastOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzb(paramCastOptions, "Setting the API options is required.");
    zze localzze = new com/google/android/gms/cast/internal/zze;
    CastDevice localCastDevice = paramCastOptions.zzZL;
    long l = Cast.CastOptions.zza(paramCastOptions);
    Cast.Listener localListener = paramCastOptions.zzZM;
    localzze.<init>(paramContext, paramLooper, paramzzf, localCastDevice, l, localListener, paramConnectionCallbacks, paramOnConnectionFailedListener);
    return localzze;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */