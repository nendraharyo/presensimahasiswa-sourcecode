package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;

final class GamesClientImpl$QuestUpdateBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$QuestUpdateBinderCallback(zzq paramzzq)
  {
    this.zzari = paramzzq;
  }
  
  private Quest zzaa(DataHolder paramDataHolder)
  {
    QuestBuffer localQuestBuffer = new com/google/android/gms/games/quest/QuestBuffer;
    localQuestBuffer.<init>(paramDataHolder);
    Object localObject1 = null;
    try
    {
      int i = localQuestBuffer.getCount();
      if (i > 0)
      {
        localObject1 = null;
        localObject1 = localQuestBuffer.get(0);
        localObject1 = (Quest)localObject1;
        localObject1 = ((Quest)localObject1).freeze();
        localObject1 = (Quest)localObject1;
      }
      return (Quest)localObject1;
    }
    finally
    {
      localQuestBuffer.release();
    }
  }
  
  public void zzR(DataHolder paramDataHolder)
  {
    Quest localQuest = zzaa(paramDataHolder);
    if (localQuest != null)
    {
      zzq localzzq = this.zzari;
      GamesClientImpl.QuestCompletedNotifier localQuestCompletedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$QuestCompletedNotifier;
      localQuestCompletedNotifier.<init>(localQuest);
      localzzq.zza(localQuestCompletedNotifier);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$QuestUpdateBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */