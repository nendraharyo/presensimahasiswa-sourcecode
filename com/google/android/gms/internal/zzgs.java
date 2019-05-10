package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;

public class zzgs
  extends zzgn
  implements zzjq.zza
{
  zzgs(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }
  
  protected void zzgb()
  {
    Object localObject1 = this.zzGe;
    int i = ((AdResponseParcel)localObject1).errorCode;
    int j = -2;
    if (i != j) {}
    for (;;)
    {
      return;
      this.zzpD.zzhU().zza(this);
      zzgi();
      zzin.zzaI("Loading HTML in WebView.");
      localObject1 = this.zzpD;
      Object localObject2 = zzr.zzbC();
      String str1 = this.zzGe.zzEF;
      localObject2 = ((zzir)localObject2).zzaC(str1);
      str1 = this.zzGe.body;
      String str2 = "text/html";
      String str3 = "UTF-8";
      ((zzjp)localObject1).loadDataWithBaseURL((String)localObject2, str1, str2, str3, null);
    }
  }
  
  protected void zzgi() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */