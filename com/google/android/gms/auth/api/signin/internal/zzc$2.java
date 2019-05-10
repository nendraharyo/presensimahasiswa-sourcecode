package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzc$2
  extends zzc.zza
{
  zzc$2(zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zzd paramzzd)
  {
    zzh localzzh = (zzh)paramzzd.zzqJ();
    zzc.2.1 local1 = new com/google/android/gms/auth/api/signin/internal/zzc$2$1;
    local1.<init>(this);
    GoogleSignInOptions localGoogleSignInOptions = paramzzd.zznd();
    localzzh.zzb(local1, localGoogleSignInOptions);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzc$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */