package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.internal.zzin;

class CustomEventAdapter$zzc
  implements CustomEventNativeListener
{
  private final CustomEventAdapter zzOt;
  private final MediationNativeListener zzbe;
  
  public CustomEventAdapter$zzc(CustomEventAdapter paramCustomEventAdapter, MediationNativeListener paramMediationNativeListener)
  {
    this.zzOt = paramCustomEventAdapter;
    this.zzbe = paramMediationNativeListener;
  }
  
  public void onAdClicked()
  {
    zzin.zzaI("Custom event adapter called onAdClicked.");
    MediationNativeListener localMediationNativeListener = this.zzbe;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationNativeListener.onAdClicked(localCustomEventAdapter);
  }
  
  public void onAdClosed()
  {
    zzin.zzaI("Custom event adapter called onAdClosed.");
    MediationNativeListener localMediationNativeListener = this.zzbe;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationNativeListener.onAdClosed(localCustomEventAdapter);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzin.zzaI("Custom event adapter called onAdFailedToLoad.");
    MediationNativeListener localMediationNativeListener = this.zzbe;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationNativeListener.onAdFailedToLoad(localCustomEventAdapter, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    zzin.zzaI("Custom event adapter called onAdLeftApplication.");
    MediationNativeListener localMediationNativeListener = this.zzbe;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationNativeListener.onAdLeftApplication(localCustomEventAdapter);
  }
  
  public void onAdLoaded(NativeAdMapper paramNativeAdMapper)
  {
    zzin.zzaI("Custom event adapter called onAdLoaded.");
    MediationNativeListener localMediationNativeListener = this.zzbe;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationNativeListener.onAdLoaded(localCustomEventAdapter, paramNativeAdMapper);
  }
  
  public void onAdOpened()
  {
    zzin.zzaI("Custom event adapter called onAdOpened.");
    MediationNativeListener localMediationNativeListener = this.zzbe;
    CustomEventAdapter localCustomEventAdapter = this.zzOt;
    localMediationNativeListener.onAdOpened(localCustomEventAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventAdapter$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */