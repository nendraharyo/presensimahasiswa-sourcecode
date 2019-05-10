package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

final class AbstractAdViewAdapter$zzc
  extends AdListener
  implements zza
{
  final AbstractAdViewAdapter zzbb;
  final MediationBannerListener zzbc;
  
  public AbstractAdViewAdapter$zzc(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.zzbb = paramAbstractAdViewAdapter;
    this.zzbc = paramMediationBannerListener;
  }
  
  public void onAdClicked()
  {
    MediationBannerListener localMediationBannerListener = this.zzbc;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationBannerListener.onAdClicked(localAbstractAdViewAdapter);
  }
  
  public void onAdClosed()
  {
    MediationBannerListener localMediationBannerListener = this.zzbc;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationBannerListener.onAdClosed(localAbstractAdViewAdapter);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    MediationBannerListener localMediationBannerListener = this.zzbc;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationBannerListener.onAdFailedToLoad(localAbstractAdViewAdapter, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    MediationBannerListener localMediationBannerListener = this.zzbc;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationBannerListener.onAdLeftApplication(localAbstractAdViewAdapter);
  }
  
  public void onAdLoaded()
  {
    MediationBannerListener localMediationBannerListener = this.zzbc;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationBannerListener.onAdLoaded(localAbstractAdViewAdapter);
  }
  
  public void onAdOpened()
  {
    MediationBannerListener localMediationBannerListener = this.zzbc;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationBannerListener.onAdOpened(localAbstractAdViewAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */