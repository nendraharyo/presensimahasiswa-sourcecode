package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzac;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public final class InterstitialAd
{
  private final zzac zzoL;
  
  public InterstitialAd(Context paramContext)
  {
    zzac localzzac = new com/google/android/gms/ads/internal/client/zzac;
    localzzac.<init>(paramContext);
    this.zzoL = localzzac;
  }
  
  public AdListener getAdListener()
  {
    return this.zzoL.getAdListener();
  }
  
  public String getAdUnitId()
  {
    return this.zzoL.getAdUnitId();
  }
  
  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.zzoL.getInAppPurchaseListener();
  }
  
  public String getMediationAdapterClassName()
  {
    return this.zzoL.getMediationAdapterClassName();
  }
  
  public boolean isLoaded()
  {
    return this.zzoL.isLoaded();
  }
  
  public boolean isLoading()
  {
    return this.zzoL.isLoading();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    zzac localzzac = this.zzoL;
    zzaa localzzaa = paramAdRequest.zzaE();
    localzzac.zza(localzzaa);
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    zzac localzzac = this.zzoL;
    localzzac.setAdListener(paramAdListener);
    if (paramAdListener != null)
    {
      boolean bool = paramAdListener instanceof zza;
      if (bool)
      {
        localzzac = this.zzoL;
        paramAdListener = (zza)paramAdListener;
        localzzac.zza(paramAdListener);
      }
    }
    for (;;)
    {
      return;
      if (paramAdListener == null)
      {
        localzzac = this.zzoL;
        localzzac.zza(null);
      }
    }
  }
  
  public void setAdUnitId(String paramString)
  {
    this.zzoL.setAdUnitId(paramString);
  }
  
  public void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.zzoL.setInAppPurchaseListener(paramInAppPurchaseListener);
  }
  
  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    this.zzoL.setPlayStorePurchaseParams(paramPlayStorePurchaseListener, paramString);
  }
  
  public void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    this.zzoL.setRewardedVideoAdListener(paramRewardedVideoAdListener);
  }
  
  public void show()
  {
    this.zzoL.show();
  }
  
  public void zza(boolean paramBoolean)
  {
    this.zzoL.zza(paramBoolean);
  }
  
  public void zzm(String paramString)
  {
    this.zzoL.setUserId(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\InterstitialAd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */