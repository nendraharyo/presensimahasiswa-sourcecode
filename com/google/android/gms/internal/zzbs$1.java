package com.google.android.gms.internal;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

class zzbs$1
  implements Callable
{
  zzbs$1(zzbs paramzzbs, zzbp paramzzbp) {}
  
  public Object call()
  {
    zzbp localzzbp = this.zzvy;
    SharedPreferences localSharedPreferences = zzbs.zza(this.zzvz);
    return localzzbp.zza(localSharedPreferences);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbs$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */