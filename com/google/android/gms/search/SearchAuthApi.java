package com.google.android.gms.search;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface SearchAuthApi
{
  public abstract PendingResult clearToken(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult getGoogleNowAuth(GoogleApiClient paramGoogleApiClient, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\search\SearchAuthApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */