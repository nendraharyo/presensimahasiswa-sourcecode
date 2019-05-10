package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public abstract interface SafetyNetApi
{
  public abstract PendingResult attest(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte);
  
  public abstract PendingResult lookupUri(GoogleApiClient paramGoogleApiClient, List paramList, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\safetynet\SafetyNetApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */