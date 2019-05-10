package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos.VideoCapabilitiesResult;

public final class GamesClientImpl$VideoCapabilitiesResultImpl
  implements Videos.VideoCapabilitiesResult
{
  private final Status zzUX;
  private final VideoCapabilities zzaFD;
  
  GamesClientImpl$VideoCapabilitiesResultImpl(Status paramStatus, VideoCapabilities paramVideoCapabilities)
  {
    this.zzUX = paramStatus;
    this.zzaFD = paramVideoCapabilities;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$VideoCapabilitiesResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */