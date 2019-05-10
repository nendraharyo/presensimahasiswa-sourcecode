package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;

class CampaignTrackingService$2
  implements Runnable
{
  CampaignTrackingService$2(CampaignTrackingService paramCampaignTrackingService, zzaf paramzzaf, Handler paramHandler, int paramInt) {}
  
  public void run()
  {
    CampaignTrackingService localCampaignTrackingService = this.zzOZ;
    zzaf localzzaf = this.zzOR;
    Handler localHandler = this.zzt;
    int i = this.zzOP;
    localCampaignTrackingService.zza(localzzaf, localHandler, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\CampaignTrackingService$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */