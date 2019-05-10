package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;

abstract class QuestsImpl$AcceptImpl
  extends Games.BaseGamesApiMethodImpl
{
  private QuestsImpl$AcceptImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Quests.AcceptQuestResult zzaw(Status paramStatus)
  {
    QuestsImpl.AcceptImpl.1 local1 = new com/google/android/gms/games/internal/api/QuestsImpl$AcceptImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\QuestsImpl$AcceptImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */