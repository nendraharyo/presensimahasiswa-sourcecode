package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import java.util.List;

public final class RealTimeMultiplayerImpl
  implements RealTimeMultiplayer
{
  private static zzq zza(GoogleApiClient paramGoogleApiClient, Object paramObject)
  {
    if (paramObject == null) {}
    for (zzq localzzq = null;; localzzq = paramGoogleApiClient.zzr(paramObject)) {
      return localzzq;
    }
  }
  
  public void create(GoogleApiClient paramGoogleApiClient, RoomConfig paramRoomConfig)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramRoomConfig.getRoomUpdateListener();
      localObject1 = paramGoogleApiClient.zzr(localObject1);
      Object localObject2 = paramRoomConfig.getRoomStatusUpdateListener();
      localObject2 = zza(paramGoogleApiClient, localObject2);
      Object localObject3 = paramRoomConfig.getMessageReceivedListener();
      localObject3 = zza(paramGoogleApiClient, localObject3);
      localGamesClientImpl.zza((zzq)localObject1, (zzq)localObject2, (zzq)localObject3, paramRoomConfig);
    }
  }
  
  public void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzr(paramString, 0);
    }
  }
  
  public void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzq(paramString, 0);
    }
  }
  
  public Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return Games.zzh(paramGoogleApiClient).zzc(paramInt1, paramInt2, true);
  }
  
  public Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return Games.zzh(paramGoogleApiClient).zzc(paramInt1, paramInt2, paramBoolean);
  }
  
  public Intent getWaitingRoomIntent(GoogleApiClient paramGoogleApiClient, Room paramRoom, int paramInt)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramRoom, paramInt);
  }
  
  public void join(GoogleApiClient paramGoogleApiClient, RoomConfig paramRoomConfig)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramRoomConfig.getRoomUpdateListener();
      localObject1 = paramGoogleApiClient.zzr(localObject1);
      Object localObject2 = paramRoomConfig.getRoomStatusUpdateListener();
      localObject2 = zza(paramGoogleApiClient, localObject2);
      Object localObject3 = paramRoomConfig.getMessageReceivedListener();
      localObject3 = zza(paramGoogleApiClient, localObject3);
      localGamesClientImpl.zzb((zzq)localObject1, (zzq)localObject2, (zzq)localObject3, paramRoomConfig);
    }
  }
  
  public void leave(GoogleApiClient paramGoogleApiClient, RoomUpdateListener paramRoomUpdateListener, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      zzq localzzq = paramGoogleApiClient.zzr(paramRoomUpdateListener);
      localGamesClientImpl.zza(localzzq, paramString);
    }
  }
  
  public int sendReliableMessage(GoogleApiClient paramGoogleApiClient, RealTimeMultiplayer.ReliableMessageSentCallback paramReliableMessageSentCallback, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    zzq localzzq = zza(paramGoogleApiClient, paramReliableMessageSentCallback);
    return Games.zzh(paramGoogleApiClient).zza(localzzq, paramArrayOfByte, paramString1, paramString2);
  }
  
  public int sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    GamesClientImpl localGamesClientImpl = Games.zzh(paramGoogleApiClient);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString2;
    return localGamesClientImpl.zza(paramArrayOfByte, paramString1, arrayOfString);
  }
  
  public int sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString, List paramList)
  {
    String[] arrayOfString = new String[paramList.size()];
    arrayOfString = (String[])paramList.toArray(arrayOfString);
    return Games.zzh(paramGoogleApiClient).zza(paramArrayOfByte, paramString, arrayOfString);
  }
  
  public int sendUnreliableMessageToOthers(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString)
  {
    return Games.zzh(paramGoogleApiClient).zzd(paramArrayOfByte, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\RealTimeMultiplayerImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */