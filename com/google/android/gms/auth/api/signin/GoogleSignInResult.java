package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult
  implements Result
{
  private Status zzUX;
  private GoogleSignInAccount zzXg;
  
  public GoogleSignInResult(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    this.zzXg = paramGoogleSignInAccount;
    this.zzUX = paramStatus;
  }
  
  public GoogleSignInAccount getSignInAccount()
  {
    return this.zzXg;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public boolean isSuccess()
  {
    return this.zzUX.isSuccess();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\GoogleSignInResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */