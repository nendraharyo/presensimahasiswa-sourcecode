package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzb$1
  implements Callable
{
  zzb$1(Context paramContext) {}
  
  public SharedPreferences zzvw()
  {
    return this.zzxh.getSharedPreferences("google_sdk_flags", 1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */