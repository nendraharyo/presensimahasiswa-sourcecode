package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;

public final class Cast
{
  public static final int ACTIVE_INPUT_STATE_NO = 0;
  public static final int ACTIVE_INPUT_STATE_UNKNOWN = 255;
  public static final int ACTIVE_INPUT_STATE_YES = 1;
  public static final Api API;
  public static final Cast.CastApi CastApi;
  public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
  public static final int MAX_MESSAGE_LENGTH = 65536;
  public static final int MAX_NAMESPACE_LENGTH = 128;
  public static final int STANDBY_STATE_NO = 0;
  public static final int STANDBY_STATE_UNKNOWN = 255;
  public static final int STANDBY_STATE_YES = 1;
  private static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/cast/Cast$1;
    ((Cast.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzk.zzUI;
    ((Api)localObject).<init>("Cast.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/cast/Cast$CastApi$zza;
    ((Cast.CastApi.zza)localObject).<init>();
    CastApi = (Cast.CastApi)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */