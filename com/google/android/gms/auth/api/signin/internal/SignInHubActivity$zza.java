package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.app.t.a;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Set;

class SignInHubActivity$zza
  implements t.a
{
  private SignInHubActivity$zza(SignInHubActivity paramSignInHubActivity) {}
  
  public c onCreateLoader(int paramInt, Bundle paramBundle)
  {
    zzb localzzb = new com/google/android/gms/auth/api/signin/internal/zzb;
    SignInHubActivity localSignInHubActivity = this.zzXZ;
    Set localSet = GoogleApiClient.zzoV();
    localzzb.<init>(localSignInHubActivity, localSet);
    return localzzb;
  }
  
  public void onLoaderReset(c paramc) {}
  
  public void zza(c paramc, Void paramVoid)
  {
    SignInHubActivity localSignInHubActivity = this.zzXZ;
    int i = SignInHubActivity.zza(this.zzXZ);
    Intent localIntent = SignInHubActivity.zzb(this.zzXZ);
    localSignInHubActivity.setResult(i, localIntent);
    this.zzXZ.finish();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\SignInHubActivity$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */