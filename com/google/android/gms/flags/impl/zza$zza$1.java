package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zza$zza$1
  implements Callable
{
  zza$zza$1(SharedPreferences paramSharedPreferences, String paramString, Boolean paramBoolean) {}
  
  public Boolean zzvt()
  {
    SharedPreferences localSharedPreferences = this.zzaBT;
    String str = this.zzaBU;
    boolean bool = this.zzaBV.booleanValue();
    return Boolean.valueOf(localSharedPreferences.getBoolean(str, bool));
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\zza$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */