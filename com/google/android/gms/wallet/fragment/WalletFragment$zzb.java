package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzrx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

class WalletFragment$zzb
  implements LifecycleDelegate
{
  private final zzrx zzbqh;
  
  private WalletFragment$zzb(zzrx paramzzrx)
  {
    this.zzbqh = paramzzrx;
  }
  
  private int getState()
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      return localzzrx.getState();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  private void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.initialize(paramWalletFragmentInitParams);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  private void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  private void setEnabled(boolean paramBoolean)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.setEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  private void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.updateMaskedWallet(paramMaskedWallet);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  private void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.updateMaskedWalletRequest(paramMaskedWalletRequest);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onCreate(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      Object localObject1 = this.zzbqh;
      localObject2 = zze.zzC(paramLayoutInflater);
      zzd localzzd = zze.zzC(paramViewGroup);
      localObject1 = ((zzrx)localObject1).onCreateView((zzd)localObject2, localzzd, paramBundle);
      localObject1 = zze.zzp((zzd)localObject1);
      return (View)localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localRemoteException);
      throw ((Throwable)localObject2);
    }
  }
  
  public void onDestroy() {}
  
  public void onDestroyView() {}
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    WalletFragmentOptions localWalletFragmentOptions = (WalletFragmentOptions)paramBundle1.getParcelable("extraWalletFragmentOptions");
    try
    {
      localObject = this.zzbqh;
      zzd localzzd = zze.zzC(paramActivity);
      ((zzrx)localObject).zza(localzzd, localWalletFragmentOptions, paramBundle2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public void onLowMemory() {}
  
  public void onPause()
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public void onResume()
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public void onStart()
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onStart();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public void onStop()
  {
    try
    {
      zzrx localzzrx = this.zzbqh;
      localzzrx.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragment$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */