package com.google.android.gms.wearable.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzbo
{
  private static Map zzG(List paramList)
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = paramList.size() * 2;
    localHashMap.<init>(i);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      CapabilityInfoParcelable localCapabilityInfoParcelable = (CapabilityInfoParcelable)localIterator.next();
      String str = localCapabilityInfoParcelable.getName();
      zzj.zzc localzzc = new com/google/android/gms/wearable/internal/zzj$zzc;
      localzzc.<init>(localCapabilityInfoParcelable);
      localHashMap.put(str, localzzc);
    }
    return localHashMap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */