package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzab$2
  extends zzs.zzh
{
  zzab$2(zzab paramzzab, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    ListParentsRequest localListParentsRequest = new com/google/android/gms/drive/internal/ListParentsRequest;
    Object localObject = this.zzary.zzaoz;
    localListParentsRequest.<init>((DriveId)localObject);
    localObject = new com/google/android/gms/drive/internal/zzab$zza;
    ((zzab.zza)localObject).<init>(this);
    localzzam.zza(localListParentsRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */