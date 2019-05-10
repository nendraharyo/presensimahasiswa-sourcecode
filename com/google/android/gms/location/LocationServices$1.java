package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.location.internal.zzl;

final class LocationServices$1
  extends Api.zza
{
  public zzl zzn(Context paramContext, Looper paramLooper, zzf paramzzf, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzl localzzl = new com/google/android/gms/location/internal/zzl;
    localzzl.<init>(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, "locationServices", paramzzf);
    return localzzl;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationServices$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */