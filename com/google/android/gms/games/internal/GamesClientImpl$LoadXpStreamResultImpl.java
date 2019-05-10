package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Players.LoadXpStreamResult;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;

final class GamesClientImpl$LoadXpStreamResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Players.LoadXpStreamResult
{
  private final ExperienceEventBuffer zzaEQ;
  
  GamesClientImpl$LoadXpStreamResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    ExperienceEventBuffer localExperienceEventBuffer = new com/google/android/gms/games/internal/experience/ExperienceEventBuffer;
    localExperienceEventBuffer.<init>(paramDataHolder);
    this.zzaEQ = localExperienceEventBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadXpStreamResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */