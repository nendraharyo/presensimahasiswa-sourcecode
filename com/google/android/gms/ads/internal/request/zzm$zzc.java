package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;

public class zzm$zzc
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = (String)paramMap.get("errors");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    zzin.zzaK("Invalid request: " + str2);
    zzm.zzgx().zzS(str1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzm$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */