package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

abstract class GamesClientImpl$TurnBasedMatchResult
  extends GamesClientImpl.GamesDataHolderResult
{
  final TurnBasedMatch zzaES;
  
  /* Error */
  GamesClientImpl$TurnBasedMatchResult(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 10	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 12	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer
    //   8: astore_2
    //   9: aload_2
    //   10: aload_1
    //   11: invokespecial 13	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: aload_2
    //   15: invokevirtual 17	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer:getCount	()I
    //   18: istore_3
    //   19: iload_3
    //   20: ifle +49 -> 69
    //   23: iconst_0
    //   24: istore_3
    //   25: aconst_null
    //   26: astore 4
    //   28: aload_2
    //   29: iconst_0
    //   30: invokevirtual 21	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer:get	(I)Ljava/lang/Object;
    //   33: astore 4
    //   35: aload 4
    //   37: checkcast 23	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch
    //   40: astore 4
    //   42: aload 4
    //   44: invokeinterface 27 1 0
    //   49: astore 4
    //   51: aload 4
    //   53: checkcast 23	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch
    //   56: astore 4
    //   58: aload_0
    //   59: aload 4
    //   61: putfield 29	com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchResult:zzaES	Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //   64: aload_2
    //   65: invokevirtual 33	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer:release	()V
    //   68: return
    //   69: iconst_0
    //   70: istore_3
    //   71: aconst_null
    //   72: astore 4
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 29	com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchResult:zzaES	Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //   79: goto -15 -> 64
    //   82: astore 4
    //   84: aload_2
    //   85: invokevirtual 33	com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer:release	()V
    //   88: aload 4
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	TurnBasedMatchResult
    //   0	91	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   8	77	2	localTurnBasedMatchBuffer	com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer
    //   18	53	3	i	int
    //   26	47	4	localObject1	Object
    //   82	7	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	18	82	finally
    //   29	33	82	finally
    //   35	40	82	finally
    //   42	49	82	finally
    //   51	56	82	finally
    //   59	64	82	finally
    //   75	79	82	finally
  }
  
  public TurnBasedMatch getMatch()
  {
    return this.zzaES;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$TurnBasedMatchResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */