package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzc$1
  extends zzc.zza
{
  zzc$1(zzc paramzzc, GoogleApiClient paramGoogleApiClient, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected void zza(zzd paramzzd)
  {
    Object localObject = zzq.zzaf(paramzzd.getContext());
    zzh localzzh = (zzh)paramzzd.zzqJ();
    zzc.1.1 local1 = new com/google/android/gms/auth/api/signin/internal/zzc$1$1;
    local1.<init>(this, (zzq)localObject);
    localObject = this.zzXr;
    localzzh.zza(local1, (GoogleSignInOptions)localObject);
  }
  
  protected GoogleSignInResult zzn(Status paramStatus)
  {
    GoogleSignInResult localGoogleSignInResult = new com/google/android/gms/auth/api/signin/GoogleSignInResult;
    localGoogleSignInResult.<init>(null, paramStatus);
    return localGoogleSignInResult;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */