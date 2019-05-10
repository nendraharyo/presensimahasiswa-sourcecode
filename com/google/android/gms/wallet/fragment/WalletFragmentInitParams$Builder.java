package com.google.android.gms.wallet.fragment;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams$Builder
{
  private WalletFragmentInitParams$Builder(WalletFragmentInitParams paramWalletFragmentInitParams) {}
  
  public WalletFragmentInitParams build()
  {
    boolean bool1 = true;
    Object localObject = WalletFragmentInitParams.zza(this.zzbqr);
    if (localObject != null)
    {
      localObject = WalletFragmentInitParams.zzb(this.zzbqr);
      if (localObject == null) {}
    }
    else
    {
      localObject = WalletFragmentInitParams.zza(this.zzbqr);
      if (localObject != null) {
        break label87;
      }
      localObject = WalletFragmentInitParams.zzb(this.zzbqr);
      if (localObject == null) {
        break label87;
      }
    }
    boolean bool2 = bool1;
    String str = "Exactly one of MaskedWallet or MaskedWalletRequest is required";
    zzx.zza(bool2, str);
    localObject = this.zzbqr;
    int i = WalletFragmentInitParams.zzc((WalletFragmentInitParams)localObject);
    if (i >= 0) {}
    for (;;)
    {
      zzx.zza(bool1, "masked wallet request code is required and must be non-negative");
      return this.zzbqr;
      label87:
      i = 0;
      localObject = null;
      break;
      bool1 = false;
    }
  }
  
  public Builder setAccountName(String paramString)
  {
    WalletFragmentInitParams.zza(this.zzbqr, paramString);
    return this;
  }
  
  public Builder setMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    WalletFragmentInitParams.zza(this.zzbqr, paramMaskedWallet);
    return this;
  }
  
  public Builder setMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    WalletFragmentInitParams.zza(this.zzbqr, paramMaskedWalletRequest);
    return this;
  }
  
  public Builder setMaskedWalletRequestCode(int paramInt)
  {
    WalletFragmentInitParams.zza(this.zzbqr, paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragmentInitParams$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */