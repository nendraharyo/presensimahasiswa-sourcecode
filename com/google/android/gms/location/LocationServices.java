package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zzf;
import com.google.android.gms.location.internal.zzl;
import com.google.android.gms.location.internal.zzq;

public class LocationServices
{
  public static final Api API;
  public static final FusedLocationProviderApi FusedLocationApi;
  public static final GeofencingApi GeofencingApi;
  public static final SettingsApi SettingsApi;
  private static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/location/LocationServices$1;
    ((LocationServices.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("LocationServices.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/location/internal/zzd;
    ((zzd)localObject).<init>();
    FusedLocationApi = (FusedLocationProviderApi)localObject;
    localObject = new com/google/android/gms/location/internal/zzf;
    ((zzf)localObject).<init>();
    GeofencingApi = (GeofencingApi)localObject;
    localObject = new com/google/android/gms/location/internal/zzq;
    ((zzq)localObject).<init>();
    SettingsApi = (SettingsApi)localObject;
  }
  
  public static zzl zzi(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    Object localObject;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      String str = "GoogleApiClient parameter is required.";
      zzx.zzb(bool2, str);
      localObject = zzUI;
      localObject = (zzl)paramGoogleApiClient.zza((Api.zzc)localObject);
      if (localObject == null) {
        break label54;
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return (zzl)localObject;
      bool2 = false;
      localObject = null;
      break;
      label54:
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationServices.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */