package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
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

class SupportWalletFragment$zzc
  extends zza
  implements View.OnClickListener
{
  private SupportWalletFragment$zzc(SupportWalletFragment paramSupportWalletFragment) {}
  
  public void onClick(View paramView)
  {
    i locali = SupportWalletFragment.zza(this.zzbqi).getActivity();
    GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(locali), locali, -1);
  }
  
  protected void zza(FrameLayout paramFrameLayout)
  {
    Button localButton = new android/widget/Button;
    i locali = SupportWalletFragment.zza(this.zzbqi).getActivity();
    localButton.<init>(locali);
    int i = R.string.wallet_buy_button_place_holder;
    localButton.setText(i);
    int j = -1;
    i = -2;
    Object localObject = SupportWalletFragment.zze(this.zzbqi);
    if (localObject != null)
    {
      localObject = SupportWalletFragment.zze(this.zzbqi).getFragmentStyle();
      if (localObject != null)
      {
        DisplayMetrics localDisplayMetrics = SupportWalletFragment.zza(this.zzbqi).getResources().getDisplayMetrics();
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
    Object localObject1 = SupportWalletFragment.zza(this.zzbqi).getActivity();
    Object localObject2 = SupportWalletFragment.zzb(this.zzbqi);
    boolean bool;
    if (localObject2 == null)
    {
      localObject2 = this.zzbqi;
      bool = SupportWalletFragment.zzc((SupportWalletFragment)localObject2);
      if ((!bool) || (localObject1 == null)) {}
    }
    try
    {
      localObject2 = this.zzbqi;
      localObject2 = SupportWalletFragment.zzd((SupportWalletFragment)localObject2);
      Object localObject3 = this.zzbqi;
      localObject3 = SupportWalletFragment.zze((SupportWalletFragment)localObject3);
      Object localObject4 = this.zzbqi;
      localObject4 = SupportWalletFragment.zzf((SupportWalletFragment)localObject4);
      localObject1 = zzsf.zza((Activity)localObject1, (zzc)localObject2, (WalletFragmentOptions)localObject3, (zzry)localObject4);
      localObject2 = this.zzbqi;
      localObject3 = new com/google/android/gms/wallet/fragment/SupportWalletFragment$zzb;
      localObject4 = null;
      ((SupportWalletFragment.zzb)localObject3).<init>((zzrx)localObject1, null);
      SupportWalletFragment.zza((SupportWalletFragment)localObject2, (SupportWalletFragment.zzb)localObject3);
      localObject1 = this.zzbqi;
      bool = false;
      localObject2 = null;
      SupportWalletFragment.zza((SupportWalletFragment)localObject1, null);
      localObject1 = SupportWalletFragment.zzb(this.zzbqi);
      paramzzf.zza((LifecycleDelegate)localObject1);
      localObject1 = SupportWalletFragment.zzg(this.zzbqi);
      if (localObject1 != null)
      {
        localObject1 = SupportWalletFragment.zzb(this.zzbqi);
        localObject2 = SupportWalletFragment.zzg(this.zzbqi);
        SupportWalletFragment.zzb.zza((SupportWalletFragment.zzb)localObject1, (WalletFragmentInitParams)localObject2);
        localObject1 = this.zzbqi;
        SupportWalletFragment.zza((SupportWalletFragment)localObject1, null);
      }
      localObject1 = SupportWalletFragment.zzh(this.zzbqi);
      if (localObject1 != null)
      {
        localObject1 = SupportWalletFragment.zzb(this.zzbqi);
        localObject2 = SupportWalletFragment.zzh(this.zzbqi);
        SupportWalletFragment.zzb.zza((SupportWalletFragment.zzb)localObject1, (MaskedWalletRequest)localObject2);
        localObject1 = this.zzbqi;
        SupportWalletFragment.zza((SupportWalletFragment)localObject1, null);
      }
      localObject1 = SupportWalletFragment.zzi(this.zzbqi);
      if (localObject1 != null)
      {
        localObject1 = SupportWalletFragment.zzb(this.zzbqi);
        localObject2 = SupportWalletFragment.zzi(this.zzbqi);
        SupportWalletFragment.zzb.zza((SupportWalletFragment.zzb)localObject1, (MaskedWallet)localObject2);
        localObject1 = this.zzbqi;
        SupportWalletFragment.zza((SupportWalletFragment)localObject1, null);
      }
      localObject1 = SupportWalletFragment.zzj(this.zzbqi);
      if (localObject1 != null)
      {
        localObject1 = SupportWalletFragment.zzb(this.zzbqi);
        localObject2 = SupportWalletFragment.zzj(this.zzbqi);
        bool = ((Boolean)localObject2).booleanValue();
        SupportWalletFragment.zzb.zza((SupportWalletFragment.zzb)localObject1, bool);
        localObject1 = this.zzbqi;
        SupportWalletFragment.zza((SupportWalletFragment)localObject1, null);
      }
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\SupportWalletFragment$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */