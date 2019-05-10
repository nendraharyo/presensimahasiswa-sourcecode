package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationNativeListener;

final class AbstractAdViewAdapter$zze
  extends AdListener
  implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, zza
{
  final AbstractAdViewAdapter zzbb;
  final MediationNativeListener zzbe;
  
  public AbstractAdViewAdapter$zze(AbstractAdViewAdapter paramAbstractAdViewAdapter, MediationNativeListener paramMediationNativeListener)
  {
    this.zzbb = paramAbstractAdViewAdapter;
    this.zzbe = paramMediationNativeListener;
  }
  
  public void onAdClicked()
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationNativeListener.onAdClicked(localAbstractAdViewAdapter);
  }
  
  public void onAdClosed()
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationNativeListener.onAdClosed(localAbstractAdViewAdapter);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationNativeListener.onAdFailedToLoad(localAbstractAdViewAdapter, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationNativeListener.onAdLeftApplication(localAbstractAdViewAdapter);
  }
  
  public void onAdLoaded() {}
  
  public void onAdOpened()
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    localMediationNativeListener.onAdOpened(localAbstractAdViewAdapter);
  }
  
  public void onAppInstallAdLoaded(NativeAppInstallAd paramNativeAppInstallAd)
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    AbstractAdViewAdapter.zza localzza = new com/google/ads/mediation/AbstractAdViewAdapter$zza;
    localzza.<init>(paramNativeAppInstallAd);
    localMediationNativeListener.onAdLoaded(localAbstractAdViewAdapter, localzza);
  }
  
  public void onContentAdLoaded(NativeContentAd paramNativeContentAd)
  {
    MediationNativeListener localMediationNativeListener = this.zzbe;
    AbstractAdViewAdapter localAbstractAdViewAdapter = this.zzbb;
    AbstractAdViewAdapter.zzb localzzb = new com/google/ads/mediation/AbstractAdViewAdapter$zzb;
    localzzb.<init>(paramNativeContentAd);
    localMediationNativeListener.onAdLoaded(localAbstractAdViewAdapter, localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */