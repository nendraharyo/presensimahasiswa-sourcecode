package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Notifications.InboxCountResult;

final class GamesClientImpl$InboxCountResultImpl
  implements Notifications.InboxCountResult
{
  private final Status zzUX;
  private final Bundle zzaEt;
  
  GamesClientImpl$InboxCountResultImpl(Status paramStatus, Bundle paramBundle)
  {
    this.zzUX = paramStatus;
    this.zzaEt = paramBundle;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$InboxCountResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */