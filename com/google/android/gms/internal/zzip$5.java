package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$5
  extends zzip.zza
{
  zzip$5(Context paramContext, boolean paramBoolean)
  {
    super(null);
  }
  
  public void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(this.zzxh).edit();
    boolean bool = this.zzLS;
    localEditor.putBoolean("content_url_opted_out", bool);
    localEditor.apply();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */