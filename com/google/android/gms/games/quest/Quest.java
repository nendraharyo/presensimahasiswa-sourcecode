package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import java.util.List;

public abstract interface Quest
  extends Parcelable, Freezable
{
  public static final int[] QUEST_STATE_ALL;
  public static final String[] QUEST_STATE_NON_TERMINAL;
  public static final int STATE_ACCEPTED = 3;
  public static final int STATE_COMPLETED = 4;
  public static final int STATE_EXPIRED = 5;
  public static final int STATE_FAILED = 6;
  public static final int STATE_OPEN = 2;
  public static final int STATE_UPCOMING = 1;
  public static final long UNSET_QUEST_TIMESTAMP = 255L;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new int[6];
    Object tmp12_11 = localObject;
    Object tmp13_12 = tmp12_11;
    Object tmp13_12 = tmp12_11;
    tmp13_12[0] = 1;
    tmp13_12[1] = 2;
    Object tmp20_13 = tmp13_12;
    Object tmp20_13 = tmp13_12;
    tmp20_13[2] = 3;
    tmp20_13[3] = 4;
    tmp20_13[4] = 6;
    tmp20_13[5] = 5;
    QUEST_STATE_ALL = (int[])localObject;
    localObject = new String[i];
    String str1 = Integer.toString(k);
    localObject[0] = str1;
    String str2 = Integer.toString(j);
    localObject[k] = str2;
    str2 = Integer.toString(i);
    localObject[j] = str2;
    QUEST_STATE_NON_TERMINAL = (String[])localObject;
  }
  
  public abstract long getAcceptedTimestamp();
  
  public abstract Uri getBannerImageUri();
  
  public abstract String getBannerImageUrl();
  
  public abstract Milestone getCurrentMilestone();
  
  public abstract String getDescription();
  
  public abstract void getDescription(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract long getEndTimestamp();
  
  public abstract Game getGame();
  
  public abstract Uri getIconImageUri();
  
  public abstract String getIconImageUrl();
  
  public abstract long getLastUpdatedTimestamp();
  
  public abstract String getName();
  
  public abstract void getName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getQuestId();
  
  public abstract long getStartTimestamp();
  
  public abstract int getState();
  
  public abstract int getType();
  
  public abstract boolean isEndingSoon();
  
  public abstract List zzxR();
  
  public abstract long zzxS();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\Quest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */