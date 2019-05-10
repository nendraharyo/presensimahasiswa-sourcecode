package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzab$1
  extends zzab.zzd
{
  zzab$1(zzab paramzzab, GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    super(paramzzab, paramGoogleApiClient, null);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    GetMetadataRequest localGetMetadataRequest = new com/google/android/gms/drive/internal/GetMetadataRequest;
    Object localObject = this.zzary.zzaoz;
    boolean bool = this.zzarx;
    localGetMetadataRequest.<init>((DriveId)localObject, bool);
    localObject = new com/google/android/gms/drive/internal/zzab$zzb;
    ((zzab.zzb)localObject).<init>(this);
    localzzam.zza(localGetMetadataRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */