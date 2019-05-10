package com.google.android.gms.auth.api;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;

public final class Auth$AuthCredentialsOptions
  implements Api.ApiOptions.Optional
{
  private final String zzVL;
  private final PasswordSpecification zzVM;
  
  public Bundle zzml()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject = this.zzVL;
    localBundle.putString("consumer_package", (String)localObject);
    localObject = this.zzVM;
    localBundle.putParcelable("password_specification", (Parcelable)localObject);
    return localBundle;
  }
  
  public PasswordSpecification zzmr()
  {
    return this.zzVM;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\Auth$AuthCredentialsOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */