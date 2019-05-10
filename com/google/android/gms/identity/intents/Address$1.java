package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpn;

final class Address$1
  extends Api.zza
{
  public zzpn zza(Context paramContext, Looper paramLooper, zzf paramzzf, Address.AddressOptions paramAddressOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    boolean bool = paramContext instanceof Activity;
    Object localObject = "An Activity must be used for Address APIs";
    zzx.zzb(bool, localObject);
    if (paramAddressOptions == null)
    {
      paramAddressOptions = new com/google/android/gms/identity/intents/Address$AddressOptions;
      paramAddressOptions.<init>();
    }
    zzpn localzzpn = new com/google/android/gms/internal/zzpn;
    localObject = paramContext;
    localObject = (Activity)paramContext;
    int i = paramAddressOptions.theme;
    localzzpn.<init>((Activity)localObject, paramLooper, paramzzf, i, paramConnectionCallbacks, paramOnConnectionFailedListener);
    return localzzpn;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\identity\intents\Address$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */