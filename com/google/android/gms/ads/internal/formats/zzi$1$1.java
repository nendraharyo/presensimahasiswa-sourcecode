package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq.zza;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class zzi$1$1
  implements zzjq.zza
{
  zzi$1$1(zzi.1 param1, Map paramMap) {}
  
  public void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    Object localObject1 = this.zzyz.zzyx;
    Object localObject2 = (String)this.zzyy.get("id");
    zzi.zza((zzi)localObject1, (String)localObject2);
    localObject2 = new org/json/JSONObject;
    ((JSONObject)localObject2).<init>();
    localObject1 = "messageType";
    Object localObject3 = "htmlLoaded";
    try
    {
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = "id";
      localObject3 = this.zzyz;
      localObject3 = ((zzi.1)localObject3).zzyx;
      localObject3 = zzi.zza((zzi)localObject3);
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = this.zzyz;
      localObject1 = ((zzi.1)localObject1).zzyx;
      localObject1 = zzi.zzb((zzi)localObject1);
      localObject3 = "sendMessageToNativeJs";
      ((zzed)localObject1).zzb((String)localObject3, (JSONObject)localObject2);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localObject1 = "Unable to dispatch sendMessageToNativeJsevent";
        zzin.zzb((String)localObject1, localJSONException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzi$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */