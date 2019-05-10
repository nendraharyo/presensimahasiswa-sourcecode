package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzag$zza
  extends zzr.zza
{
  private zzag$zza(zzag paramzzag) {}
  
  public String getMediationAdapterClassName()
  {
    return null;
  }
  
  public boolean isLoading()
  {
    return false;
  }
  
  public void zzf(AdRequestParcel paramAdRequestParcel)
  {
    zzb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    Handler localHandler = zza.zzMS;
    zzag.zza.1 local1 = new com/google/android/gms/ads/internal/client/zzag$zza$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzag$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */