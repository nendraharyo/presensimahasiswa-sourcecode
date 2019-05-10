package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzcy;
import com.google.android.gms.internal.zzcz;

public class AdLoader$Builder
{
  private final Context mContext;
  private final zzs zzoD;
  
  AdLoader$Builder(Context paramContext, zzs paramzzs)
  {
    this.mContext = paramContext;
    this.zzoD = paramzzs;
  }
  
  public AdLoader$Builder(Context paramContext, String paramString)
  {
    this(localContext, (zzs)localObject);
  }
  
  public AdLoader build()
  {
    try
    {
      localAdLoader = new com/google/android/gms/ads/AdLoader;
      localObject2 = this.mContext;
      Object localObject3 = this.zzoD;
      localObject3 = ((zzs)localObject3).zzbn();
      localAdLoader.<init>((Context)localObject2, (zzr)localObject3);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        AdLoader localAdLoader;
        Object localObject2 = "Failed to build AdLoader.";
        zzb.zzb((String)localObject2, localRemoteException);
        Object localObject1 = null;
      }
    }
    return localAdLoader;
  }
  
  public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener paramOnAppInstallAdLoadedListener)
  {
    try
    {
      zzs localzzs = this.zzoD;
      localObject = new com/google/android/gms/internal/zzcw;
      ((zzcw)localObject).<init>(paramOnAppInstallAdLoadedListener);
      localzzs.zza((zzcr)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to add app install ad listener";
        zzb.zzd((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
  {
    try
    {
      zzs localzzs = this.zzoD;
      localObject = new com/google/android/gms/internal/zzcx;
      ((zzcx)localObject).<init>(paramOnContentAdLoadedListener);
      localzzs.zza((zzcs)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to add content ad listener";
        zzb.zzd((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public Builder forCustomTemplateAd(String paramString, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzoD;
        zzcz localzzcz = new com/google/android/gms/internal/zzcz;
        localzzcz.<init>(paramOnCustomTemplateAdLoadedListener);
        if (paramOnCustomClickListener != null) {
          continue;
        }
        localObject2 = null;
        ((zzs)localObject1).zza(paramString, localzzcz, (zzct)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2;
        Object localObject1 = "Failed to add custom template ad listener";
        zzb.zzd((String)localObject1, localRemoteException);
        continue;
      }
      return this;
      localObject2 = new com/google/android/gms/internal/zzcy;
      ((zzcy)localObject2).<init>(paramOnCustomClickListener);
    }
  }
  
  public Builder withAdListener(AdListener paramAdListener)
  {
    try
    {
      zzs localzzs = this.zzoD;
      localObject = new com/google/android/gms/ads/internal/client/zzc;
      ((zzc)localObject).<init>(paramAdListener);
      localzzs.zzb((zzq)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to set AdListener.";
        zzb.zzd((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public Builder withCorrelator(Correlator paramCorrelator)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramCorrelator);
    try
    {
      zzs localzzs = this.zzoD;
      localObject = paramCorrelator.zzaF();
      localzzs.zzb((com.google.android.gms.ads.internal.client.zzx)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to set correlator.";
        zzb.zzd((String)localObject, localRemoteException);
      }
    }
    return this;
  }
  
  public Builder withNativeAdOptions(NativeAdOptions paramNativeAdOptions)
  {
    try
    {
      zzs localzzs = this.zzoD;
      localObject = new com/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;
      ((NativeAdOptionsParcel)localObject).<init>(paramNativeAdOptions);
      localzzs.zza((NativeAdOptionsParcel)localObject);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Failed to specify native ad options";
        zzb.zzd((String)localObject, localRemoteException);
      }
    }
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\AdLoader$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */