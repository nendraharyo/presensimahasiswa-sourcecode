package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.internal.GamesClientImpl;

class NotificationsImpl$1
  extends Games.BaseGamesApiMethodImpl
{
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzaGC;
    paramGamesClientImpl.zzd(this, str, true);
  }
  
  public Notifications.GameMuteStatusChangeResult zzao(Status paramStatus)
  {
    NotificationsImpl.1.1 local1 = new com/google/android/gms/games/internal/api/NotificationsImpl$1$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\NotificationsImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */