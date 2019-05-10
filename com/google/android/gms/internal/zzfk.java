package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

public final class zzfk
  implements MediationBannerListener, MediationInterstitialListener
{
  private final zzez zzCK;
  
  public zzfk(zzez paramzzez)
  {
    this.zzCK = paramzzez;
  }
  
  public void onClick(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzb.zzaI("Adapter called onClick.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onClick must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$1;
      ((zzfk.1)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdClicked();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdClicked.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onDismissScreen(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzb.zzaI("Adapter called onDismissScreen.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onDismissScreen must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$4;
      ((zzfk.4)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdClosed();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdClosed.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onDismissScreen(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzb.zzaI("Adapter called onDismissScreen.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onDismissScreen must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$9;
      ((zzfk.9)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdClosed();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdClosed.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onFailedToReceiveAd(MediationBannerAdapter paramMediationBannerAdapter, AdRequest.ErrorCode paramErrorCode)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = "Adapter called onFailedToReceiveAd with error. ";
    zzb.zzaI((String)localObject2 + paramErrorCode);
    localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    if (!bool)
    {
      zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$5;
      ((zzfk.5)localObject2).<init>(this, paramErrorCode);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        int i = zzfl.zza(paramErrorCode);
        ((zzez)localObject1).onAdFailedToLoad(i);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdFailedToLoad.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onFailedToReceiveAd(MediationInterstitialAdapter paramMediationInterstitialAdapter, AdRequest.ErrorCode paramErrorCode)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Adapter called onFailedToReceiveAd with error ").append(paramErrorCode);
    Object localObject2 = ".";
    zzb.zzaI((String)localObject2);
    localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    if (!bool)
    {
      zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$10;
      ((zzfk.10)localObject2).<init>(this, paramErrorCode);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        int i = zzfl.zza(paramErrorCode);
        ((zzez)localObject1).onAdFailedToLoad(i);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdFailedToLoad.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onLeaveApplication(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzb.zzaI("Adapter called onLeaveApplication.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$6;
      ((zzfk.6)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdLeftApplication();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdLeftApplication.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onLeaveApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzb.zzaI("Adapter called onLeaveApplication.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$11;
      ((zzfk.11)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdLeftApplication();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdLeftApplication.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onPresentScreen(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzb.zzaI("Adapter called onPresentScreen.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onPresentScreen must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$7;
      ((zzfk.7)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdOpened();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdOpened.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onPresentScreen(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzb.zzaI("Adapter called onPresentScreen.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onPresentScreen must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$2;
      ((zzfk.2)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdOpened();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdOpened.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onReceivedAd(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzb.zzaI("Adapter called onReceivedAd.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onReceivedAd must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$8;
      ((zzfk.8)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdLoaded();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdLoaded.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onReceivedAd(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzb.zzaI("Adapter called onReceivedAd.");
    Object localObject1 = zzn.zzcS();
    boolean bool = ((zza)localObject1).zzhJ();
    Object localObject2;
    if (!bool)
    {
      zzb.zzaK("onReceivedAd must be called on the main UI thread.");
      localObject1 = zza.zzMS;
      localObject2 = new com/google/android/gms/internal/zzfk$3;
      ((zzfk.3)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject1 = this.zzCK;
        ((zzez)localObject1).onAdLoaded();
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = "Could not call onAdLoaded.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */