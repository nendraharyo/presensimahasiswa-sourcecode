package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzfj
  extends zzey.zza
{
  private final MediationAdapter zzCO;
  private final NetworkExtras zzCP;
  
  public zzfj(MediationAdapter paramMediationAdapter, NetworkExtras paramNetworkExtras)
  {
    this.zzCO = paramMediationAdapter;
    this.zzCP = paramNetworkExtras;
  }
  
  private MediationServerParameters zzb(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 != null) {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString1);
        localObject2 = new java/util/HashMap;
        int i = ((JSONObject)localObject1).length();
        ((HashMap)localObject2).<init>(i);
        Iterator localIterator = ((JSONObject)localObject1).keys();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          Object localObject3 = localIterator.next();
          localObject3 = (String)localObject3;
          String str = ((JSONObject)localObject1).getString((String)localObject3);
          ((Map)localObject2).put(localObject3, str);
        }
        localObject4 = new java/util/HashMap;
      }
      finally
      {
        zzb.zzd("Could not get MediationServerParameters.", localThrowable);
        localObject4 = new android/os/RemoteException;
        ((RemoteException)localObject4).<init>();
      }
    }
    Object localObject2 = null;
    ((HashMap)localObject4).<init>(0);
    localObject2 = localObject4;
    Object localObject4 = this.zzCO;
    Object localObject1 = ((MediationAdapter)localObject4).getServerParametersType();
    boolean bool = false;
    localObject4 = null;
    if (localObject1 != null)
    {
      localObject4 = ((Class)localObject1).newInstance();
      localObject4 = (MediationServerParameters)localObject4;
      ((MediationServerParameters)localObject4).load((Map)localObject2);
    }
    return (MediationServerParameters)localObject4;
  }
  
  public void destroy()
  {
    RemoteException localRemoteException;
    try
    {
      MediationAdapter localMediationAdapter = this.zzCO;
      localMediationAdapter.destroy();
      return;
    }
    finally
    {
      zzb.zzd("Could not destroy adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public zzd getView()
  {
    Object localObject = this.zzCO;
    boolean bool = localObject instanceof MediationBannerAdapter;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a MediationBannerAdapter: ");
      String str = this.zzCO.getClass().getCanonicalName();
      zzb.zzaK(str);
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    RemoteException localRemoteException;
    try
    {
      localObject = this.zzCO;
      localObject = (MediationBannerAdapter)localObject;
      localObject = ((MediationBannerAdapter)localObject).getBannerView();
      return zze.zzC(localObject);
    }
    finally
    {
      zzb.zzd("Could not get banner view from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public boolean isInitialized()
  {
    return true;
  }
  
  public void pause()
  {
    RemoteException localRemoteException = new android/os/RemoteException;
    localRemoteException.<init>();
    throw localRemoteException;
  }
  
  public void resume()
  {
    RemoteException localRemoteException = new android/os/RemoteException;
    localRemoteException.<init>();
    throw localRemoteException;
  }
  
  public void showInterstitial()
  {
    Object localObject = this.zzCO;
    boolean bool = localObject instanceof MediationInterstitialAdapter;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("MediationAdapter is not a MediationInterstitialAdapter: ");
      String str = this.zzCO.getClass().getCanonicalName();
      zzb.zzaK(str);
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = "Showing interstitial from adapter.";
    zzb.zzaI((String)localObject);
    RemoteException localRemoteException;
    try
    {
      localObject = this.zzCO;
      localObject = (MediationInterstitialAdapter)localObject;
      ((MediationInterstitialAdapter)localObject).showInterstitial();
      return;
    }
    finally
    {
      zzb.zzd("Could not show interstitial from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void showVideo() {}
  
  public void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2) {}
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, zza paramzza, String paramString2) {}
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    Object localObject1 = this.zzCO;
    boolean bool = localObject1 instanceof MediationInterstitialAdapter;
    Object localObject2;
    if (!bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationInterstitialAdapter: ");
      localObject2 = this.zzCO.getClass().getCanonicalName();
      zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "Requesting interstitial ad from adapter.";
    zzb.zzaI((String)localObject1);
    RemoteException localRemoteException;
    try
    {
      localObject1 = this.zzCO;
      localObject1 = (MediationInterstitialAdapter)localObject1;
      localObject2 = new com/google/android/gms/internal/zzfk;
      ((zzfk)localObject2).<init>(paramzzez);
      Object localObject3 = zze.zzp(paramzzd);
      localObject3 = (Activity)localObject3;
      int i = paramAdRequestParcel.zztG;
      MediationServerParameters localMediationServerParameters = zzb(paramString1, i, paramString2);
      MediationAdRequest localMediationAdRequest = zzfl.zzj(paramAdRequestParcel);
      NetworkExtras localNetworkExtras = this.zzCP;
      ((MediationInterstitialAdapter)localObject1).requestInterstitialAd((MediationInterstitialListener)localObject2, (Activity)localObject3, localMediationServerParameters, localMediationAdRequest, localNetworkExtras);
      return;
    }
    finally
    {
      zzb.zzd("Could not request interstitial ad from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList) {}
  
  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    Object localObject1 = this.zzCO;
    boolean bool = localObject1 instanceof MediationBannerAdapter;
    Object localObject2;
    if (!bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("MediationAdapter is not a MediationBannerAdapter: ");
      localObject2 = this.zzCO.getClass().getCanonicalName();
      zzb.zzaK((String)localObject2);
      localObject1 = new android/os/RemoteException;
      ((RemoteException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject1 = "Requesting banner ad from adapter.";
    zzb.zzaI((String)localObject1);
    RemoteException localRemoteException;
    try
    {
      localObject1 = this.zzCO;
      localObject1 = (MediationBannerAdapter)localObject1;
      localObject2 = new com/google/android/gms/internal/zzfk;
      ((zzfk)localObject2).<init>(paramzzez);
      Object localObject3 = zze.zzp(paramzzd);
      localObject3 = (Activity)localObject3;
      int i = paramAdRequestParcel.zztG;
      MediationServerParameters localMediationServerParameters = zzb(paramString1, i, paramString2);
      AdSize localAdSize = zzfl.zzb(paramAdSizeParcel);
      MediationAdRequest localMediationAdRequest = zzfl.zzj(paramAdRequestParcel);
      NetworkExtras localNetworkExtras = this.zzCP;
      ((MediationBannerAdapter)localObject1).requestBannerAd((MediationBannerListener)localObject2, (Activity)localObject3, localMediationServerParameters, localAdSize, localMediationAdRequest, localNetworkExtras);
      return;
    }
    finally
    {
      zzb.zzd("Could not request banner ad from adapter.", localThrowable);
      localRemoteException = new android/os/RemoteException;
      localRemoteException.<init>();
    }
  }
  
  public void zzb(AdRequestParcel paramAdRequestParcel, String paramString) {}
  
  public zzfb zzeF()
  {
    return null;
  }
  
  public zzfc zzeG()
  {
    return null;
  }
  
  public Bundle zzeH()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
  
  public Bundle zzeI()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    return localBundle;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */