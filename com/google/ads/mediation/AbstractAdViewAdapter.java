package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzka;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractAdViewAdapter
  implements MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzka
{
  public static final String AD_UNIT_ID_PARAMETER = "pubid";
  protected AdView zzaQ;
  protected InterstitialAd zzaR;
  private AdLoader zzaS;
  private Context zzaT;
  private InterstitialAd zzaU;
  private MediationRewardedVideoAdListener zzaV;
  private String zzaW;
  final RewardedVideoAdListener zzaX;
  
  public AbstractAdViewAdapter()
  {
    AbstractAdViewAdapter.1 local1 = new com/google/ads/mediation/AbstractAdViewAdapter$1;
    local1.<init>(this);
    this.zzaX = local1;
  }
  
  public String getAdUnitId(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return this.zzaQ;
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    MediationAdapter.zza localzza = new com/google/android/gms/ads/mediation/MediationAdapter$zza;
    localzza.<init>();
    return localzza.zzS(1).zziw();
  }
  
  public void initialize(Context paramContext, MediationAdRequest paramMediationAdRequest, String paramString, MediationRewardedVideoAdListener paramMediationRewardedVideoAdListener, Bundle paramBundle1, Bundle paramBundle2)
  {
    Context localContext = paramContext.getApplicationContext();
    this.zzaT = localContext;
    this.zzaW = paramString;
    this.zzaV = paramMediationRewardedVideoAdListener;
    this.zzaV.onInitializationSucceeded(this);
  }
  
  public boolean isInitialized()
  {
    MediationRewardedVideoAdListener localMediationRewardedVideoAdListener = this.zzaV;
    boolean bool;
    if (localMediationRewardedVideoAdListener != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMediationRewardedVideoAdListener = null;
    }
  }
  
  public void loadAd(MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    Object localObject1 = this.zzaT;
    if (localObject1 != null)
    {
      localObject1 = this.zzaV;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = "AdMobAdapter.loadAd called before initialize.";
      zzin.e((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/ads/InterstitialAd;
      Object localObject2 = this.zzaT;
      ((InterstitialAd)localObject1).<init>((Context)localObject2);
      this.zzaU = ((InterstitialAd)localObject1);
      localObject1 = this.zzaU;
      boolean bool = true;
      ((InterstitialAd)localObject1).zza(bool);
      localObject1 = this.zzaU;
      localObject2 = getAdUnitId(paramBundle1);
      ((InterstitialAd)localObject1).setAdUnitId((String)localObject2);
      localObject1 = this.zzaU;
      localObject2 = this.zzaX;
      ((InterstitialAd)localObject1).setRewardedVideoAdListener((RewardedVideoAdListener)localObject2);
      localObject1 = this.zzaU;
      localObject2 = this.zzaW;
      ((InterstitialAd)localObject1).zzm((String)localObject2);
      localObject1 = this.zzaU;
      localObject2 = this.zzaT;
      localObject2 = zza((Context)localObject2, paramMediationAdRequest, paramBundle2, paramBundle1);
      ((InterstitialAd)localObject1).loadAd((AdRequest)localObject2);
    }
  }
  
  public void onDestroy()
  {
    Object localObject = this.zzaQ;
    if (localObject != null)
    {
      localObject = this.zzaQ;
      ((AdView)localObject).destroy();
      this.zzaQ = null;
    }
    localObject = this.zzaR;
    if (localObject != null) {
      this.zzaR = null;
    }
    localObject = this.zzaS;
    if (localObject != null) {
      this.zzaS = null;
    }
    localObject = this.zzaU;
    if (localObject != null) {
      this.zzaU = null;
    }
  }
  
  public void onPause()
  {
    AdView localAdView = this.zzaQ;
    if (localAdView != null)
    {
      localAdView = this.zzaQ;
      localAdView.pause();
    }
  }
  
  public void onResume()
  {
    AdView localAdView = this.zzaQ;
    if (localAdView != null)
    {
      localAdView = this.zzaQ;
      localAdView.resume();
    }
  }
  
  public void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    AdView localAdView = new com/google/android/gms/ads/AdView;
    localAdView.<init>(paramContext);
    this.zzaQ = localAdView;
    localAdView = this.zzaQ;
    Object localObject = new com/google/android/gms/ads/AdSize;
    int i = paramAdSize.getWidth();
    int j = paramAdSize.getHeight();
    ((AdSize)localObject).<init>(i, j);
    localAdView.setAdSize((AdSize)localObject);
    localAdView = this.zzaQ;
    localObject = getAdUnitId(paramBundle1);
    localAdView.setAdUnitId((String)localObject);
    localAdView = this.zzaQ;
    localObject = new com/google/ads/mediation/AbstractAdViewAdapter$zzc;
    ((AbstractAdViewAdapter.zzc)localObject).<init>(this, paramMediationBannerListener);
    localAdView.setAdListener((AdListener)localObject);
    localAdView = this.zzaQ;
    localObject = zza(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1);
    localAdView.loadAd((AdRequest)localObject);
  }
  
  public void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    InterstitialAd localInterstitialAd = new com/google/android/gms/ads/InterstitialAd;
    localInterstitialAd.<init>(paramContext);
    this.zzaR = localInterstitialAd;
    localInterstitialAd = this.zzaR;
    Object localObject = getAdUnitId(paramBundle1);
    localInterstitialAd.setAdUnitId((String)localObject);
    localInterstitialAd = this.zzaR;
    localObject = new com/google/ads/mediation/AbstractAdViewAdapter$zzd;
    ((AbstractAdViewAdapter.zzd)localObject).<init>(this, paramMediationInterstitialListener);
    localInterstitialAd.setAdListener((AdListener)localObject);
    localInterstitialAd = this.zzaR;
    localObject = zza(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1);
    localInterstitialAd.loadAd((AdRequest)localObject);
  }
  
  public void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    Object localObject1 = new com/google/ads/mediation/AbstractAdViewAdapter$zze;
    ((AbstractAdViewAdapter.zze)localObject1).<init>(this, paramMediationNativeListener);
    Object localObject2 = paramBundle1.getString("pubid");
    localObject2 = zza(paramContext, (String)localObject2).withAdListener((AdListener)localObject1);
    NativeAdOptions localNativeAdOptions = paramNativeMediationAdRequest.getNativeAdOptions();
    if (localNativeAdOptions != null) {
      ((AdLoader.Builder)localObject2).withNativeAdOptions(localNativeAdOptions);
    }
    boolean bool = paramNativeMediationAdRequest.isAppInstallAdRequested();
    if (bool) {
      ((AdLoader.Builder)localObject2).forAppInstallAd((NativeAppInstallAd.OnAppInstallAdLoadedListener)localObject1);
    }
    bool = paramNativeMediationAdRequest.isContentAdRequested();
    if (bool) {
      ((AdLoader.Builder)localObject2).forContentAd((NativeContentAd.OnContentAdLoadedListener)localObject1);
    }
    localObject1 = ((AdLoader.Builder)localObject2).build();
    this.zzaS = ((AdLoader)localObject1);
    localObject1 = this.zzaS;
    localObject2 = zza(paramContext, paramNativeMediationAdRequest, paramBundle2, paramBundle1);
    ((AdLoader)localObject1).loadAd((AdRequest)localObject2);
  }
  
  public void showInterstitial()
  {
    this.zzaR.show();
  }
  
  public void showVideo()
  {
    this.zzaU.show();
  }
  
  protected abstract Bundle zza(Bundle paramBundle1, Bundle paramBundle2);
  
  AdLoader.Builder zza(Context paramContext, String paramString)
  {
    AdLoader.Builder localBuilder = new com/google/android/gms/ads/AdLoader$Builder;
    localBuilder.<init>(paramContext, paramString);
    return localBuilder;
  }
  
  AdRequest zza(Context paramContext, MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    int i = 1;
    AdRequest.Builder localBuilder = new com/google/android/gms/ads/AdRequest$Builder;
    localBuilder.<init>();
    Object localObject = paramMediationAdRequest.getBirthday();
    if (localObject != null) {
      localBuilder.setBirthday((Date)localObject);
    }
    int j = paramMediationAdRequest.getGender();
    if (j != 0) {
      localBuilder.setGender(j);
    }
    localObject = paramMediationAdRequest.getKeywords();
    if (localObject != null)
    {
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (String)localIterator.next();
        localBuilder.addKeyword((String)localObject);
      }
    }
    localObject = paramMediationAdRequest.getLocation();
    if (localObject != null) {
      localBuilder.setLocation((Location)localObject);
    }
    boolean bool1 = paramMediationAdRequest.isTesting();
    if (bool1)
    {
      localObject = zzn.zzcS().zzT(paramContext);
      localBuilder.addTestDevice((String)localObject);
    }
    int k = paramMediationAdRequest.taggedForChildDirectedTreatment();
    int m = -1;
    if (k != m)
    {
      k = paramMediationAdRequest.taggedForChildDirectedTreatment();
      if (k != i) {
        break label252;
      }
      k = i;
    }
    for (;;)
    {
      localBuilder.tagForChildDirectedTreatment(k);
      boolean bool2 = paramMediationAdRequest.isDesignedForFamilies();
      localBuilder.setIsDesignedForFamilies(bool2);
      localObject = zza(paramBundle1, paramBundle2);
      localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, (Bundle)localObject);
      return localBuilder.build();
      label252:
      bool2 = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\AbstractAdViewAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */