package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import com.google.android.gms.internal.zzry.zza;

class SupportWalletFragment$zza
  extends zzry.zza
{
  private SupportWalletFragment.OnStateChangedListener zzbqf;
  private final SupportWalletFragment zzbqg;
  
  SupportWalletFragment$zza(SupportWalletFragment paramSupportWalletFragment)
  {
    this.zzbqg = paramSupportWalletFragment;
  }
  
  public void zza(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    SupportWalletFragment.OnStateChangedListener localOnStateChangedListener = this.zzbqf;
    if (localOnStateChangedListener != null)
    {
      localOnStateChangedListener = this.zzbqf;
      SupportWalletFragment localSupportWalletFragment = this.zzbqg;
      localOnStateChangedListener.onStateChanged(localSupportWalletFragment, paramInt1, paramInt2, paramBundle);
    }
  }
  
  public void zza(SupportWalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    this.zzbqf = paramOnStateChangedListener;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\SupportWalletFragment$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */