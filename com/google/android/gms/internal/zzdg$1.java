package com.google.android.gms.internal;

import android.os.Handler;
import java.util.Map;
import org.json.JSONObject;

class zzdg$1
  implements Runnable
{
  zzdg$1(zzdg paramzzdg, Map paramMap, zzjp paramzzjp) {}
  
  public void run()
  {
    zzin.zzaI("Received Http request.");
    Object localObject1 = (String)this.zzyy.get("http_request");
    Object localObject2 = this.zzzm;
    localObject1 = ((zzdg)localObject2).zzQ((String)localObject1);
    if (localObject1 == null)
    {
      localObject1 = "Response should not be null.";
      zzin.e((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = zzir.zzMc;
      zzdg.1.1 local1 = new com/google/android/gms/internal/zzdg$1$1;
      local1.<init>(this, (JSONObject)localObject1);
      ((Handler)localObject2).post(local1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdg$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */