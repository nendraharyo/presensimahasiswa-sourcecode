package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzm$4
  implements zzdf
{
  zzm$4(CountDownLatch paramCountDownLatch) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzin.zzaK("Adapter returned an ad, but assets substitution failed");
    this.zzqu.countDown();
    paramzzjp.destroy();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzm$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */