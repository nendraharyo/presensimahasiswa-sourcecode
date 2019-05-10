package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class zzi
{
  public static void zza(SignInConfiguration paramSignInConfiguration, List paramList, Map paramMap)
  {
    zzx.zzz(paramSignInConfiguration);
    zzx.zzz(paramList);
    zzx.zzz(paramMap);
    Object localObject1 = paramSignInConfiguration.zznm();
    if (localObject1 != null)
    {
      Object localObject2 = zzd.zzXh;
      paramList.add(localObject2);
      localObject2 = new java/util/LinkedList;
      ((LinkedList)localObject2).<init>();
      localObject1 = ((GoogleSignInOptions)localObject1).zzmN();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((Scope)localIterator.next()).zzpb();
        ((List)localObject2).add(localObject1);
      }
      localObject1 = zzd.zzXh;
      paramMap.put(localObject1, localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */