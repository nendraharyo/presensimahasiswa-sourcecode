package com.google.android.gms.auth.api.signin.internal;

import android.app.Activity;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzlh;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzk
{
  private final Map zzXD;
  
  public zzk(Activity paramActivity, List paramList, Map paramMap)
  {
    zzx.zzz(paramActivity);
    zzx.zzz(paramList);
    zzx.zzz(paramMap);
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzd)localIterator.next();
      Object localObject2 = (List)paramMap.get(localObject1);
      if (localObject2 == null) {
        localObject2 = Collections.emptyList();
      }
      localObject2 = zza((zzd)localObject1, paramActivity, (List)localObject2);
      if (localObject2 != null) {
        localHashMap.put(localObject1, localObject2);
      }
    }
    Object localObject1 = Collections.unmodifiableMap(localHashMap);
    this.zzXD = ((Map)localObject1);
  }
  
  private zzlf zza(zzd paramzzd, Activity paramActivity, List paramList)
  {
    Object localObject = zzd.zzXi;
    boolean bool = ((zzd)localObject).equals(paramzzd);
    if (bool)
    {
      localObject = new com/google/android/gms/internal/zzlh;
      ((zzlh)localObject).<init>(paramActivity, paramList);
    }
    for (;;)
    {
      return (zzlf)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public zzlf zza(zzd paramzzd)
  {
    zzx.zzz(paramzzd);
    return (zzlf)this.zzXD.get(paramzzd);
  }
  
  public Collection zznh()
  {
    return this.zzXD.values();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */