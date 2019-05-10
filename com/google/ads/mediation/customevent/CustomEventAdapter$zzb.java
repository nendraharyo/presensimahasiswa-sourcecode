package com.google.ads.mediation.customevent;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzin;

class CustomEventAdapter$zzb
  implements CustomEventInterstitialListener
{
  private final CustomEventAdapter zzbn;
  private final MediationInterstitialListener zzbp;
  
  public CustomEventAdapter$zzb(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.zzbn = paramCustomEventAdapter2;
    this.zzbp = paramMediationInterstitialListener;
  }
  
  public void onDismissScreen()
  {
    zzin.zzaI("Custom event adapter called onDismissScreen.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbp;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationInterstitialListener.onDismissScreen(localCustomEventAdapter);
  }
  
  public void onFailedToReceiveAd()
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbp;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    AdRequest.ErrorCode localErrorCode = AdRequest.ErrorCode.NO_FILL;
    localMediationInterstitialListener.onFailedToReceiveAd(localCustomEventAdapter, localErrorCode);
  }
  
  public void onLeaveApplication()
  {
    zzin.zzaI("Custom event adapter called onLeaveApplication.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbp;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationInterstitialListener.onLeaveApplication(localCustomEventAdapter);
  }
  
  public void onPresentScreen()
  {
    zzin.zzaI("Custom event adapter called onPresentScreen.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbp;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationInterstitialListener.onPresentScreen(localCustomEventAdapter);
  }
  
  public void onReceivedAd()
  {
    zzin.zzaI("Custom event adapter called onReceivedAd.");
    MediationInterstitialListener localMediationInterstitialListener = this.zzbp;
    CustomEventAdapter localCustomEventAdapter = this.zzbq;
    localMediationInterstitialListener.onReceivedAd(localCustomEventAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\customevent\CustomEventAdapter$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */