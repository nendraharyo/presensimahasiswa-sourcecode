package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;

final class GamesClientImpl$LoadQuestsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Quests.LoadQuestsResult
{
  private final DataHolder zzahi;
  
  GamesClientImpl$LoadQuestsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.zzahi = paramDataHolder;
  }
  
  public QuestBuffer getQuests()
  {
    QuestBuffer localQuestBuffer = new com/google/android/gms/games/quest/QuestBuffer;
    DataHolder localDataHolder = this.zzahi;
    localQuestBuffer.<init>(localDataHolder);
    return localQuestBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadQuestsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */