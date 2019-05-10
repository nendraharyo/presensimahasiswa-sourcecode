package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.zzsd;
import com.google.android.gms.internal.zzsg;
import com.google.android.gms.internal.zzsh;
import com.google.android.gms.wallet.firstparty.zza;
import com.google.android.gms.wallet.wobs.zzj;

public final class Wallet
{
  public static final Api API;
  public static final Payments Payments;
  private static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  public static final zzj zzbpJ;
  public static final zza zzbpK;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/wallet/Wallet$1;
    ((Wallet.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("Wallet.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzsd;
    ((zzsd)localObject).<init>();
    Payments = (Payments)localObject;
    localObject = new com/google/android/gms/internal/zzsh;
    ((zzsh)localObject).<init>();
    zzbpJ = (zzj)localObject;
    localObject = new com/google/android/gms/internal/zzsg;
    ((zzsg)localObject).<init>();
    zzbpK = (zza)localObject;
  }
  
  public static void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    Payments.changeMaskedWallet(paramGoogleApiClient, paramString1, paramString2, paramInt);
  }
  
  public static void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    Payments.checkForPreAuthorization(paramGoogleApiClient, paramInt);
  }
  
  public static void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    Payments.loadFullWallet(paramGoogleApiClient, paramFullWalletRequest, paramInt);
  }
  
  public static void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Payments.loadMaskedWallet(paramGoogleApiClient, paramMaskedWalletRequest, paramInt);
  }
  
  public static void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Payments.notifyTransactionStatus(paramGoogleApiClient, paramNotifyTransactionStatusRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\Wallet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */