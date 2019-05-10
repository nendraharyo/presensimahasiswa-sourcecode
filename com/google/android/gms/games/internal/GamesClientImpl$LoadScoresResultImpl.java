package com.google.android.gms.games.internal;

import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;

final class GamesClientImpl$LoadScoresResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Leaderboards.LoadScoresResult
{
  private final LeaderboardEntity zzaEM;
  private final LeaderboardScoreBuffer zzaEN;
  
  /* Error */
  GamesClientImpl$LoadScoresResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder1, com.google.android.gms.common.data.DataHolder paramDataHolder2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokespecial 14	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 16	com/google/android/gms/games/leaderboard/LeaderboardBuffer
    //   8: astore_3
    //   9: aload_3
    //   10: aload_1
    //   11: invokespecial 17	com/google/android/gms/games/leaderboard/LeaderboardBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: aload_3
    //   15: invokevirtual 21	com/google/android/gms/games/leaderboard/LeaderboardBuffer:getCount	()I
    //   18: istore 4
    //   20: iload 4
    //   22: ifle +67 -> 89
    //   25: iconst_0
    //   26: istore 4
    //   28: aconst_null
    //   29: astore 5
    //   31: aload_3
    //   32: iconst_0
    //   33: invokevirtual 25	com/google/android/gms/games/leaderboard/LeaderboardBuffer:get	(I)Ljava/lang/Object;
    //   36: astore 5
    //   38: aload 5
    //   40: checkcast 27	com/google/android/gms/games/leaderboard/Leaderboard
    //   43: astore 5
    //   45: aload 5
    //   47: invokeinterface 31 1 0
    //   52: astore 5
    //   54: aload 5
    //   56: checkcast 33	com/google/android/gms/games/leaderboard/LeaderboardEntity
    //   59: astore 5
    //   61: aload_0
    //   62: aload 5
    //   64: putfield 35	com/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl:zzaEM	Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;
    //   67: aload_3
    //   68: invokevirtual 39	com/google/android/gms/games/leaderboard/LeaderboardBuffer:release	()V
    //   71: new 41	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer
    //   74: astore 5
    //   76: aload 5
    //   78: aload_2
    //   79: invokespecial 42	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   82: aload_0
    //   83: aload 5
    //   85: putfield 44	com/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl:zzaEN	Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    //   88: return
    //   89: iconst_0
    //   90: istore 4
    //   92: aconst_null
    //   93: astore 5
    //   95: aload_0
    //   96: aconst_null
    //   97: putfield 35	com/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl:zzaEM	Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;
    //   100: goto -33 -> 67
    //   103: astore 5
    //   105: aload_3
    //   106: invokevirtual 39	com/google/android/gms/games/leaderboard/LeaderboardBuffer:release	()V
    //   109: aload 5
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	LoadScoresResultImpl
    //   0	112	1	paramDataHolder1	com.google.android.gms.common.data.DataHolder
    //   0	112	2	paramDataHolder2	com.google.android.gms.common.data.DataHolder
    //   8	98	3	localLeaderboardBuffer	com.google.android.gms.games.leaderboard.LeaderboardBuffer
    //   18	73	4	i	int
    //   29	65	5	localObject1	Object
    //   103	7	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	18	103	finally
    //   32	36	103	finally
    //   38	43	103	finally
    //   45	52	103	finally
    //   54	59	103	finally
    //   62	67	103	finally
    //   96	100	103	finally
  }
  
  public Leaderboard getLeaderboard()
  {
    return this.zzaEM;
  }
  
  public LeaderboardScoreBuffer getScores()
  {
    return this.zzaEN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadScoresResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */