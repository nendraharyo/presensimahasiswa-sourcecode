package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzab$7
  extends zzt.zza
{
  zzab$7(zzab paramzzab, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    UntrashResourceRequest localUntrashResourceRequest = new com/google/android/gms/drive/internal/UntrashResourceRequest;
    Object localObject = this.zzary.zzaoz;
    localUntrashResourceRequest.<init>((DriveId)localObject);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localUntrashResourceRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */