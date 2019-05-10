package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzre;
import com.google.android.gms.internal.zzrg;

public final class SafetyNet
{
  public static final Api API;
  public static final SafetyNetApi SafetyNetApi;
  public static final Api.zzc zzUI;
  public static final Api.zza zzUJ;
  public static final zzc zzbgw;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/safetynet/SafetyNet$1;
    ((SafetyNet.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("SafetyNet.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzre;
    ((zzre)localObject).<init>();
    SafetyNetApi = (SafetyNetApi)localObject;
    localObject = new com/google/android/gms/internal/zzrg;
    ((zzrg)localObject).<init>();
    zzbgw = (zzc)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\safetynet\SafetyNet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */