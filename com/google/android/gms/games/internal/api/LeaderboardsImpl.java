package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

public final class LeaderboardsImpl
  implements Leaderboards
{
  public Intent getAllLeaderboardsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwz();
  }
  
  public Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return getLeaderboardIntent(paramGoogleApiClient, paramString, -1);
  }
  
  public Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return getLeaderboardIntent(paramGoogleApiClient, paramString, paramInt, -1);
  }
  
  public Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2)
  {
    return Games.zzh(paramGoogleApiClient).zzl(paramString, paramInt1, paramInt2);
  }
  
  public PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2)
  {
    LeaderboardsImpl.3 local3 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$3;
    local3.<init>(this, paramGoogleApiClient, paramString, paramInt1, paramInt2);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    LeaderboardsImpl.2 local2 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramString, paramBoolean);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    LeaderboardsImpl.1 local1 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult loadMoreScores(GoogleApiClient paramGoogleApiClient, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    LeaderboardsImpl.6 local6 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$6;
    local6.<init>(this, paramGoogleApiClient, paramLeaderboardScoreBuffer, paramInt1, paramInt2);
    return paramGoogleApiClient.zza(local6);
  }
  
  public PendingResult loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return loadPlayerCenteredScores(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public PendingResult loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    LeaderboardsImpl.5 local5 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$5;
    local5.<init>(this, paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
    return paramGoogleApiClient.zza(local5);
  }
  
  public PendingResult loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return loadTopScores(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public PendingResult loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    LeaderboardsImpl.4 local4 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$4;
    local4.<init>(this, paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
    return paramGoogleApiClient.zza(local4);
  }
  
  public void submitScore(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong)
  {
    submitScore(paramGoogleApiClient, paramString, paramLong, null);
  }
  
  public void submitScore(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = Games.zzb(paramGoogleApiClient, false);
    if (localObject2 != null) {}
    try
    {
      ((GamesClientImpl)localObject2).zza(null, paramString1, paramLong, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "LeaderboardsImpl";
        localObject2 = "service died";
        GamesLog.zzz(str, (String)localObject2);
      }
    }
  }
  
  public PendingResult submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong)
  {
    return submitScoreImmediate(paramGoogleApiClient, paramString, paramLong, null);
  }
  
  public PendingResult submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    LeaderboardsImpl.7 local7 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$7;
    local7.<init>(this, paramGoogleApiClient, paramString1, paramLong, paramString2);
    return paramGoogleApiClient.zzb(local7);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */