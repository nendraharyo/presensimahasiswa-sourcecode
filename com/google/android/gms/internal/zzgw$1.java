package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class zzgw$1
  implements zzdf
{
  zzgw$1(zzgw paramzzgw, zzed paramzzed, zzgw.zzb paramzzb, zzjd paramzzjd) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = this.zzGM;
    Object localObject2 = "/nativeAdPreProcess";
    Object localObject3 = this.zzGN.zzHb;
    ((zzed)localObject1).zzb((String)localObject2, (zzdf)localObject3);
    localObject1 = "success";
    try
    {
      localObject1 = paramMap.get(localObject1);
      localObject1 = (String)localObject1;
      bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool1)
      {
        localObject2 = this.zzGO;
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>((String)localObject1);
        localObject1 = "ads";
        localObject1 = ((JSONObject)localObject3).getJSONArray((String)localObject1);
        localObject3 = null;
        localObject1 = ((JSONArray)localObject1).getJSONObject(0);
        ((zzjd)localObject2).zzg(localObject1);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localObject2 = "Malformed native JSON response.";
        zzin.zzb((String)localObject2, localJSONException);
        this.zzGP.zzF(0);
        boolean bool2 = this.zzGP.zzgn();
        zzx.zza(bool2, "Unable to set the ad state error!");
        zzjd localzzjd = this.zzGO;
        boolean bool1 = false;
        localObject2 = null;
        localzzjd.zzg(null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgw$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */