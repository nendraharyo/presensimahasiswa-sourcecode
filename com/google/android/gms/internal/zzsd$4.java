package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.Wallet.zzb;

class zzsd$4
  extends Wallet.zzb
{
  zzsd$4(zzsd paramzzsd, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzse paramzzse)
  {
    Object localObject = this.zzbqz;
    String str = this.zzbqA;
    int i = this.val$requestCode;
    paramzzse.zzf((String)localObject, str, i);
    localObject = Status.zzagC;
    zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsd$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */