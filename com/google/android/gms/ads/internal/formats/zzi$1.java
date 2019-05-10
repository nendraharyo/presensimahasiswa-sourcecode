package com.google.android.gms.ads.internal.formats;

import android.text.TextUtils;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjq.zza;
import java.util.Map;

class zzi$1
  implements zzdf
{
  zzi$1(zzi paramzzi) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = zzi.zzc(this.zzyx).zzhU();
    Object localObject2 = new com/google/android/gms/ads/internal/formats/zzi$1$1;
    ((zzi.1.1)localObject2).<init>(this, paramMap);
    ((zzjq)localObject1).zza((zzjq.zza)localObject2);
    String str1 = (String)paramMap.get("overlayHtml");
    localObject1 = "baseUrl";
    localObject2 = (String)paramMap.get(localObject1);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
    String str2;
    if (bool)
    {
      localObject1 = zzi.zzc(this.zzyx);
      localObject2 = "text/html";
      str2 = "UTF-8";
      ((zzjp)localObject1).loadData(str1, (String)localObject2, str2);
    }
    for (;;)
    {
      return;
      localObject1 = zzi.zzc(this.zzyx);
      str2 = "text/html";
      String str3 = "UTF-8";
      ((zzjp)localObject1).loadDataWithBaseURL((String)localObject2, str1, str2, str3, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzi$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */