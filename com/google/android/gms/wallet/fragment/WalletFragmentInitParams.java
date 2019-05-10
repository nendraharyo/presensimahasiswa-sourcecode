package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private String zzVa;
  private MaskedWalletRequest zzbqc;
  private MaskedWallet zzbqd;
  private int zzbqq;
  
  static
  {
    zza localzza = new com/google/android/gms/wallet/fragment/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  private WalletFragmentInitParams()
  {
    this.mVersionCode = 1;
    this.zzbqq = -1;
  }
  
  WalletFragmentInitParams(int paramInt1, String paramString, MaskedWalletRequest paramMaskedWalletRequest, int paramInt2, MaskedWallet paramMaskedWallet)
  {
    this.mVersionCode = paramInt1;
    this.zzVa = paramString;
    this.zzbqc = paramMaskedWalletRequest;
    this.zzbqq = paramInt2;
    this.zzbqd = paramMaskedWallet;
  }
  
  public static WalletFragmentInitParams.Builder newBuilder()
  {
    WalletFragmentInitParams.Builder localBuilder = new com/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
    WalletFragmentInitParams localWalletFragmentInitParams = new com/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    localWalletFragmentInitParams.<init>();
    localWalletFragmentInitParams.getClass();
    localBuilder.<init>(localWalletFragmentInitParams, null);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAccountName()
  {
    return this.zzVa;
  }
  
  public MaskedWallet getMaskedWallet()
  {
    return this.zzbqd;
  }
  
  public MaskedWalletRequest getMaskedWalletRequest()
  {
    return this.zzbqc;
  }
  
  public int getMaskedWalletRequestCode()
  {
    return this.zzbqq;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragmentInitParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */