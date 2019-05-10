package com.google.android.gms.internal;

import android.support.v4.h.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzmr
{
  public static Set zzA(Object paramObject)
  {
    return Collections.singleton(paramObject);
  }
  
  public static Map zza(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object paramObject7, Object paramObject8, Object paramObject9, Object paramObject10, Object paramObject11, Object paramObject12)
  {
    a locala = new android/support/v4/h/a;
    locala.<init>(6);
    locala.put(paramObject1, paramObject2);
    locala.put(paramObject3, paramObject4);
    locala.put(paramObject5, paramObject6);
    locala.put(paramObject7, paramObject8);
    locala.put(paramObject9, paramObject10);
    locala.put(paramObject11, paramObject12);
    return Collections.unmodifiableMap(locala);
  }
  
  public static Set zza(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zzmm localzzmm = new com/google/android/gms/internal/zzmm;
    localzzmm.<init>(3);
    localzzmm.add(paramObject1);
    localzzmm.add(paramObject2);
    localzzmm.add(paramObject3);
    return Collections.unmodifiableSet(localzzmm);
  }
  
  public static Set zza(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    zzmm localzzmm = new com/google/android/gms/internal/zzmm;
    localzzmm.<init>(4);
    localzzmm.add(paramObject1);
    localzzmm.add(paramObject2);
    localzzmm.add(paramObject3);
    localzzmm.add(paramObject4);
    return Collections.unmodifiableSet(localzzmm);
  }
  
  public static List zzc(Object paramObject1, Object paramObject2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(2);
    localArrayList.add(paramObject1);
    localArrayList.add(paramObject2);
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static Set zzc(Object... paramVarArgs)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Object localObject1 = null;
    int m = paramVarArgs.length;
    Object localObject2;
    switch (m)
    {
    default: 
      m = paramVarArgs.length;
      k = 32;
      if (m <= k)
      {
        localObject2 = new com/google/android/gms/internal/zzmm;
        localObject1 = Arrays.asList(paramVarArgs);
        ((zzmm)localObject2).<init>((Collection)localObject1);
      }
      break;
    }
    for (;;)
    {
      localObject2 = Collections.unmodifiableSet((Set)localObject2);
      for (;;)
      {
        return (Set)localObject2;
        localObject2 = zzsb();
        continue;
        localObject2 = zzA(paramVarArgs[0]);
        continue;
        localObject2 = paramVarArgs[0];
        localObject1 = paramVarArgs[j];
        localObject2 = zzd(localObject2, localObject1);
        continue;
        localObject2 = paramVarArgs[0];
        localObject1 = paramVarArgs[j];
        Object localObject3 = paramVarArgs[i];
        localObject2 = zza(localObject2, localObject1, localObject3);
        continue;
        localObject2 = paramVarArgs[0];
        localObject1 = paramVarArgs[j];
        localObject3 = paramVarArgs[i];
        i = 3;
        Object localObject4 = paramVarArgs[i];
        localObject2 = zza(localObject2, localObject1, localObject3, localObject4);
      }
      localObject2 = new java/util/HashSet;
      localObject1 = Arrays.asList(paramVarArgs);
      ((HashSet)localObject2).<init>((Collection)localObject1);
    }
  }
  
  public static Set zzd(Object paramObject1, Object paramObject2)
  {
    zzmm localzzmm = new com/google/android/gms/internal/zzmm;
    localzzmm.<init>(2);
    localzzmm.add(paramObject1);
    localzzmm.add(paramObject2);
    return Collections.unmodifiableSet(localzzmm);
  }
  
  public static Set zzsb()
  {
    return Collections.emptySet();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */