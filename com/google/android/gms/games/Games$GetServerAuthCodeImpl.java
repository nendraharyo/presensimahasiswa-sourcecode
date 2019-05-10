package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

abstract class Games$GetServerAuthCodeImpl
  extends Games.BaseGamesApiMethodImpl
{
  private Games$GetServerAuthCodeImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Games.GetServerAuthCodeResult zzX(Status paramStatus)
  {
    Games.GetServerAuthCodeImpl.1 local1 = new com/google/android/gms/games/Games$GetServerAuthCodeImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Games$GetServerAuthCodeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */