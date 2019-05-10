package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzse;

final class Wallet$1
  extends Api.zza
{
  public zzse zza(Context paramContext, Looper paramLooper, zzf paramzzf, Wallet.WalletOptions paramWalletOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramWalletOptions != null) {}
    for (;;)
    {
      zzse localzzse = new com/google/android/gms/internal/zzse;
      int i = paramWalletOptions.environment;
      int j = paramWalletOptions.theme;
      boolean bool = Wallet.WalletOptions.zza(paramWalletOptions);
      localzzse.<init>(paramContext, paramLooper, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener, i, j, bool);
      return localzzse;
      paramWalletOptions = new com/google/android/gms/wallet/Wallet$WalletOptions;
      localzzse = null;
      paramWalletOptions.<init>(null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\Wallet$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */