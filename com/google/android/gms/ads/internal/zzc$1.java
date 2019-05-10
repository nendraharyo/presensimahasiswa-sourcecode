package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;

class zzc$1
  implements zzdf
{
  zzc$1(zzc paramzzc) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject = this.zzpr.zzpj.zzrq;
    if (localObject != null)
    {
      localObject = this.zzpr.zzpl;
      AdSizeParcel localAdSizeParcel = this.zzpr.zzpj.zzrp;
      zzif localzzif = this.zzpr.zzpj.zzrq;
      View localView = paramzzjp.getView();
      ((zzax)localObject).zza(localAdSizeParcel, localzzif, localView, paramzzjp);
    }
    for (;;)
    {
      return;
      localObject = "Request to enable ActiveView before adState is available.";
      zzin.zzaK((String)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */