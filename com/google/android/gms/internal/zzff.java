package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.common.internal.zzx;

public final class zzff
  implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{
  private final zzez zzCK;
  private NativeAdMapper zzCL;
  
  public zzff(zzez paramzzez)
  {
    this.zzCK = paramzzez;
  }
  
  public void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClicked.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClicked.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClicked.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClicked.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdClicked(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClicked.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClicked.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClosed.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClosed.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClosed.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClosed.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdClosed(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    Object localObject = "Adapter called onAdClosed.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdClosed.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = "Adapter called onAdFailedToLoad with error. ";
    localObject = str + paramInt;
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        str = "Could not call onAdFailedToLoad.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Adapter called onAdFailedToLoad with error ").append(paramInt);
    String str = ".";
    localObject = str;
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        str = "Could not call onAdFailedToLoad.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Adapter called onAdFailedToLoad with error ").append(paramInt);
    String str = ".";
    localObject = str;
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        str = "Could not call onAdFailedToLoad.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLeftApplication.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLeftApplication.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLeftApplication.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLeftApplication.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdLeftApplication(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLeftApplication.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLeftApplication.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLoaded.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLoaded.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, NativeAdMapper paramNativeAdMapper)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    Object localObject = "Adapter called onAdLoaded.";
    zzb.zzaI((String)localObject);
    this.zzCL = paramNativeAdMapper;
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    Object localObject = "Adapter called onAdOpened.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    Object localObject = "Adapter called onAdOpened.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public void onAdOpened(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    Object localObject = "Adapter called onAdOpened.";
    zzb.zzaI((String)localObject);
    try
    {
      localObject = this.zzCK;
      ((zzez)localObject).onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public NativeAdMapper zzeJ()
  {
    return this.zzCL;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzff.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */