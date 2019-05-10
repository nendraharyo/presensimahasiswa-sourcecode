package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq.zza;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzm$2
  implements zzjq.zza
{
  zzm$2(zze paramzze, String paramString, zzjp paramzzjp) {}
  
  public void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    Object localObject2;
    Object localObject3;
    Object localObject4;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject2 = "headline";
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).getHeadline();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "body";
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).getBody();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "call_to_action";
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).getCallToAction();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "advertiser";
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).getAdvertiser();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "logo";
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).zzdO();
      localObject3 = zzm.zza((zzch)localObject3);
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).getImages();
      if (localObject3 != null)
      {
        localObject3 = ((List)localObject3).iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject3).hasNext();
          if (!bool) {
            break;
          }
          localObject4 = ((Iterator)localObject3).next();
          localObject4 = zzm.zzd(localObject4);
          localObject4 = zzm.zza((zzch)localObject4);
          ((JSONArray)localObject2).put(localObject4);
        }
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      localObject2 = "Exception occurred when loading assets";
      zzin.zzd((String)localObject2, localJSONException);
    }
    for (;;)
    {
      localObject3 = "images";
      localJSONException.put((String)localObject3, localObject2);
      localObject2 = "extras";
      localObject3 = this.zzqt;
      localObject3 = ((zze)localObject3).getExtras();
      localObject4 = this.zzqr;
      localObject3 = zzm.zzb((Bundle)localObject3, (String)localObject4);
      localJSONException.put((String)localObject2, localObject3);
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      localObject3 = "assets";
      ((JSONObject)localObject2).put((String)localObject3, localJSONException);
      Object localObject1 = "template_id";
      localObject3 = "1";
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = this.zzqs;
      localObject3 = "google.afma.nativeExpressAds.loadAssets";
      ((zzjp)localObject1).zza((String)localObject3, (JSONObject)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzm$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */