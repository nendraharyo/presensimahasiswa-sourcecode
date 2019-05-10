package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zza$zzd$1
  implements Callable
{
  zza$zzd$1(SharedPreferences paramSharedPreferences, String paramString1, String paramString2) {}
  
  public String zzkp()
  {
    SharedPreferences localSharedPreferences = this.zzaBT;
    String str1 = this.zzaBU;
    String str2 = this.zzaBY;
    return localSharedPreferences.getString(str1, str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\flags\impl\zza$zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */