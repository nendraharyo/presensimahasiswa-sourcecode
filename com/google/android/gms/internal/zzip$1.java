package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$1
  extends zzip.zza
{
  zzip$1(Context paramContext, boolean paramBoolean)
  {
    super(null);
  }
  
  public void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(this.zzxh).edit();
    boolean bool = this.zzLP;
    localEditor.putBoolean("use_https", bool);
    localEditor.apply();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */