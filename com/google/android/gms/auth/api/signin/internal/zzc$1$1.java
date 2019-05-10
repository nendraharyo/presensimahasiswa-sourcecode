package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

class zzc$1$1
  extends zza
{
  zzc$1$1(zzc.1 param1, zzq paramzzq) {}
  
  public void zza(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    if (paramGoogleSignInAccount != null)
    {
      localObject1 = this.zzXt;
      localObject2 = this.zzXu.zzXr;
      ((zzq)localObject1).zzb(paramGoogleSignInAccount, (GoogleSignInOptions)localObject2);
    }
    Object localObject1 = this.zzXu;
    Object localObject2 = new com/google/android/gms/auth/api/signin/GoogleSignInResult;
    ((GoogleSignInResult)localObject2).<init>(paramGoogleSignInAccount, paramStatus);
    ((zzc.1)localObject1).zza((Result)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzc$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */