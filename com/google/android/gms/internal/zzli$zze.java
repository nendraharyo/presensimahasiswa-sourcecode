package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient.GameManagerResult;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

final class zzli$zze
  implements GameManagerClient.GameManagerResult
{
  private final Status zzUX;
  private final String zzacX;
  private final long zzacY;
  private final JSONObject zzacZ;
  
  zzli$zze(Status paramStatus, String paramString, long paramLong, JSONObject paramJSONObject)
  {
    this.zzUX = paramStatus;
    this.zzacX = paramString;
    this.zzacY = paramLong;
    this.zzacZ = paramJSONObject;
  }
  
  public JSONObject getExtraMessageData()
  {
    return this.zzacZ;
  }
  
  public String getPlayerId()
  {
    return this.zzacX;
  }
  
  public long getRequestId()
  {
    return this.zzacY;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */