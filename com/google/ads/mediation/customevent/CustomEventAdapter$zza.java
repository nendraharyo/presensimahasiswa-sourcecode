package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.zzin;

final class CustomEventAdapter$zza
  implements CustomEventBannerListener
{
  private final CustomEventAdapter zzbn;
  private final MediationBannerListener zzbo;
  
  public CustomEventAdapter$zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.zzbn = paramCustomEventAdapter;
    this.zzbo = paramMediationBannerListener;
  }
  
  public void onClick()
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationBannerListener localMediationBannerListener = this.zzbo;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationBannerListener.onClick(localCustomEventAdapter);
  }
  
  public void onDismissScreen()
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationBannerListener localMediationBannerListener = this.zzbo;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationBannerListener.onDismissScreen(localCustomEventAdapter);
  }
  
  public void onFailedToReceiveAd()
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationBannerListener localMediationBannerListener = this.zzbo;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    AdRequest.ErrorCode localErrorCode = AdRequest.ErrorCode.NO_FILL;
    localMediationBannerListener.onFailedToReceiveAd(localCustomEventAdapter, localErrorCode);
  }
  
  public void onLeaveApplication()
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationBannerListener localMediationBannerListener = this.zzbo;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationBannerListener.onLeaveApplication(localCustomEventAdapter);
  }
  
  public void onPresentScreen()
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    MediationBannerListener localMediationBannerListener = this.zzbo;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationBannerListener.onPresentScreen(localCustomEventAdapter);
  }
  
  public void onReceivedAd(View paramView)
  {
    zzin.zzaI("Custom event adapter called onReceivedAd.");
    CustomEventAdapter.zza(this.zzbn, paramView);
    MediationBannerListener localMediationBannerListener = this.zzbo;
    CustomEventAdapter localCustomEventAdapter = this.zzbn;
    localMediationBannerListener.onReceivedAd(localCustomEventAdapter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\customevent\CustomEventAdapter$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */