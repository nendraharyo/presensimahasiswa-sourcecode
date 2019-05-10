package com.google.android.gms.cast.games;

import com.google.android.gms.common.api.Result;
import org.json.JSONObject;

public abstract interface GameManagerClient$GameManagerResult
  extends Result
{
  public abstract JSONObject getExtraMessageData();
  
  public abstract String getPlayerId();
  
  public abstract long getRequestId();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\games\GameManagerClient$GameManagerResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */