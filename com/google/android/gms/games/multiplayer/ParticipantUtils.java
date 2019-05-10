package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import java.util.ArrayList;

public final class ParticipantUtils
{
  public static String getParticipantId(ArrayList paramArrayList, String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    int j = paramArrayList.size();
    int k = 0;
    if (k < j)
    {
      localObject1 = (Participant)paramArrayList.get(k);
      Object localObject2 = ((Participant)localObject1).getPlayer();
      if (localObject2 != null)
      {
        localObject2 = ((Player)localObject2).getPlayerId();
        boolean bool = ((String)localObject2).equals(paramString);
        if (!bool) {}
      }
    }
    for (localObject1 = ((Participant)localObject1).getParticipantId();; localObject1 = null)
    {
      return (String)localObject1;
      i = k + 1;
      k = i;
      break;
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */