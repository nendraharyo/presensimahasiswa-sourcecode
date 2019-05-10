package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

final class GamesClientImpl$QuestCompletedNotifier
  implements zzq.zzb
{
  private final Quest zzaEk;
  
  GamesClientImpl$QuestCompletedNotifier(Quest paramQuest)
  {
    this.zzaEk = paramQuest;
  }
  
  public void zza(QuestUpdateListener paramQuestUpdateListener)
  {
    Quest localQuest = this.zzaEk;
    paramQuestUpdateListener.onQuestCompleted(localQuest);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$QuestCompletedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */