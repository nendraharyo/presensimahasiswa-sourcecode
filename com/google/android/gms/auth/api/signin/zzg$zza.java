package com.google.android.gms.auth.api.signin;

import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.zzx;

public class zzg$zza
{
  private final SignInConfiguration zzXo;
  
  public zzg$zza(String paramString)
  {
    zzx.zzcM(paramString);
    SignInConfiguration localSignInConfiguration = new com/google/android/gms/auth/api/signin/internal/SignInConfiguration;
    localSignInConfiguration.<init>(paramString);
    this.zzXo = localSignInConfiguration;
  }
  
  public zza zzi(GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzx.zzz(paramGoogleSignInOptions);
    this.zzXo.zzj(paramGoogleSignInOptions);
    return this;
  }
  
  public zzg zzmY()
  {
    Object localObject = this.zzXo.zznl();
    boolean bool;
    if (localObject == null)
    {
      localObject = this.zzXo.zznm();
      if (localObject == null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Must support either Facebook, Google or Email sign-in.");
      localObject = new com/google/android/gms/auth/api/signin/zzg;
      SignInConfiguration localSignInConfiguration = this.zzXo;
      ((zzg)localObject).<init>(localSignInConfiguration, null);
      return (zzg)localObject;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */