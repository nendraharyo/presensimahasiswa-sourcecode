package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;

public final class Wallet$WalletOptions
  implements Api.ApiOptions.HasOptions
{
  public final int environment;
  public final int theme;
  private final boolean zzbpL;
  
  private Wallet$WalletOptions()
  {
    this(localBuilder);
  }
  
  private Wallet$WalletOptions(Wallet.WalletOptions.Builder paramBuilder)
  {
    int i = Wallet.WalletOptions.Builder.zza(paramBuilder);
    this.environment = i;
    i = Wallet.WalletOptions.Builder.zzb(paramBuilder);
    this.theme = i;
    boolean bool = Wallet.WalletOptions.Builder.zzc(paramBuilder);
    this.zzbpL = bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\Wallet$WalletOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */