package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.h.m;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzf;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbf;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzen;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzeq;
import com.google.android.gms.internal.zzet;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgg;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class zzb
  extends zza
  implements com.google.android.gms.ads.internal.overlay.zzg, zzj, zzdh, zzep
{
  private final Messenger mMessenger;
  protected final zzex zzpn;
  protected transient boolean zzpo;
  
  public zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    this(localzzs, paramzzex, null, paramzzd);
  }
  
  zzb(zzs paramzzs, zzex paramzzex, zzq paramzzq, zzd paramzzd)
  {
    super(paramzzs, paramzzq, paramzzd);
    this.zzpn = paramzzex;
    Messenger localMessenger = new android/os/Messenger;
    zzga localzzga = new com/google/android/gms/internal/zzga;
    Context localContext = this.zzpj.context;
    localzzga.<init>(localContext);
    localMessenger.<init>(localzzga);
    this.mMessenger = localMessenger;
    this.zzpo = false;
  }
  
  private AdRequestInfoParcel.zza zza(AdRequestParcel paramAdRequestParcel, Bundle paramBundle)
  {
    Object localObject1 = this;
    Object localObject2 = this.zzpj.context;
    ApplicationInfo localApplicationInfo = ((Context)localObject2).getApplicationInfo();
    PackageInfo localPackageInfo;
    try
    {
      localObject2 = this.zzpj;
      localObject2 = ((zzs)localObject2).context;
      localObject2 = ((Context)localObject2).getPackageManager();
      localObject4 = localApplicationInfo.packageName;
      i = 0;
      localObject5 = null;
      localPackageInfo = ((PackageManager)localObject2).getPackageInfo((String)localObject4, 0);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool1;
        int n;
        int i1;
        int i2;
        int i3;
        int k;
        int m;
        int i5;
        localPackageInfo = null;
      }
    }
    localObject1 = this;
    DisplayMetrics localDisplayMetrics = this.zzpj.context.getResources().getDisplayMetrics();
    bool1 = false;
    Object localObject4 = null;
    localObject2 = this.zzpj.zzrm;
    String str1;
    if (localObject2 != null)
    {
      localObject2 = this.zzpj.zzrm.getParent();
      if (localObject2 != null)
      {
        localObject2 = new int[2];
        this.zzpj.zzrm.getLocationOnScreen((int[])localObject2);
        i = localObject2[0];
        n = localObject2[1];
        i1 = this.zzpj.zzrm.getWidth();
        i2 = this.zzpj.zzrm.getHeight();
        i3 = 0;
        localObject2 = null;
        localObject4 = this.zzpj.zzrm;
        bool1 = ((zzs.zza)localObject4).isShown();
        if (bool1)
        {
          k = i + i1;
          if (k > 0)
          {
            k = n + i2;
            if (k > 0)
            {
              localObject1 = localDisplayMetrics;
              k = localDisplayMetrics.widthPixels;
              if (i <= k)
              {
                m = localDisplayMetrics.heightPixels;
                if (n <= m) {
                  i3 = 1;
                }
              }
            }
          }
        }
        localObject4 = new android/os/Bundle;
        i5 = 5;
        ((Bundle)localObject4).<init>(i5);
        str1 = "x";
        ((Bundle)localObject4).putInt(str1, i);
        ((Bundle)localObject4).putInt("y", n);
        ((Bundle)localObject4).putInt("width", i1);
        ((Bundle)localObject4).putInt("height", i2);
        localObject5 = "visible";
        ((Bundle)localObject4).putInt((String)localObject5, i3);
      }
    }
    String str2 = zzr.zzbF().zzgZ();
    localObject1 = this;
    localObject2 = this.zzpj;
    Object localObject5 = new com/google/android/gms/internal/zzig;
    Object localObject6 = this.zzpj.zzrj;
    ((zzig)localObject5).<init>(str2, (String)localObject6);
    ((zzs)localObject2).zzrs = ((zzig)localObject5);
    localObject2 = this.zzpj.zzrs;
    localObject1 = paramAdRequestParcel;
    ((zzig)localObject2).zzk(paramAdRequestParcel);
    localObject2 = zzr.zzbC();
    localObject1 = this;
    localObject5 = this.zzpj.context;
    localObject6 = this.zzpj.zzrm;
    Object localObject7 = this.zzpj.zzrp;
    String str3 = ((zzir)localObject2).zza((Context)localObject5, (View)localObject6, (AdSizeParcel)localObject7);
    long l = 0L;
    localObject2 = this.zzpj.zzrw;
    if (localObject2 != null) {}
    try
    {
      localObject2 = this.zzpj;
      localObject2 = ((zzs)localObject2).zzrw;
      l = ((com.google.android.gms.ads.internal.client.zzx)localObject2).getValue();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        localObject3 = "Cannot get correlation id, default to 0.";
        zzin.zzaK((String)localObject3);
      }
      localObject3 = this.zzpj.zzrx;
      if (localObject3 == null) {
        break label957;
      }
    }
    String str4 = UUID.randomUUID().toString();
    localObject2 = zzr.zzbF();
    localObject1 = this;
    localObject5 = this.zzpj.context;
    Bundle localBundle = ((zzih)localObject2).zza((Context)localObject5, this, str2);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    i3 = 0;
    localObject2 = null;
    for (;;)
    {
      localObject1 = this;
      localObject5 = this.zzpj.zzrC;
      i = ((m)localObject5).size();
      if (i3 >= i) {
        break;
      }
      localObject5 = this.zzpj.zzrC.keyAt(i3);
      localArrayList.add(localObject5);
      i3 += 1;
    }
    int i4 = 1;
    int i = i4;
    localObject1 = this;
    Object localObject3 = this.zzpj.zzry;
    boolean bool2;
    boolean bool3;
    if (localObject3 != null)
    {
      localObject3 = zzr.zzbF();
      bool2 = ((zzih)localObject3).zzhj();
      if (bool2)
      {
        bool2 = true;
        bool3 = bool2;
      }
    }
    for (;;)
    {
      localObject1 = this;
      boolean bool4 = this.zzpm.zzpy.zzfM();
      localObject3 = new com/google/android/gms/ads/internal/request/AdRequestInfoParcel$zza;
      localObject6 = this.zzpj.zzrp;
      localObject7 = this.zzpj.zzrj;
      str1 = zzr.zzbF().getSessionId();
      VersionInfoParcel localVersionInfoParcel = this.zzpj.zzrl;
      List localList1 = this.zzpj.zzrH;
      boolean bool5 = zzr.zzbF().zzhd();
      Messenger localMessenger = this.mMessenger;
      localObject1 = localDisplayMetrics;
      int i6 = localDisplayMetrics.widthPixels;
      int i7 = localDisplayMetrics.heightPixels;
      float f1 = localDisplayMetrics.density;
      List localList2 = zzbt.zzdr();
      localObject1 = this;
      localObject1 = this.zzpj;
      Object localObject8 = localObject1;
      localObject8 = ((zzs)localObject1).zzri;
      localObject1 = this;
      localObject1 = this.zzpj;
      Object localObject9 = localObject1;
      localObject9 = ((zzs)localObject1).zzrD;
      CapabilityParcel localCapabilityParcel = new com/google/android/gms/ads/internal/request/CapabilityParcel;
      localObject1 = localCapabilityParcel;
      localCapabilityParcel.<init>(i, bool3, bool4);
      localObject1 = this;
      String str5 = this.zzpj.zzca();
      float f2 = zzr.zzbC().zzbt();
      localObject5 = zzr.zzbC();
      Object localObject10 = this.zzpj.context;
      int i8 = ((zzir)localObject5).zzR((Context)localObject10);
      localObject5 = zzr.zzbC();
      localObject10 = this.zzpj.zzrm;
      int i9 = ((zzir)localObject5).zzl((View)localObject10);
      localObject5 = paramAdRequestParcel;
      localObject10 = paramBundle;
      ((AdRequestInfoParcel.zza)localObject3).<init>((Bundle)localObject4, paramAdRequestParcel, (AdSizeParcel)localObject6, (String)localObject7, localApplicationInfo, localPackageInfo, str2, str1, localVersionInfoParcel, localBundle, localList1, localArrayList, paramBundle, bool5, localMessenger, i6, i7, f1, str3, l, str4, localList2, (String)localObject8, (NativeAdOptionsParcel)localObject9, localCapabilityParcel, str5, f2, i8, i9);
      return (AdRequestInfoParcel.zza)localObject3;
      label957:
      bool2 = false;
      localObject3 = null;
      int j = 0;
      localObject5 = null;
      break;
      bool2 = false;
      localObject3 = null;
      bool3 = false;
      localObject10 = null;
    }
  }
  
  public String getMediationAdapterClassName()
  {
    Object localObject = this.zzpj.zzrq;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzpj.zzrq.zzCr) {
      return (String)localObject;
    }
  }
  
  public void onAdClicked()
  {
    Object localObject = this.zzpj.zzrq;
    if (localObject == null)
    {
      localObject = "Ad state was null when trying to ping click URLs.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.zzpj.zzrq.zzKV;
      Context localContext;
      String str1;
      zzif localzzif;
      String str2;
      List localList;
      if (localObject != null)
      {
        localObject = this.zzpj.zzrq.zzKV.zzBQ;
        if (localObject != null)
        {
          localObject = zzr.zzbP();
          localContext = this.zzpj.context;
          str1 = this.zzpj.zzrl.afmaVersion;
          localzzif = this.zzpj.zzrq;
          str2 = this.zzpj.zzrj;
          localList = this.zzpj.zzrq.zzKV.zzBQ;
          ((zzet)localObject).zza(localContext, str1, localzzif, str2, false, localList);
        }
      }
      localObject = this.zzpj.zzrq.zzCp;
      if (localObject != null)
      {
        localObject = this.zzpj.zzrq.zzCp.zzBE;
        if (localObject != null)
        {
          localObject = zzr.zzbP();
          localContext = this.zzpj.context;
          str1 = this.zzpj.zzrl.afmaVersion;
          localzzif = this.zzpj.zzrq;
          str2 = this.zzpj.zzrj;
          localList = this.zzpj.zzrq.zzCp.zzBE;
          ((zzet)localObject).zza(localContext, str1, localzzif, str2, false, localList);
        }
      }
      super.onAdClicked();
    }
  }
  
  public void onPause()
  {
    zzax localzzax = this.zzpl;
    zzif localzzif = this.zzpj.zzrq;
    localzzax.zzk(localzzif);
  }
  
  public void onResume()
  {
    zzax localzzax = this.zzpl;
    zzif localzzif = this.zzpj.zzrq;
    localzzax.zzl(localzzif);
  }
  
  public void pause()
  {
    com.google.android.gms.common.internal.zzx.zzcD("pause must be called on the main UI thread.");
    Object localObject1 = this.zzpj.zzrq;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj.zzrq.zzED;
      if (localObject1 != null)
      {
        localObject1 = this.zzpj;
        boolean bool = ((zzs)localObject1).zzbW();
        if (bool)
        {
          localObject1 = zzr.zzbE();
          localObject2 = this.zzpj.zzrq.zzED;
          ((zzis)localObject1).zzi((zzjp)localObject2);
        }
      }
    }
    localObject1 = this.zzpj.zzrq;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj.zzrq.zzCq;
      if (localObject1 == null) {}
    }
    try
    {
      localObject1 = this.zzpj;
      localObject1 = ((zzs)localObject1).zzrq;
      localObject1 = ((zzif)localObject1).zzCq;
      ((zzey)localObject1).pause();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not pause mediation adapter.";
        zzin.zzaK(str);
      }
    }
    localObject1 = this.zzpl;
    Object localObject2 = this.zzpj.zzrq;
    ((zzax)localObject1).zzk((zzif)localObject2);
    this.zzpi.pause();
  }
  
  public void recordImpression()
  {
    zzif localzzif = this.zzpj.zzrq;
    zza(localzzif, false);
  }
  
  public void resume()
  {
    com.google.android.gms.common.internal.zzx.zzcD("resume must be called on the main UI thread.");
    Object localObject1 = this.zzpj.zzrq;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj.zzrq.zzED;
      if (localObject1 != null)
      {
        localObject1 = this.zzpj;
        boolean bool = ((zzs)localObject1).zzbW();
        if (bool)
        {
          localObject1 = zzr.zzbE();
          localObject2 = this.zzpj.zzrq.zzED;
          ((zzis)localObject1).zzj((zzjp)localObject2);
        }
      }
    }
    localObject1 = this.zzpj.zzrq;
    if (localObject1 != null)
    {
      localObject1 = this.zzpj.zzrq.zzCq;
      if (localObject1 == null) {}
    }
    try
    {
      localObject1 = this.zzpj;
      localObject1 = ((zzs)localObject1).zzrq;
      localObject1 = ((zzif)localObject1).zzCq;
      ((zzey)localObject1).resume();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not resume mediation adapter.";
        zzin.zzaK(str);
      }
    }
    this.zzpi.resume();
    localObject1 = this.zzpl;
    Object localObject2 = this.zzpj.zzrq;
    ((zzax)localObject1).zzl((zzif)localObject2);
  }
  
  public void showInterstitial()
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("showInterstitial is not supported for current ad type");
    throw localIllegalStateException;
  }
  
  public void zza(zzgd paramzzgd)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setInAppPurchaseListener must be called on the main UI thread.");
    this.zzpj.zzrx = paramzzgd;
  }
  
  public void zza(zzgh paramzzgh, String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setPlayStorePurchaseParams must be called on the main UI thread.");
    Object localObject1 = this.zzpj;
    Object localObject2 = new com/google/android/gms/ads/internal/purchase/zzk;
    ((zzk)localObject2).<init>(paramString);
    ((zzs)localObject1).zzrI = ((zzk)localObject2);
    this.zzpj.zzry = paramzzgh;
    localObject1 = zzr.zzbF();
    boolean bool = ((zzih)localObject1).zzhc();
    if ((!bool) && (paramzzgh != null))
    {
      localObject1 = new com/google/android/gms/ads/internal/purchase/zzc;
      localObject2 = this.zzpj.context;
      zzgh localzzgh = this.zzpj.zzry;
      zzk localzzk = this.zzpj.zzrI;
      ((zzc)localObject1).<init>((Context)localObject2, localzzgh, localzzk);
      ((zzc)localObject1).zzhn();
    }
  }
  
  protected void zza(zzif paramzzif, boolean paramBoolean)
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
      super.zzc(paramzzif);
      localObject = paramzzif.zzKV;
      Context localContext;
      String str1;
      String str2;
      List localList;
      if (localObject != null)
      {
        localObject = paramzzif.zzKV.zzBR;
        if (localObject != null)
        {
          localObject = zzr.zzbP();
          localContext = this.zzpj.context;
          str1 = this.zzpj.zzrl.afmaVersion;
          str2 = this.zzpj.zzrj;
          localList = paramzzif.zzKV.zzBR;
          ((zzet)localObject).zza(localContext, str1, paramzzif, str2, paramBoolean, localList);
        }
      }
      localObject = paramzzif.zzCp;
      if (localObject != null)
      {
        localObject = paramzzif.zzCp.zzBF;
        if (localObject != null)
        {
          localObject = zzr.zzbP();
          localContext = this.zzpj.context;
          str1 = this.zzpj.zzrl.afmaVersion;
          str2 = this.zzpj.zzrj;
          localList = paramzzif.zzCp.zzBF;
          ((zzet)localObject).zza(localContext, str1, paramzzif, str2, paramBoolean, localList);
        }
      }
    }
  }
  
  public void zza(String paramString, ArrayList paramArrayList)
  {
    boolean bool1 = false;
    VersionInfoParcel localVersionInfoParcel = null;
    Object localObject1 = new com/google/android/gms/ads/internal/purchase/zzd;
    Object localObject2 = this.zzpj.context;
    Object localObject3 = this.zzpj.zzrl.afmaVersion;
    ((com.google.android.gms.ads.internal.purchase.zzd)localObject1).<init>(paramString, paramArrayList, (Context)localObject2, (String)localObject3);
    localObject2 = this.zzpj.zzrx;
    boolean bool2;
    if (localObject2 == null)
    {
      zzin.zzaK("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      localObject2 = zzn.zzcS();
      localObject3 = this.zzpj.context;
      bool2 = ((com.google.android.gms.ads.internal.util.client.zza)localObject2).zzU((Context)localObject3);
      if (!bool2)
      {
        localObject1 = "Google Play Service unavailable, cannot launch default purchase flow.";
        zzin.zzaK((String)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.zzpj.zzry;
      if (localObject2 == null)
      {
        localObject1 = "PlayStorePurchaseListener is not set.";
        zzin.zzaK((String)localObject1);
      }
      else
      {
        localObject2 = this.zzpj.zzrI;
        if (localObject2 == null)
        {
          localObject1 = "PlayStorePurchaseVerifier is not initialized.";
          zzin.zzaK((String)localObject1);
        }
        else
        {
          localObject2 = this.zzpj;
          bool2 = ((zzs)localObject2).zzrM;
          if (bool2)
          {
            localObject1 = "An in-app purchase request is already in progress, abort";
            zzin.zzaK((String)localObject1);
          }
          else
          {
            localObject2 = this.zzpj;
            boolean bool3 = true;
            ((zzs)localObject2).zzrM = bool3;
            zzs localzzs;
            try
            {
              localObject2 = this.zzpj;
              localObject2 = ((zzs)localObject2).zzry;
              bool2 = ((zzgh)localObject2).isValidPurchase(paramString);
              if (bool2) {
                break label274;
              }
              localObject1 = this.zzpj;
              bool2 = false;
              localObject2 = null;
              ((zzs)localObject1).zzrM = false;
            }
            catch (RemoteException localRemoteException1)
            {
              zzin.zzaK("Could not start In-App purchase.");
              localzzs = this.zzpj;
              localzzs.zzrM = false;
            }
            continue;
            label274:
            localObject2 = zzr.zzbM();
            localObject3 = this.zzpj.context;
            localVersionInfoParcel = this.zzpj.zzrl;
            bool1 = localVersionInfoParcel.zzNb;
            GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = new com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;
            Context localContext = this.zzpj.context;
            zzk localzzk = this.zzpj.zzrI;
            localGInAppPurchaseManagerInfoParcel.<init>(localContext, localzzk, localzzs, this);
            ((zzi)localObject2).zza((Context)localObject3, bool1, localGInAppPurchaseManagerInfoParcel);
            continue;
            try
            {
              localObject2 = this.zzpj;
              localObject2 = ((zzs)localObject2).zzrx;
              ((zzgd)localObject2).zza(localzzs);
            }
            catch (RemoteException localRemoteException2)
            {
              String str = "Could not start In-App purchase.";
              zzin.zzaK(str);
            }
          }
        }
      }
    }
  }
  
  public void zza(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, zzf paramzzf)
  {
    try
    {
      localObject1 = this.zzpj;
      localObject1 = ((zzs)localObject1).zzry;
      if (localObject1 != null)
      {
        localObject1 = this.zzpj;
        zzgh localzzgh = ((zzs)localObject1).zzry;
        localObject1 = new com/google/android/gms/ads/internal/purchase/zzg;
        localObject2 = this.zzpj;
        localObject2 = ((zzs)localObject2).context;
        ((com.google.android.gms.ads.internal.purchase.zzg)localObject1).<init>((Context)localObject2, paramString, paramBoolean, paramInt, paramIntent, paramzzf);
        localzzgh.zza((zzgg)localObject1);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        String str = "Fail to invoke PlayStorePurchaseListener.";
        zzin.zzaK(str);
      }
    }
    localObject1 = zzir.zzMc;
    localObject2 = new com/google/android/gms/ads/internal/zzb$1;
    ((zzb.1)localObject2).<init>(this, paramIntent);
    ((Handler)localObject1).postDelayed((Runnable)localObject2, 500L);
  }
  
  public boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = zzaV();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject2 = zzr.zzbF();
      Object localObject3 = this.zzpj.context;
      localObject2 = ((zzih)localObject2).zzG((Context)localObject3);
      localObject2 = zza((zzbf)localObject2);
      this.zzpi.cancel();
      this.zzpj.zzrL = 0;
      localObject1 = zza(paramAdRequestParcel, (Bundle)localObject2);
      localObject3 = ((AdRequestInfoParcel.zza)localObject1).zzHw;
      paramzzcb.zzc("seq_num", (String)localObject3);
      localObject3 = ((AdRequestInfoParcel.zza)localObject1).zzHI;
      paramzzcb.zzc("request_id", (String)localObject3);
      localObject3 = ((AdRequestInfoParcel.zza)localObject1).zzHx;
      paramzzcb.zzc("session_id", (String)localObject3);
      localObject2 = ((AdRequestInfoParcel.zza)localObject1).zzHu;
      if (localObject2 != null)
      {
        localObject2 = "app_version";
        int i = ((AdRequestInfoParcel.zza)localObject1).zzHu.versionCode;
        localObject3 = String.valueOf(i);
        paramzzcb.zzc((String)localObject2, (String)localObject3);
      }
      localObject2 = this.zzpj;
      localObject3 = zzr.zzby();
      Context localContext = this.zzpj.context;
      zzan localzzan = this.zzpj.zzrk;
      localObject1 = ((com.google.android.gms.ads.internal.request.zza)localObject3).zza(localContext, (AdRequestInfoParcel.zza)localObject1, localzzan, this);
      ((zzs)localObject2).zzrn = ((zzim)localObject1);
      bool1 = true;
    }
  }
  
  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    long l1 = 0L;
    Object localObject;
    boolean bool;
    long l2;
    if (!paramBoolean)
    {
      localObject = this.zzpj;
      bool = ((zzs)localObject).zzbW();
      if (bool)
      {
        l2 = paramzzif.zzBU;
        bool = l2 < l1;
        if (!bool) {
          break label71;
        }
        localObject = this.zzpi;
        l1 = paramzzif.zzBU;
        ((zzq)localObject).zza(paramAdRequestParcel, l1);
      }
    }
    for (;;)
    {
      return this.zzpi.zzbw();
      label71:
      localObject = paramzzif.zzKV;
      if (localObject != null)
      {
        localObject = paramzzif.zzKV;
        l2 = ((zzeo)localObject).zzBU;
        bool = l2 < l1;
        if (bool)
        {
          localObject = this.zzpi;
          zzeo localzzeo = paramzzif.zzKV;
          l1 = localzzeo.zzBU;
          ((zzq)localObject).zza(paramAdRequestParcel, l1);
          continue;
        }
      }
      bool = paramzzif.zzHT;
      if (!bool)
      {
        int i = paramzzif.errorCode;
        int j = 2;
        if (i == j)
        {
          localObject = this.zzpi;
          ((zzq)localObject).zzg(paramAdRequestParcel);
        }
      }
    }
  }
  
  boolean zza(zzif paramzzif)
  {
    boolean bool = false;
    AdRequestParcel localAdRequestParcel = this.zzpk;
    Bundle localBundle;
    if (localAdRequestParcel != null)
    {
      localAdRequestParcel = this.zzpk;
      localBundle = null;
      this.zzpk = null;
    }
    for (;;)
    {
      return zza(localAdRequestParcel, paramzzif, bool);
      localAdRequestParcel = paramzzif.zzHt;
      localBundle = localAdRequestParcel.extras;
      if (localBundle != null)
      {
        localBundle = localAdRequestParcel.extras;
        String str = "_noRefresh";
        bool = localBundle.getBoolean(str, false);
      }
    }
  }
  
  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    int i = 0;
    zzeo localzzeo = null;
    if (paramzzif1 != null)
    {
      localObject = paramzzif1.zzCs;
      if (localObject != null)
      {
        localObject = paramzzif1.zzCs;
        ((zzeq)localObject).zza(null);
      }
    }
    Object localObject = paramzzif2.zzCs;
    if (localObject != null)
    {
      localObject = paramzzif2.zzCs;
      ((zzeq)localObject).zza(this);
    }
    localObject = paramzzif2.zzKV;
    int j;
    if (localObject != null)
    {
      j = paramzzif2.zzKV.zzBZ;
      localzzeo = paramzzif2.zzKV;
      i = localzzeo.zzCa;
    }
    for (;;)
    {
      this.zzpj.zzrJ.zzg(j, i);
      return true;
      j = 0;
      localObject = null;
    }
  }
  
  protected boolean zzaV()
  {
    boolean bool1 = true;
    zzir localzzir = zzr.zzbC();
    Object localObject = this.zzpj.context.getPackageManager();
    String str1 = this.zzpj.context.getPackageName();
    String str2 = "android.permission.INTERNET";
    boolean bool2 = localzzir.zza((PackageManager)localObject, str1, str2);
    if (bool2)
    {
      localzzir = zzr.zzbC();
      localObject = this.zzpj.context;
      bool2 = localzzir.zzI((Context)localObject);
      if (bool2) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public void zzaW()
  {
    zzax localzzax = this.zzpl;
    zzif localzzif = this.zzpj.zzrq;
    localzzax.zzi(localzzif);
    this.zzpo = false;
    zzaQ();
    this.zzpj.zzrs.zzgU();
  }
  
  public void zzaX()
  {
    this.zzpo = true;
    zzaS();
  }
  
  public void zzaY()
  {
    onAdClicked();
  }
  
  public void zzaZ()
  {
    zzaW();
  }
  
  public void zzb(zzif paramzzif)
  {
    super.zzb(paramzzif);
    int i = paramzzif.errorCode;
    int j = 3;
    if (i == j)
    {
      Object localObject = paramzzif.zzKV;
      if (localObject != null)
      {
        localObject = paramzzif.zzKV.zzBS;
        if (localObject != null)
        {
          zzin.zzaI("Pinging no fill URLs.");
          localObject = zzr.zzbP();
          Context localContext = this.zzpj.context;
          String str1 = this.zzpj.zzrl.afmaVersion;
          String str2 = this.zzpj.zzrj;
          List localList = paramzzif.zzKV.zzBS;
          ((zzet)localObject).zza(localContext, str1, paramzzif, str2, false, localList);
        }
      }
    }
  }
  
  public void zzba()
  {
    zzaO();
  }
  
  public void zzbb()
  {
    zzaX();
  }
  
  public void zzbc()
  {
    Object localObject = this.zzpj.zzrq;
    if (localObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Mediation adapter ");
      String str = this.zzpj.zzrq.zzCr;
      localObject = ((StringBuilder)localObject).append(str);
      str = " refreshed, but mediation adapters should never refresh.";
      localObject = str;
      zzin.zzaK((String)localObject);
    }
    localObject = this.zzpj.zzrq;
    zza((zzif)localObject, true);
    zzaT();
  }
  
  protected boolean zzc(AdRequestParcel paramAdRequestParcel)
  {
    boolean bool = super.zzc(paramAdRequestParcel);
    if (bool)
    {
      bool = this.zzpo;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */