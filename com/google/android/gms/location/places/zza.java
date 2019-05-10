package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zza
{
  static List zzf(Collection paramCollection)
  {
    Object localObject;
    if (paramCollection != null)
    {
      boolean bool = paramCollection.isEmpty();
      if (!bool) {}
    }
    else
    {
      localObject = Collections.emptyList();
    }
    for (;;)
    {
      return (List)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramCollection);
    }
  }
  
  static Set zzw(List paramList)
  {
    if (paramList != null)
    {
      boolean bool = paramList.isEmpty();
      if (!bool) {
        break label21;
      }
    }
    for (Object localObject = Collections.emptySet();; localObject = Collections.unmodifiableSet((Set)localObject))
    {
      return (Set)localObject;
      label21:
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>(paramList);
    }
  }
  
  public abstract Set getPlaceIds();
  
  public boolean isRestrictedToPlacesOpenNow()
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */