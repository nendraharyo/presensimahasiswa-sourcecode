package com.google.android.gms.cast.games;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.zzli;
import org.json.JSONObject;

public final class GameManagerClient
{
  public static final int GAMEPLAY_STATE_LOADING = 1;
  public static final int GAMEPLAY_STATE_PAUSED = 3;
  public static final int GAMEPLAY_STATE_RUNNING = 2;
  public static final int GAMEPLAY_STATE_SHOWING_INFO_SCREEN = 4;
  public static final int GAMEPLAY_STATE_UNKNOWN = 0;
  public static final int LOBBY_STATE_CLOSED = 2;
  public static final int LOBBY_STATE_OPEN = 1;
  public static final int LOBBY_STATE_UNKNOWN = 0;
  public static final int PLAYER_STATE_AVAILABLE = 3;
  public static final int PLAYER_STATE_DROPPED = 1;
  public static final int PLAYER_STATE_IDLE = 5;
  public static final int PLAYER_STATE_PLAYING = 6;
  public static final int PLAYER_STATE_QUIT = 2;
  public static final int PLAYER_STATE_READY = 4;
  public static final int PLAYER_STATE_UNKNOWN = 0;
  public static final int STATUS_INCORRECT_VERSION = 2150;
  public static final int STATUS_TOO_MANY_PLAYERS = 2151;
  private final zzli zzacy;
  
  public GameManagerClient(zzli paramzzli)
  {
    this.zzacy = paramzzli;
  }
  
  public static PendingResult getInstanceFor(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzli localzzli = new com/google/android/gms/internal/zzli;
    Cast.CastApi localCastApi = Cast.CastApi;
    localzzli.<init>(paramGoogleApiClient, paramString, localCastApi);
    return zza(localzzli);
  }
  
  static PendingResult zza(zzli paramzzli)
  {
    GameManagerClient localGameManagerClient = new com/google/android/gms/cast/games/GameManagerClient;
    localGameManagerClient.<init>(paramzzli);
    return paramzzli.zza(localGameManagerClient);
  }
  
  private PendingResult zza(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    return this.zzacy.zza(paramString, paramInt, paramJSONObject);
  }
  
  public void dispose()
  {
    this.zzacy.dispose();
  }
  
  public GameManagerState getCurrentState()
  {
    try
    {
      Object localObject1 = this.zzacy;
      localObject1 = ((zzli)localObject1).getCurrentState();
      return (GameManagerState)localObject1;
    }
    finally {}
  }
  
  public String getLastUsedPlayerId()
  {
    return this.zzacy.getLastUsedPlayerId();
  }
  
  public boolean isDisposed()
  {
    return this.zzacy.isDisposed();
  }
  
  public void sendGameMessage(String paramString, JSONObject paramJSONObject)
  {
    this.zzacy.sendGameMessage(paramString, paramJSONObject);
  }
  
  public void sendGameMessage(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    sendGameMessage(str, paramJSONObject);
  }
  
  public PendingResult sendGameRequest(String paramString, JSONObject paramJSONObject)
  {
    return this.zzacy.sendGameRequest(paramString, paramJSONObject);
  }
  
  public PendingResult sendGameRequest(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    return sendGameRequest(str, paramJSONObject);
  }
  
  public PendingResult sendPlayerAvailableRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 3, paramJSONObject);
  }
  
  public PendingResult sendPlayerAvailableRequest(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    return zza(str, 3, paramJSONObject);
  }
  
  public PendingResult sendPlayerIdleRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 5, paramJSONObject);
  }
  
  public PendingResult sendPlayerIdleRequest(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    return zza(str, 5, paramJSONObject);
  }
  
  public PendingResult sendPlayerPlayingRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 6, paramJSONObject);
  }
  
  public PendingResult sendPlayerPlayingRequest(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    return zza(str, 6, paramJSONObject);
  }
  
  public PendingResult sendPlayerQuitRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 2, paramJSONObject);
  }
  
  public PendingResult sendPlayerQuitRequest(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    return zza(str, 2, paramJSONObject);
  }
  
  public PendingResult sendPlayerReadyRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 4, paramJSONObject);
  }
  
  public PendingResult sendPlayerReadyRequest(JSONObject paramJSONObject)
  {
    String str = getLastUsedPlayerId();
    return zza(str, 4, paramJSONObject);
  }
  
  public void setListener(GameManagerClient.Listener paramListener)
  {
    this.zzacy.setListener(paramListener);
  }
  
  public void setSessionLabel(String paramString)
  {
    this.zzacy.setSessionLabel(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\games\GameManagerClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */