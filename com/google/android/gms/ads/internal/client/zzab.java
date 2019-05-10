package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgi;
import com.google.android.gms.internal.zzgm;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class zzab
{
  private final zzh zzoB;
  private boolean zzpE;
  private String zzpS;
  private AdListener zztA;
  private zza zztz;
  private final zzew zzuJ;
  private final AtomicBoolean zzuK;
  private zzu zzuL;
  private String zzuM;
  private ViewGroup zzuN;
  private InAppPurchaseListener zzuO;
  private PlayStorePurchaseListener zzuP;
  private OnCustomRenderedAdLoadedListener zzuQ;
  private Correlator zzuR;
  private boolean zzuS;
  private AppEventListener zzun;
  private AdSize[] zzuo;
  
  public zzab(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, localzzh, false);
  }
  
  public zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, localzzh, false);
  }
  
  zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, zzh paramzzh, zzu paramzzu, boolean paramBoolean2)
  {
    Object localObject1 = new com/google/android/gms/internal/zzew;
    ((zzew)localObject1).<init>();
    this.zzuJ = ((zzew)localObject1);
    this.zzuN = paramViewGroup;
    this.zzoB = paramzzh;
    this.zzuL = paramzzu;
    localObject1 = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject1).<init>(false);
    this.zzuK = ((AtomicBoolean)localObject1);
    this.zzuS = paramBoolean2;
    Object localObject2;
    if (paramAttributeSet != null) {
      localObject2 = paramViewGroup.getContext();
    }
    try
    {
      localObject1 = new com/google/android/gms/ads/internal/client/zzk;
      ((zzk)localObject1).<init>((Context)localObject2, paramAttributeSet);
      localObject3 = ((zzk)localObject1).zzj(paramBoolean1);
      this.zzuo = ((AdSize[])localObject3);
      localObject1 = ((zzk)localObject1).getAdUnitId();
      this.zzpS = ((String)localObject1);
      boolean bool2 = paramViewGroup.isInEditMode();
      if (bool2)
      {
        localObject1 = zzn.zzcS();
        localObject3 = this.zzuo[0];
        bool1 = this.zzuS;
        localObject2 = zza((Context)localObject2, (AdSize)localObject3, bool1);
        localObject3 = "Ads by Google";
        ((com.google.android.gms.ads.internal.util.client.zza)localObject1).zza(paramViewGroup, (AdSizeParcel)localObject2, (String)localObject3);
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        Object localObject3 = zzn.zzcS();
        localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
        AdSize localAdSize = AdSize.BANNER;
        localAdSizeParcel.<init>((Context)localObject2, localAdSize);
        localObject2 = localIllegalArgumentException.getMessage();
        String str = localIllegalArgumentException.getMessage();
        ((com.google.android.gms.ads.internal.util.client.zza)localObject3).zza(paramViewGroup, localAdSizeParcel, (String)localObject2, str);
      }
    }
  }
  
  zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, zzh paramzzh, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, paramzzh, null, paramBoolean2);
  }
  
  public zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, localzzh, paramBoolean2);
  }
  
  public zzab(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this(paramViewGroup, null, false, localzzh, paramBoolean);
  }
  
  private static AdSizeParcel zza(Context paramContext, AdSize paramAdSize, boolean paramBoolean)
  {
    AdSizeParcel localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    localAdSizeParcel.<init>(paramContext, paramAdSize);
    localAdSizeParcel.zzi(paramBoolean);
    return localAdSizeParcel;
  }
  
  private static AdSizeParcel zza(Context paramContext, AdSize[] paramArrayOfAdSize, boolean paramBoolean)
  {
    AdSizeParcel localAdSizeParcel = new com/google/android/gms/ads/internal/client/AdSizeParcel;
    localAdSizeParcel.<init>(paramContext, paramArrayOfAdSize);
    localAdSizeParcel.zzi(paramBoolean);
    return localAdSizeParcel;
  }
  
  private void zzdf()
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzuL;
        localObject1 = ((zzu)localObject1).zzaM();
        if (localObject1 == null) {
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2 = "Failed to get an ad frame.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject2 = this.zzuN;
      localObject1 = com.google.android.gms.dynamic.zze.zzp((zzd)localObject1);
      localObject1 = (View)localObject1;
      ((ViewGroup)localObject2).addView((View)localObject1);
    }
  }
  
  public void destroy()
  {
    try
    {
      zzu localzzu = this.zzuL;
      if (localzzu != null)
      {
        localzzu = this.zzuL;
        localzzu.destroy();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to destroy AdView.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public AdListener getAdListener()
  {
    return this.zztA;
  }
  
  public AdSize getAdSize()
  {
    try
    {
      localObject1 = this.zzuL;
      if (localObject1 == null) {
        break label41;
      }
      localObject1 = this.zzuL;
      localObject1 = ((zzu)localObject1).zzaN();
      if (localObject1 == null) {
        break label41;
      }
      localObject1 = ((AdSizeParcel)localObject1).zzcQ();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get the current AdSize.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        label41:
        Object localObject2 = this.zzuo;
        if (localObject2 != null)
        {
          localObject2 = this.zzuo;
          str = null;
          localObject2 = localObject2[0];
        }
        else
        {
          localObject2 = null;
        }
      }
    }
    return (AdSize)localObject1;
  }
  
  public AdSize[] getAdSizes()
  {
    return this.zzuo;
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
  
  public boolean isLoading()
  {
    try
    {
      zzu localzzu = this.zzuL;
      if (localzzu == null) {
        break label32;
      }
      localzzu = this.zzuL;
      bool = localzzu.isLoading();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to check if ad is loading.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
        label32:
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  public void pause()
  {
    try
    {
      zzu localzzu = this.zzuL;
      if (localzzu != null)
      {
        localzzu = this.zzuL;
        localzzu.pause();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to call pause.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void recordManualImpression()
  {
    Object localObject = this.zzuK;
    boolean bool1 = true;
    boolean bool2 = ((AtomicBoolean)localObject).getAndSet(bool1);
    if (bool2) {}
    for (;;)
    {
      return;
      try
      {
        localObject = this.zzuL;
        if (localObject != null)
        {
          localObject = this.zzuL;
          ((zzu)localObject).zzaP();
        }
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Failed to record impression.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void resume()
  {
    try
    {
      zzu localzzu = this.zzuL;
      if (localzzu != null)
      {
        localzzu = this.zzuL;
        localzzu.resume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to call resume.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
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
  
  public void setAdSizes(AdSize... paramVarArgs)
  {
    Object localObject = this.zzuo;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The ad size can only be set once on AdView.");
      throw ((Throwable)localObject);
    }
    zza(paramVarArgs);
  }
  
  public void setAdUnitId(String paramString)
  {
    Object localObject = this.zzpS;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("The ad unit ID can only be set once on AdView.");
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
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.zzpE = paramBoolean;
    try
    {
      zzu localzzu = this.zzuL;
      if (localzzu != null)
      {
        localzzu = this.zzuL;
        boolean bool = this.zzpE;
        localzzu.setManualImpressionsEnabled(bool);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to set manual impressions.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.zzuQ = paramOnCustomRenderedAdLoadedListener;
    for (;;)
    {
      try
      {
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
        Object localObject2 = "Failed to set the onCustomRenderedAdLoadedListener.";
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
      ((IllegalStateException)localObject1).<init>("InAppPurchaseListener has already been set.");
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
      if (localObject1 == null) {
        zzdg();
      }
      localObject1 = this.zzuL;
      localObject2 = this.zzoB;
      Object localObject3 = this.zzuN;
      localObject3 = ((ViewGroup)localObject3).getContext();
      localObject2 = ((zzh)localObject2).zza((Context)localObject3, paramzzaa);
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
  
  public void zza(AdSize... paramVarArgs)
  {
    this.zzuo = paramVarArgs;
    try
    {
      zzu localzzu = this.zzuL;
      if (localzzu != null)
      {
        localzzu = this.zzuL;
        localObject = this.zzuN;
        localObject = ((ViewGroup)localObject).getContext();
        AdSize[] arrayOfAdSize = this.zzuo;
        boolean bool = this.zzuS;
        localObject = zza((Context)localObject, arrayOfAdSize, bool);
        localzzu.zza((AdSizeParcel)localObject);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to set the ad size.";
        com.google.android.gms.ads.internal.util.client.zzb.zzd((String)localObject, localRemoteException);
      }
    }
    this.zzuN.requestLayout();
  }
  
  void zzdg()
  {
    Object localObject1 = this.zzuo;
    if (localObject1 != null)
    {
      localObject1 = this.zzpS;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = this.zzuL;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("The ad size and ad unit ID must be set before loadAd is called.");
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = zzdh();
    this.zzuL = ((zzu)localObject1);
    localObject1 = this.zztA;
    Object localObject2;
    Object localObject3;
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
    localObject1 = this.zzuL;
    boolean bool = this.zzpE;
    ((zzu)localObject1).setManualImpressionsEnabled(bool);
    zzdf();
  }
  
  protected zzu zzdh()
  {
    Context localContext = this.zzuN.getContext();
    zze localzze = zzn.zzcT();
    Object localObject = this.zzuo;
    boolean bool = this.zzuS;
    localObject = zza(localContext, (AdSize[])localObject, bool);
    String str = this.zzpS;
    zzew localzzew = this.zzuJ;
    return localzze.zza(localContext, (AdSizeParcel)localObject, str, localzzew);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */