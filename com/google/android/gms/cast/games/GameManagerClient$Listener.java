package com.google.android.gms.cast.games;

import org.json.JSONObject;

public abstract interface GameManagerClient$Listener
{
  public abstract void onGameMessageReceived(String paramString, JSONObject paramJSONObject);
  
  public abstract void onStateChanged(GameManagerState paramGameManagerState1, GameManagerState paramGameManagerState2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\games\GameManagerClient$Listener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */