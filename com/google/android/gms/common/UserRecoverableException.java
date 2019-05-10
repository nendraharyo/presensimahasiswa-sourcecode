package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException
  extends Exception
{
  private final Intent mIntent;
  
  public UserRecoverableException(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.mIntent = paramIntent;
  }
  
  public Intent getIntent()
  {
    Intent localIntent1 = new android/content/Intent;
    Intent localIntent2 = this.mIntent;
    localIntent1.<init>(localIntent2);
    return localIntent1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\UserRecoverableException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */