package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzw;

class AnalyticsService$1
  implements zzw
{
  AnalyticsService$1(AnalyticsService paramAnalyticsService, int paramInt, zzf paramzzf, zzaf paramzzaf) {}
  
  public void zzc(Throwable paramThrowable)
  {
    Handler localHandler = AnalyticsService.zza(this.zzOS);
    AnalyticsService.1.1 local1 = new com/google/android/gms/analytics/AnalyticsService$1$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\AnalyticsService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */