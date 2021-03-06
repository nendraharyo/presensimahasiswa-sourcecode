package com.google.android.gms.games.multiplayer.realtime;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

public abstract interface RealTimeMultiplayer
{
  public static final int REAL_TIME_MESSAGE_FAILED = 255;
  
  public abstract void create(GoogleApiClient paramGoogleApiClient, RoomConfig paramRoomConfig);
  
  public abstract void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2);
  
  public abstract Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract Intent getWaitingRoomIntent(GoogleApiClient paramGoogleApiClient, Room paramRoom, int paramInt);
  
  public abstract void join(GoogleApiClient paramGoogleApiClient, RoomConfig paramRoomConfig);
  
  public abstract void leave(GoogleApiClient paramGoogleApiClient, RoomUpdateListener paramRoomUpdateListener, String paramString);
  
  public abstract int sendReliableMessage(GoogleApiClient paramGoogleApiClient, RealTimeMultiplayer.ReliableMessageSentCallback paramReliableMessageSentCallback, byte[] paramArrayOfByte, String paramString1, String paramString2);
  
  public abstract int sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString1, String paramString2);
  
  public abstract int sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString, List paramList);
  
  public abstract int sendUnreliableMessageToOthers(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RealTimeMultiplayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */