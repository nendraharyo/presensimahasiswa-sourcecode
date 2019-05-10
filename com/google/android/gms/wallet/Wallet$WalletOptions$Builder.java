package com.google.android.gms.wallet;

import java.util.Locale;

public final class Wallet$WalletOptions$Builder
{
  private int mTheme = 0;
  private int zzbpM = 3;
  private boolean zzbpN = true;
  
  public Wallet.WalletOptions build()
  {
    Wallet.WalletOptions localWalletOptions = new com/google/android/gms/wallet/Wallet$WalletOptions;
    localWalletOptions.<init>(this, null);
    return localWalletOptions;
  }
  
  public Builder setEnvironment(int paramInt)
  {
    int i = 1;
    if (paramInt != 0)
    {
      int j = 2;
      if ((paramInt != j) && (paramInt != i))
      {
        j = 3;
        if (paramInt != j) {
          break label32;
        }
      }
    }
    this.zzbpM = paramInt;
    return this;
    label32:
    Object localObject = Locale.US;
    Object[] arrayOfObject = new Object[i];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    localObject = String.format((Locale)localObject, "Invalid environment value %d", arrayOfObject);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public Builder setTheme(int paramInt)
  {
    int i = 1;
    if ((paramInt == 0) || (paramInt == i))
    {
      this.mTheme = paramInt;
      return this;
    }
    Object localObject = Locale.US;
    Object[] arrayOfObject = new Object[i];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    localObject = String.format((Locale)localObject, "Invalid theme value %d", arrayOfObject);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public Builder useGoogleWallet()
  {
    this.zzbpN = false;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\Wallet$WalletOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */