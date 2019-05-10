package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;

public class zzsd
  implements Payments
{
  public void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    zzsd.4 local4 = new com/google/android/gms/internal/zzsd$4;
    local4.<init>(this, paramGoogleApiClient, paramString1, paramString2, paramInt);
    paramGoogleApiClient.zza(local4);
  }
  
  public void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    zzsd.1 local1 = new com/google/android/gms/internal/zzsd$1;
    local1.<init>(this, paramGoogleApiClient, paramInt);
    paramGoogleApiClient.zza(local1);
  }
  
  public void isNewUser(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    zzsd.6 local6 = new com/google/android/gms/internal/zzsd$6;
    local6.<init>(this, paramGoogleApiClient, paramInt);
    paramGoogleApiClient.zza(local6);
  }
  
  public PendingResult isReadyToPay(GoogleApiClient paramGoogleApiClient)
  {
    zzsd.7 local7 = new com/google/android/gms/internal/zzsd$7;
    local7.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local7);
  }
  
  public void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    zzsd.3 local3 = new com/google/android/gms/internal/zzsd$3;
    local3.<init>(this, paramGoogleApiClient, paramFullWalletRequest, paramInt);
    paramGoogleApiClient.zza(local3);
  }
  
  public void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    zzsd.2 local2 = new com/google/android/gms/internal/zzsd$2;
    local2.<init>(this, paramGoogleApiClient, paramMaskedWalletRequest, paramInt);
    paramGoogleApiClient.zza(local2);
  }
  
  public void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    zzsd.5 local5 = new com/google/android/gms/internal/zzsd$5;
    local5.<init>(this, paramGoogleApiClient, paramNotifyTransactionStatusRequest);
    paramGoogleApiClient.zza(local5);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */