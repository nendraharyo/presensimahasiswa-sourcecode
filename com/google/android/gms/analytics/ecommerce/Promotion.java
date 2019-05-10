package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Promotion
{
  public static final String ACTION_CLICK = "click";
  public static final String ACTION_VIEW = "view";
  Map zzPU;
  
  public Promotion()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzPU = localHashMap;
  }
  
  void put(String paramString1, String paramString2)
  {
    zzx.zzb(paramString1, "Name should be non-null");
    this.zzPU.put(paramString1, paramString2);
  }
  
  public Promotion setCreative(String paramString)
  {
    put("cr", paramString);
    return this;
  }
  
  public Promotion setId(String paramString)
  {
    put("id", paramString);
    return this;
  }
  
  public Promotion setName(String paramString)
  {
    put("nm", paramString);
    return this;
  }
  
  public Promotion setPosition(String paramString)
  {
    put("ps", paramString);
    return this;
  }
  
  public String toString()
  {
    return zze.zzO(this.zzPU);
  }
  
  public Map zzba(String paramString)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.zzPU.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      StringBuilder localStringBuilder = ((StringBuilder)localObject2).append(paramString);
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject2 = (String)localObject2;
      localObject1 = ((Map.Entry)localObject1).getValue();
      localHashMap.put(localObject2, localObject1);
    }
    return localHashMap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\ecommerce\Promotion.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */