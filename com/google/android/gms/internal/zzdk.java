package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public class zzdk
  implements zzdf
{
  final HashMap zzzz;
  
  public zzdk()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzzz = localHashMap;
  }
  
  public Future zzR(String paramString)
  {
    zzjd localzzjd = new com/google/android/gms/internal/zzjd;
    localzzjd.<init>();
    this.zzzz.put(paramString, localzzjd);
    return localzzjd;
  }
  
  public void zzS(String paramString)
  {
    Object localObject = (zzjd)this.zzzz.get(paramString);
    if (localObject == null)
    {
      localObject = "Could not find the ad request for the corresponding ad response.";
      zzin.e((String)localObject);
    }
    for (;;)
    {
      return;
      boolean bool = ((zzjd)localObject).isDone();
      if (!bool)
      {
        bool = true;
        ((zzjd)localObject).cancel(bool);
      }
      localObject = this.zzzz;
      ((HashMap)localObject).remove(paramString);
    }
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = (String)paramMap.get("fetched_ad");
    zzd(str1, str2);
  }
  
  public void zzd(String paramString1, String paramString2)
  {
    zzin.zzaI("Received ad from the cache.");
    Object localObject1 = (zzjd)this.zzzz.get(paramString1);
    if (localObject1 == null)
    {
      localObject1 = "Could not find the ad request for the corresponding ad response.";
      zzin.e((String)localObject1);
    }
    for (;;)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString2);
        ((zzjd)localObject1).zzg(localJSONObject);
        localObject1 = this.zzzz;
        ((HashMap)localObject1).remove(paramString1);
      }
      catch (JSONException localJSONException)
      {
        String str = "Failed constructing JSON object from value passed from javascript";
        zzin.zzb(str, localJSONException);
        Object localObject3 = null;
        ((zzjd)localObject1).zzg(null);
        localObject1 = this.zzzz;
        ((HashMap)localObject1).remove(paramString1);
      }
      finally
      {
        this.zzzz.remove(paramString1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */