package com.google.android.gms.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract interface zzd
  extends IInterface
{
  public abstract void zza(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult);
  
  public abstract void zza(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount);
  
  public abstract void zzb(SignInResponse paramSignInResponse);
  
  public abstract void zzbl(Status paramStatus);
  
  public abstract void zzbm(Status paramStatus);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */