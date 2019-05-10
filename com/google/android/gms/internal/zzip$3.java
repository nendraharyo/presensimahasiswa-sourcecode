package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$3
  extends zzip.zza
{
  zzip$3(Context paramContext, int paramInt)
  {
    super(null);
  }
  
  public void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(this.zzxh).edit();
    int i = this.zzLR;
    localEditor.putInt("webview_cache_version", i);
    localEditor.apply();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */