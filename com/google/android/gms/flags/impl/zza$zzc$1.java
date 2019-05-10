package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zza$zzc$1
  implements Callable
{
  zza$zzc$1(SharedPreferences paramSharedPreferences, String paramString, Long paramLong) {}
  
  public Long zzvv()
  {
    SharedPreferences localSharedPreferences = this.zzaBT;
    String str = this.zzaBU;
    long l = this.zzaBX.longValue();
    return Long.valueOf(localSharedPreferences.getLong(str, l));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\zza$zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */