package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import com.google.android.gms.common.internal.zzx;

public final class IdentityProviders
{
  public static final String FACEBOOK = "https://www.facebook.com";
  public static final String GOOGLE = "https://accounts.google.com";
  public static final String LINKEDIN = "https://www.linkedin.com";
  public static final String MICROSOFT = "https://login.live.com";
  public static final String PAYPAL = "https://www.paypal.com";
  public static final String TWITTER = "https://twitter.com";
  public static final String YAHOO = "https://login.yahoo.com";
  
  public static final String getIdentityProviderForAccount(Account paramAccount)
  {
    zzx.zzb(paramAccount, "account cannot be null");
    String str1 = "com.google";
    String str2 = paramAccount.type;
    boolean bool = str1.equals(str2);
    if (bool) {
      str1 = "https://accounts.google.com";
    }
    for (;;)
    {
      return str1;
      str1 = "com.facebook.auth.login";
      str2 = paramAccount.type;
      bool = str1.equals(str2);
      if (bool)
      {
        str1 = "https://www.facebook.com";
      }
      else
      {
        bool = false;
        str1 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\IdentityProviders.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */