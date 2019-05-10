package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzin;

class CustomEventAdapter$zzb
  implements CustomEventInterstitialListener
{
  private final CustomEventAdapter zzOt;
  private final MediationInterstitialListener zzbd;
  
  public CustomEventAdapter$zzb(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.zzOt = paramCustomEventAdapter2;
    this.zzbd = paramMediationInterstitialListener;
  }
  
  public void onAdClicked()
  {
    zzin.zzaI("Custom event adapter called onAdClicked.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationInterstitialListener.onAdClicked(localCustomEventAdapter);
  }
  
  public void onAdClosed()
  {
    zzin.zzaI("Custom event adapter called onAdClosed.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationInterstitialListener.onAdClosed(localCustomEventAdapter);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationInterstitialListener.onAdFailedToLoad(localCustomEventAdapter, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    zzin.zzaI("Custom event adapter called onAdLeftApplication.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationInterstitialListener.onAdLeftApplication(localCustomEventAdapter);
  }
  
  public void onAdLoaded()
  {
    zzin.zzaI("Custom event adapter called onReceivedAd.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    CustomEventAdapter localCustomEventAdapter = this.zzOu;
    localMediationInterstitialListener.onAdLoaded(localCustomEventAdapter);
  }
  
  public void onAdOpened()
  {
    zzin.zzaI("Custom event adapter called onAdOpened.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationInterstitialListener.onAdOpened(localCustomEventAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventAdapter$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */