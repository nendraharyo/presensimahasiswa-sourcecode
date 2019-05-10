package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class zzip$4
  extends zzip.zza
{
  zzip$4(Context paramContext, zzip.zzb paramzzb)
  {
    super(null);
  }
  
  public void zzbr()
  {
    Object localObject = zzip.zzw(this.zzxh);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "webview_cache_version";
    String str2 = "webview_cache_version";
    int i = ((SharedPreferences)localObject).getInt(str2, 0);
    localBundle.putInt(str1, i);
    localObject = this.zzLQ;
    if (localObject != null)
    {
      localObject = this.zzLQ;
      ((zzip.zzb)localObject).zze(localBundle);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */