package com.google.ads.mediation;

import android.app.Activity;

public abstract interface MediationInterstitialAdapter
  extends MediationAdapter
{
  public abstract void requestInterstitialAd(MediationInterstitialListener paramMediationInterstitialListener, Activity paramActivity, MediationServerParameters paramMediationServerParameters, MediationAdRequest paramMediationAdRequest, NetworkExtras paramNetworkExtras);
  
  public abstract void showInterstitial();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\MediationInterstitialAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */