package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;

public final class Address
{
  public static final Api API;
  static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/identity/intents/Address$1;
    ((Address.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("Address.API", localzza, localzzc);
    API = (Api)localObject;
  }
  
  public static void requestUserAddress(GoogleApiClient paramGoogleApiClient, UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    Address.2 local2 = new com/google/android/gms/identity/intents/Address$2;
    local2.<init>(paramGoogleApiClient, paramUserAddressRequest, paramInt);
    paramGoogleApiClient.zza(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\identity\intents\Address.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */