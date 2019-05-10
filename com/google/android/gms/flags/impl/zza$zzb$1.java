package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zza$zzb$1
  implements Callable
{
  zza$zzb$1(SharedPreferences paramSharedPreferences, String paramString, Integer paramInteger) {}
  
  public Integer zzvu()
  {
    SharedPreferences localSharedPreferences = this.zzaBT;
    String str = this.zzaBU;
    int i = this.zzaBW.intValue();
    return Integer.valueOf(localSharedPreferences.getInt(str, i));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\zza$zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */