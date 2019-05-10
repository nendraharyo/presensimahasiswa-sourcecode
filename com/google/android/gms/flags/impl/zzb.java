package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.zzpl;
import java.util.concurrent.Callable;

public class zzb
{
  private static SharedPreferences zzaBZ = null;
  
  public static SharedPreferences zzw(Context paramContext)
  {
    synchronized (SharedPreferences.class)
    {
      Object localObject1 = zzaBZ;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/flags/impl/zzb$1;
        ((zzb.1)localObject1).<init>(paramContext);
        localObject1 = zzpl.zzb((Callable)localObject1);
        localObject1 = (SharedPreferences)localObject1;
        zzaBZ = (SharedPreferences)localObject1;
      }
      localObject1 = zzaBZ;
      return (SharedPreferences)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */