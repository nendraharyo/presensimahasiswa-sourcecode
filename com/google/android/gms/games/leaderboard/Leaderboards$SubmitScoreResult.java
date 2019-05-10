package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Leaderboards$SubmitScoreResult
  extends Releasable, Result
{
  public abstract ScoreSubmissionData getScoreData();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\Leaderboards$SubmitScoreResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */