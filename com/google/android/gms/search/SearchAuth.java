package com.google.android.gms.search;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzrk;

public class SearchAuth
{
  public static final Api API;
  public static final SearchAuthApi SearchAuthApi;
  public static final Api.zzc zzUI;
  private static final Api.zza zzbgI;
  
  static
  {
    Object localObject = new com/google/android/gms/search/SearchAuth$1;
    ((SearchAuth.1)localObject).<init>();
    zzbgI = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzbgI;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("SearchAuth.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzrk;
    ((zzrk)localObject).<init>();
    SearchAuthApi = (SearchAuthApi)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\search\SearchAuth.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */