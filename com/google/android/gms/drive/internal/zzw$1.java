package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;

class zzw$1
  extends zzs.zzc
{
  zzw$1(zzw paramzzw, GoogleApiClient paramGoogleApiClient, int paramInt, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    Object localObject1 = paramzzu.zzte();
    OpenContentsRequest localOpenContentsRequest = new com/google/android/gms/drive/internal/OpenContentsRequest;
    Object localObject2 = this.zzarh.getDriveId();
    int i = this.zzaqE;
    localOpenContentsRequest.<init>((DriveId)localObject2, i, 0);
    localObject2 = new com/google/android/gms/drive/internal/zzbl;
    DriveFile.DownloadProgressListener localDownloadProgressListener = this.zzarg;
    ((zzbl)localObject2).<init>(this, localDownloadProgressListener);
    localObject1 = ((zzam)localObject1).zza(localOpenContentsRequest, (zzan)localObject2).zztj();
    zza((zzq)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzw$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */