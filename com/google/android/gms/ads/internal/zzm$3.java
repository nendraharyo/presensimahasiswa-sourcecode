package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzjp;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzm$3
  implements zzdf
{
  zzm$3(CountDownLatch paramCountDownLatch) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    this.zzqu.countDown();
    View localView = paramzzjp.getView();
    if (localView == null) {}
    for (;;)
    {
      return;
      localView.setVisibility(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzm$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */