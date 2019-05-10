package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class zzfe
  extends zzey.zza
{
  private final MediationAdapter zzCI;
  private zzff zzCJ;
  
  public zzfe(MediationAdapter paramMediationAdapter)
  {
    this.zzCI = paramMediationAdapter;
  }
  
  private Bundle zza(String paramString1, int paramInt, String paramString2)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject3 = "Server parameters: ";
    localObject1 = (String)localObject3 + paramString1;
    com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject1);
    Object localObject2;
    try
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      if (paramString1 != null)
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString1);
        localObject3 = new android/os/Bundle;
        ((Bundle)localObject3).<init>();
        Iterator localIterator = localJSONObject.keys();
        for (;;)
        {
          boolean bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (String)localObject1;
          String str = localJSONObject.getString((String)localObject1);
          ((Bundle)localObject3).putString((String)localObject1, str);
        }
        localObject2 = localObject3;
      }
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get Server Parameters Bundle.", localThrowable);
      localObject2 = new android/os/RemoteException;
      ((RemoteException)localObject2).<init>();
    }
    localObject3 = this.zzCI;
    boolean bool2 = localObject3 instanceof AdMobAdapter;
    if (bool2)
    {
      localObject3 = "adJson";
      ((Bundle)localObject2).putString((String)localObject3, paramString2);
      localObject3 = "tagForChildDirectedTreatment";
      ((Bundle)localObject2).putInt((String)localObject3, paramInt);
    }
    return (Bundle)localObject2;
  }
  
  public void destroy()
  {
    RemoteException localRemoteException;
    try
    {
      MediationAdapter localMediationAdapter = this.zzCI;
      localMediationAdapter.onDestroy();
      return;
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not destroy adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    Object localObject = this.zzCI;
    boolean bool = localObject instanceof zzka;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a v2 MediationInterstitialAdapter: ");
      String str = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK(str);
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
    }
    for (;;)
    {
      return (Bundle)localObject;
      localObject = ((zzka)this.zzCI).getInterstitialAdapterInfo();
    }
  }
  
  public zzd getView()
  {
    Object localObject = this.zzCI;
    boolean bool = localObject instanceof MediationBannerAdapter;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a MediationBannerAdapter: ");
      String str = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK(str);
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    RemoteException localRemoteException;
    try
    {
      localObject = this.zzCI;
      localObject = (MediationBannerAdapter)localObject;
      localObject = ((MediationBannerAdapter)localObject).getBannerView();
      return zze.zzC(localObject);
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get banner view from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public boolean isInitialized()
  {
    Object localObject = this.zzCI;
    boolean bool = localObject instanceof MediationRewardedVideoAdAdapter;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ");
      String str = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK(str);
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = "Check if adapter is initialized.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = this.zzCI;
      localObject = (MediationRewardedVideoAdAdapter)localObject;
      return ((MediationRewardedVideoAdAdapter)localObject).isInitialized();
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not check if adapter is initialized.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void pause()
  {
    RemoteException localRemoteException;
    try
    {
      MediationAdapter localMediationAdapter = this.zzCI;
      localMediationAdapter.onPause();
      return;
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not pause adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void resume()
  {
    RemoteException localRemoteException;
    try
    {
      MediationAdapter localMediationAdapter = this.zzCI;
      localMediationAdapter.onResume();
      return;
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not resume adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void showInterstitial()
  {
    Object localObject = this.zzCI;
    boolean bool = localObject instanceof MediationInterstitialAdapter;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a MediationInterstitialAdapter: ");
      String str = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK(str);
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = "Showing interstitial from adapter.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = this.zzCI;
      localObject = (MediationInterstitialAdapter)localObject;
      ((MediationInterstitialAdapter)localObject).showInterstitial();
      return;
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void showVideo()
  {
    Object localObject = this.zzCI;
    boolean bool = localObject instanceof MediationRewardedVideoAdAdapter;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ");
      String str = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK(str);
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = "Show rewarded video ad from adapter.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = this.zzCI;
      localObject = (MediationRewardedVideoAdAdapter)localObject;
      ((MediationRewardedVideoAdAdapter)localObject).showVideo();
      return;
    }
    finally
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show rewarded video ad from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
    Object localObject1 = this.zzCI;
    boolean bool1 = localObject1 instanceof MediationRewardedVideoAdAdapter;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ");
      localObject2 = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "Requesting rewarded video ad from adapter.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.zzCI;
        Object localObject3 = localObject1;
        localObject3 = (MediationRewardedVideoAdAdapter)localObject1;
        Object localObject4 = localObject3;
        localObject1 = paramAdRequestParcel.zztE;
        HashSet localHashSet;
        if (localObject1 != null)
        {
          localHashSet = new java/util/HashSet;
          localObject1 = paramAdRequestParcel.zztE;
          localHashSet.<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/internal/zzfd;
          l1 = paramAdRequestParcel.zztC;
          long l2 = -1;
          bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            int i = paramAdRequestParcel.zztD;
            Location localLocation = paramAdRequestParcel.zztK;
            boolean bool3 = paramAdRequestParcel.zztF;
            int j = paramAdRequestParcel.zztG;
            boolean bool4 = paramAdRequestParcel.zztR;
            ((zzfd)localObject1).<init>((Date)localObject2, i, localHashSet, localLocation, bool3, j, bool4);
            localObject2 = paramAdRequestParcel.zztM;
            if (localObject2 == null) {
              break label335;
            }
            localObject2 = paramAdRequestParcel.zztM;
            Object localObject5 = localObject4.getClass();
            localObject5 = ((Class)localObject5).getName();
            localObject2 = ((Bundle)localObject2).getBundle((String)localObject5);
            i = paramAdRequestParcel.zztG;
            localObject5 = zza(paramString1, i, paramString2);
            ((MediationRewardedVideoAdAdapter)localObject4).loadAd((MediationAdRequest)localObject1, (Bundle)localObject5, (Bundle)localObject2);
          }
        }
        else
        {
          localHashSet = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = paramAdRequestParcel.zztC;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        boolean bool2 = false;
      }
      finally
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not load rewarded video ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label335:
      localObject2 = null;
    }
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.zza paramzza, String paramString2)
  {
    Object localObject1 = this.zzCI;
    boolean bool1 = localObject1 instanceof MediationRewardedVideoAdAdapter;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationRewardedVideoAdAdapter: ");
      localObject2 = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "Initialize rewarded video adapter.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.zzCI;
        Object localObject3 = localObject1;
        localObject3 = (MediationRewardedVideoAdAdapter)localObject1;
        Object localObject4 = localObject3;
        localObject1 = paramAdRequestParcel.zztE;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = paramAdRequestParcel.zztE;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/internal/zzfd;
          l1 = paramAdRequestParcel.zztC;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            int j = paramAdRequestParcel.zztD;
            Object localObject6 = paramAdRequestParcel.zztK;
            boolean bool3 = paramAdRequestParcel.zztF;
            int k = paramAdRequestParcel.zztG;
            bool4 = paramAdRequestParcel.zztR;
            ((zzfd)localObject1).<init>((Date)localObject2, j, (Set)localObject5, (Location)localObject6, bool3, k, bool4);
            localObject2 = paramAdRequestParcel.zztM;
            if (localObject2 == null) {
              break label388;
            }
            localObject2 = paramAdRequestParcel.zztM;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle1 = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject7 = zze.zzp(paramzzd);
            localObject7 = (Context)localObject7;
            com.google.android.gms.ads.internal.reward.mediation.client.zzb localzzb = new com/google/android/gms/ads/internal/reward/mediation/client/zzb;
            localObject3 = paramzza;
            localzzb.<init>(paramzza);
            int i = paramAdRequestParcel.zztG;
            localObject5 = null;
            localObject3 = paramString2;
            Bundle localBundle2 = zza(paramString2, i, null);
            localObject2 = localObject4;
            localObject5 = localObject1;
            localObject6 = paramString1;
            ((MediationRewardedVideoAdAdapter)localObject4).initialize((Context)localObject7, (MediationAdRequest)localObject1, paramString1, localzzb, localBundle2, localBundle1);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = paramAdRequestParcel.zztC;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        boolean bool4 = false;
      }
      finally
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not initialize rewarded video adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label388:
      Bundle localBundle1 = null;
    }
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    Object localObject1 = this.zzCI;
    boolean bool1 = localObject1 instanceof MediationInterstitialAdapter;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationInterstitialAdapter: ");
      localObject2 = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "Requesting interstitial ad from adapter.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.zzCI;
        Object localObject3 = localObject1;
        localObject3 = (MediationInterstitialAdapter)localObject1;
        Object localObject4 = localObject3;
        localObject1 = paramAdRequestParcel.zztE;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = paramAdRequestParcel.zztE;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/internal/zzfd;
          l1 = paramAdRequestParcel.zztC;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            int j = paramAdRequestParcel.zztD;
            Object localObject6 = paramAdRequestParcel.zztK;
            boolean bool3 = paramAdRequestParcel.zztF;
            k = paramAdRequestParcel.zztG;
            boolean bool4 = paramAdRequestParcel.zztR;
            ((zzfd)localObject1).<init>((Date)localObject2, j, (Set)localObject5, (Location)localObject6, bool3, k, bool4);
            localObject2 = paramAdRequestParcel.zztM;
            if (localObject2 == null) {
              break label379;
            }
            localObject2 = paramAdRequestParcel.zztM;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject7 = zze.zzp(paramzzd);
            localObject7 = (Context)localObject7;
            localObject5 = new com/google/android/gms/internal/zzff;
            localObject3 = paramzzez;
            ((zzff)localObject5).<init>(paramzzez);
            int i = paramAdRequestParcel.zztG;
            localObject3 = paramString2;
            localObject6 = zza(paramString1, i, paramString2);
            localObject2 = localObject4;
            ((MediationInterstitialAdapter)localObject4).requestInterstitialAd((Context)localObject7, (MediationInterstitialListener)localObject5, (Bundle)localObject6, (MediationAdRequest)localObject1, localBundle);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = paramAdRequestParcel.zztC;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        int k = 0;
      }
      finally
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request interstitial ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label379:
      Bundle localBundle = null;
    }
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    Object localObject1 = this.zzCI;
    boolean bool1 = localObject1 instanceof MediationNativeAdapter;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationNativeAdapter: ");
      localObject2 = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    for (;;)
    {
      try
      {
        localObject1 = this.zzCI;
        Object localObject3 = localObject1;
        localObject3 = (MediationNativeAdapter)localObject1;
        Object localObject4 = localObject3;
        localObject1 = paramAdRequestParcel.zztE;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = paramAdRequestParcel.zztE;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/internal/zzfi;
          l1 = paramAdRequestParcel.zztC;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            int j = paramAdRequestParcel.zztD;
            Object localObject6 = paramAdRequestParcel.zztK;
            boolean bool3 = paramAdRequestParcel.zztF;
            k = paramAdRequestParcel.zztG;
            boolean bool4 = paramAdRequestParcel.zztR;
            ((zzfi)localObject1).<init>((Date)localObject2, j, (Set)localObject5, (Location)localObject6, bool3, k, paramNativeAdOptionsParcel, paramList, bool4);
            localObject2 = paramAdRequestParcel.zztM;
            if (localObject2 == null) {
              break label385;
            }
            localObject2 = paramAdRequestParcel.zztM;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject2 = new com/google/android/gms/internal/zzff;
            localObject3 = paramzzez;
            ((zzff)localObject2).<init>(paramzzez);
            this.zzCJ = ((zzff)localObject2);
            localObject7 = zze.zzp(paramzzd);
            localObject7 = (Context)localObject7;
            localObject5 = this.zzCJ;
            int i = paramAdRequestParcel.zztG;
            localObject3 = paramString1;
            localObject6 = zza(paramString1, i, paramString2);
            localObject2 = localObject4;
            ((MediationNativeAdapter)localObject4).requestNativeAd((Context)localObject7, (MediationNativeListener)localObject5, (Bundle)localObject6, (NativeMediationAdRequest)localObject1, localBundle);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = paramAdRequestParcel.zztC;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        int k = 0;
      }
      finally
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request native ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label385:
      Bundle localBundle = null;
    }
  }
  
  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    Object localObject1 = this.zzCI;
    boolean bool1 = localObject1 instanceof MediationBannerAdapter;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationBannerAdapter: ");
      localObject2 = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "Requesting banner ad from adapter.";
    com.google.android.gms.ads.internal.util.client.zzb.zzaI((String)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.zzCI;
        Object localObject3 = localObject1;
        localObject3 = (MediationBannerAdapter)localObject1;
        Object localObject4 = localObject3;
        localObject1 = paramAdRequestParcel.zztE;
        Object localObject5;
        if (localObject1 != null)
        {
          localObject5 = new java/util/HashSet;
          localObject1 = paramAdRequestParcel.zztE;
          ((HashSet)localObject5).<init>((Collection)localObject1);
          localObject1 = new com/google/android/gms/internal/zzfd;
          l1 = paramAdRequestParcel.zztC;
          long l2 = -1;
          boolean bool2 = l1 < l2;
          if (!bool2)
          {
            bool2 = false;
            localObject2 = null;
            int j = paramAdRequestParcel.zztD;
            Object localObject6 = paramAdRequestParcel.zztK;
            boolean bool3 = paramAdRequestParcel.zztF;
            int m = paramAdRequestParcel.zztG;
            bool4 = paramAdRequestParcel.zztR;
            ((zzfd)localObject1).<init>((Date)localObject2, j, (Set)localObject5, (Location)localObject6, bool3, m, bool4);
            localObject2 = paramAdRequestParcel.zztM;
            if (localObject2 == null) {
              break label415;
            }
            localObject2 = paramAdRequestParcel.zztM;
            Object localObject7 = localObject4.getClass();
            localObject7 = ((Class)localObject7).getName();
            localBundle = ((Bundle)localObject2).getBundle((String)localObject7);
            localObject7 = zze.zzp(paramzzd);
            localObject7 = (Context)localObject7;
            localObject5 = new com/google/android/gms/internal/zzff;
            localObject3 = paramzzez;
            ((zzff)localObject5).<init>(paramzzez);
            int i = paramAdRequestParcel.zztG;
            localObject3 = paramString2;
            localObject6 = zza(paramString1, i, paramString2);
            i = paramAdSizeParcel.width;
            int k = paramAdSizeParcel.height;
            Object localObject8 = paramAdSizeParcel.zzuh;
            AdSize localAdSize = com.google.android.gms.ads.zza.zza(i, k, (String)localObject8);
            localObject2 = localObject4;
            localObject8 = localObject1;
            ((MediationBannerAdapter)localObject4).requestBannerAd((Context)localObject7, (MediationBannerListener)localObject5, (Bundle)localObject6, localAdSize, (MediationAdRequest)localObject1, localBundle);
          }
        }
        else
        {
          localObject5 = null;
          continue;
        }
        localObject2 = new java/util/Date;
        long l1 = paramAdRequestParcel.zztC;
        ((Date)localObject2).<init>(l1);
        continue;
        RemoteException localRemoteException;
        boolean bool4 = false;
      }
      finally
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request banner ad from adapter.", localThrowable);
        localRemoteException = new android/os/RemoteException;
        localRemoteException.<init>();
      }
      label415:
      Bundle localBundle = null;
    }
  }
  
  public void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    zza(paramAdRequestParcel, paramString, null);
  }
  
  public zzfb zzeF()
  {
    Object localObject = this.zzCJ.zzeJ();
    boolean bool = localObject instanceof NativeAppInstallAdMapper;
    zzfg localzzfg;
    if (bool)
    {
      localzzfg = new com/google/android/gms/internal/zzfg;
      localObject = (NativeAppInstallAdMapper)localObject;
      localzzfg.<init>((NativeAppInstallAdMapper)localObject);
    }
    for (localObject = localzzfg;; localObject = null) {
      return (zzfb)localObject;
    }
  }
  
  public zzfc zzeG()
  {
    Object localObject = this.zzCJ.zzeJ();
    boolean bool = localObject instanceof NativeContentAdMapper;
    zzfh localzzfh;
    if (bool)
    {
      localzzfh = new com/google/android/gms/internal/zzfh;
      localObject = (NativeContentAdMapper)localObject;
      localzzfh.<init>((NativeContentAdMapper)localObject);
    }
    for (localObject = localzzfh;; localObject = null) {
      return (zzfc)localObject;
    }
  }
  
  public Bundle zzeH()
  {
    Object localObject = this.zzCI;
    boolean bool = localObject instanceof zzjz;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a v2 MediationBannerAdapter: ");
      String str = this.zzCI.getClass().getCanonicalName();
      com.google.android.gms.ads.internal.util.client.zzb.zzaK(str);
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
    }
    for (;;)
    {
      return (Bundle)localObject;
      localObject = ((zzjz)this.zzCI).zzeH();
    }
  }
  
  public Bundle zzeI()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */