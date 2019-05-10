package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzab$5
  extends zzt.zza
{
  zzab$5(zzab paramzzab, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    DeleteResourceRequest localDeleteResourceRequest = new com/google/android/gms/drive/internal/DeleteResourceRequest;
    Object localObject = this.zzary.zzaoz;
    localDeleteResourceRequest.<init>((DriveId)localObject);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localDeleteResourceRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */