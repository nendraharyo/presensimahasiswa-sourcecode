package com.google.android.gms.games.leaderboard;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Leaderboards
{
  public abstract Intent getAllLeaderboardsIntent(GoogleApiClient paramGoogleApiClient);
  
  public abstract Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);
  
  public abstract Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2);
  
  public abstract PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2);
  
  public abstract PendingResult loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean);
  
  public abstract PendingResult loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  public abstract PendingResult loadMoreScores(GoogleApiClient paramGoogleApiClient, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2);
  
  public abstract PendingResult loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract PendingResult loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract PendingResult loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract PendingResult loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void submitScore(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong);
  
  public abstract void submitScore(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2);
  
  public abstract PendingResult submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong);
  
  public abstract PendingResult submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\Leaderboards.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */