package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

class LeaderboardsImpl$SubmitScoreImpl$1
  implements Leaderboards.SubmitScoreResult
{
  LeaderboardsImpl$SubmitScoreImpl$1(LeaderboardsImpl.SubmitScoreImpl paramSubmitScoreImpl, Status paramStatus) {}
  
  public ScoreSubmissionData getScoreData()
  {
    ScoreSubmissionData localScoreSubmissionData = new com/google/android/gms/games/leaderboard/ScoreSubmissionData;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localScoreSubmissionData.<init>(localDataHolder);
    return localScoreSubmissionData;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$SubmitScoreImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */