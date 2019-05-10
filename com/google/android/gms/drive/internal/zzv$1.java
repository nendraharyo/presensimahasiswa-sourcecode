package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;

class zzv$1
  extends zzs.zzc
{
  zzv$1(zzv paramzzv, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    OpenContentsRequest localOpenContentsRequest = new com/google/android/gms/drive/internal/OpenContentsRequest;
    Object localObject = this.zzard.getDriveId();
    int i = zzv.zza(this.zzard).getRequestId();
    localOpenContentsRequest.<init>((DriveId)localObject, 536870912, i);
    localObject = new com/google/android/gms/drive/internal/zzbl;
    ((zzbl)localObject).<init>(this, null);
    localzzam.zza(localOpenContentsRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzv$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */