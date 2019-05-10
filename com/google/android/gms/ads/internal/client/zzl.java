package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;

public class zzl
{
  public static String zzuq = null;
  private zzm zzup;
  
  public zzl()
  {
    ClientApi.retainReference();
    Object localObject = zzuq;
    if (localObject != null) {
      localObject = zzl.class;
    }
    for (;;)
    {
      try
      {
        localObject = ((Class)localObject).getClassLoader();
        str = zzuq;
        localObject = ((ClassLoader)localObject).loadClass(str);
        localObject = ((Class)localObject).newInstance();
        localObject = (zzm)localObject;
        this.zzup = ((zzm)localObject);
        return;
      }
      catch (Exception localException)
      {
        String str = "Failed to instantiate ClientApi class.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localException);
        localzzai = new com/google/android/gms/ads/internal/client/zzai;
        localzzai.<init>();
        this.zzup = localzzai;
        continue;
      }
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("No client jar implementation found.");
      zzai localzzai = new com/google/android/gms/ads/internal/client/zzai;
      localzzai.<init>();
      this.zzup = localzzai;
    }
  }
  
  public zzs createAdLoaderBuilder(Context paramContext, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return this.zzup.createAdLoaderBuilder(paramContext, paramString, paramzzew, paramVersionInfoParcel);
  }
  
  public zzfv createAdOverlay(Activity paramActivity)
  {
    return this.zzup.createAdOverlay(paramActivity);
  }
  
  public zzu createBannerAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return this.zzup.createBannerAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, paramVersionInfoParcel);
  }
  
  public zzge createInAppPurchaseManager(Activity paramActivity)
  {
    return this.zzup.createInAppPurchaseManager(paramActivity);
  }
  
  public zzu createInterstitialAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return this.zzup.createInterstitialAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, paramVersionInfoParcel);
  }
  
  public zzcj createNativeAdViewDelegate(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    return this.zzup.createNativeAdViewDelegate(paramFrameLayout1, paramFrameLayout2);
  }
  
  public com.google.android.gms.ads.internal.reward.client.zzb createRewardedVideoAd(Context paramContext, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return this.zzup.createRewardedVideoAd(paramContext, paramzzew, paramVersionInfoParcel);
  }
  
  public zzy getMobileAdsSettingsManager(Context paramContext)
  {
    return this.zzup.getMobileAdsSettingsManager(paramContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */