package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.GetServerAuthCodeResult;

final class GamesClientImpl$GetServerAuthCodeResultImpl
  implements Games.GetServerAuthCodeResult
{
  private final Status zzUX;
  private final String zzaEs;
  
  GamesClientImpl$GetServerAuthCodeResultImpl(Status paramStatus, String paramString)
  {
    this.zzUX = paramStatus;
    this.zzaEs = paramString;
  }
  
  public String getCode()
  {
    return this.zzaEs;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GetServerAuthCodeResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */