package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzh;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class SupportWalletFragment
  extends Fragment
{
  private boolean mCreated = false;
  private final Fragment zzalg;
  private SupportWalletFragment.zzb zzbpW;
  private final zzh zzbpX;
  private final SupportWalletFragment.zzc zzbpY;
  private SupportWalletFragment.zza zzbpZ;
  private WalletFragmentOptions zzbqa;
  private WalletFragmentInitParams zzbqb;
  private MaskedWalletRequest zzbqc;
  private MaskedWallet zzbqd;
  private Boolean zzbqe;
  
  public SupportWalletFragment()
  {
    Object localObject = zzh.zza(this);
    this.zzbpX = ((zzh)localObject);
    localObject = new com/google/android/gms/wallet/fragment/SupportWalletFragment$zzc;
    ((SupportWalletFragment.zzc)localObject).<init>(this, null);
    this.zzbpY = ((SupportWalletFragment.zzc)localObject);
    localObject = new com/google/android/gms/wallet/fragment/SupportWalletFragment$zza;
    ((SupportWalletFragment.zza)localObject).<init>(this);
    this.zzbpZ = ((SupportWalletFragment.zza)localObject);
    this.zzalg = this;
  }
  
  public static SupportWalletFragment newInstance(WalletFragmentOptions paramWalletFragmentOptions)
  {
    SupportWalletFragment localSupportWalletFragment = new com/google/android/gms/wallet/fragment/SupportWalletFragment;
    localSupportWalletFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("extraWalletFragmentOptions", paramWalletFragmentOptions);
    localSupportWalletFragment.zzalg.setArguments(localBundle);
    return localSupportWalletFragment;
  }
  
  public int getState()
  {
    SupportWalletFragment.zzb localzzb = this.zzbpW;
    int i;
    if (localzzb != null)
    {
      localzzb = this.zzbpW;
      i = SupportWalletFragment.zzb.zza(localzzb);
    }
    for (;;)
    {
      return i;
      i = 0;
      localzzb = null;
    }
  }
  
  public void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
    Object localObject = this.zzbpW;
    if (localObject != null)
    {
      SupportWalletFragment.zzb.zza(this.zzbpW, paramWalletFragmentInitParams);
      localObject = null;
      this.zzbqb = null;
    }
    for (;;)
    {
      return;
      localObject = this.zzbqb;
      String str;
      if (localObject == null)
      {
        this.zzbqb = paramWalletFragmentInitParams;
        localObject = this.zzbqc;
        if (localObject != null)
        {
          localObject = "SupportWalletFragment";
          str = "updateMaskedWalletRequest() was called before initialize()";
          Log.w((String)localObject, str);
        }
        localObject = this.zzbqd;
        if (localObject != null)
        {
          localObject = "SupportWalletFragment";
          str = "updateMaskedWallet() was called before initialize()";
          Log.w((String)localObject, str);
        }
      }
      else
      {
        localObject = "SupportWalletFragment";
        str = "initialize(WalletFragmentInitParams) was called more than once. Ignoring.";
        Log.w((String)localObject, str);
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    SupportWalletFragment.zzb localzzb = this.zzbpW;
    if (localzzb != null)
    {
      localzzb = this.zzbpW;
      SupportWalletFragment.zzb.zza(localzzb, paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject1;
    Object localObject2;
    if (paramBundle != null)
    {
      localObject1 = WalletFragmentOptions.class.getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject1);
      localObject1 = (WalletFragmentInitParams)paramBundle.getParcelable("walletFragmentInitParams");
      if (localObject1 != null)
      {
        localObject2 = this.zzbqb;
        if (localObject2 != null)
        {
          localObject2 = "SupportWalletFragment";
          String str = "initialize(WalletFragmentInitParams) was called more than once.Ignoring.";
          Log.w((String)localObject2, str);
        }
        this.zzbqb = ((WalletFragmentInitParams)localObject1);
      }
      localObject1 = this.zzbqc;
      if (localObject1 == null)
      {
        localObject1 = (MaskedWalletRequest)paramBundle.getParcelable("maskedWalletRequest");
        this.zzbqc = ((MaskedWalletRequest)localObject1);
      }
      localObject1 = this.zzbqd;
      if (localObject1 == null)
      {
        localObject1 = (MaskedWallet)paramBundle.getParcelable("maskedWallet");
        this.zzbqd = ((MaskedWallet)localObject1);
      }
      localObject1 = "walletFragmentOptions";
      boolean bool = paramBundle.containsKey((String)localObject1);
      if (bool)
      {
        localObject1 = (WalletFragmentOptions)paramBundle.getParcelable("walletFragmentOptions");
        this.zzbqa = ((WalletFragmentOptions)localObject1);
      }
      localObject1 = "enabled";
      bool = paramBundle.containsKey((String)localObject1);
      if (bool)
      {
        bool = paramBundle.getBoolean("enabled");
        localObject1 = Boolean.valueOf(bool);
        this.zzbqe = ((Boolean)localObject1);
      }
    }
    for (;;)
    {
      this.mCreated = true;
      this.zzbpY.onCreate(paramBundle);
      return;
      localObject1 = this.zzalg.getArguments();
      if (localObject1 != null)
      {
        localObject1 = this.zzalg.getArguments();
        localObject2 = "extraWalletFragmentOptions";
        localObject1 = (WalletFragmentOptions)((Bundle)localObject1).getParcelable((String)localObject2);
        if (localObject1 != null)
        {
          localObject2 = this.zzalg.getActivity();
          ((WalletFragmentOptions)localObject1).zzbc((Context)localObject2);
          this.zzbqa = ((WalletFragmentOptions)localObject1);
        }
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.zzbpY.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.mCreated = false;
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    Object localObject = this.zzbqa;
    if (localObject == null)
    {
      localObject = WalletFragmentOptions.zzb(paramActivity, paramAttributeSet);
      this.zzbqa = ((WalletFragmentOptions)localObject);
    }
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    WalletFragmentOptions localWalletFragmentOptions = this.zzbqa;
    ((Bundle)localObject).putParcelable("attrKeyWalletFragmentOptions", localWalletFragmentOptions);
    this.zzbpY.onInflate(paramActivity, (Bundle)localObject, paramBundle);
  }
  
  public void onPause()
  {
    super.onPause();
    this.zzbpY.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.zzbpY.onResume();
    Object localObject1 = this.zzalg.getActivity().getSupportFragmentManager();
    Object localObject2 = ((m)localObject1).a("GooglePlayServicesErrorDialog");
    if (localObject2 != null)
    {
      ((m)localObject1).a().a((Fragment)localObject2).c();
      localObject1 = this.zzalg.getActivity();
      int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)localObject1);
      localObject2 = this.zzalg.getActivity();
      int j = -1;
      GooglePlayServicesUtil.showErrorDialogFragment(i, (Activity)localObject2, j);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject1 = WalletFragmentOptions.class.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject1);
    this.zzbpY.onSaveInstanceState(paramBundle);
    localObject1 = this.zzbqb;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = "walletFragmentInitParams";
      localObject2 = this.zzbqb;
      paramBundle.putParcelable((String)localObject1, (Parcelable)localObject2);
      this.zzbqb = null;
    }
    localObject1 = this.zzbqc;
    if (localObject1 != null)
    {
      localObject1 = "maskedWalletRequest";
      localObject2 = this.zzbqc;
      paramBundle.putParcelable((String)localObject1, (Parcelable)localObject2);
      this.zzbqc = null;
    }
    localObject1 = this.zzbqd;
    if (localObject1 != null)
    {
      localObject1 = "maskedWallet";
      localObject2 = this.zzbqd;
      paramBundle.putParcelable((String)localObject1, (Parcelable)localObject2);
      this.zzbqd = null;
    }
    localObject1 = this.zzbqa;
    if (localObject1 != null)
    {
      localObject1 = "walletFragmentOptions";
      localObject2 = this.zzbqa;
      paramBundle.putParcelable((String)localObject1, (Parcelable)localObject2);
      this.zzbqa = null;
    }
    localObject1 = this.zzbqe;
    if (localObject1 != null)
    {
      localObject1 = "enabled";
      localObject2 = this.zzbqe;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramBundle.putBoolean((String)localObject1, bool);
      this.zzbqe = null;
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.zzbpY.onStart();
  }
  
  public void onStop()
  {
    super.onStop();
    this.zzbpY.onStop();
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    Object localObject = this.zzbpW;
    if (localObject != null)
    {
      SupportWalletFragment.zzb.zza(this.zzbpW, paramBoolean);
      localObject = null;
    }
    for (this.zzbqe = null;; this.zzbqe = ((Boolean)localObject))
    {
      return;
      localObject = Boolean.valueOf(paramBoolean);
    }
  }
  
  public void setOnStateChangedListener(SupportWalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    this.zzbpZ.zza(paramOnStateChangedListener);
  }
  
  public void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    SupportWalletFragment.zzb localzzb = this.zzbpW;
    if (localzzb != null)
    {
      SupportWalletFragment.zzb.zza(this.zzbpW, paramMaskedWallet);
      localzzb = null;
    }
    for (this.zzbqd = null;; this.zzbqd = paramMaskedWallet) {
      return;
    }
  }
  
  public void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    SupportWalletFragment.zzb localzzb = this.zzbpW;
    if (localzzb != null)
    {
      SupportWalletFragment.zzb.zza(this.zzbpW, paramMaskedWalletRequest);
      localzzb = null;
    }
    for (this.zzbqc = null;; this.zzbqc = paramMaskedWalletRequest) {
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\SupportWalletFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */