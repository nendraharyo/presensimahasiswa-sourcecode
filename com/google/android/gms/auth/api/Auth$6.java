package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzd;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import java.util.Collections;
import java.util.List;

final class Auth$6
  extends Api.zza
{
  public zzd zza(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleSignInOptions paramGoogleSignInOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzd localzzd = new com/google/android/gms/auth/api/signin/internal/zzd;
    localzzd.<init>(paramContext, paramLooper, paramzzf, paramGoogleSignInOptions, paramConnectionCallbacks, paramOnConnectionFailedListener);
    return localzzd;
  }
  
  public List zza(GoogleSignInOptions paramGoogleSignInOptions)
  {
    if (paramGoogleSignInOptions == null) {}
    for (Object localObject = Collections.emptyList();; localObject = paramGoogleSignInOptions.zzmN()) {
      return (List)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\Auth$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */