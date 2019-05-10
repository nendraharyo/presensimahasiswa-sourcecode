package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.GetTokenResult;

final class GamesClientImpl$GetTokenResultImpl
  implements Games.GetTokenResult
{
  private final Status zzUX;
  private final String zzVo;
  
  GamesClientImpl$GetTokenResultImpl(Status paramStatus, String paramString)
  {
    this.zzUX = paramStatus;
    this.zzVo = paramString;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GetTokenResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */