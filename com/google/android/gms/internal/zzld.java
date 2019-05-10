package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;

public class zzld
  implements ProxyApi
{
  public PendingResult performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest)
  {
    zzx.zzz(paramGoogleApiClient);
    zzx.zzz(paramProxyRequest);
    zzld.1 local1 = new com/google/android/gms/internal/zzld$1;
    local1.<init>(this, paramGoogleApiClient, paramProxyRequest);
    return paramGoogleApiClient.zzb(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzld.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */