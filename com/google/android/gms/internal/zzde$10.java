package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

final class zzde$10
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("u");
    if (str1 == null)
    {
      str1 = "URL missing from httpTrack GMSG.";
      zzin.zzaK(str1);
    }
    for (;;)
    {
      return;
      zziy localzziy = new com/google/android/gms/internal/zziy;
      Context localContext = paramzzjp.getContext();
      String str2 = paramzzjp.zzhX().afmaVersion;
      localzziy.<init>(localContext, str2, str1);
      localzziy.zzhn();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzde$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */