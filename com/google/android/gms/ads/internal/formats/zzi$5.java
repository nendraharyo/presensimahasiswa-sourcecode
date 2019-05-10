package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class zzi$5
  implements zzdf
{
  zzi$5(zzi paramzzi) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    Object localObject4;
    try
    {
      Object localObject2 = paramMap.keySet();
      localObject4 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (String)localObject2;
        Object localObject5 = paramMap.get(localObject2);
        ((JSONObject)localObject1).put((String)localObject2, localObject5);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      localObject1 = "Unable to dispatch sendMessageToNativeJs event";
      zzin.zzb((String)localObject1, localJSONException);
    }
    for (;;)
    {
      Object localObject3 = "id";
      localObject4 = this.zzyx;
      localObject4 = zzi.zza((zzi)localObject4);
      ((JSONObject)localObject1).put((String)localObject3, localObject4);
      localObject3 = this.zzyx;
      localObject3 = zzi.zzb((zzi)localObject3);
      localObject4 = "sendMessageToNativeJs";
      ((zzed)localObject3).zzb((String)localObject4, (JSONObject)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzi$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */