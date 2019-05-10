package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class ScoreSubmissionData$Result
{
  public final String formattedScore;
  public final boolean newBest;
  public final long rawScore;
  public final String scoreTag;
  
  public ScoreSubmissionData$Result(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.rawScore = paramLong;
    this.formattedScore = paramString1;
    this.scoreTag = paramString2;
    this.newBest = paramBoolean;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.rawScore);
    localzza = localzza.zzg("RawScore", localObject);
    localObject = this.formattedScore;
    localzza = localzza.zzg("FormattedScore", localObject);
    localObject = this.scoreTag;
    localzza = localzza.zzg("ScoreTag", localObject);
    localObject = Boolean.valueOf(this.newBest);
    return localzza.zzg("NewBest", localObject).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\ScoreSubmissionData$Result.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */