package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;

final class GamesClientImpl$RequestReceivedNotifier
  implements zzq.zzb
{
  private final GameRequest zzaFi;
  
  GamesClientImpl$RequestReceivedNotifier(GameRequest paramGameRequest)
  {
    this.zzaFi = paramGameRequest;
  }
  
  public void zza(OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    GameRequest localGameRequest = this.zzaFi;
    paramOnRequestReceivedListener.onRequestReceived(localGameRequest);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestReceivedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */