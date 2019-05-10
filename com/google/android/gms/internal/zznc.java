package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zznc
{
  public static void zza(StringBuilder paramStringBuilder, HashMap paramHashMap)
  {
    Object localObject1 = "{";
    paramStringBuilder.append((String)localObject1);
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    Object localObject2 = paramHashMap.keySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    boolean bool2 = bool1;
    float f2 = f1;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject1 = (String)localIterator.next();
      String str1;
      boolean bool3;
      float f3;
      if (!bool2)
      {
        str1 = ",";
        paramStringBuilder.append(str1);
        bool3 = bool2;
        f3 = f2;
        label84:
        localObject2 = (String)paramHashMap.get(localObject1);
        localObject1 = paramStringBuilder.append("\"").append((String)localObject1);
        String str2 = "\":";
        ((StringBuilder)localObject1).append(str2);
        if (localObject2 != null) {
          break label153;
        }
        localObject1 = "null";
        paramStringBuilder.append((String)localObject1);
      }
      for (;;)
      {
        bool2 = bool3;
        f2 = f3;
        break;
        bool3 = false;
        f3 = 0.0F;
        str1 = null;
        break label84;
        label153:
        localObject1 = paramStringBuilder.append("\"").append((String)localObject2);
        localObject2 = "\"";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
    paramStringBuilder.append("}");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */