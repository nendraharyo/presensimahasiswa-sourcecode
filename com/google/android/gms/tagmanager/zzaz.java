package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzrs.zza;
import com.google.android.gms.internal.zzrs.zzb;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zzd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class zzaz
{
  private static zzag.zza zzK(Object paramObject)
  {
    return zzdf.zzR(zzL(paramObject));
  }
  
  static Object zzL(Object paramObject)
  {
    boolean bool = paramObject instanceof JSONArray;
    if (bool)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("JSONArrays are not supported");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = JSONObject.NULL;
    bool = localObject1.equals(paramObject);
    if (bool)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("JSON nulls are not supported");
      throw ((Throwable)localObject1);
    }
    bool = paramObject instanceof JSONObject;
    if (bool)
    {
      paramObject = (JSONObject)paramObject;
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Iterator localIterator = ((JSONObject)paramObject).keys();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)localIterator.next();
        Object localObject2 = zzL(((JSONObject)paramObject).get((String)localObject1));
        localHashMap.put(localObject1, localObject2);
      }
      paramObject = localHashMap;
    }
    return paramObject;
  }
  
  public static zzrs.zzc zzgi(String paramString)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramString);
    zzag.zza localzza1 = zzK(localJSONObject);
    zzrs.zzd localzzd = zzrs.zzc.zzHK();
    int i = 0;
    localJSONObject = null;
    for (;;)
    {
      Object localObject = localzza1.zzjz;
      int j = localObject.length;
      if (i >= j) {
        break;
      }
      localObject = zzrs.zza.zzHH();
      String str = zzae.zzfR.toString();
      zzag.zza localzza2 = localzza1.zzjz[i];
      localObject = ((zzrs.zzb)localObject).zzb(str, localzza2);
      str = zzae.zzfG.toString();
      localzza2 = zzdf.zzgt(zzn.zzFZ());
      localObject = ((zzrs.zzb)localObject).zzb(str, localzza2);
      str = zzn.zzGa();
      localzza2 = localzza1.zzjA[i];
      localObject = ((zzrs.zzb)localObject).zzb(str, localzza2).zzHJ();
      localzzd.zzc((zzrs.zza)localObject);
      i += 1;
    }
    return localzzd.zzHN();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzaz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */