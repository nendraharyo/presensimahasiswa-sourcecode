package com.google.android.gms.wallet.fragment;

public final class WalletFragmentOptions$Builder
{
  private WalletFragmentOptions$Builder(WalletFragmentOptions paramWalletFragmentOptions) {}
  
  public WalletFragmentOptions build()
  {
    return this.zzbqt;
  }
  
  public Builder setEnvironment(int paramInt)
  {
    WalletFragmentOptions.zza(this.zzbqt, paramInt);
    return this;
  }
  
  public Builder setFragmentStyle(int paramInt)
  {
    WalletFragmentOptions localWalletFragmentOptions = this.zzbqt;
    WalletFragmentStyle localWalletFragmentStyle = new com/google/android/gms/wallet/fragment/WalletFragmentStyle;
    localWalletFragmentStyle.<init>();
    localWalletFragmentStyle = localWalletFragmentStyle.setStyleResourceId(paramInt);
    WalletFragmentOptions.zza(localWalletFragmentOptions, localWalletFragmentStyle);
    return this;
  }
  
  public Builder setFragmentStyle(WalletFragmentStyle paramWalletFragmentStyle)
  {
    WalletFragmentOptions.zza(this.zzbqt, paramWalletFragmentStyle);
    return this;
  }
  
  public Builder setMode(int paramInt)
  {
    WalletFragmentOptions.zzc(this.zzbqt, paramInt);
    return this;
  }
  
  public Builder setTheme(int paramInt)
  {
    WalletFragmentOptions.zzb(this.zzbqt, paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragmentOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */