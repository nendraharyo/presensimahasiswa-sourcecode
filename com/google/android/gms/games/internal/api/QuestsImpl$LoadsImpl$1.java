package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;

class QuestsImpl$LoadsImpl$1
  implements Quests.LoadQuestsResult
{
  QuestsImpl$LoadsImpl$1(QuestsImpl.LoadsImpl paramLoadsImpl, Status paramStatus) {}
  
  public QuestBuffer getQuests()
  {
    int i = this.zzZR.getStatusCode();
    QuestBuffer localQuestBuffer = new com/google/android/gms/games/quest/QuestBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(i);
    localQuestBuffer.<init>(localDataHolder);
    return localQuestBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\QuestsImpl$LoadsImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */