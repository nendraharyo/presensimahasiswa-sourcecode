package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.client.zzg;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgi;
import com.google.android.gms.internal.zzgm;
import java.util.Map;

public class zzac
{
  private final Context mContext;
  private String zzaW;
  private RewardedVideoAdListener zzaX;
  private final zzh zzoB;
  private String zzpS;
  private AdListener zztA;
  private zza zztz;
  private final zzew zzuJ;
  private zzu zzuL;
  private String zzuM;
  private InAppPurchaseListener zzuO;
  private PlayStorePurchaseListener zzuP;
  private OnCustomRenderedAdLoadedListener zzuQ;
  private Correlator zzuR;
  private PublisherInterstitialAd zzuT;
  private boolean zzuU;
  private AppEventListener zzun;
  
  public zzac(Context paramContext)
  {
    this(paramContext, localzzh, null);
  }
  
  public zzac(Context paramContext, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this(paramContext, localzzh, paramPublisherInterstitialAd);
  }
  
  public zzac(Context paramContext, zzh paramzzh, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    zzew localzzew = new com/google/android/gms/internal/zzew;
    localzzew.<init>();
    this.zzuJ = localzzew;
    this.mContext = paramContext;
    this.zzoB = paramzzh;
    this.zzuT = paramPublisherInterstitialAd;
  }
  
  private void zzH(String paramString)
  {
    Object localObject1 = this.zzpS;
    if (localObject1 == null) {
      zzI(paramString);
    }
    boolean bool = this.zzuU;
    if (bool) {
      localObject1 = AdSizeParcel.zzcP();
    }
    for (;;)
    {
      Object localObject2 = zzn.zzcT();
      Object localObject3 = this.mContext;
      String str = this.zzpS;
      zzew localzzew = this.zzuJ;
      localObject1 = ((zze)localObject2).zzb((Context)localObject3, (AdSizeParcel)localObject1, str, localzzew);
      this.zzuL = ((zzu)localObject1);
      localObject1 = this.zztA;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/ads/internal/client/zzc;
        localObject3 = this.zztA;
        ((zzc)localObject2).<init>((AdListener)localObject3);
        ((zzu)localObject1).zza((zzq)localObject2);
      }
      localObject1 = this.zztz;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/ads/internal/client/zzb;
        localObject3 = this.zztz;
        ((zzb)localObject2).<init>((zza)localObject3);
        ((zzu)localObject1).zza((zzp)localObject2);
      }
      localObject1 = this.zzun;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/ads/internal/client/zzj;
        localObject3 = this.zzun;
        ((zzj)localObject2).<init>((AppEventListener)localObject3);
        ((zzu)localObject1).zza((zzw)localObject2);
      }
      localObject1 = this.zzuO;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/internal/zzgi;
        localObject3 = this.zzuO;
        ((zzgi)localObject2).<init>((InAppPurchaseListener)localObject3);
        ((zzu)localObject1).zza((zzgd)localObject2);
      }
      localObject1 = this.zzuP;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/internal/zzgm;
        localObject3 = this.zzuP;
        ((zzgm)localObject2).<init>((PlayStorePurchaseListener)localObject3);
        localObject3 = this.zzuM;
        ((zzu)localObject1).zza((zzgh)localObject2, (String)localObject3);
      }
      localObject1 = this.zzuQ;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/internal/zzcg;
        localObject3 = this.zzuQ;
        ((zzcg)localObject2).<init>((OnCustomRenderedAdLoadedListener)localObject3);
        ((zzu)localObject1).zza((zzcf)localObject2);
      }
      localObject1 = this.zzuR;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = this.zzuR.zzaF();
        ((zzu)localObject1).zza((zzx)localObject2);
      }
      localObject1 = this.zzaX;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = new com/google/android/gms/ads/internal/reward/client/zzg;
        localObject3 = this.zzaX;
        ((zzg)localObject2).<init>((RewardedVideoAdListener)localObject3);
        ((zzu)localObject1).zza((zzd)localObject2);
      }
      localObject1 = this.zzaW;
      if (localObject1 != null)
      {
        localObject1 = this.zzuL;
        localObject2 = this.zzaW;
        ((zzu)localObject1).setUserId((String)localObject2);
      }
      return;
      localObject1 = new com/google/android/gms/ads/internal/client/AdSizeParcel;
      ((AdSizeParcel)localObject1).<init>();
    }
  }
  
  private void zzI(String paramString)
  {
    Object localObject1 = this.zzuL;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "The ad unit ID must be set on InterstitialAd before " + paramString + " is called.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public AdListener getAdListener()
  {
    return this.zztA;
  }
  
  public String getAdUnitId()
  {
    return this.zzpS;
  }
  
  public AppEventListener getAppEventListener()
  {
    return this.zzun;
  }
  
  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.zzuO;
  }
  
  public String getMediationAdapterClassName()
  {
    try
    {
      localObject1 = this.zzuL;
      if (localObject1 == null) {
        break label32;
      }
      localObject1 = this.zzuL;
      localObject1 = ((zzu)localObject1).getMediationAdapterClassName();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get the mediation adapter class name.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        label32:
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return this.zzuQ;
  }
  
  public boolean isLoaded()
  {
    for (boolean bool = false;; bool = localzzu.isReady())
    {
      try
      {
        localzzu = this.zzuL;
        if (localzzu != null) {
          break label13;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          zzu localzzu;
          label13:
          String str = "Failed to check if ad is ready.";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
      return bool;
      localzzu = this.zzuL;
    }
  }
  
  public boolean isLoading()
  {
    for (boolean bool = false;; bool = localzzu.isLoading())
    {
      try
      {
        localzzu = this.zzuL;
        if (localzzu != null) {
          break label13;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          zzu localzzu;
          label13:
          String str = "Failed to check if ad is loading.";
          com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        }
      }
      return bool;
      localzzu = this.zzuL;
    }
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    for (;;)
    {
      try
      {
        this.zztA = paramAdListener;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramAdListener != null)
          {
            localObject1 = new com/google/android/gms/ads/internal/client/zzc;
            ((zzc)localObject1).<init>(paramAdListener);
            ((zzu)localObject2).zza((zzq)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set the AdListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void setAdUnitId(String paramString)
  {
    Object localObject = this.zzpS;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The ad unit ID can only be set once on InterstitialAd.");
      throw ((Throwable)localObject);
    }
    this.zzpS = paramString;
  }
  
  public void setAppEventListener(AppEventListener paramAppEventListener)
  {
    for (;;)
    {
      try
      {
        this.zzun = paramAppEventListener;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramAppEventListener != null)
          {
            localObject1 = new com/google/android/gms/ads/internal/client/zzj;
            ((zzj)localObject1).<init>(paramAppEventListener);
            ((zzu)localObject2).zza((zzw)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set the AppEventListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void setCorrelator(Correlator paramCorrelator)
  {
    this.zzuR = paramCorrelator;
    for (;;)
    {
      try
      {
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          localObject1 = this.zzuR;
          if (localObject1 == null)
          {
            localObject1 = null;
            ((zzu)localObject2).zza((zzx)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set correlator.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = this.zzuR;
      localObject1 = ((Correlator)localObject1).zzaF();
    }
  }
  
  public void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    Object localObject1 = this.zzuP;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Play store purchase parameter has already been set.");
      throw ((Throwable)localObject1);
    }
    for (;;)
    {
      try
      {
        this.zzuO = paramInAppPurchaseListener;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramInAppPurchaseListener != null)
          {
            localObject1 = new com/google/android/gms/internal/zzgi;
            ((zzgi)localObject1).<init>(paramInAppPurchaseListener);
            ((zzu)localObject2).zza((zzgd)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "Failed to set the InAppPurchaseListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    for (;;)
    {
      try
      {
        this.zzuQ = paramOnCustomRenderedAdLoadedListener;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramOnCustomRenderedAdLoadedListener != null)
          {
            localObject1 = new com/google/android/gms/internal/zzcg;
            ((zzcg)localObject1).<init>(paramOnCustomRenderedAdLoadedListener);
            ((zzu)localObject2).zza((zzcf)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set the OnCustomRenderedAdLoadedListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    Object localObject1 = this.zzuO;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("In app purchase parameter has already been set.");
      throw ((Throwable)localObject1);
    }
    for (;;)
    {
      try
      {
        this.zzuP = paramPlayStorePurchaseListener;
        this.zzuM = paramString;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramPlayStorePurchaseListener != null)
          {
            localObject1 = new com/google/android/gms/internal/zzgm;
            ((zzgm)localObject1).<init>(paramPlayStorePurchaseListener);
            ((zzu)localObject2).zza((zzgh)localObject1, paramString);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = "Failed to set the play store purchase parameter.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    for (;;)
    {
      try
      {
        this.zzaX = paramRewardedVideoAdListener;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramRewardedVideoAdListener != null)
          {
            localObject1 = new com/google/android/gms/ads/internal/reward/client/zzg;
            ((zzg)localObject1).<init>(paramRewardedVideoAdListener);
            ((zzu)localObject2).zza((zzd)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set the AdListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void setUserId(String paramString)
  {
    try
    {
      this.zzaW = paramString;
      zzu localzzu = this.zzuL;
      if (localzzu != null)
      {
        localzzu = this.zzuL;
        localzzu.setUserId(paramString);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to set the AdListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void show()
  {
    Object localObject = "show";
    try
    {
      zzI((String)localObject);
      localObject = this.zzuL;
      ((zzu)localObject).showInterstitial();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to show interstitial.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void zza(zza paramzza)
  {
    for (;;)
    {
      try
      {
        this.zztz = paramzza;
        localObject1 = this.zzuL;
        if (localObject1 != null)
        {
          localObject2 = this.zzuL;
          if (paramzza != null)
          {
            localObject1 = new com/google/android/gms/ads/internal/client/zzb;
            ((zzb)localObject1).<init>(paramzza);
            ((zzu)localObject2).zza((zzp)localObject1);
          }
        }
        else
        {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to set the AdClickListener.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = null;
    }
  }
  
  public void zza(zzaa paramzzaa)
  {
    try
    {
      Object localObject1 = this.zzuL;
      if (localObject1 == null)
      {
        localObject1 = "loadAd";
        zzH((String)localObject1);
      }
      localObject1 = this.zzuL;
      localObject2 = this.zzoB;
      Context localContext = this.mContext;
      localObject2 = ((zzh)localObject2).zza(localContext, paramzzaa);
      boolean bool = ((zzu)localObject1).zzb((AdRequestParcel)localObject2);
      if (bool)
      {
        localObject1 = this.zzuJ;
        localObject2 = paramzzaa.zzdb();
        ((zzew)localObject1).zzg((Map)localObject2);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Failed to load ad.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void zza(boolean paramBoolean)
  {
    this.zzuU = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */