package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.signin.internal.zzh;

final class zzrl$1
  extends Api.zza
{
  public zzh zza(Context paramContext, Looper paramLooper, zzf paramzzf, zzro paramzzro, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramzzro == null) {}
    for (zzro localzzro = zzro.zzbgV;; localzzro = paramzzro)
    {
      zzh localzzh = new com/google/android/gms/signin/internal/zzh;
      localzzh.<init>(paramContext, paramLooper, true, paramzzf, localzzro, paramConnectionCallbacks, paramOnConnectionFailedListener);
      return localzzh;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */