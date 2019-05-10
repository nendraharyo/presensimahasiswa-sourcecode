package com.google.android.gms.internal;

import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest.zza;
import com.google.android.gms.wallet.Wallet.zza;

class zzsd$7
  extends Wallet.zza
{
  zzsd$7(zzsd paramzzsd, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected BooleanResult zzA(Status paramStatus)
  {
    BooleanResult localBooleanResult = new com/google/android/gms/common/api/BooleanResult;
    localBooleanResult.<init>(paramStatus, false);
    return localBooleanResult;
  }
  
  protected void zza(zzse paramzzse)
  {
    IsReadyToPayRequest localIsReadyToPayRequest = IsReadyToPayRequest.zzIj().zzIk();
    paramzzse.zza(localIsReadyToPayRequest, this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsd$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */