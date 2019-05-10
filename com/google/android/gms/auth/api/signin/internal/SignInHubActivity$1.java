package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzlf.zza;

class SignInHubActivity$1
  implements zzlf.zza
{
  SignInHubActivity$1(SignInHubActivity paramSignInHubActivity, String paramString) {}
  
  public void zzk(Intent paramIntent)
  {
    Object localObject;
    String str;
    if (paramIntent != null)
    {
      localObject = this.zzXY;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = "scopes";
        str = this.zzXY;
        paramIntent.putExtra((String)localObject, str);
      }
      localObject = this.zzXZ;
      SignInHubActivity.zza((SignInHubActivity)localObject, paramIntent);
    }
    for (;;)
    {
      return;
      str = "Idp signin failed!";
      Log.w("AuthSignInClient", str);
      localObject = this.zzXZ;
      int i = 4;
      SignInHubActivity.zza((SignInHubActivity)localObject, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\SignInHubActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */