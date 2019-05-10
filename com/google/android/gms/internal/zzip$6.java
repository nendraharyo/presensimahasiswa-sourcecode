package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class zzip$6
  extends zzip.zza
{
  zzip$6(Context paramContext, zzip.zzb paramzzb)
  {
    super(null);
  }
  
  public void zzbr()
  {
    Object localObject = zzip.zzw(this.zzxh);
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str1 = "content_url_opted_out";
    String str2 = "content_url_opted_out";
    boolean bool1 = true;
    boolean bool2 = ((SharedPreferences)localObject).getBoolean(str2, bool1);
    localBundle.putBoolean(str1, bool2);
    localObject = this.zzLQ;
    if (localObject != null)
    {
      localObject = this.zzLQ;
      ((zzip.zzb)localObject).zze(localBundle);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzip$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */