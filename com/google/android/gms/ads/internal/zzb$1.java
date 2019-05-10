package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzjp;

class zzb$1
  implements Runnable
{
  zzb$1(zzb paramzzb, Intent paramIntent) {}
  
  public void run()
  {
    Object localObject = zzr.zzbM();
    Intent localIntent = this.zzpp;
    int i = ((zzi)localObject).zzd(localIntent);
    zzr.zzbM();
    if (i == 0)
    {
      localObject = this.zzpq.zzpj.zzrq;
      if (localObject != null)
      {
        localObject = this.zzpq.zzpj.zzrq.zzED;
        if (localObject != null)
        {
          localObject = this.zzpq.zzpj.zzrq.zzED.zzhS();
          if (localObject != null)
          {
            localObject = this.zzpq.zzpj.zzrq.zzED.zzhS();
            ((zzd)localObject).close();
          }
        }
      }
    }
    this.zzpq.zzpj.zzrM = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */