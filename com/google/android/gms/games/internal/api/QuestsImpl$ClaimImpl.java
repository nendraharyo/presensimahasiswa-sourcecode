package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;

abstract class QuestsImpl$ClaimImpl
  extends Games.BaseGamesApiMethodImpl
{
  private QuestsImpl$ClaimImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Quests.ClaimMilestoneResult zzax(Status paramStatus)
  {
    QuestsImpl.ClaimImpl.1 local1 = new com/google/android/gms/games/internal/api/QuestsImpl$ClaimImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\QuestsImpl$ClaimImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */