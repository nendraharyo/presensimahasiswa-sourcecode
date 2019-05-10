package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class AbstractAdViewAdapter$zzd
  extends AdListener
  implements zza
{
  final AbstractAdViewAdapter zzbb;
  final MediationInterstitialListener zzbd;
  
  public AbstractAdViewAdapter$zzd(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.zzbb = paramAbstractAdViewAdapter;
    this.zzbd = paramMediationInterstitialListener;
  }
  
  public void onAdClicked()
  {
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationInterstitialListener.onAdClicked(localAbstractAdViewAdapter);
  }
  
  public void onAdClosed()
  {
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationInterstitialListener.onAdClosed(localAbstractAdViewAdapter);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationInterstitialListener.onAdFailedToLoad(localAbstractAdViewAdapter, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationInterstitialListener.onAdLeftApplication(localAbstractAdViewAdapter);
  }
  
  public void onAdLoaded()
  {
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationInterstitialListener.onAdLoaded(localAbstractAdViewAdapter);
  }
  
  public void onAdOpened()
  {
    MediationInterstitialListener localMediationInterstitialListener = this.zzbd;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationInterstitialListener.onAdOpened(localAbstractAdViewAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */