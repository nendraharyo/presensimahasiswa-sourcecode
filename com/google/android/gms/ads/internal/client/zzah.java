package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;

public class zzah
  extends zzu.zza
{
  private zzq zzpK;
  
  public void destroy() {}
  
  public String getMediationAdapterClassName()
  {
    return null;
  }
  
  public boolean isLoading()
  {
    return false;
  }
  
  public boolean isReady()
  {
    return false;
  }
  
  public void pause() {}
  
  public void resume() {}
  
  public void setManualImpressionsEnabled(boolean paramBoolean) {}
  
  public void setUserId(String paramString) {}
  
  public void showInterstitial() {}
  
  public void stopLoading() {}
  
  public void zza(AdSizeParcel paramAdSizeParcel) {}
  
  public void zza(zzp paramzzp) {}
  
  public void zza(zzq paramzzq)
  {
    this.zzpK = paramzzq;
  }
  
  public void zza(zzw paramzzw) {}
  
  public void zza(zzx paramzzx) {}
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd) {}
  
  public void zza(zzcf paramzzcf) {}
  
  public void zza(zzgd paramzzgd) {}
  
  public void zza(zzgh paramzzgh, String paramString) {}
  
  public com.google.android.gms.dynamic.zzd zzaM()
  {
    return null;
  }
  
  public AdSizeParcel zzaN()
  {
    return null;
  }
  
  public void zzaP() {}
  
  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    zzb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    Handler localHandler = zza.zzMS;
    zzah.1 local1 = new com/google/android/gms/ads/internal/client/zzah$1;
    local1.<init>(this);
    localHandler.post(local1);
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */