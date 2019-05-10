package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

class zzdr$2
  implements Runnable
{
  zzdr$2(zzdr paramzzdr, String paramString1, String paramString2, int paramInt) {}
  
  public void run()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "precacheComplete");
    String str = this.zzzP;
    localHashMap.put("src", str);
    str = this.zzzQ;
    localHashMap.put("cachedSrc", str);
    str = Integer.toString(this.zzzS);
    localHashMap.put("totalBytes", str);
    zzdr.zza(this.zzzU, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdr$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */