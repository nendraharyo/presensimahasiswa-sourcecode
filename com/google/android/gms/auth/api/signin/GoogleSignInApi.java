package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;

public abstract interface GoogleSignInApi
{
  public abstract Intent getSignInIntent(GoogleApiClient paramGoogleApiClient);
  
  public abstract GoogleSignInResult getSignInResultFromIntent(Intent paramIntent);
  
  public abstract PendingResult revokeAccess(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult signOut(GoogleApiClient paramGoogleApiClient);
  
  public abstract OptionalPendingResult silentSignIn(GoogleApiClient paramGoogleApiClient);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\GoogleSignInApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */