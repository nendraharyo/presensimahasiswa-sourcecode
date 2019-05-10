package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface CredentialsApi
{
  public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
  public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
  public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;
  
  public abstract PendingResult delete(GoogleApiClient paramGoogleApiClient, Credential paramCredential);
  
  public abstract PendingResult disableAutoSignIn(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingIntent getHintPickerIntent(GoogleApiClient paramGoogleApiClient, HintRequest paramHintRequest);
  
  public abstract PendingResult request(GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest);
  
  public abstract PendingResult save(GoogleApiClient paramGoogleApiClient, Credential paramCredential);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\CredentialsApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */