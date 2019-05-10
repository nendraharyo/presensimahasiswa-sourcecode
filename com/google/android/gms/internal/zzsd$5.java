package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Wallet.zzb;

class zzsd$5
  extends Wallet.zzb
{
  zzsd$5(zzsd paramzzsd, GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzse paramzzse)
  {
    Object localObject = this.zzbqB;
    paramzzse.zza((NotifyTransactionStatusRequest)localObject);
    localObject = Status.zzagC;
    zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsd$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */