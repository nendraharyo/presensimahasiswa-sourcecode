package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.zzin;

public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter
{
  private View zzbk;
  CustomEventBanner zzbl;
  CustomEventInterstitial zzbm;
  
  private void zza(View paramView)
  {
    this.zzbk = paramView;
  }
  
  private static Object zzj(String paramString)
  {
    try
    {
      localObject1 = Class.forName(paramString);
      localObject1 = ((Class)localObject1).newInstance();
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Could not instantiate custom event adapter: ").append(paramString);
        String str2 = ". ";
        localStringBuilder = localStringBuilder.append(str2);
        String str1 = ((Throwable)localObject2).getMessage();
        zzin.zzaK(str1);
        str1 = null;
      }
    }
    return localObject1;
  }
  
  public void destroy()
  {
    Object localObject = this.zzbl;
    if (localObject != null)
    {
      localObject = this.zzbl;
      ((CustomEventBanner)localObject).destroy();
    }
    localObject = this.zzbm;
    if (localObject != null)
    {
      localObject = this.zzbm;
      ((CustomEventInterstitial)localObject).destroy();
    }
  }
  
  public Class getAdditionalParametersType()
  {
    return CustomEventExtras.class;
  }
  
  public View getBannerView()
  {
    return this.zzbk;
  }
  
  public Class getServerParametersType()
  {
    return CustomEventServerParameters.class;
  }
  
  public void requestBannerAd(MediationBannerListener paramMediationBannerListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    Object localObject1 = (CustomEventBanner)zzj(paramCustomEventServerParameters.className);
    this.zzbl = ((CustomEventBanner)localObject1);
    localObject1 = this.zzbl;
    if (localObject1 == null)
    {
      localObject1 = AdRequest.ErrorCode.INTERNAL_ERROR;
      paramMediationBannerListener.onFailedToReceiveAd(this, (AdRequest.ErrorCode)localObject1);
      return;
    }
    if (paramCustomEventExtras == null) {}
    for (Object localObject2 = null;; localObject2 = paramCustomEventExtras.getExtra((String)localObject1))
    {
      localObject1 = this.zzbl;
      CustomEventAdapter.zza localzza = new com/google/ads/mediation/customevent/CustomEventAdapter$zza;
      localzza.<init>(this, paramMediationBannerListener);
      String str1 = paramCustomEventServerParameters.label;
      String str2 = paramCustomEventServerParameters.parameter;
      ((CustomEventBanner)localObject1).requestBannerAd(localzza, paramActivity, str1, str2, paramAdSize, paramMediationAdRequest, localObject2);
      break;
      localObject1 = paramCustomEventServerParameters.label;
    }
  }
  
  public void requestInterstitialAd(MediationInterstitialListener paramMediationInterstitialListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    Object localObject1 = (CustomEventInterstitial)zzj(paramCustomEventServerParameters.className);
    this.zzbm = ((CustomEventInterstitial)localObject1);
    localObject1 = this.zzbm;
    if (localObject1 == null)
    {
      localObject1 = AdRequest.ErrorCode.INTERNAL_ERROR;
      paramMediationInterstitialListener.onFailedToReceiveAd(this, (AdRequest.ErrorCode)localObject1);
      return;
    }
    if (paramCustomEventExtras == null) {}
    for (Object localObject2 = null;; localObject2 = paramCustomEventExtras.getExtra((String)localObject1))
    {
      localObject1 = this.zzbm;
      CustomEventAdapter.zzb localzzb = zza(paramMediationInterstitialListener);
      String str1 = paramCustomEventServerParameters.label;
      String str2 = paramCustomEventServerParameters.parameter;
      ((CustomEventInterstitial)localObject1).requestInterstitialAd(localzzb, paramActivity, str1, str2, paramMediationAdRequest, localObject2);
      break;
      localObject1 = paramCustomEventServerParameters.label;
    }
  }
  
  public void showInterstitial()
  {
    this.zzbm.showInterstitial();
  }
  
  CustomEventAdapter.zzb zza(MediationInterstitialListener paramMediationInterstitialListener)
  {
    CustomEventAdapter.zzb localzzb = new com/google/ads/mediation/customevent/CustomEventAdapter$zzb;
    localzzb.<init>(this, this, paramMediationInterstitialListener);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\customevent\CustomEventAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */