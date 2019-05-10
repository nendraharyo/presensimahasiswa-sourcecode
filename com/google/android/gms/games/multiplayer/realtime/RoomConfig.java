package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;

public abstract class RoomConfig
{
  public static RoomConfig.Builder builder(RoomUpdateListener paramRoomUpdateListener)
  {
    RoomConfig.Builder localBuilder = new com/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    localBuilder.<init>(paramRoomUpdateListener, null);
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
  
  public abstract String getInvitationId();
  
  public abstract String[] getInvitedPlayerIds();
  
  public abstract RealTimeMessageReceivedListener getMessageReceivedListener();
  
  public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();
  
  public abstract RoomUpdateListener getRoomUpdateListener();
  
  public abstract int getVariant();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */