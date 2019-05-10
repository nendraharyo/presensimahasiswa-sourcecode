package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzaa$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  private zzaa$zza(zzaa paramzzaa, zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzaa.zzb localzzb1 = new com/google/android/gms/drive/internal/zzaa$zzb;
    zzaa localzzaa = this.zzaru;
    localzzb1.<init>(localzzaa, paramStatus, null, null);
    localzzb.zzs(localzzb1);
  }
  
  public void zza(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzaa.zzb localzzb1 = new com/google/android/gms/drive/internal/zzaa$zzb;
    zzaa localzzaa = this.zzaru;
    Status localStatus = Status.zzagC;
    FileUploadPreferencesImpl localFileUploadPreferencesImpl = paramOnDeviceUsagePreferenceResponse.zztp();
    localzzb1.<init>(localzzaa, localStatus, localFileUploadPreferencesImpl, null);
    localzzb.zzs(localzzb1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzaa$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */