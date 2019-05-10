package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.zzin;

final class CustomEventAdapter$zza
  implements CustomEventBannerListener
{
  private final CustomEventAdapter zzOt;
  private final MediationBannerListener zzbc;
  
  public CustomEventAdapter$zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.zzOt = paramCustomEventAdapter;
    this.zzbc = paramMediationBannerListener;
  }
  
  public void onAdClicked()
  {
    zzin.zzaI("Custom event adapter called onAdClicked.");
    MediationBannerListener localMediationBannerListener = this.zzbc;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationBannerListener.onAdClicked(localCustomEventAdapter);
  }
  
  public void onAdClosed()
  {
    zzin.zzaI("Custom event adapter called onAdClosed.");
    MediationBannerListener localMediationBannerListener = this.zzbc;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationBannerListener.onAdClosed(localCustomEventAdapter);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzin.zzaI("Custom event adapter called onAdFailedToLoad.");
    MediationBannerListener localMediationBannerListener = this.zzbc;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationBannerListener.onAdFailedToLoad(localCustomEventAdapter, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    zzin.zzaI("Custom event adapter called onAdLeftApplication.");
    MediationBannerListener localMediationBannerListener = this.zzbc;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationBannerListener.onAdLeftApplication(localCustomEventAdapter);
  }
  
  public void onAdLoaded(View paramView)
  {
    zzin.zzaI("Custom event adapter called onAdLoaded.");
    CustomEventAdapter.zza(this.zzOt, paramView);
    MediationBannerListener localMediationBannerListener = this.zzbc;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationBannerListener.onAdLoaded(localCustomEventAdapter);
  }
  
  public void onAdOpened()
  {
    zzin.zzaI("Custom event adapter called onAdOpened.");
    MediationBannerListener localMediationBannerListener = this.zzbc;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationBannerListener.onAdOpened(localCustomEventAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventAdapter$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */