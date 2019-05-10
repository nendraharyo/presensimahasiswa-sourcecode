package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zza.zza;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbc;
import com.google.android.gms.internal.zzbf;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgr.zza;
import com.google.android.gms.internal.zzhr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzij;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.HashSet;
import java.util.List;

public abstract class zza
  extends zzu.zza
  implements com.google.android.gms.ads.internal.client.zza, com.google.android.gms.ads.internal.overlay.zzp, zza.zza, zzdb, zzgr.zza, zzij
{
  protected zzcb zzpe;
  protected zzbz zzpf;
  protected zzbz zzpg;
  protected boolean zzph;
  protected final zzq zzpi;
  protected final zzs zzpj;
  protected transient AdRequestParcel zzpk;
  protected final zzax zzpl;
  protected final zzd zzpm;
  
  zza(zzs paramzzs, zzq paramzzq, zzd paramzzd)
  {
    Object localObject = null;
    this.zzph = false;
    this.zzpj = paramzzs;
    if (paramzzq != null) {}
    for (;;)
    {
      this.zzpi = paramzzq;
      this.zzpm = paramzzd;
      localObject = zzr.zzbC();
      Context localContext = this.zzpj.context;
      ((zzir)localObject).zzJ(localContext);
      localObject = zzr.zzbF();
      localContext = this.zzpj.context;
      VersionInfoParcel localVersionInfoParcel = this.zzpj.zzrl;
      ((zzih)localObject).zzb(localContext, localVersionInfoParcel);
      localObject = zzr.zzbF().zzhh();
      this.zzpl = ((zzax)localObject);
      return;
      paramzzq = new com/google/android/gms/ads/internal/zzq;
      paramzzq.<init>(this);
    }
  }
  
  private AdRequestParcel zza(AdRequestParcel paramAdRequestParcel)
  {
    Object localObject = this.zzpj.context;
    boolean bool = com.google.android.gms.common.zze.zzap((Context)localObject);
    if (bool)
    {
      localObject = paramAdRequestParcel.zztK;
      if (localObject != null)
      {
        localObject = new com/google/android/gms/ads/internal/client/zzf;
        ((zzf)localObject).<init>(paramAdRequestParcel);
        localObject = ((zzf)localObject).zza(null);
        paramAdRequestParcel = ((zzf)localObject).zzcN();
      }
    }
    return paramAdRequestParcel;
  }
  
  public void destroy()
  {
    com.google.android.gms.common.internal.zzx.zzcD("destroy must be called on the main UI thread.");
    this.zzpi.cancel();
    zzax localzzax = this.zzpl;
    zzif localzzif = this.zzpj.zzrq;
    localzzax.zzj(localzzif);
    this.zzpj.destroy();
  }
  
  public boolean isLoading()
  {
    return this.zzph;
  }
  
  public boolean isReady()
  {
    com.google.android.gms.common.internal.zzx.zzcD("isLoaded must be called on the main UI thread.");
    Object localObject = this.zzpj.zzrn;
    boolean bool;
    if (localObject == null)
    {
      localObject = this.zzpj.zzro;
      if (localObject == null)
      {
        localObject = this.zzpj.zzrq;
        if (localObject != null) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public void onAdClicked()
  {
    Object localObject1 = this.zzpj.zzrq;
    if (localObject1 == null)
    {
      localObject1 = "Ad state was null when trying to ping click URLs.";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return;
      zzin.zzaI("Pinging click URLs.");
      this.zzpj.zzrs.zzgT();
      localObject1 = this.zzpj.zzrq.zzBQ;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = zzr.zzbC();
        localObject2 = this.zzpj.context;
        String str = this.zzpj.zzrl.afmaVersion;
        List localList = this.zzpj.zzrq.zzBQ;
        ((zzir)localObject1).zza((Context)localObject2, str, localList);
      }
      localObject1 = this.zzpj.zzrt;
      if (localObject1 != null) {
        try
        {
          localObject1 = this.zzpj;
          localObject1 = ((zzs)localObject1).zzrt;
          ((com.google.android.gms.ads.internal.client.zzp)localObject1).onAdClicked();
        }
        catch (RemoteException localRemoteException)
        {
          localObject2 = "Could not notify onAdClicked event.";
          zzin.zzd((String)localObject2, localRemoteException);
        }
      }
    }
  }
  
  public void onAppEvent(String paramString1, String paramString2)
  {
    Object localObject = this.zzpj.zzrv;
    if (localObject != null) {}
    try
    {
      localObject = this.zzpj;
      localObject = ((zzs)localObject).zzrv;
      ((zzw)localObject).onAppEvent(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call the AppEventListener.";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
  
  public void pause()
  {
    com.google.android.gms.common.internal.zzx.zzcD("pause must be called on the main UI thread.");
  }
  
  public void resume()
  {
    com.google.android.gms.common.internal.zzx.zzcD("resume must be called on the main UI thread.");
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    throw localUnsupportedOperationException;
  }
  
  public void setUserId(String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setUserId must be called on the main UI thread.");
    this.zzpj.setUserId(paramString);
  }
  
  public void stopLoading()
  {
    com.google.android.gms.common.internal.zzx.zzcD("stopLoading must be called on the main UI thread.");
    this.zzph = false;
    this.zzpj.zzf(true);
  }
  
  Bundle zza(zzbf paramzzbf)
  {
    Bundle localBundle = null;
    if (paramzzbf == null) {}
    label187:
    for (;;)
    {
      return localBundle;
      boolean bool1 = paramzzbf.zzcK();
      if (bool1) {
        paramzzbf.wakeup();
      }
      Object localObject = paramzzbf.zzcI();
      String str1;
      String str2;
      if (localObject != null)
      {
        str1 = ((zzbc)localObject).zzcy();
        str2 = ((zzbc)localObject).zzcz();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str3 = "In AdManager: loadAd, ";
        localStringBuilder = localStringBuilder.append(str3);
        localObject = ((zzbc)localObject).toString();
        localObject = (String)localObject;
        zzin.zzaI((String)localObject);
        if (str1 != null)
        {
          localObject = zzr.zzbF();
          ((zzih)localObject).zzaA(str1);
        }
      }
      for (;;)
      {
        if (str1 == null) {
          break label187;
        }
        localBundle = new android/os/Bundle;
        int i = 1;
        localBundle.<init>(i);
        localObject = "fingerprint";
        localBundle.putString((String)localObject, str1);
        boolean bool2 = str1.equals(str2);
        if (bool2) {
          break;
        }
        str1 = "v_fp";
        localBundle.putString(str1, str2);
        break;
        str1 = zzr.zzbF().zzhf();
        bool1 = false;
        str2 = null;
      }
    }
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdSize must be called on the main UI thread.");
    this.zzpj.zzrp = paramAdSizeParcel;
    Object localObject = this.zzpj.zzrq;
    int i;
    if (localObject != null)
    {
      localObject = this.zzpj.zzrq.zzED;
      if (localObject != null)
      {
        localObject = this.zzpj;
        i = ((zzs)localObject).zzrL;
        if (i == 0)
        {
          localObject = this.zzpj.zzrq.zzED;
          ((zzjp)localObject).zza(paramAdSizeParcel);
        }
      }
    }
    localObject = this.zzpj.zzrm;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.zzpj.zzrm;
      i = ((zzs.zza)localObject).getChildCount();
      int j = 1;
      if (i > j)
      {
        localObject = this.zzpj.zzrm;
        View localView = this.zzpj.zzrm.getNextView();
        ((zzs.zza)localObject).removeView(localView);
      }
      localObject = this.zzpj.zzrm;
      j = paramAdSizeParcel.widthPixels;
      ((zzs.zza)localObject).setMinimumWidth(j);
      localObject = this.zzpj.zzrm;
      j = paramAdSizeParcel.heightPixels;
      ((zzs.zza)localObject).setMinimumHeight(j);
      localObject = this.zzpj.zzrm;
      ((zzs.zza)localObject).requestLayout();
    }
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zzp paramzzp)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdListener must be called on the main UI thread.");
    this.zzpj.zzrt = paramzzp;
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zzq paramzzq)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdListener must be called on the main UI thread.");
    this.zzpj.zzru = paramzzq;
  }
  
  public void zza(zzw paramzzw)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAppEventListener must be called on the main UI thread.");
    this.zzpj.zzrv = paramzzw;
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zzx paramzzx)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setCorrelationIdProvider must be called on the main UI thread");
    this.zzpj.zzrw = paramzzx;
  }
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setRewardedVideoAdListener can only be called from the UI thread.");
    this.zzpj.zzrF = paramzzd;
  }
  
  protected void zza(RewardItemParcel paramRewardItemParcel)
  {
    com.google.android.gms.ads.internal.reward.client.zzd localzzd = this.zzpj.zzrF;
    if (localzzd == null) {}
    for (;;)
    {
      return;
      String str = "";
      int i = 0;
      localzzd = null;
      if (paramRewardItemParcel != null) {}
      try
      {
        str = paramRewardItemParcel.type;
        i = paramRewardItemParcel.zzKS;
        Object localObject = this.zzpj;
        localObject = ((zzs)localObject).zzrF;
        zzhr localzzhr = new com/google/android/gms/internal/zzhr;
        localzzhr.<init>(str, i);
        ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).zza(localzzhr);
      }
      catch (RemoteException localRemoteException)
      {
        str = "Could not call RewardedVideoAdListener.onRewarded().";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
  
  public void zza(zzcf paramzzcf)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public void zza(zzgd paramzzgd)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setInAppPurchaseListener is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public void zza(zzgh paramzzgh, String paramString)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("setPlayStorePurchaseParams is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public void zza(zzif.zza paramzza)
  {
    long l1 = -1;
    int i = 1;
    Object localObject1 = paramzza.zzLe;
    long l2 = ((AdResponseParcel)localObject1).zzHX;
    boolean bool1 = l2 < l1;
    if (bool1)
    {
      localObject1 = paramzza.zzLe.zzIh;
      bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool1)
      {
        localObject1 = paramzza.zzLe.zzIh;
        l2 = zzp((String)localObject1);
        boolean bool2 = l2 < l1;
        if (bool2)
        {
          localObject2 = this.zzpe;
          long l3 = paramzza.zzLe.zzHX;
          l2 += l3;
          localObject1 = ((zzcb)localObject2).zzb(l2);
          localObject3 = this.zzpe;
          localObject2 = new String[i];
          String str = "stc";
          localObject2[0] = str;
          ((zzcb)localObject3).zza((zzbz)localObject1, (String[])localObject2);
        }
      }
    }
    localObject1 = this.zzpe;
    Object localObject3 = paramzza.zzLe.zzIh;
    ((zzcb)localObject1).zzN((String)localObject3);
    localObject1 = this.zzpe;
    localObject3 = this.zzpf;
    Object localObject2 = new String[i];
    localObject2[0] = "arf";
    ((zzcb)localObject1).zza((zzbz)localObject3, (String[])localObject2);
    localObject1 = this.zzpe.zzdB();
    this.zzpg = ((zzbz)localObject1);
    localObject1 = this.zzpe;
    localObject2 = paramzza.zzLe.zzIi;
    ((zzcb)localObject1).zzc("gqi", (String)localObject2);
    this.zzpj.zzrn = null;
    this.zzpj.zzrr = paramzza;
    localObject1 = this.zzpe;
    zza(paramzza, (zzcb)localObject1);
  }
  
  protected abstract void zza(zzif.zza paramzza, zzcb paramzzcb);
  
  public void zza(HashSet paramHashSet)
  {
    this.zzpj.zza(paramHashSet);
  }
  
  protected abstract boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb);
  
  boolean zza(zzif paramzzif)
  {
    return false;
  }
  
  protected abstract boolean zza(zzif paramzzif1, zzif paramzzif2);
  
  void zzaL()
  {
    long l = -1;
    zzcb localzzcb = new com/google/android/gms/internal/zzcb;
    boolean bool = ((Boolean)zzbt.zzwg.get()).booleanValue();
    String str = this.zzpj.zzrp.zzuh;
    localzzcb.<init>(bool, "load_ad", str);
    this.zzpe = localzzcb;
    zzbz localzzbz = new com/google/android/gms/internal/zzbz;
    localzzbz.<init>(l, null, null);
    this.zzpf = localzzbz;
    localzzbz = new com/google/android/gms/internal/zzbz;
    localzzbz.<init>(l, null, null);
    this.zzpg = localzzbz;
  }
  
  public com.google.android.gms.dynamic.zzd zzaM()
  {
    com.google.android.gms.common.internal.zzx.zzcD("getAdFrame must be called on the main UI thread.");
    return com.google.android.gms.dynamic.zze.zzC(this.zzpj.zzrm);
  }
  
  public AdSizeParcel zzaN()
  {
    com.google.android.gms.common.internal.zzx.zzcD("getAdSize must be called on the main UI thread.");
    Object localObject = this.zzpj.zzrp;
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (AdSizeParcel)localObject;
      localObject = new com/google/android/gms/ads/internal/client/ThinAdSizeParcel;
      AdSizeParcel localAdSizeParcel = this.zzpj.zzrp;
      ((ThinAdSizeParcel)localObject).<init>(localAdSizeParcel);
    }
  }
  
  public void zzaO()
  {
    zzaR();
  }
  
  public void zzaP()
  {
    com.google.android.gms.common.internal.zzx.zzcD("recordManualImpression must be called on the main UI thread.");
    Object localObject = this.zzpj.zzrq;
    if (localObject == null)
    {
      localObject = "Ad state was null when trying to ping manual tracking URLs.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      zzin.zzaI("Pinging manual tracking URLs.");
      localObject = this.zzpj.zzrq.zzHV;
      if (localObject != null)
      {
        localObject = this.zzpj.zzrq;
        boolean bool1 = ((zzif)localObject).zzLc;
        if (!bool1)
        {
          localObject = zzr.zzbC();
          Context localContext = this.zzpj.context;
          String str = this.zzpj.zzrl.afmaVersion;
          List localList = this.zzpj.zzrq.zzHV;
          ((zzir)localObject).zza(localContext, str, localList);
          localObject = this.zzpj.zzrq;
          boolean bool2 = true;
          ((zzif)localObject).zzLc = bool2;
        }
      }
    }
  }
  
  protected void zzaQ()
  {
    zzin.zzaJ("Ad closing.");
    localObject = this.zzpj.zzru;
    if (localObject != null) {}
    try
    {
      localObject = this.zzpj;
      localObject = ((zzs)localObject).zzru;
      ((com.google.android.gms.ads.internal.client.zzq)localObject).onAdClosed();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = this.zzpj;
          localObject = ((zzs)localObject).zzrF;
          ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).onRewardedVideoAdClosed();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().";
          zzin.zzd(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdClosed().";
        zzin.zzd(str, localRemoteException1);
      }
    }
    localObject = this.zzpj.zzrF;
    if (localObject == null) {}
  }
  
  protected void zzaR()
  {
    zzin.zzaJ("Ad leaving application.");
    localObject = this.zzpj.zzru;
    if (localObject != null) {}
    try
    {
      localObject = this.zzpj;
      localObject = ((zzs)localObject).zzru;
      ((com.google.android.gms.ads.internal.client.zzq)localObject).onAdLeftApplication();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = this.zzpj;
          localObject = ((zzs)localObject).zzrF;
          ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).onRewardedVideoAdLeftApplication();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().";
          zzin.zzd(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdLeftApplication().";
        zzin.zzd(str, localRemoteException1);
      }
    }
    localObject = this.zzpj.zzrF;
    if (localObject == null) {}
  }
  
  protected void zzaS()
  {
    zzin.zzaJ("Ad opening.");
    localObject = this.zzpj.zzru;
    if (localObject != null) {}
    try
    {
      localObject = this.zzpj;
      localObject = ((zzs)localObject).zzru;
      ((com.google.android.gms.ads.internal.client.zzq)localObject).onAdOpened();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = this.zzpj;
          localObject = ((zzs)localObject).zzrF;
          ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).onRewardedVideoAdOpened();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().";
          zzin.zzd(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdOpened().";
        zzin.zzd(str, localRemoteException1);
      }
    }
    localObject = this.zzpj.zzrF;
    if (localObject == null) {}
  }
  
  protected void zzaT()
  {
    zzin.zzaJ("Ad finished loading.");
    this.zzph = false;
    localObject = this.zzpj.zzru;
    if (localObject != null) {}
    try
    {
      localObject = this.zzpj;
      localObject = ((zzs)localObject).zzru;
      ((com.google.android.gms.ads.internal.client.zzq)localObject).onAdLoaded();
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = this.zzpj;
          localObject = ((zzs)localObject).zzrF;
          ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).onRewardedVideoAdLoaded();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          String str = "Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().";
          zzin.zzd(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdLoaded().";
        zzin.zzd(str, localRemoteException1);
      }
    }
    localObject = this.zzpj.zzrF;
    if (localObject == null) {}
  }
  
  protected void zzaU()
  {
    Object localObject = this.zzpj.zzrF;
    if (localObject == null) {}
    for (;;)
    {
      return;
      try
      {
        localObject = this.zzpj;
        localObject = ((zzs)localObject).zzrF;
        ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).onRewardedVideoStarted();
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not call RewardedVideoAdListener.onVideoStarted().";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
  
  protected void zzb(View paramView)
  {
    zzs.zza localzza = this.zzpj.zzrm;
    ViewGroup.LayoutParams localLayoutParams = zzr.zzbE().zzhy();
    localzza.addView(paramView, localLayoutParams);
  }
  
  public void zzb(zzif paramzzif)
  {
    int i = 1;
    int j = -2;
    Object localObject1 = this.zzpe;
    Object localObject2 = this.zzpg;
    Object localObject3 = new String[i];
    String str = "awr";
    localObject3[0] = str;
    ((zzcb)localObject1).zza((zzbz)localObject2, (String[])localObject3);
    localObject1 = this.zzpj;
    int k = 0;
    localObject2 = null;
    ((zzs)localObject1).zzro = null;
    int m = paramzzif.errorCode;
    if (m != j)
    {
      m = paramzzif.errorCode;
      k = 3;
      if (m != k)
      {
        localObject1 = zzr.zzbF();
        localObject2 = this.zzpj.zzbS();
        ((zzih)localObject1).zzb((HashSet)localObject2);
      }
    }
    m = paramzzif.errorCode;
    k = -1;
    if (m == k) {
      this.zzph = false;
    }
    do
    {
      for (;;)
      {
        return;
        boolean bool1 = zza(paramzzif);
        if (bool1)
        {
          localObject1 = "Ad refresh scheduled.";
          zzin.zzaI((String)localObject1);
        }
        int n = paramzzif.errorCode;
        if (n == j) {
          break;
        }
        n = paramzzif.errorCode;
        zzf(n);
      }
      localObject1 = this.zzpj.zzrJ;
      if (localObject1 == null)
      {
        localObject1 = this.zzpj;
        localObject2 = new com/google/android/gms/internal/zzik;
        localObject3 = this.zzpj.zzrj;
        ((zzik)localObject2).<init>((String)localObject3);
        ((zzs)localObject1).zzrJ = ((zzik)localObject2);
      }
      localObject1 = this.zzpl;
      localObject2 = this.zzpj.zzrq;
      ((zzax)localObject1).zzi((zzif)localObject2);
      localObject1 = this.zzpj.zzrq;
      bool2 = zza((zzif)localObject1, paramzzif);
    } while (!bool2);
    this.zzpj.zzrq = paramzzif;
    this.zzpj.zzcb();
    localObject2 = this.zzpe;
    localObject3 = "is_mraid";
    localObject1 = this.zzpj.zzrq;
    boolean bool2 = ((zzif)localObject1).zzcv();
    if (bool2)
    {
      localObject1 = "1";
      label327:
      ((zzcb)localObject2).zzc((String)localObject3, (String)localObject1);
      localObject2 = this.zzpe;
      localObject3 = "is_mediation";
      localObject1 = this.zzpj.zzrq;
      bool2 = ((zzif)localObject1).zzHT;
      if (!bool2) {
        break label582;
      }
      localObject1 = "1";
      label373:
      ((zzcb)localObject2).zzc((String)localObject3, (String)localObject1);
      localObject1 = this.zzpj.zzrq.zzED;
      if (localObject1 != null)
      {
        localObject1 = this.zzpj.zzrq.zzED.zzhU();
        if (localObject1 != null)
        {
          localObject2 = this.zzpe;
          localObject3 = "is_video";
          localObject1 = this.zzpj.zzrq.zzED.zzhU();
          bool2 = ((zzjq)localObject1).zzih();
          if (!bool2) {
            break label590;
          }
        }
      }
    }
    label582:
    label590:
    for (localObject1 = "1";; localObject1 = "0")
    {
      ((zzcb)localObject2).zzc((String)localObject3, (String)localObject1);
      localObject1 = this.zzpe;
      localObject2 = this.zzpf;
      localObject3 = new String[i];
      str = "ttc";
      localObject3[0] = str;
      ((zzcb)localObject1).zza((zzbz)localObject2, (String[])localObject3);
      localObject1 = zzr.zzbF().zzhb();
      if (localObject1 != null)
      {
        localObject1 = zzr.zzbF().zzhb();
        localObject2 = this.zzpe;
        ((zzbv)localObject1).zza((zzcb)localObject2);
      }
      localObject1 = this.zzpj;
      bool2 = ((zzs)localObject1).zzbW();
      if (!bool2) {
        break;
      }
      zzaT();
      break;
      localObject1 = "0";
      break label327;
      localObject1 = "0";
      break label373;
    }
  }
  
  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    com.google.android.gms.common.internal.zzx.zzcD("loadAd must be called on the main UI thread.");
    AdRequestParcel localAdRequestParcel = zza(paramAdRequestParcel);
    Object localObject1 = this.zzpj.zzrn;
    boolean bool1;
    if (localObject1 == null)
    {
      localObject1 = this.zzpj.zzro;
      if (localObject1 == null) {}
    }
    else
    {
      localObject1 = this.zzpk;
      if (localObject1 != null)
      {
        localObject1 = "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.";
        zzin.zzaK((String)localObject1);
        this.zzpk = localAdRequestParcel;
        bool1 = false;
        localAdRequestParcel = null;
      }
    }
    for (;;)
    {
      return bool1;
      localObject1 = "Loading already in progress, saving this object for future refreshes.";
      zzin.zzaK((String)localObject1);
      break;
      zzin.zzaJ("Starting ad request.");
      zzaL();
      localObject1 = this.zzpe.zzdB();
      this.zzpf = ((zzbz)localObject1);
      boolean bool2 = localAdRequestParcel.zztF;
      if (!bool2)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Use AdRequest.Builder.addTestDevice(\"");
        Object localObject2 = zzn.zzcS();
        Context localContext = this.zzpj.context;
        localObject2 = ((com.google.android.gms.ads.internal.util.client.zza)localObject2).zzT(localContext);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = "\") to get test ads on this device.";
        localObject1 = (String)localObject2;
        zzin.zzaJ((String)localObject1);
      }
      localObject1 = this.zzpe;
      bool1 = zza(localAdRequestParcel, (zzcb)localObject1);
      this.zzph = bool1;
      bool1 = this.zzph;
    }
  }
  
  protected void zzc(zzif paramzzif)
  {
    Object localObject;
    if (paramzzif == null)
    {
      localObject = "Ad state was null when trying to ping impression URLs.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      zzin.zzaI("Pinging Impression URLs.");
      this.zzpj.zzrs.zzgS();
      localObject = paramzzif.zzBR;
      if (localObject != null)
      {
        boolean bool = paramzzif.zzLb;
        if (!bool)
        {
          localObject = zzr.zzbC();
          Context localContext = this.zzpj.context;
          String str = this.zzpj.zzrl.afmaVersion;
          List localList = paramzzif.zzBR;
          ((zzir)localObject).zza(localContext, str, localList);
          bool = true;
          paramzzif.zzLb = bool;
        }
      }
    }
  }
  
  protected boolean zzc(AdRequestParcel paramAdRequestParcel)
  {
    Object localObject = this.zzpj.zzrm.getParent();
    boolean bool1 = localObject instanceof View;
    boolean bool2;
    if (bool1)
    {
      localObject = (View)localObject;
      bool2 = ((View)localObject).isShown();
      if (bool2)
      {
        localObject = zzr.zzbC();
        bool2 = ((zzir)localObject).zzhq();
        if (bool2) {
          bool2 = true;
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public void zzd(AdRequestParcel paramAdRequestParcel)
  {
    boolean bool = zzc(paramAdRequestParcel);
    if (bool) {
      zzb(paramAdRequestParcel);
    }
    for (;;)
    {
      return;
      zzin.zzaJ("Ad is not visible. Not refreshing ad.");
      zzq localzzq = this.zzpi;
      localzzq.zzg(paramAdRequestParcel);
    }
  }
  
  protected void zzf(int paramInt)
  {
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = "Failed to load ad: ";
    zzin.zzaK(str + paramInt);
    this.zzph = false;
    localObject = this.zzpj.zzru;
    if (localObject != null) {}
    try
    {
      localObject = this.zzpj;
      localObject = ((zzs)localObject).zzru;
      ((com.google.android.gms.ads.internal.client.zzq)localObject).onAdFailedToLoad(paramInt);
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          localObject = this.zzpj;
          localObject = ((zzs)localObject).zzrF;
          ((com.google.android.gms.ads.internal.reward.client.zzd)localObject).onRewardedVideoAdFailedToLoad(paramInt);
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          str = "Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().";
          zzin.zzd(str, localRemoteException2);
          continue;
        }
        localRemoteException1 = localRemoteException1;
        str = "Could not call AdListener.onAdFailedToLoad().";
        zzin.zzd(str, localRemoteException1);
      }
    }
    localObject = this.zzpj.zzrF;
    if (localObject == null) {}
  }
  
  long zzp(String paramString)
  {
    String str1 = "ufe";
    int i = paramString.indexOf(str1);
    int j = paramString.indexOf(',', i);
    int k = -1;
    if (j == k) {
      j = paramString.length();
    }
    i += 4;
    try
    {
      str1 = paramString.substring(i, j);
      l = Long.parseLong(str1);
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      for (;;)
      {
        String str2 = "Invalid index for Url fetch time in CSI latency info.";
        zzin.zzaK(str2);
        long l = -1;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str3 = "Cannot find valid format of Url fetch time in CSI latency info.";
        zzin.zzaK(str3);
      }
    }
    return l;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */