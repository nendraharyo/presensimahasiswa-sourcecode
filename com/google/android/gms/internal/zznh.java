package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import java.util.Set;

public final class zznh
{
  public static String[] zzb(Scope[] paramArrayOfScope)
  {
    zzx.zzb(paramArrayOfScope, "scopes can't be null.");
    String[] arrayOfString = new String[paramArrayOfScope.length];
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfScope.length;
      if (i >= j) {
        break;
      }
      String str = paramArrayOfScope[i].zzpb();
      arrayOfString[i] = str;
      i += 1;
    }
    return arrayOfString;
  }
  
  public static String[] zzc(Set paramSet)
  {
    zzx.zzb(paramSet, "scopes can't be null.");
    Scope[] arrayOfScope = new Scope[paramSet.size()];
    return zzb((Scope[])paramSet.toArray(arrayOfScope));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */