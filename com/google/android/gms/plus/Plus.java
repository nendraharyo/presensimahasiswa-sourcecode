package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.plus.internal.zze;

public final class Plus
{
  public static final Api API;
  public static final Account AccountApi;
  public static final Moments MomentsApi;
  public static final People PeopleApi;
  public static final Scope SCOPE_PLUS_LOGIN;
  public static final Scope SCOPE_PLUS_PROFILE;
  public static final Api.zzc zzUI;
  static final Api.zza zzUJ;
  public static final zzb zzbdW;
  public static final zza zzbdX;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/plus/Plus$1;
    ((Plus.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("Plus.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("https://www.googleapis.com/auth/plus.login");
    SCOPE_PLUS_LOGIN = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("https://www.googleapis.com/auth/plus.me");
    SCOPE_PLUS_PROFILE = (Scope)localObject;
    localObject = new com/google/android/gms/internal/zzqy;
    ((zzqy)localObject).<init>();
    MomentsApi = (Moments)localObject;
    localObject = new com/google/android/gms/internal/zzqz;
    ((zzqz)localObject).<init>();
    PeopleApi = (People)localObject;
    localObject = new com/google/android/gms/internal/zzqv;
    ((zzqv)localObject).<init>();
    AccountApi = (Account)localObject;
    localObject = new com/google/android/gms/internal/zzqx;
    ((zzqx)localObject).<init>();
    zzbdW = (zzb)localObject;
    localObject = new com/google/android/gms/internal/zzqw;
    ((zzqw)localObject).<init>();
    zzbdX = (zza)localObject;
  }
  
  public static zze zzf(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    boolean bool;
    if (paramGoogleApiClient != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "GoogleApiClient parameter is required.");
      zzx.zza(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      localObject = API;
      bool = paramGoogleApiClient.zza((Api)localObject);
      String str = "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.";
      zzx.zza(bool, str);
      localObject = API;
      bool = paramGoogleApiClient.hasConnectedApi((Api)localObject);
      if ((!paramBoolean) || (bool)) {
        break;
      }
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
      throw ((Throwable)localObject);
      bool = false;
      localObject = null;
    }
    if (bool) {
      localObject = zzUI;
    }
    for (Object localObject = (zze)paramGoogleApiClient.zza((Api.zzc)localObject);; localObject = null)
    {
      return (zze)localObject;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\Plus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */