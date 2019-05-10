package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface CastRemoteDisplayApi
{
  public abstract PendingResult startRemoteDisplay(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult stopRemoteDisplay(GoogleApiClient paramGoogleApiClient);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */