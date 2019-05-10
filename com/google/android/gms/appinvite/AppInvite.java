package com.google.android.gms.appinvite;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzkl;

public final class AppInvite
{
  public static final Api API;
  public static final AppInviteApi AppInviteApi;
  public static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/appinvite/AppInvite$1;
    ((AppInvite.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("AppInvite.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzkl;
    ((zzkl)localObject).<init>();
    AppInviteApi = (AppInviteApi)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appinvite\AppInvite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */