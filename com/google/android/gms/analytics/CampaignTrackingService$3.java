package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzaf;

class CampaignTrackingService$3
  implements Runnable
{
  CampaignTrackingService$3(CampaignTrackingService paramCampaignTrackingService, int paramInt, zzaf paramzzaf) {}
  
  public void run()
  {
    Object localObject = this.zzOZ;
    int i = this.zzOP;
    boolean bool = ((CampaignTrackingService)localObject).stopSelfResult(i);
    if (bool)
    {
      zzaf localzzaf = this.zzOR;
      String str = "Install campaign broadcast processed";
      localObject = Boolean.valueOf(bool);
      localzzaf.zza(str, localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\CampaignTrackingService$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */