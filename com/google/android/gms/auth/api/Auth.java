package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.consent.zza;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.internal.zzd;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zzc;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.auth.api.signin.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzkq;
import com.google.android.gms.internal.zzkr;
import com.google.android.gms.internal.zzkv;
import com.google.android.gms.internal.zzld;

public final class Auth
{
  public static final Api CREDENTIALS_API;
  public static final CredentialsApi CredentialsApi;
  public static final Api GOOGLE_SIGN_IN_API;
  public static final GoogleSignInApi GoogleSignInApi;
  public static final Api PROXY_API;
  public static final ProxyApi ProxyApi;
  private static final Api.zza zzVA;
  private static final Api.zza zzVB;
  private static final Api.zza zzVC;
  private static final Api.zza zzVD;
  private static final Api.zza zzVE;
  public static final Api zzVF;
  public static final Api zzVG;
  public static final Api zzVH;
  public static final zzkq zzVI;
  public static final zzf zzVJ;
  public static final zza zzVK;
  public static final Api.zzc zzVt;
  public static final Api.zzc zzVu;
  public static final Api.zzc zzVv;
  public static final Api.zzc zzVw;
  public static final Api.zzc zzVx;
  public static final Api.zzc zzVy;
  private static final Api.zza zzVz;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzVt = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzVu = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzVv = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzVw = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzVx = (Api.zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzVy = (Api.zzc)localObject;
    localObject = new com/google/android/gms/auth/api/Auth$1;
    ((Auth.1)localObject).<init>();
    zzVz = (Api.zza)localObject;
    localObject = new com/google/android/gms/auth/api/Auth$2;
    ((Auth.2)localObject).<init>();
    zzVA = (Api.zza)localObject;
    localObject = new com/google/android/gms/auth/api/Auth$3;
    ((Auth.3)localObject).<init>();
    zzVB = (Api.zza)localObject;
    localObject = new com/google/android/gms/auth/api/Auth$4;
    ((Auth.4)localObject).<init>();
    zzVC = (Api.zza)localObject;
    localObject = new com/google/android/gms/auth/api/Auth$5;
    ((Auth.5)localObject).<init>();
    zzVD = (Api.zza)localObject;
    localObject = new com/google/android/gms/auth/api/Auth$6;
    ((Auth.6)localObject).<init>();
    zzVE = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzVz;
    Api.zzc localzzc = zzVt;
    ((Api)localObject).<init>("Auth.PROXY_API", localzza, localzzc);
    PROXY_API = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzVA;
    localzzc = zzVu;
    ((Api)localObject).<init>("Auth.CREDENTIALS_API", localzza, localzzc);
    CREDENTIALS_API = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzVD;
    localzzc = zzVw;
    ((Api)localObject).<init>("Auth.SIGN_IN_API", localzza, localzzc);
    zzVF = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzVE;
    localzzc = zzVx;
    ((Api)localObject).<init>("Auth.GOOGLE_SIGN_IN_API", localzza, localzzc);
    GOOGLE_SIGN_IN_API = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzVB;
    localzzc = zzVv;
    ((Api)localObject).<init>("Auth.ACCOUNT_STATUS_API", localzza, localzzc);
    zzVG = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzVC;
    localzzc = zzVy;
    ((Api)localObject).<init>("Auth.CONSENT_API", localzza, localzzc);
    zzVH = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzld;
    ((zzld)localObject).<init>();
    ProxyApi = (ProxyApi)localObject;
    localObject = new com/google/android/gms/auth/api/credentials/internal/zzd;
    ((zzd)localObject).<init>();
    CredentialsApi = (CredentialsApi)localObject;
    localObject = new com/google/android/gms/internal/zzkr;
    ((zzkr)localObject).<init>();
    zzVI = (zzkq)localObject;
    localObject = new com/google/android/gms/auth/api/signin/internal/zzn;
    ((zzn)localObject).<init>();
    zzVJ = (zzf)localObject;
    localObject = new com/google/android/gms/auth/api/signin/internal/zzc;
    ((zzc)localObject).<init>();
    GoogleSignInApi = (GoogleSignInApi)localObject;
    localObject = new com/google/android/gms/internal/zzkv;
    ((zzkv)localObject).<init>();
    zzVK = (zza)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\Auth.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */