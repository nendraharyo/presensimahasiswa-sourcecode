package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

public class zzfq
{
  private final boolean zzDu;
  private final boolean zzDv;
  private final boolean zzDw;
  private final boolean zzDx;
  private final boolean zzDy;
  
  private zzfq(zzfq.zza paramzza)
  {
    boolean bool = zzfq.zza.zza(paramzza);
    this.zzDu = bool;
    bool = zzfq.zza.zzb(paramzza);
    this.zzDv = bool;
    bool = zzfq.zza.zzc(paramzza);
    this.zzDw = bool;
    bool = zzfq.zza.zzd(paramzza);
    this.zzDx = bool;
    bool = zzfq.zza.zze(paramzza);
    this.zzDy = bool;
  }
  
  public JSONObject toJson()
  {
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      str = "sms";
      boolean bool = this.zzDu;
      localJSONObject = localJSONObject.put(str, bool);
      str = "tel";
      bool = this.zzDv;
      localJSONObject = localJSONObject.put(str, bool);
      str = "calendar";
      bool = this.zzDw;
      localJSONObject = localJSONObject.put(str, bool);
      str = "storePicture";
      bool = this.zzDx;
      localJSONObject = localJSONObject.put(str, bool);
      str = "inlineVideo";
      bool = this.zzDy;
      localJSONObject = localJSONObject.put(str, bool);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        String str = "Error occured while obtaining the MRAID capabilities.";
        zzin.zzb(str, localJSONException);
        Object localObject = null;
      }
    }
    return localJSONObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */