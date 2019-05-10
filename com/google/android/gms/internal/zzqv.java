package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;

public final class zzqv
  implements Account
{
  public void clearDefaultAccount(GoogleApiClient paramGoogleApiClient)
  {
    zze localzze = Plus.zzf(paramGoogleApiClient, false);
    if (localzze != null) {
      localzze.zzEY();
    }
  }
  
  public String getAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.zzf(paramGoogleApiClient, true).getAccountName();
  }
  
  public PendingResult revokeAccessAndDisconnect(GoogleApiClient paramGoogleApiClient)
  {
    zzqv.1 local1 = new com/google/android/gms/internal/zzqv$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */