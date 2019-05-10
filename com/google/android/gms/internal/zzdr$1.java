package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

class zzdr$1
  implements Runnable
{
  zzdr$1(zzdr paramzzdr, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  public void run()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "precacheProgress");
    String str1 = this.zzzP;
    localHashMap.put("src", str1);
    str1 = this.zzzQ;
    localHashMap.put("cachedSrc", str1);
    str1 = Integer.toString(this.zzzR);
    localHashMap.put("bytesLoaded", str1);
    String str2 = "totalBytes";
    int i = this.zzzS;
    str1 = Integer.toString(i);
    localHashMap.put(str2, str1);
    str1 = "cacheReady";
    boolean bool = this.zzzT;
    if (bool) {}
    for (str2 = "1";; str2 = "0")
    {
      localHashMap.put(str1, str2);
      zzdr.zza(this.zzzU, "onPrecacheEvent", localHashMap);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdr$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */