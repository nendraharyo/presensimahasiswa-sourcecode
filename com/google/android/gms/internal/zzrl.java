package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zzg;

public final class zzrl
{
  public static final Api API;
  public static final Api.zzc zzUI;
  public static final Api.zza zzUJ;
  public static final Scope zzWW;
  public static final Scope zzWX;
  public static final Api zzaoG;
  public static final Api.zzc zzavN;
  static final Api.zza zzbgS;
  public static final zzrm zzbgT;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzavN = (Api.zzc)localObject;
    localObject = new com/google/android/gms/internal/zzrl$1;
    ((zzrl.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/internal/zzrl$2;
    ((zzrl.2)localObject).<init>();
    zzbgS = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("profile");
    zzWW = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("email");
    zzWX = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("SignIn.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzbgS;
    localzzc = zzavN;
    ((Api)localObject).<init>("SignIn.INTERNAL_API", localzza, localzzc);
    zzaoG = (Api)localObject;
    localObject = new com/google/android/gms/signin/internal/zzg;
    ((zzg)localObject).<init>();
    zzbgT = (zzrm)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */