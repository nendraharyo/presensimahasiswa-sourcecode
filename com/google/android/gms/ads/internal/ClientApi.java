package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.purchase.zze;
import com.google.android.gms.ads.internal.reward.client.zzb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzeb;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzhs;

public class ClientApi
  implements zzm
{
  public static void retainReference()
  {
    com.google.android.gms.ads.internal.client.zzl.zzuq = ClientApi.class.getName();
  }
  
  public zzs createAdLoaderBuilder(Context paramContext, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    zzj localzzj = new com/google/android/gms/ads/internal/zzj;
    zzd localzzd = zzd.zzbg();
    localzzj.<init>(paramContext, paramString, paramzzew, paramVersionInfoParcel, localzzd);
    return localzzj;
  }
  
  public zzfv createAdOverlay(Activity paramActivity)
  {
    com.google.android.gms.ads.internal.overlay.zzd localzzd = new com/google/android/gms/ads/internal/overlay/zzd;
    localzzd.<init>(paramActivity);
    return localzzd;
  }
  
  public zzu createBannerAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    zzf localzzf = new com/google/android/gms/ads/internal/zzf;
    zzd localzzd = zzd.zzbg();
    localzzf.<init>(paramContext, paramAdSizeParcel, paramString, paramzzew, paramVersionInfoParcel, localzzd);
    return localzzf;
  }
  
  public zzge createInAppPurchaseManager(Activity paramActivity)
  {
    zze localzze = new com/google/android/gms/ads/internal/purchase/zze;
    localzze.<init>(paramActivity);
    return localzze;
  }
  
  public zzu createInterstitialAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    Object localObject1 = (Boolean)zzbt.zzwE.get();
    boolean bool = ((Boolean)localObject1).booleanValue();
    Object localObject2;
    if (bool)
    {
      localObject1 = new com/google/android/gms/internal/zzeb;
      localObject2 = zzd.zzbg();
      ((zzeb)localObject1).<init>(paramContext, paramString, paramzzew, paramVersionInfoParcel, (zzd)localObject2);
    }
    for (;;)
    {
      return (zzu)localObject1;
      localObject1 = new com/google/android/gms/ads/internal/zzk;
      zzd localzzd = zzd.zzbg();
      localObject2 = paramVersionInfoParcel;
      ((zzk)localObject1).<init>(paramContext, paramAdSizeParcel, paramString, paramzzew, paramVersionInfoParcel, localzzd);
    }
  }
  
  public zzcj createNativeAdViewDelegate(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    com.google.android.gms.ads.internal.formats.zzk localzzk = new com/google/android/gms/ads/internal/formats/zzk;
    localzzk.<init>(paramFrameLayout1, paramFrameLayout2);
    return localzzk;
  }
  
  public zzb createRewardedVideoAd(Context paramContext, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    zzhs localzzhs = new com/google/android/gms/internal/zzhs;
    zzd localzzd = zzd.zzbg();
    localzzhs.<init>(paramContext, localzzd, paramzzew, paramVersionInfoParcel);
    return localzzhs;
  }
  
  public zzy getMobileAdsSettingsManager(Context paramContext)
  {
    return zzn.zzr(paramContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\ClientApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */