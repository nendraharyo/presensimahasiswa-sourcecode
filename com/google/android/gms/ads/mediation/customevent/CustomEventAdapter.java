package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.zzin;

public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  CustomEventBanner zzOq;
  CustomEventInterstitial zzOr;
  CustomEventNative zzOs;
  private View zzbk;
  
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
  
  public View getBannerView()
  {
    return this.zzbk;
  }
  
  public void onDestroy()
  {
    Object localObject = this.zzOq;
    if (localObject != null)
    {
      localObject = this.zzOq;
      ((CustomEventBanner)localObject).onDestroy();
    }
    localObject = this.zzOr;
    if (localObject != null)
    {
      localObject = this.zzOr;
      ((CustomEventInterstitial)localObject).onDestroy();
    }
    localObject = this.zzOs;
    if (localObject != null)
    {
      localObject = this.zzOs;
      ((CustomEventNative)localObject).onDestroy();
    }
  }
  
  public void onPause()
  {
    Object localObject = this.zzOq;
    if (localObject != null)
    {
      localObject = this.zzOq;
      ((CustomEventBanner)localObject).onPause();
    }
    localObject = this.zzOr;
    if (localObject != null)
    {
      localObject = this.zzOr;
      ((CustomEventInterstitial)localObject).onPause();
    }
    localObject = this.zzOs;
    if (localObject != null)
    {
      localObject = this.zzOs;
      ((CustomEventNative)localObject).onPause();
    }
  }
  
  public void onResume()
  {
    Object localObject = this.zzOq;
    if (localObject != null)
    {
      localObject = this.zzOq;
      ((CustomEventBanner)localObject).onResume();
    }
    localObject = this.zzOr;
    if (localObject != null)
    {
      localObject = this.zzOr;
      ((CustomEventInterstitial)localObject).onResume();
    }
    localObject = this.zzOs;
    if (localObject != null)
    {
      localObject = this.zzOs;
      ((CustomEventNative)localObject).onResume();
    }
  }
  
  public void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    Object localObject = (CustomEventBanner)zzj(paramBundle1.getString("class_name"));
    this.zzOq = ((CustomEventBanner)localObject);
    localObject = this.zzOq;
    if (localObject == null)
    {
      localObject = null;
      paramMediationBannerListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle2.getBundle((String)localObject))
    {
      localObject = this.zzOq;
      CustomEventAdapter.zza localzza = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter$zza;
      localzza.<init>(this, paramMediationBannerListener);
      String str = paramBundle1.getString("parameter");
      ((CustomEventBanner)localObject).requestBannerAd(paramContext, localzza, str, paramAdSize, paramMediationAdRequest, localBundle);
      break;
      localObject = paramBundle1.getString("class_name");
    }
  }
  
  public void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    Object localObject = (CustomEventInterstitial)zzj(paramBundle1.getString("class_name"));
    this.zzOr = ((CustomEventInterstitial)localObject);
    localObject = this.zzOr;
    if (localObject == null)
    {
      localObject = null;
      paramMediationInterstitialListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle2.getBundle((String)localObject))
    {
      localObject = this.zzOr;
      CustomEventAdapter.zzb localzzb = zza(paramMediationInterstitialListener);
      String str = paramBundle1.getString("parameter");
      ((CustomEventInterstitial)localObject).requestInterstitialAd(paramContext, localzzb, str, paramMediationAdRequest, localBundle);
      break;
      localObject = paramBundle1.getString("class_name");
    }
  }
  
  public void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    Object localObject = (CustomEventNative)zzj(paramBundle1.getString("class_name"));
    this.zzOs = ((CustomEventNative)localObject);
    localObject = this.zzOs;
    if (localObject == null)
    {
      localObject = null;
      paramMediationNativeListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (Bundle localBundle = null;; localBundle = paramBundle2.getBundle((String)localObject))
    {
      localObject = this.zzOs;
      CustomEventAdapter.zzc localzzc = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter$zzc;
      localzzc.<init>(this, paramMediationNativeListener);
      String str = paramBundle1.getString("parameter");
      ((CustomEventNative)localObject).requestNativeAd(paramContext, localzzc, str, paramNativeMediationAdRequest, localBundle);
      break;
      localObject = paramBundle1.getString("class_name");
    }
  }
  
  public void showInterstitial()
  {
    this.zzOr.showInterstitial();
  }
  
  CustomEventAdapter.zzb zza(MediationInterstitialListener paramMediationInterstitialListener)
  {
    CustomEventAdapter.zzb localzzb = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter$zzb;
    localzzb.<init>(this, this, paramMediationInterstitialListener);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */