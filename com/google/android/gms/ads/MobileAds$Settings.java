package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzae;

public final class MobileAds$Settings
{
  private final zzae zzoM;
  
  public MobileAds$Settings()
  {
    zzae localzzae = new com/google/android/gms/ads/internal/client/zzae;
    localzzae.<init>();
    this.zzoM = localzzae;
  }
  
  public String getTrackingId()
  {
    return this.zzoM.getTrackingId();
  }
  
  public boolean isGoogleAnalyticsEnabled()
  {
    return this.zzoM.isGoogleAnalyticsEnabled();
  }
  
  public Settings setGoogleAnalyticsEnabled(boolean paramBoolean)
  {
    this.zzoM.zzm(paramBoolean);
    return this;
  }
  
  public Settings setTrackingId(String paramString)
  {
    this.zzoM.zzJ(paramString);
    return this;
  }
  
  zzae zzaG()
  {
    return this.zzoM;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\MobileAds$Settings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */