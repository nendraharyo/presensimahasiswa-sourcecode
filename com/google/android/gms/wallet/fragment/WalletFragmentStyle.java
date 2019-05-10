package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentStyle
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  Bundle zzbqu;
  int zzbqv;
  
  static
  {
    zzc localzzc = new com/google/android/gms/wallet/fragment/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  public WalletFragmentStyle()
  {
    this.mVersionCode = 1;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.zzbqu = localBundle;
    this.zzbqu.putInt("buyButtonAppearanceDefault", 4);
    this.zzbqu.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
  }
  
  WalletFragmentStyle(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzbqu = paramBundle;
    this.zzbqv = paramInt2;
  }
  
  private static int zza(long paramLong, DisplayMetrics paramDisplayMetrics)
  {
    float f1 = 4.5E-44F;
    long l = paramLong >>> 32;
    int i = (int)l;
    int j = (int)paramLong;
    String str;
    switch (i)
    {
    default: 
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = "Unexpected unit or type: " + i;
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    case 129: 
    case 128: 
      for (i = j;; i = TypedValue.complexToDimensionPixelSize(j, paramDisplayMetrics)) {
        return i;
      }
    case 0: 
      i = 0;
      f1 = 0.0F;
      str = null;
    }
    for (;;)
    {
      float f2 = Float.intBitsToFloat(j);
      f1 = TypedValue.applyDimension(i, f2, paramDisplayMetrics);
      i = Math.round(f1);
      break;
      i = 1;
      f1 = Float.MIN_VALUE;
      continue;
      i = 2;
      f1 = 2.8E-45F;
      continue;
      i = 3;
      f1 = 4.2E-45F;
      continue;
      i = 4;
      f1 = 5.6E-45F;
      continue;
      i = 5;
      f1 = 7.0E-45F;
    }
  }
  
  private static long zza(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unrecognized unit: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int i = Float.floatToIntBits(paramFloat);
    return zzv(paramInt, i);
  }
  
  private static long zza(TypedValue paramTypedValue)
  {
    int i = paramTypedValue.type;
    switch (i)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Unexpected dimension type: ");
      int j = paramTypedValue.type;
      localObject = j;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    case 16: 
      i = paramTypedValue.data;
    }
    int k;
    for (long l = zzll(i);; l = zzv(i, k))
    {
      return l;
      i = 128;
      k = paramTypedValue.data;
    }
  }
  
  private void zza(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    Object localObject = this.zzbqu;
    boolean bool = ((Bundle)localObject).containsKey(paramString);
    if (bool) {}
    for (;;)
    {
      return;
      localObject = paramTypedArray.peekValue(paramInt);
      if (localObject != null)
      {
        Bundle localBundle = this.zzbqu;
        long l = zza((TypedValue)localObject);
        localBundle.putLong(paramString, l);
      }
    }
  }
  
  private void zza(TypedArray paramTypedArray, int paramInt, String paramString1, String paramString2)
  {
    Object localObject = this.zzbqu;
    boolean bool = ((Bundle)localObject).containsKey(paramString1);
    if (!bool)
    {
      localObject = this.zzbqu;
      bool = ((Bundle)localObject).containsKey(paramString2);
      if (!bool) {
        break label40;
      }
    }
    for (;;)
    {
      return;
      label40:
      localObject = paramTypedArray.peekValue(paramInt);
      if (localObject != null)
      {
        int j = ((TypedValue)localObject).type;
        int k = 28;
        if (j >= k)
        {
          j = ((TypedValue)localObject).type;
          k = 31;
          if (j <= k)
          {
            localBundle = this.zzbqu;
            i = ((TypedValue)localObject).data;
            localBundle.putInt(paramString1, i);
            continue;
          }
        }
        Bundle localBundle = this.zzbqu;
        int i = ((TypedValue)localObject).resourceId;
        localBundle.putInt(paramString2, i);
      }
    }
  }
  
  private void zzb(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    Object localObject = this.zzbqu;
    boolean bool = ((Bundle)localObject).containsKey(paramString);
    if (bool) {}
    for (;;)
    {
      return;
      localObject = paramTypedArray.peekValue(paramInt);
      if (localObject != null)
      {
        Bundle localBundle = this.zzbqu;
        int i = ((TypedValue)localObject).data;
        localBundle.putInt(paramString, i);
      }
    }
  }
  
  private static long zzll(int paramInt)
  {
    int i;
    if (paramInt < 0)
    {
      i = -1;
      if (paramInt != i)
      {
        i = -2;
        if (paramInt != i) {}
      }
      else
      {
        i = 129;
      }
    }
    float f;
    for (long l = zzv(i, paramInt);; l = zza(0, f))
    {
      return l;
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unexpected dimension value: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
      i = 0;
      localIllegalArgumentException = null;
      f = paramInt;
    }
  }
  
  private static long zzv(int paramInt1, int paramInt2)
  {
    long l1 = paramInt1 << 32;
    long l2 = paramInt2 & 0xFFFFFFFF;
    return l1 | l2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public WalletFragmentStyle setBuyButtonAppearance(int paramInt)
  {
    this.zzbqu.putInt("buyButtonAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setBuyButtonHeight(int paramInt)
  {
    Bundle localBundle = this.zzbqu;
    long l = zzll(paramInt);
    localBundle.putLong("buyButtonHeight", l);
    return this;
  }
  
  public WalletFragmentStyle setBuyButtonHeight(int paramInt, float paramFloat)
  {
    Bundle localBundle = this.zzbqu;
    long l = zza(paramInt, paramFloat);
    localBundle.putLong("buyButtonHeight", l);
    return this;
  }
  
  public WalletFragmentStyle setBuyButtonText(int paramInt)
  {
    this.zzbqu.putInt("buyButtonText", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setBuyButtonWidth(int paramInt)
  {
    Bundle localBundle = this.zzbqu;
    long l = zzll(paramInt);
    localBundle.putLong("buyButtonWidth", l);
    return this;
  }
  
  public WalletFragmentStyle setBuyButtonWidth(int paramInt, float paramFloat)
  {
    Bundle localBundle = this.zzbqu;
    long l = zza(paramInt, paramFloat);
    localBundle.putLong("buyButtonWidth", l);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int paramInt)
  {
    this.zzbqu.remove("maskedWalletDetailsBackgroundResource");
    this.zzbqu.putInt("maskedWalletDetailsBackgroundColor", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int paramInt)
  {
    this.zzbqu.remove("maskedWalletDetailsBackgroundColor");
    this.zzbqu.putInt("maskedWalletDetailsBackgroundResource", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int paramInt)
  {
    this.zzbqu.remove("maskedWalletDetailsButtonBackgroundResource");
    this.zzbqu.putInt("maskedWalletDetailsButtonBackgroundColor", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int paramInt)
  {
    this.zzbqu.remove("maskedWalletDetailsButtonBackgroundColor");
    this.zzbqu.putInt("maskedWalletDetailsButtonBackgroundResource", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int paramInt)
  {
    this.zzbqu.putInt("maskedWalletDetailsButtonTextAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int paramInt)
  {
    this.zzbqu.putInt("maskedWalletDetailsHeaderTextAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int paramInt)
  {
    this.zzbqu.putInt("maskedWalletDetailsLogoImageType", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int paramInt)
  {
    this.zzbqu.putInt("maskedWalletDetailsLogoTextColor", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int paramInt)
  {
    this.zzbqu.putInt("maskedWalletDetailsTextAppearance", paramInt);
    return this;
  }
  
  public WalletFragmentStyle setStyleResourceId(int paramInt)
  {
    this.zzbqv = paramInt;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public int zza(String paramString, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    Bundle localBundle = this.zzbqu;
    boolean bool = localBundle.containsKey(paramString);
    if (bool)
    {
      localBundle = this.zzbqu;
      long l = localBundle.getLong(paramString);
      paramInt = zza(l, paramDisplayMetrics);
    }
    return paramInt;
  }
  
  public void zzbc(Context paramContext)
  {
    int i = this.zzbqv;
    if (i <= 0) {}
    for (i = R.style.WalletFragmentDefaultStyle;; i = this.zzbqv)
    {
      int[] arrayOfInt = R.styleable.WalletFragmentStyle;
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(i, arrayOfInt);
      int j = R.styleable.WalletFragmentStyle_buyButtonWidth;
      zza(localTypedArray, j, "buyButtonWidth");
      j = R.styleable.WalletFragmentStyle_buyButtonHeight;
      zza(localTypedArray, j, "buyButtonHeight");
      j = R.styleable.WalletFragmentStyle_buyButtonText;
      zzb(localTypedArray, j, "buyButtonText");
      j = R.styleable.WalletFragmentStyle_buyButtonAppearance;
      zzb(localTypedArray, j, "buyButtonAppearance");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance;
      zzb(localTypedArray, j, "maskedWalletDetailsTextAppearance");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance;
      zzb(localTypedArray, j, "maskedWalletDetailsHeaderTextAppearance");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground;
      zza(localTypedArray, j, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance;
      zzb(localTypedArray, j, "maskedWalletDetailsButtonTextAppearance");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground;
      zza(localTypedArray, j, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor;
      zzb(localTypedArray, j, "maskedWalletDetailsLogoTextColor");
      j = R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType;
      zzb(localTypedArray, j, "maskedWalletDetailsLogoImageType");
      localTypedArray.recycle();
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\fragment\WalletFragmentStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */