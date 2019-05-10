package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzb.zza;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

public class zzal
  extends zzb.zza
{
  private zzd zzvb;
  
  public void destroy() {}
  
  public boolean isLoaded()
  {
    return false;
  }
  
  public void pause() {}
  
  public void resume() {}
  
  public void setUserId(String paramString) {}
  
  public void show() {}
  
  public void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    zzb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    Handler localHandler = zza.zzMS;
    zzal.1 local1 = new com/google/android/gms/ads/internal/client/zzal$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
  
  public void zza(zzd paramzzd)
  {
    this.zzvb = paramzzd;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */