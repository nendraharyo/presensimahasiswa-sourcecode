package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

final class Games$4
  extends Games.GetServerAuthCodeImpl
{
  Games$4(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzaCC;
    paramGamesClientImpl.zzb(str, this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Games$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */