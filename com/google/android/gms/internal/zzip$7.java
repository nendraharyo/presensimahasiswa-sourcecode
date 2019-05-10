package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$7
  extends zzip.zza
{
  zzip$7(Context paramContext, String paramString)
  {
    super(null);
  }
  
  public void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(this.zzxh).edit();
    String str = this.zzLT;
    localEditor.putString("content_url_hashes", str);
    localEditor.apply();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */