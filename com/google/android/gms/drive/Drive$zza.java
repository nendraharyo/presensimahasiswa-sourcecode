package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.drive.internal.zzu;

public abstract class Drive$zza
  extends Api.zza
{
  protected abstract Bundle zza(Api.ApiOptions paramApiOptions);
  
  public zzu zza(Context paramContext, Looper paramLooper, zzf paramzzf, Api.ApiOptions paramApiOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzu localzzu = new com/google/android/gms/drive/internal/zzu;
    Bundle localBundle = zza(paramApiOptions);
    localzzu.<init>(paramContext, paramLooper, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener, localBundle);
    return localzzu;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\Drive$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */