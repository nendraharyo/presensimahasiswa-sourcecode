package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;

final class GamesClientImpl$GameMuteStatusChangeResultImpl
  implements Notifications.GameMuteStatusChangeResult
{
  private final Status zzUX;
  private final String zzaEq;
  private final boolean zzaEr;
  
  public GamesClientImpl$GameMuteStatusChangeResultImpl(int paramInt, String paramString, boolean paramBoolean)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    this.zzUX = localStatus;
    this.zzaEq = paramString;
    this.zzaEr = paramBoolean;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GameMuteStatusChangeResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */