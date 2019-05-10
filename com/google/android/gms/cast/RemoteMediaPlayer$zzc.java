package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

final class RemoteMediaPlayer$zzc
  implements RemoteMediaPlayer.MediaChannelResult
{
  private final Status zzUX;
  private final JSONObject zzaaU;
  
  RemoteMediaPlayer$zzc(Status paramStatus, JSONObject paramJSONObject)
  {
    this.zzUX = paramStatus;
    this.zzaaU = paramJSONObject;
  }
  
  public JSONObject getCustomData()
  {
    return this.zzaaU;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */