package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.location.internal.zza;

public class ActivityRecognition
{
  public static final Api API;
  public static final ActivityRecognitionApi ActivityRecognitionApi;
  public static final String CLIENT_NAME = "activity_recognition";
  private static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/location/ActivityRecognition$1;
    ((ActivityRecognition.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("ActivityRecognition.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/location/internal/zza;
    ((zza)localObject).<init>();
    ActivityRecognitionApi = (ActivityRecognitionApi)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\ActivityRecognition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */