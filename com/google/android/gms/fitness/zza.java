package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class zza
{
  public static Scope zza(Scope paramScope)
  {
    Object localObject = new com/google/android/gms/common/api/Scope;
    String str = "https://www.googleapis.com/auth/fitness.activity.read";
    ((Scope)localObject).<init>(str);
    boolean bool = paramScope.equals(localObject);
    if (bool)
    {
      paramScope = new com/google/android/gms/common/api/Scope;
      localObject = "https://www.googleapis.com/auth/fitness.activity.write";
      paramScope.<init>((String)localObject);
    }
    for (;;)
    {
      return paramScope;
      localObject = new com/google/android/gms/common/api/Scope;
      str = "https://www.googleapis.com/auth/fitness.location.read";
      ((Scope)localObject).<init>(str);
      bool = paramScope.equals(localObject);
      if (bool)
      {
        paramScope = new com/google/android/gms/common/api/Scope;
        localObject = "https://www.googleapis.com/auth/fitness.location.write";
        paramScope.<init>((String)localObject);
      }
      else
      {
        localObject = new com/google/android/gms/common/api/Scope;
        str = "https://www.googleapis.com/auth/fitness.body.read";
        ((Scope)localObject).<init>(str);
        bool = paramScope.equals(localObject);
        if (bool)
        {
          paramScope = new com/google/android/gms/common/api/Scope;
          localObject = "https://www.googleapis.com/auth/fitness.body.write";
          paramScope.<init>((String)localObject);
        }
        else
        {
          localObject = new com/google/android/gms/common/api/Scope;
          str = "https://www.googleapis.com/auth/fitness.nutrition.read";
          ((Scope)localObject).<init>(str);
          bool = paramScope.equals(localObject);
          if (bool)
          {
            paramScope = new com/google/android/gms/common/api/Scope;
            localObject = "https://www.googleapis.com/auth/fitness.nutrition.write";
            paramScope.<init>((String)localObject);
          }
        }
      }
    }
  }
  
  public static Set zze(Collection paramCollection)
  {
    HashSet localHashSet = new java/util/HashSet;
    int i = paramCollection.size();
    localHashSet.<init>(i);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Scope localScope1 = (Scope)localIterator.next();
      Scope localScope2 = zza(localScope1);
      boolean bool2 = localScope2.equals(localScope1);
      if (!bool2)
      {
        boolean bool3 = paramCollection.contains(localScope2);
        if (bool3) {}
      }
      else
      {
        localHashSet.add(localScope1);
      }
    }
    return localHashSet;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */