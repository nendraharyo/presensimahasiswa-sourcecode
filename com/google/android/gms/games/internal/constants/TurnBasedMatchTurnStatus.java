package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class TurnBasedMatchTurnStatus
{
  public static String zzgw(int paramInt)
  {
    String str2;
    switch (paramInt)
    {
    default: 
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str1 = "Unknown match turn status: ";
      localObject = str1 + paramInt;
      GamesLog.zzA("MatchTurnStatus", (String)localObject);
      str2 = "TURN_STATUS_UNKNOWN";
    }
    for (;;)
    {
      return str2;
      str2 = "TURN_STATUS_INVITED";
      continue;
      str2 = "TURN_STATUS_MY_TURN";
      continue;
      str2 = "TURN_STATUS_THEIR_TURN";
      continue;
      str2 = "TURN_STATUS_COMPLETE";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\constants\TurnBasedMatchTurnStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */