package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.Wallet.zzb;

class zzsd$2
  extends Wallet.zzb
{
  zzsd$2(zzsd paramzzsd, GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzse paramzzse)
  {
    Object localObject = this.zzbqx;
    int i = this.val$requestCode;
    paramzzse.zza((MaskedWalletRequest)localObject, i);
    localObject = Status.zzagC;
    zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsd$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */