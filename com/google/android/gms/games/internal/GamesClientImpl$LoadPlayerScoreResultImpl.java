package com.google.android.gms.games.internal;

import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;

final class GamesClientImpl$LoadPlayerScoreResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Leaderboards.LoadPlayerScoreResult
{
  private final LeaderboardScoreEntity zzaEH;
  
  /* Error */
  GamesClientImpl$LoadPlayerScoreResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 12	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 14	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer
    //   8: astore_2
    //   9: aload_2
    //   10: aload_1
    //   11: invokespecial 15	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: aload_2
    //   15: invokevirtual 19	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:getCount	()I
    //   18: istore_3
    //   19: iload_3
    //   20: ifle +42 -> 62
    //   23: iconst_0
    //   24: istore_3
    //   25: aconst_null
    //   26: astore 4
    //   28: aload_2
    //   29: iconst_0
    //   30: invokevirtual 23	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:get	(I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //   33: astore 4
    //   35: aload 4
    //   37: invokeinterface 29 1 0
    //   42: astore 4
    //   44: aload 4
    //   46: checkcast 31	com/google/android/gms/games/leaderboard/LeaderboardScoreEntity
    //   49: astore 4
    //   51: aload_0
    //   52: aload 4
    //   54: putfield 33	com/google/android/gms/games/internal/GamesClientImpl$LoadPlayerScoreResultImpl:zzaEH	Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;
    //   57: aload_2
    //   58: invokevirtual 37	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:release	()V
    //   61: return
    //   62: iconst_0
    //   63: istore_3
    //   64: aconst_null
    //   65: astore 4
    //   67: aload_0
    //   68: aconst_null
    //   69: putfield 33	com/google/android/gms/games/internal/GamesClientImpl$LoadPlayerScoreResultImpl:zzaEH	Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;
    //   72: goto -15 -> 57
    //   75: astore 4
    //   77: aload_2
    //   78: invokevirtual 37	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:release	()V
    //   81: aload 4
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	LoadPlayerScoreResultImpl
    //   0	84	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   8	70	2	localLeaderboardScoreBuffer	com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
    //   18	46	3	i	int
    //   26	40	4	localObject1	Object
    //   75	7	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	18	75	finally
    //   29	33	75	finally
    //   35	42	75	finally
    //   44	49	75	finally
    //   52	57	75	finally
    //   68	72	75	finally
  }
  
  public LeaderboardScore getScore()
  {
    return this.zzaEH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadPlayerScoreResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */