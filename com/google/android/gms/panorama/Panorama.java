package com.google.android.gms.panorama;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzqq;

public final class Panorama
{
  public static final Api API;
  public static final PanoramaApi PanoramaApi;
  public static final Api.zzc zzUI;
  static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/panorama/Panorama$1;
    ((Panorama.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("Panorama.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzqq;
    ((zzqq)localObject).<init>();
    PanoramaApi = (PanoramaApi)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\panorama\Panorama.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */