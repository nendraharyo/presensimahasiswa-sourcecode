package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.location.places.internal.zzd;
import com.google.android.gms.location.places.internal.zze.zza;
import com.google.android.gms.location.places.internal.zzj;
import com.google.android.gms.location.places.internal.zzk.zza;

public class Places
{
  public static final Api GEO_DATA_API;
  public static final GeoDataApi GeoDataApi;
  public static final Api PLACE_DETECTION_API;
  public static final PlaceDetectionApi PlaceDetectionApi;
  public static final Api.zzc zzaPN;
  public static final Api.zzc zzaPO;
  
  static
  {
    Object localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzaPN = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzaPO = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    Object localObject2 = new com/google/android/gms/location/places/internal/zze$zza;
    ((zze.zza)localObject2).<init>(null);
    Api.zzc localzzc = zzaPN;
    ((Api)localObject1).<init>("Places.GEO_DATA_API", (Api.zza)localObject2, localzzc);
    GEO_DATA_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/location/places/internal/zzk$zza;
    ((zzk.zza)localObject2).<init>(null);
    localzzc = zzaPO;
    ((Api)localObject1).<init>("Places.PLACE_DETECTION_API", (Api.zza)localObject2, localzzc);
    PLACE_DETECTION_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/location/places/internal/zzd;
    ((zzd)localObject1).<init>();
    GeoDataApi = (GeoDataApi)localObject1;
    localObject1 = new com/google/android/gms/location/places/internal/zzj;
    ((zzj)localObject1).<init>();
    PlaceDetectionApi = (PlaceDetectionApi)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\Places.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */