package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;

final class GamesClientImpl$AcceptQuestResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Quests.AcceptQuestResult
{
  private final Quest zzaEk;
  
  /* Error */
  GamesClientImpl$AcceptQuestResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 12	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 14	com/google/android/gms/games/quest/QuestBuffer
    //   8: astore_2
    //   9: aload_2
    //   10: aload_1
    //   11: invokespecial 15	com/google/android/gms/games/quest/QuestBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: aload_2
    //   15: invokevirtual 19	com/google/android/gms/games/quest/QuestBuffer:getCount	()I
    //   18: istore_3
    //   19: iload_3
    //   20: ifle +45 -> 65
    //   23: new 21	com/google/android/gms/games/quest/QuestEntity
    //   26: astore 4
    //   28: iconst_0
    //   29: istore_3
    //   30: aconst_null
    //   31: astore 5
    //   33: aload_2
    //   34: iconst_0
    //   35: invokevirtual 25	com/google/android/gms/games/quest/QuestBuffer:get	(I)Ljava/lang/Object;
    //   38: astore 5
    //   40: aload 5
    //   42: checkcast 27	com/google/android/gms/games/quest/Quest
    //   45: astore 5
    //   47: aload 4
    //   49: aload 5
    //   51: invokespecial 30	com/google/android/gms/games/quest/QuestEntity:<init>	(Lcom/google/android/gms/games/quest/Quest;)V
    //   54: aload_0
    //   55: aload 4
    //   57: putfield 32	com/google/android/gms/games/internal/GamesClientImpl$AcceptQuestResultImpl:zzaEk	Lcom/google/android/gms/games/quest/Quest;
    //   60: aload_2
    //   61: invokevirtual 36	com/google/android/gms/games/quest/QuestBuffer:release	()V
    //   64: return
    //   65: iconst_0
    //   66: istore_3
    //   67: aconst_null
    //   68: astore 5
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 32	com/google/android/gms/games/internal/GamesClientImpl$AcceptQuestResultImpl:zzaEk	Lcom/google/android/gms/games/quest/Quest;
    //   75: goto -15 -> 60
    //   78: astore 5
    //   80: aload_2
    //   81: invokevirtual 36	com/google/android/gms/games/quest/QuestBuffer:release	()V
    //   84: aload 5
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	AcceptQuestResultImpl
    //   0	87	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   8	73	2	localQuestBuffer	com.google.android.gms.games.quest.QuestBuffer
    //   18	49	3	i	int
    //   26	30	4	localQuestEntity	com.google.android.gms.games.quest.QuestEntity
    //   31	38	5	localObject1	Object
    //   78	7	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	18	78	finally
    //   23	26	78	finally
    //   34	38	78	finally
    //   40	45	78	finally
    //   49	54	78	finally
    //   55	60	78	finally
    //   71	75	78	finally
  }
  
  public Quest getQuest()
  {
    return this.zzaEk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$AcceptQuestResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */