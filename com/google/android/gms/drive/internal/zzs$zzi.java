package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.MetadataBuffer;

class zzs$zzi
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzs$zzi(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zza.zzb localzzb = this.zzamC;
    zzs.zzg localzzg = new com/google/android/gms/drive/internal/zzs$zzg;
    localzzg.<init>(paramStatus, null, false);
    localzzb.zzs(localzzg);
  }
  
  public void zza(OnListEntriesResponse paramOnListEntriesResponse)
  {
    MetadataBuffer localMetadataBuffer = new com/google/android/gms/drive/MetadataBuffer;
    Object localObject = paramOnListEntriesResponse.zztt();
    localMetadataBuffer.<init>((DataHolder)localObject);
    localObject = this.zzamC;
    zzs.zzg localzzg = new com/google/android/gms/drive/internal/zzs$zzg;
    Status localStatus = Status.zzagC;
    boolean bool = paramOnListEntriesResponse.zztu();
    localzzg.<init>(localStatus, localMetadataBuffer, bool);
    ((zza.zzb)localObject).zzs(localzzg);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */