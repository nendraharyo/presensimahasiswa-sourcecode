package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzpn;

final class Address$2
  extends Address.zza
{
  Address$2(GoogleApiClient paramGoogleApiClient, UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzpn paramzzpn)
  {
    Object localObject = this.zzaMz;
    int i = this.val$requestCode;
    paramzzpn.zza((UserAddressRequest)localObject, i);
    localObject = Status.zzagC;
    zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\identity\intents\Address$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */