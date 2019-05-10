package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

class zzdr$3
  implements Runnable
{
  zzdr$3(zzdr paramzzdr, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public void run()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "precacheCanceled");
    Object localObject = this.zzzP;
    localHashMap.put("src", localObject);
    String str1 = this.zzzQ;
    boolean bool = TextUtils.isEmpty(str1);
    if (!bool)
    {
      str1 = "cachedSrc";
      localObject = this.zzzQ;
      localHashMap.put(str1, localObject);
    }
    localObject = this.zzzU;
    String str2 = this.zzzV;
    localObject = zzdr.zza((zzdr)localObject, str2);
    localHashMap.put("type", localObject);
    localObject = this.zzzV;
    localHashMap.put("reason", localObject);
    str1 = this.zzzW;
    bool = TextUtils.isEmpty(str1);
    if (!bool)
    {
      str1 = "message";
      localObject = this.zzzW;
      localHashMap.put(str1, localObject);
    }
    zzdr.zza(this.zzzU, "onPrecacheEvent", localHashMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdr$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */