package com.google.android.gms.common.internal;

import java.util.Arrays;

public final class zzw
{
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static int hashCode(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static zzw.zza zzy(Object paramObject)
  {
    zzw.zza localzza = new com/google/android/gms/common/internal/zzw$zza;
    localzza.<init>(paramObject, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */