package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class QuestBuffer
  extends zzf
{
  public QuestBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected String zzqg()
  {
    return "external_quest_id";
  }
  
  protected Quest zzt(int paramInt1, int paramInt2)
  {
    QuestRef localQuestRef = new com/google/android/gms/games/quest/QuestRef;
    DataHolder localDataHolder = this.zzahi;
    localQuestRef.<init>(localDataHolder, paramInt1, paramInt2);
    return localQuestRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\QuestBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */