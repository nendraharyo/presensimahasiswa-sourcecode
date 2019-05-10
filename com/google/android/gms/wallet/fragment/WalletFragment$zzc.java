package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R.string;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.internal.zzrx;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzsf;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

class WalletFragment$zzc
  extends zza
  implements View.OnClickListener
{
  private WalletFragment$zzc(WalletFragment paramWalletFragment) {}
  
  public void onClick(View paramView)
  {
    Activity localActivity = WalletFragment.zza(this.zzbqp).getActivity();
    GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(localActivity), localActivity, -1);
  }
  
  protected void zza(FrameLayout paramFrameLayout)
  {
    Button localButton = new android/widget/Button;
    Activity localActivity = WalletFragment.zza(this.zzbqp).getActivity();
    localButton.<init>(localActivity);
    int i = R.string.wallet_buy_button_place_holder;
    localButton.setText(i);
    int j = -1;
    i = -2;
    Object localObject = WalletFragment.zze(this.zzbqp);
    if (localObject != null)
    {
      localObject = WalletFragment.zze(this.zzbqp).getFragmentStyle();
      if (localObject != null)
      {
        DisplayMetrics localDisplayMetrics = WalletFragment.zza(this.zzbqp).getResources().getDisplayMetrics();
        j = ((WalletFragmentStyle)localObject).zza("buyButtonWidth", localDisplayMetrics, j);
        String str = "buyButtonHeight";
        i = ((WalletFragmentStyle)localObject).zza(str, localDisplayMetrics, i);
      }
    }
    localObject = new android/view/ViewGroup$LayoutParams;
    ((ViewGroup.LayoutParams)localObject).<init>(j, i);
    localButton.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localButton.setOnClickListener(this);
    paramFrameLayout.addView(localButton);
  }
  
  protected void zza(zzf paramzzf)
  {
    Object localObject1 = WalletFragment.zza(this.zzbqp).getActivity();
    Object localObject2 = WalletFragment.zzb(this.zzbqp);
    boolean bool;
    if (localObject2 == null)
    {
      localObject2 = this.zzbqp;
      bool = WalletFragment.zzc((WalletFragment)localObject2);
      if ((!bool) || (localObject1 == null)) {}
    }
    try
    {
      localObject2 = this.zzbqp;
      localObject2 = WalletFragment.zzd((WalletFragment)localObject2);
      Object localObject3 = this.zzbqp;
      localObject3 = WalletFragment.zze((WalletFragment)localObject3);
      Object localObject4 = this.zzbqp;
      localObject4 = WalletFragment.zzf((WalletFragment)localObject4);
      localObject1 = zzsf.zza((Activity)localObject1, (zzc)localObject2, (WalletFragmentOptions)localObject3, (zzry)localObject4);
      localObject2 = this.zzbqp;
      localObject3 = new com/google/android/gms/wallet/fragment/WalletFragment$zzb;
      localObject4 = null;
      ((WalletFragment.zzb)localObject3).<init>((zzrx)localObject1, null);
      WalletFragment.zza((WalletFragment)localObject2, (WalletFragment.zzb)localObject3);
      localObject1 = this.zzbqp;
      bool = false;
      localObject2 = null;
      WalletFragment.zza((WalletFragment)localObject1, null);
      localObject1 = WalletFragment.zzb(this.zzbqp);
      paramzzf.zza((LifecycleDelegate)localObject1);
      localObject1 = WalletFragment.zzg(this.zzbqp);
      if (localObject1 != null)
      {
        localObject1 = WalletFragment.zzb(this.zzbqp);
        localObject2 = WalletFragment.zzg(this.zzbqp);
        WalletFragment.zzb.zza((WalletFragment.zzb)localObject1, (WalletFragmentInitParams)localObject2);
        localObject1 = this.zzbqp;
        WalletFragment.zza((WalletFragment)localObject1, null);
      }
      localObject1 = WalletFragment.zzh(this.zzbqp);
      if (localObject1 != null)
      {
        localObject1 = WalletFragment.zzb(this.zzbqp);
        localObject2 = WalletFragment.zzh(this.zzbqp);
        WalletFragment.zzb.zza((WalletFragment.zzb)localObject1, (MaskedWalletRequest)localObject2);
        localObject1 = this.zzbqp;
        WalletFragment.zza((WalletFragment)localObject1, null);
      }
      localObject1 = WalletFragment.zzi(this.zzbqp);
      if (localObject1 != null)
      {
        localObject1 = WalletFragment.zzb(this.zzbqp);
        localObject2 = WalletFragment.zzi(this.zzbqp);
        WalletFragment.zzb.zza((WalletFragment.zzb)localObject1, (MaskedWallet)localObject2);
        localObject1 = this.zzbqp;
        WalletFragment.zza((WalletFragment)localObject1, null);
      }
      localObject1 = WalletFragment.zzj(this.zzbqp);
      if (localObject1 != null)
      {
        localObject1 = WalletFragment.zzb(this.zzbqp);
        localObject2 = WalletFragment.zzj(this.zzbqp);
        bool = ((Boolean)localObject2).booleanValue();
        WalletFragment.zzb.zza((WalletFragment.zzb)localObject1, bool);
        localObject1 = this.zzbqp;
        WalletFragment.zza((WalletFragment)localObject1, null);
      }
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragment$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */