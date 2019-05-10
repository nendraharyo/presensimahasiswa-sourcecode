package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException
  extends GoogleAuthException
{
  private final Intent mIntent;
  
  public UserRecoverableAuthException(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.mIntent = paramIntent;
  }
  
  public Intent getIntent()
  {
    Intent localIntent1 = this.mIntent;
    if (localIntent1 == null) {
      localIntent1 = null;
    }
    for (;;)
    {
      return localIntent1;
      localIntent1 = new android/content/Intent;
      Intent localIntent2 = this.mIntent;
      localIntent1.<init>(localIntent2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\UserRecoverableAuthException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */