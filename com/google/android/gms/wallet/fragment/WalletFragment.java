package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragment
  extends Fragment
{
  private boolean mCreated = false;
  private final Fragment zzavH;
  private WalletFragmentOptions zzbqa;
  private WalletFragmentInitParams zzbqb;
  private MaskedWalletRequest zzbqc;
  private MaskedWallet zzbqd;
  private Boolean zzbqe;
  private WalletFragment.zzb zzbqj;
  private final zzb zzbqk;
  private final WalletFragment.zzc zzbql;
  private WalletFragment.zza zzbqm;
  
  public WalletFragment()
  {
    Object localObject = zzb.zza(this);
    this.zzbqk = ((zzb)localObject);
    localObject = new com/google/android/gms/wallet/fragment/WalletFragment$zzc;
    ((WalletFragment.zzc)localObject).<init>(this, null);
    this.zzbql = ((WalletFragment.zzc)localObject);
    localObject = new com/google/android/gms/wallet/fragment/WalletFragment$zza;
    ((WalletFragment.zza)localObject).<init>(this);
    this.zzbqm = ((WalletFragment.zza)localObject);
    this.zzavH = this;
  }
  
  public static WalletFragment newInstance(WalletFragmentOptions paramWalletFragmentOptions)
  {
    WalletFragment localWalletFragment = new com/google/android/gms/wallet/fragment/WalletFragment;
    localWalletFragment.<init>();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putParcelable("extraWalletFragmentOptions", paramWalletFragmentOptions);
    localWalletFragment.zzavH.setArguments(localBundle);
    return localWalletFragment;
  }
  
  public int getState()
  {
    WalletFragment.zzb localzzb = this.zzbqj;
    int i;
    if (localzzb != null)
    {
      localzzb = this.zzbqj;
      i = WalletFragment.zzb.zza(localzzb);
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
    Object localObject = this.zzbqj;
    if (localObject != null)
    {
      WalletFragment.zzb.zza(this.zzbqj, paramWalletFragmentInitParams);
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
          localObject = "WalletFragment";
          str = "updateMaskedWalletRequest() was called before initialize()";
          Log.w((String)localObject, str);
        }
        localObject = this.zzbqd;
        if (localObject != null)
        {
          localObject = "WalletFragment";
          str = "updateMaskedWallet() was called before initialize()";
          Log.w((String)localObject, str);
        }
      }
      else
      {
        localObject = "WalletFragment";
        str = "initialize(WalletFragmentInitParams) was called more than once. Ignoring.";
        Log.w((String)localObject, str);
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    WalletFragment.zzb localzzb = this.zzbqj;
    if (localzzb != null)
    {
      localzzb = this.zzbqj;
      WalletFragment.zzb.zza(localzzb, paramInt1, paramInt2, paramIntent);
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
          localObject2 = "WalletFragment";
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
      this.zzbql.onCreate(paramBundle);
      return;
      localObject1 = this.zzavH.getArguments();
      if (localObject1 != null)
      {
        localObject1 = this.zzavH.getArguments();
        localObject2 = "extraWalletFragmentOptions";
        localObject1 = (WalletFragmentOptions)((Bundle)localObject1).getParcelable((String)localObject2);
        if (localObject1 != null)
        {
          localObject2 = this.zzavH.getActivity();
          ((WalletFragmentOptions)localObject1).zzbc((Context)localObject2);
          this.zzbqa = ((WalletFragmentOptions)localObject1);
        }
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.zzbql.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
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
    this.zzbql.onInflate(paramActivity, (Bundle)localObject, paramBundle);
  }
  
  public void onPause()
  {
    super.onPause();
    this.zzbql.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.zzbql.onResume();
    Object localObject1 = this.zzavH.getActivity().getFragmentManager();
    Object localObject2 = ((FragmentManager)localObject1).findFragmentByTag("GooglePlayServicesErrorDialog");
    if (localObject2 != null)
    {
      ((FragmentManager)localObject1).beginTransaction().remove((Fragment)localObject2).commit();
      localObject1 = this.zzavH.getActivity();
      int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)localObject1);
      localObject2 = this.zzavH.getActivity();
      int j = -1;
      GooglePlayServicesUtil.showErrorDialogFragment(i, (Activity)localObject2, j);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject1 = WalletFragmentOptions.class.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject1);
    this.zzbql.onSaveInstanceState(paramBundle);
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
    this.zzbql.onStart();
  }
  
  public void onStop()
  {
    super.onStop();
    this.zzbql.onStop();
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    Object localObject = this.zzbqj;
    if (localObject != null)
    {
      WalletFragment.zzb.zza(this.zzbqj, paramBoolean);
      localObject = null;
    }
    for (this.zzbqe = null;; this.zzbqe = ((Boolean)localObject))
    {
      return;
      localObject = Boolean.valueOf(paramBoolean);
    }
  }
  
  public void setOnStateChangedListener(WalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    this.zzbqm.zza(paramOnStateChangedListener);
  }
  
  public void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    WalletFragment.zzb localzzb = this.zzbqj;
    if (localzzb != null)
    {
      WalletFragment.zzb.zza(this.zzbqj, paramMaskedWallet);
      localzzb = null;
    }
    for (this.zzbqd = null;; this.zzbqd = paramMaskedWallet) {
      return;
    }
  }
  
  public void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    WalletFragment.zzb localzzb = this.zzbqj;
    if (localzzb != null)
    {
      WalletFragment.zzb.zza(this.zzbqj, paramMaskedWalletRequest);
      localzzb = null;
    }
    for (this.zzbqc = null;; this.zzbqc = paramMaskedWalletRequest) {
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */