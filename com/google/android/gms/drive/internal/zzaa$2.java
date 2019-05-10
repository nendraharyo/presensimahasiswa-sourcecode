package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;

class zzaa$2
  extends zzt.zza
{
  zzaa$2(zzaa paramzzaa, GoogleApiClient paramGoogleApiClient, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    SetFileUploadPreferencesRequest localSetFileUploadPreferencesRequest = new com/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;
    Object localObject = this.zzarv;
    localSetFileUploadPreferencesRequest.<init>((FileUploadPreferencesImpl)localObject);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localSetFileUploadPreferencesRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzaa$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */