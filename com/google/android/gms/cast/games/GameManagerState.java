package com.google.android.gms.cast.games;

import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public abstract interface GameManagerState
{
  public abstract CharSequence getApplicationName();
  
  public abstract List getConnectedControllablePlayers();
  
  public abstract List getConnectedPlayers();
  
  public abstract List getControllablePlayers();
  
  public abstract JSONObject getGameData();
  
  public abstract CharSequence getGameStatusText();
  
  public abstract int getGameplayState();
  
  public abstract Collection getListOfChangedPlayers(GameManagerState paramGameManagerState);
  
  public abstract int getLobbyState();
  
  public abstract int getMaxPlayers();
  
  public abstract PlayerInfo getPlayer(String paramString);
  
  public abstract Collection getPlayers();
  
  public abstract List getPlayersInState(int paramInt);
  
  public abstract boolean hasGameDataChanged(GameManagerState paramGameManagerState);
  
  public abstract boolean hasGameStatusTextChanged(GameManagerState paramGameManagerState);
  
  public abstract boolean hasGameplayStateChanged(GameManagerState paramGameManagerState);
  
  public abstract boolean hasLobbyStateChanged(GameManagerState paramGameManagerState);
  
  public abstract boolean hasPlayerChanged(String paramString, GameManagerState paramGameManagerState);
  
  public abstract boolean hasPlayerDataChanged(String paramString, GameManagerState paramGameManagerState);
  
  public abstract boolean hasPlayerStateChanged(String paramString, GameManagerState paramGameManagerState);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\games\GameManagerState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */