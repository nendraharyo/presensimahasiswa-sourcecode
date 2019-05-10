package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import com.google.android.gms.internal.zzry.zza;

class WalletFragment$zza
  extends zzry.zza
{
  private WalletFragment.OnStateChangedListener zzbqn;
  private final WalletFragment zzbqo;
  
  WalletFragment$zza(WalletFragment paramWalletFragment)
  {
    this.zzbqo = paramWalletFragment;
  }
  
  public void zza(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    WalletFragment.OnStateChangedListener localOnStateChangedListener = this.zzbqn;
    if (localOnStateChangedListener != null)
    {
      localOnStateChangedListener = this.zzbqn;
      WalletFragment localWalletFragment = this.zzbqo;
      localOnStateChangedListener.onStateChanged(localWalletFragment, paramInt1, paramInt2, paramBundle);
    }
  }
  
  public void zza(WalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    this.zzbqn = paramOnStateChangedListener;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragment$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */