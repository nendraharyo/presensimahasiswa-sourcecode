package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface DrivePreferencesApi
{
  public abstract PendingResult getFileUploadPreferences(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult setFileUploadPreferences(GoogleApiClient paramGoogleApiClient, FileUploadPreferences paramFileUploadPreferences);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\DrivePreferencesApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */