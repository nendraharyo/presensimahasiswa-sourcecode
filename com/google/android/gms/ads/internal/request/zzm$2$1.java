package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzji.zzc;
import org.json.JSONObject;

class zzm$2$1
  implements zzji.zzc
{
  zzm$2$1(zzm.2 param2) {}
  
  public void zzd(zzeh paramzzeh)
  {
    String str = "AFMA_getAdapterLessMediationAd";
    try
    {
      localObject = this.zzIG;
      localObject = ((zzm.2)localObject).zzIE;
      paramzzeh.zza(str, (JSONObject)localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        zzin.zzb("Error requesting an ad url", localException);
        zzdk localzzdk = zzm.zzgx();
        Object localObject = this.zzIG.zzIF;
        localzzdk.zzS((String)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzm$2$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */