package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;

public class zzaa
  implements DrivePreferencesApi
{
  public PendingResult getFileUploadPreferences(GoogleApiClient paramGoogleApiClient)
  {
    zzaa.1 local1 = new com/google/android/gms/drive/internal/zzaa$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult setFileUploadPreferences(GoogleApiClient paramGoogleApiClient, FileUploadPreferences paramFileUploadPreferences)
  {
    boolean bool = paramFileUploadPreferences instanceof FileUploadPreferencesImpl;
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Invalid preference value");
      throw ((Throwable)localObject);
    }
    paramFileUploadPreferences = (FileUploadPreferencesImpl)paramFileUploadPreferences;
    Object localObject = new com/google/android/gms/drive/internal/zzaa$2;
    ((zzaa.2)localObject).<init>(this, paramGoogleApiClient, paramFileUploadPreferences);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzaa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */