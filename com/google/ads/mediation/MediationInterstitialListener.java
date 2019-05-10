package com.google.ads.mediation;

import com.google.ads.AdRequest.ErrorCode;

public abstract interface MediationInterstitialListener
{
  public abstract void onDismissScreen(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  public abstract void onFailedToReceiveAd(MediationInterstitialAdapter paramMediationInterstitialAdapter, AdRequest.ErrorCode paramErrorCode);
  
  public abstract void onLeaveApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  public abstract void onPresentScreen(MediationInterstitialAdapter paramMediationInterstitialAdapter);
  
  public abstract void onReceivedAd(MediationInterstitialAdapter paramMediationInterstitialAdapter);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\MediationInterstitialListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */