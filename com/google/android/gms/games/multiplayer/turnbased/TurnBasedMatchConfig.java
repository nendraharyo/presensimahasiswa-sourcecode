package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;

public abstract class TurnBasedMatchConfig
{
  public static TurnBasedMatchConfig.Builder builder()
  {
    TurnBasedMatchConfig.Builder localBuilder = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;
    localBuilder.<init>(null);
    return localBuilder;
  }
  
  public static Bundle createAutoMatchCriteria(int paramInt1, int paramInt2, long paramLong)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putInt("min_automatch_players", paramInt1);
    localBundle.putInt("max_automatch_players", paramInt2);
    localBundle.putLong("exclusive_bit_mask", paramLong);
    return localBundle;
  }
  
  public abstract Bundle getAutoMatchCriteria();
  
  public abstract String[] getInvitedPlayerIds();
  
  public abstract int getVariant();
  
  public abstract int zzxP();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */