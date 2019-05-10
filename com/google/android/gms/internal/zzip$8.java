package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class zzip$8
  extends zzip.zza
{
  zzip$8(Context paramContext, zzip.zzb paramzzb)
  {
    super(null);
  }
  
  public void zzbr()
  {
    Object localObject = zzip.zzw(this.zzxh);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "content_url_hashes";
    String str2 = "content_url_hashes";
    String str3 = "";
    localObject = ((SharedPreferences)localObject).getString(str2, str3);
    localBundle.putString(str1, (String)localObject);
    localObject = this.zzLQ;
    if (localObject != null)
    {
      localObject = this.zzLQ;
      ((zzip.zzb)localObject).zze(localBundle);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */