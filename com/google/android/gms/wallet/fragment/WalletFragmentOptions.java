package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private int mTheme;
  final int mVersionCode;
  private int zzaoy;
  private int zzbpM;
  private WalletFragmentStyle zzbqs;
  
  static
  {
    zzb localzzb = new com/google/android/gms/wallet/fragment/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  private WalletFragmentOptions()
  {
    this.mVersionCode = 1;
    this.zzbpM = 3;
    WalletFragmentStyle localWalletFragmentStyle = new com/google/android/gms/wallet/fragment/WalletFragmentStyle;
    localWalletFragmentStyle.<init>();
    this.zzbqs = localWalletFragmentStyle;
  }
  
  WalletFragmentOptions(int paramInt1, int paramInt2, int paramInt3, WalletFragmentStyle paramWalletFragmentStyle, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.zzbpM = paramInt2;
    this.mTheme = paramInt3;
    this.zzbqs = paramWalletFragmentStyle;
    this.zzaoy = paramInt4;
  }
  
  public static WalletFragmentOptions.Builder newBuilder()
  {
    WalletFragmentOptions.Builder localBuilder = new com/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    WalletFragmentOptions localWalletFragmentOptions = new com/google/android/gms/wallet/fragment/WalletFragmentOptions;
    localWalletFragmentOptions.<init>();
    localWalletFragmentOptions.getClass();
    localBuilder.<init>(localWalletFragmentOptions, null);
    return localBuilder;
  }
  
  public static WalletFragmentOptions zzb(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 1;
    Object localObject = R.styleable.WalletFragmentOptions;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = R.styleable.WalletFragmentOptions_appTheme;
    j = ((TypedArray)localObject).getInt(j, 0);
    int k = R.styleable.WalletFragmentOptions_environment;
    k = ((TypedArray)localObject).getInt(k, i);
    int m = R.styleable.WalletFragmentOptions_fragmentStyle;
    m = ((TypedArray)localObject).getResourceId(m, 0);
    int n = R.styleable.WalletFragmentOptions_fragmentMode;
    n = ((TypedArray)localObject).getInt(n, i);
    ((TypedArray)localObject).recycle();
    localObject = new com/google/android/gms/wallet/fragment/WalletFragmentOptions;
    ((WalletFragmentOptions)localObject).<init>();
    ((WalletFragmentOptions)localObject).mTheme = j;
    ((WalletFragmentOptions)localObject).zzbpM = k;
    WalletFragmentStyle localWalletFragmentStyle = new com/google/android/gms/wallet/fragment/WalletFragmentStyle;
    localWalletFragmentStyle.<init>();
    localWalletFragmentStyle = localWalletFragmentStyle.setStyleResourceId(m);
    ((WalletFragmentOptions)localObject).zzbqs = localWalletFragmentStyle;
    ((WalletFragmentOptions)localObject).zzbqs.zzbc(paramContext);
    ((WalletFragmentOptions)localObject).zzaoy = n;
    return (WalletFragmentOptions)localObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getEnvironment()
  {
    return this.zzbpM;
  }
  
  public WalletFragmentStyle getFragmentStyle()
  {
    return this.zzbqs;
  }
  
  public int getMode()
  {
    return this.zzaoy;
  }
  
  public int getTheme()
  {
    return this.mTheme;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public void zzbc(Context paramContext)
  {
    WalletFragmentStyle localWalletFragmentStyle = this.zzbqs;
    if (localWalletFragmentStyle != null)
    {
      localWalletFragmentStyle = this.zzbqs;
      localWalletFragmentStyle.zzbc(paramContext);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragmentOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */