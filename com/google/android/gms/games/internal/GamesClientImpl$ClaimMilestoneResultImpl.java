package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;

final class GamesClientImpl$ClaimMilestoneResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Quests.ClaimMilestoneResult
{
  private final Quest zzaEk;
  private final Milestone zzaEn;
  
  /* Error */
  GamesClientImpl$ClaimMilestoneResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 14	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   7: new 16	com/google/android/gms/games/quest/QuestBuffer
    //   10: astore 4
    //   12: aload 4
    //   14: aload_1
    //   15: invokespecial 17	com/google/android/gms/games/quest/QuestBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   18: aload 4
    //   20: invokevirtual 21	com/google/android/gms/games/quest/QuestBuffer:getCount	()I
    //   23: istore 5
    //   25: iload 5
    //   27: ifle +170 -> 197
    //   30: new 23	com/google/android/gms/games/quest/QuestEntity
    //   33: astore 6
    //   35: iconst_0
    //   36: istore 5
    //   38: aconst_null
    //   39: astore 7
    //   41: aload 4
    //   43: iconst_0
    //   44: invokevirtual 27	com/google/android/gms/games/quest/QuestBuffer:get	(I)Ljava/lang/Object;
    //   47: astore 7
    //   49: aload 7
    //   51: checkcast 29	com/google/android/gms/games/quest/Quest
    //   54: astore 7
    //   56: aload 6
    //   58: aload 7
    //   60: invokespecial 32	com/google/android/gms/games/quest/QuestEntity:<init>	(Lcom/google/android/gms/games/quest/Quest;)V
    //   63: aload_0
    //   64: aload 6
    //   66: putfield 34	com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl:zzaEk	Lcom/google/android/gms/games/quest/Quest;
    //   69: aload_0
    //   70: getfield 34	com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl:zzaEk	Lcom/google/android/gms/games/quest/Quest;
    //   73: astore 7
    //   75: aload 7
    //   77: invokeinterface 38 1 0
    //   82: astore 6
    //   84: aload 6
    //   86: invokeinterface 43 1 0
    //   91: istore 8
    //   93: iload_3
    //   94: iload 8
    //   96: if_icmpge +82 -> 178
    //   99: aload 6
    //   101: iload_3
    //   102: invokeinterface 44 2 0
    //   107: astore 7
    //   109: aload 7
    //   111: checkcast 46	com/google/android/gms/games/quest/Milestone
    //   114: astore 7
    //   116: aload 7
    //   118: invokeinterface 50 1 0
    //   123: astore 7
    //   125: aload 7
    //   127: aload_2
    //   128: invokevirtual 56	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   131: istore 5
    //   133: iload 5
    //   135: ifeq +32 -> 167
    //   138: aload 6
    //   140: iload_3
    //   141: invokeinterface 44 2 0
    //   146: astore 7
    //   148: aload 7
    //   150: checkcast 46	com/google/android/gms/games/quest/Milestone
    //   153: astore 7
    //   155: aload_0
    //   156: aload 7
    //   158: putfield 58	com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl:zzaEn	Lcom/google/android/gms/games/quest/Milestone;
    //   161: aload 4
    //   163: invokevirtual 62	com/google/android/gms/games/quest/QuestBuffer:release	()V
    //   166: return
    //   167: iload_3
    //   168: iconst_1
    //   169: iadd
    //   170: istore 5
    //   172: iload 5
    //   174: istore_3
    //   175: goto -82 -> 93
    //   178: iconst_0
    //   179: istore 5
    //   181: aconst_null
    //   182: astore 7
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 58	com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl:zzaEn	Lcom/google/android/gms/games/quest/Milestone;
    //   189: aload 4
    //   191: invokevirtual 62	com/google/android/gms/games/quest/QuestBuffer:release	()V
    //   194: goto -28 -> 166
    //   197: iconst_0
    //   198: istore 5
    //   200: aconst_null
    //   201: astore 7
    //   203: aload_0
    //   204: aconst_null
    //   205: putfield 58	com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl:zzaEn	Lcom/google/android/gms/games/quest/Milestone;
    //   208: iconst_0
    //   209: istore 5
    //   211: aconst_null
    //   212: astore 7
    //   214: aload_0
    //   215: aconst_null
    //   216: putfield 34	com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl:zzaEk	Lcom/google/android/gms/games/quest/Quest;
    //   219: goto -30 -> 189
    //   222: astore 7
    //   224: aload 4
    //   226: invokevirtual 62	com/google/android/gms/games/quest/QuestBuffer:release	()V
    //   229: aload 7
    //   231: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	this	ClaimMilestoneResultImpl
    //   0	232	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   0	232	2	paramString	String
    //   1	174	3	i	int
    //   10	215	4	localQuestBuffer	com.google.android.gms.games.quest.QuestBuffer
    //   23	14	5	j	int
    //   131	3	5	bool	boolean
    //   170	40	5	k	int
    //   33	106	6	localObject1	Object
    //   39	174	7	localObject2	Object
    //   222	8	7	localObject3	Object
    //   91	6	8	m	int
    // Exception table:
    //   from	to	target	type
    //   18	23	222	finally
    //   30	33	222	finally
    //   43	47	222	finally
    //   49	54	222	finally
    //   58	63	222	finally
    //   64	69	222	finally
    //   69	73	222	finally
    //   75	82	222	finally
    //   84	91	222	finally
    //   101	107	222	finally
    //   109	114	222	finally
    //   116	123	222	finally
    //   127	131	222	finally
    //   140	146	222	finally
    //   148	153	222	finally
    //   156	161	222	finally
    //   185	189	222	finally
    //   204	208	222	finally
    //   215	219	222	finally
  }
  
  public Milestone getMilestone()
  {
    return this.zzaEn;
  }
  
  public Quest getQuest()
  {
    return this.zzaEk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$ClaimMilestoneResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */