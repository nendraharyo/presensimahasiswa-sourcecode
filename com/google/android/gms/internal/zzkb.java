package com.google.android.gms.internal;

import com.google.android.gms.measurement.zze;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzkb
  extends zze
{
  private Map zzPL;
  
  public zzkb()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(4);
    this.zzPL = localHashMap;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.zzPL.entrySet();
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
      localObject2 = ((StringBuilder)localObject2).append("dimension");
      Object localObject3 = ((Map.Entry)localObject1).getKey();
      localObject2 = localObject3;
      localObject1 = ((Map.Entry)localObject1).getValue();
      localHashMap.put(localObject2, localObject1);
    }
    return zzF(localHashMap);
  }
  
  public void zza(zzkb paramzzkb)
  {
    Map localMap1 = paramzzkb.zzPL;
    Map localMap2 = this.zzPL;
    localMap1.putAll(localMap2);
  }
  
  public Map zziP()
  {
    return Collections.unmodifiableMap(this.zzPL);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */