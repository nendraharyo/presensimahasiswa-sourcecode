package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;

final class zzqd$1
  extends Api.zza
{
  public zzqc zzo(Context paramContext, Looper paramLooper, zzf paramzzf, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzqc localzzqc = new com/google/android/gms/internal/zzqc;
    localzzqc.<init>(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf);
    return localzzqc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */