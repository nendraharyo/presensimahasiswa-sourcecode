package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class zzh
{
  private static final String[] zzUb;
  private static final Map zzUc;
  
  static
  {
    int i = 0;
    int j = 9;
    Object localObject1 = new String[j];
    localObject1[0] = "text1";
    localObject1[1] = "text2";
    localObject1[2] = "icon";
    localObject1[3] = "intent_action";
    localObject1[4] = "intent_data";
    localObject1[5] = "intent_data_id";
    localObject1[6] = "intent_extra_data";
    localObject1[7] = "suggest_large_icon";
    Object localObject2 = "intent_activity";
    localObject1[8] = localObject2;
    zzUb = (String[])localObject1;
    localObject1 = new java/util/HashMap;
    Object localObject3 = zzUb;
    int k = localObject3.length;
    ((HashMap)localObject1).<init>(k);
    zzUc = (Map)localObject1;
    for (;;)
    {
      localObject1 = zzUb;
      j = localObject1.length;
      if (i >= j) {
        break;
      }
      localObject1 = zzUc;
      localObject3 = zzUb[i];
      localObject2 = Integer.valueOf(i);
      ((Map)localObject1).put(localObject3, localObject2);
      i += 1;
    }
  }
  
  public static String zzao(int paramInt)
  {
    int i;
    if (paramInt >= 0)
    {
      localObject = zzUb;
      i = localObject.length;
      if (paramInt < i) {}
    }
    else
    {
      i = 0;
    }
    for (Object localObject = null;; localObject = zzUb[paramInt]) {
      return (String)localObject;
    }
  }
  
  public static int zzbA(String paramString)
  {
    Object localObject1 = (Integer)zzUc.get(paramString);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "[" + paramString + "] is not a valid global search section name";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return ((Integer)localObject1).intValue();
  }
  
  public static int zzmg()
  {
    return zzUb.length;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */