package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;

final class GamesClientImpl$MatchUpdateReceivedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$MatchUpdateReceivedBinderCallback(zzq paramzzq)
  {
    this.zzari = paramzzq;
  }
  
  public void onTurnBasedMatchRemoved(String paramString)
  {
    zzq localzzq = this.zzari;
    GamesClientImpl.MatchRemovedNotifier localMatchRemovedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$MatchRemovedNotifier;
    localMatchRemovedNotifier.<init>(paramString);
    localzzq.zza(localMatchRemovedNotifier);
  }
  
  public void zzy(DataHolder paramDataHolder)
  {
    Object localObject1 = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    ((TurnBasedMatchBuffer)localObject1).<init>(paramDataHolder);
    Object localObject2 = null;
    try
    {
      int i = ((TurnBasedMatchBuffer)localObject1).getCount();
      if (i > 0)
      {
        localObject2 = null;
        localObject2 = ((TurnBasedMatchBuffer)localObject1).get(0);
        localObject2 = (TurnBasedMatch)localObject2;
        localObject2 = ((TurnBasedMatch)localObject2).freeze();
        localObject2 = (TurnBasedMatch)localObject2;
      }
      ((TurnBasedMatchBuffer)localObject1).release();
      if (localObject2 != null)
      {
        localObject1 = this.zzari;
        GamesClientImpl.MatchUpdateReceivedNotifier localMatchUpdateReceivedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedNotifier;
        localMatchUpdateReceivedNotifier.<init>((TurnBasedMatch)localObject2);
        ((zzq)localObject1).zza(localMatchUpdateReceivedNotifier);
      }
      return;
    }
    finally
    {
      ((TurnBasedMatchBuffer)localObject1).release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$MatchUpdateReceivedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */