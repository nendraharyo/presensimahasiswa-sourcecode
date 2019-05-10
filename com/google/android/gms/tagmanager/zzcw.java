package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzcw
  implements zzl
{
  private final Map zzbld;
  private final int zzble;
  private final zzm.zza zzblf;
  private int zzblg;
  
  zzcw(int paramInt, zzm.zza paramzza)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzbld = localHashMap;
    this.zzble = paramInt;
    this.zzblf = paramzza;
  }
  
  public Object get(Object paramObject)
  {
    try
    {
      Object localObject1 = this.zzbld;
      localObject1 = ((Map)localObject1).get(paramObject);
      return localObject1;
    }
    finally {}
  }
  
  public void zzh(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      try
      {
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localObject3 = "key == null || value == null";
        localNullPointerException.<init>((String)localObject3);
        throw localNullPointerException;
      }
      finally {}
    }
    int i = this.zzblg;
    Object localObject3 = this.zzblf;
    int k = ((zzm.zza)localObject3).sizeOf(paramObject1, paramObject2);
    i += k;
    this.zzblg = i;
    i = this.zzblg;
    k = this.zzble;
    if (i > k)
    {
      localObject2 = this.zzbld;
      localObject2 = ((Map)localObject2).entrySet();
      localObject3 = ((Set)localObject2).iterator();
      int m;
      int j;
      do
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject3).next();
        localObject2 = (Map.Entry)localObject2;
        m = this.zzblg;
        zzm.zza localzza = this.zzblf;
        Object localObject4 = ((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        j = localzza.sizeOf(localObject4, localObject2);
        j = m - j;
        this.zzblg = j;
        ((Iterator)localObject3).remove();
        j = this.zzblg;
        m = this.zzble;
      } while (j > m);
    }
    Object localObject2 = this.zzbld;
    ((Map)localObject2).put(paramObject1, paramObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */