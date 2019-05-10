package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

final class GamesClientImpl$SubmitScoreResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Leaderboards.SubmitScoreResult
{
  private final ScoreSubmissionData zzaFu;
  
  public GamesClientImpl$SubmitScoreResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    try
    {
      ScoreSubmissionData localScoreSubmissionData = new com/google/android/gms/games/leaderboard/ScoreSubmissionData;
      localScoreSubmissionData.<init>(paramDataHolder);
      this.zzaFu = localScoreSubmissionData;
      return;
    }
    finally
    {
      paramDataHolder.close();
    }
  }
  
  public ScoreSubmissionData getScoreData()
  {
    return this.zzaFu;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$SubmitScoreResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */