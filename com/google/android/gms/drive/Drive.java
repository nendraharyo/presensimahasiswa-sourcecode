package com.google.android.gms.drive;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.zzaa;
import com.google.android.gms.drive.internal.zzac;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.internal.zzx;

public final class Drive
{
  public static final Api API;
  public static final DriveApi DriveApi;
  public static final DrivePreferencesApi DrivePreferencesApi;
  public static final Scope SCOPE_APPFOLDER;
  public static final Scope SCOPE_FILE;
  public static final Api.zzc zzUI;
  public static final Scope zzaoE;
  public static final Scope zzaoF;
  public static final Api zzaoG;
  public static final zzd zzaoH;
  public static final zzf zzaoI;
  
  static
  {
    Object localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzUI = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/drive.file");
    SCOPE_FILE = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/drive.appdata");
    SCOPE_APPFOLDER = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/drive");
    zzaoE = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/drive.apps");
    zzaoF = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    Object localObject2 = new com/google/android/gms/drive/Drive$1;
    ((Drive.1)localObject2).<init>();
    Api.zzc localzzc = zzUI;
    ((Api)localObject1).<init>("Drive.API", (Api.zza)localObject2, localzzc);
    API = (Api)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/drive/Drive$2;
    ((Drive.2)localObject2).<init>();
    localzzc = zzUI;
    ((Api)localObject1).<init>("Drive.INTERNAL_API", (Api.zza)localObject2, localzzc);
    zzaoG = (Api)localObject1;
    localObject1 = new com/google/android/gms/drive/internal/zzs;
    ((zzs)localObject1).<init>();
    DriveApi = (DriveApi)localObject1;
    localObject1 = new com/google/android/gms/drive/internal/zzx;
    ((zzx)localObject1).<init>();
    zzaoH = (zzd)localObject1;
    localObject1 = new com/google/android/gms/drive/internal/zzac;
    ((zzac)localObject1).<init>();
    zzaoI = (zzf)localObject1;
    localObject1 = new com/google/android/gms/drive/internal/zzaa;
    ((zzaa)localObject1).<init>();
    DrivePreferencesApi = (DrivePreferencesApi)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\Drive.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */