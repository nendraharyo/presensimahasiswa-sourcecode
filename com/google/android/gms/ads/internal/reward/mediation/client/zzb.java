package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzin;

public class zzb
  implements MediationRewardedVideoAdListener
{
  private final zza zzKR;
  
  public zzb(zza paramzza)
  {
    this.zzKR = paramzza;
  }
  
  public void onAdClicked(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdClicked.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzl((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdClicked.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onAdClosed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdClosed.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzk((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdClosed.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onAdFailedToLoad(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdFailedToLoad.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzc((zzd)localObject2, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdFailedToLoad.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onAdLeftApplication(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdLeftApplication.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzm((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdLeftApplication.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onAdLoaded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdLoaded.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzh((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdLoaded.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onAdOpened(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    Object localObject1 = "Adapter called onAdOpened.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzi((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdOpened.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onInitializationFailed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt)
  {
    zzx.zzcD("onInitializationFailed must be called on the main UI thread.");
    Object localObject1 = "Adapter called onInitializationFailed.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzb((zzd)localObject2, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onInitializationFailed.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onInitializationSucceeded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onInitializationSucceeded must be called on the main UI thread.");
    Object localObject1 = "Adapter called onInitializationSucceeded.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzg((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onInitializationSucceeded.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
  
  public void onRewarded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, RewardItem paramRewardItem)
  {
    zzx.zzcD("onRewarded must be called on the main UI thread.");
    Object localObject1 = "Adapter called onRewarded.";
    zzin.zzaI((String)localObject1);
    if (paramRewardItem != null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.zzKR;
        localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
        localRewardItemParcel = new com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
        localRewardItemParcel.<init>(paramRewardItem);
        ((zza)localObject1).zza((zzd)localObject2, localRewardItemParcel);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        RewardItemParcel localRewardItemParcel;
        Object localObject3;
        int i;
        Object localObject2 = "Could not call onRewarded.";
        zzin.zzd((String)localObject2, localRemoteException);
        continue;
      }
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      localRewardItemParcel = new com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
      localObject3 = paramMediationRewardedVideoAdAdapter.getClass();
      localObject3 = ((Class)localObject3).getName();
      i = 1;
      localRewardItemParcel.<init>((String)localObject3, i);
      ((zza)localObject1).zza((zzd)localObject2, localRewardItemParcel);
    }
  }
  
  public void onVideoStarted(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onVideoStarted must be called on the main UI thread.");
    Object localObject1 = "Adapter called onVideoStarted.";
    zzin.zzaI((String)localObject1);
    try
    {
      localObject1 = this.zzKR;
      localObject2 = zze.zzC(paramMediationRewardedVideoAdAdapter);
      ((zza)localObject1).zzj((zzd)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onVideoStarted.";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\mediation\client\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */