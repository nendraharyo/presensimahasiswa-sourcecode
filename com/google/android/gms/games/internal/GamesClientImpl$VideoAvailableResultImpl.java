package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.Videos.VideoAvailableResult;

public final class GamesClientImpl$VideoAvailableResultImpl
  implements Videos.VideoAvailableResult
{
  private final Status zzUX;
  private final boolean zzaFC;
  
  GamesClientImpl$VideoAvailableResultImpl(Status paramStatus, boolean paramBoolean)
  {
    this.zzUX = paramStatus;
    this.zzaFC = paramBoolean;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$VideoAvailableResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */