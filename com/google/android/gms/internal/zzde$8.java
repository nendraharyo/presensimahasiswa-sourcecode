package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Map;
import org.json.JSONObject;

final class zzde$8
  implements zzdf
{
  private void zzc(zzjp paramzzjp)
  {
    zzin.zzaJ("Received support message, responding.");
    boolean bool = false;
    String str1 = null;
    Object localObject2 = paramzzjp.zzhR();
    if (localObject2 != null)
    {
      localObject2 = ((com.google.android.gms.ads.internal.zzd)localObject2).zzpy;
      if (localObject2 != null) {
        bool = ((zzm)localObject2).zzfM();
      }
    }
    localObject2 = new org/json/JSONObject;
    ((JSONObject)localObject2).<init>();
    String str2 = "event";
    String str3 = "checkSupport";
    try
    {
      ((JSONObject)localObject2).put(str2, str3);
      str2 = "supports";
      ((JSONObject)localObject2).put(str2, bool);
      str1 = "appStreaming";
      paramzzjp.zzb(str1, (JSONObject)localObject2);
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = "checkSupport";
    Object localObject2 = paramMap.get("action");
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool) {
      zzc(paramzzjp);
    }
    for (;;)
    {
      return;
      localObject1 = paramzzjp.zzhS();
      if (localObject1 != null) {
        ((com.google.android.gms.ads.internal.overlay.zzd)localObject1).zzg(paramzzjp, paramMap);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzde$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */