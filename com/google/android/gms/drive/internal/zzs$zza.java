package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.Contents;

class zzs$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzs$zza(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzs.zzb localzzb1 = new com/google/android/gms/drive/internal/zzs$zzb;
    localzzb1.<init>(paramStatus, null);
    localzzb.zzs(localzzb1);
  }
  
  public void zza(OnContentsResponse paramOnContentsResponse)
  {
    zza.zzb localzzb = this.zzamC;
    zzs.zzb localzzb1 = new com/google/android/gms/drive/internal/zzs$zzb;
    Status localStatus = Status.zzagC;
    zzv localzzv = new com/google/android/gms/drive/internal/zzv;
    Contents localContents = paramOnContentsResponse.zztn();
    localzzv.<init>(localContents);
    localzzb1.<init>(localStatus, localzzv);
    localzzb.zzs(localzzb1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */