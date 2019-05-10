package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzab$6
  extends zzt.zza
{
  zzab$6(zzab paramzzab, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    TrashResourceRequest localTrashResourceRequest = new com/google/android/gms/drive/internal/TrashResourceRequest;
    Object localObject = this.zzary.zzaoz;
    localTrashResourceRequest.<init>((DriveId)localObject);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localTrashResourceRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */