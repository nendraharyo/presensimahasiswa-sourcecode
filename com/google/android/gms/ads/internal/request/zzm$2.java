package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzeg.zzd;
import com.google.android.gms.internal.zzji.zzc;
import org.json.JSONObject;

class zzm$2
  implements Runnable
{
  zzm$2(zzm paramzzm, JSONObject paramJSONObject, String paramString) {}
  
  public void run()
  {
    Object localObject1 = this.zzID;
    Object localObject2 = zzm.zzgy().zzer();
    zzm.zza((zzm)localObject1, (zzeg.zzd)localObject2);
    localObject1 = zzm.zzb(this.zzID);
    localObject2 = new com/google/android/gms/ads/internal/request/zzm$2$1;
    ((zzm.2.1)localObject2).<init>(this);
    zzm.2.2 local2 = new com/google/android/gms/ads/internal/request/zzm$2$2;
    local2.<init>(this);
    ((zzeg.zzd)localObject1).zza((zzji.zzc)localObject2, local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzm$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */