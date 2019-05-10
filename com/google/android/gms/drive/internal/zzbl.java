package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzbl
  extends zzd
{
  private final zza.zzb zzamC;
  private final DriveFile.DownloadProgressListener zzasy;
  
  zzbl(zza.zzb paramzzb, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    this.zzamC = paramzzb;
    this.zzasy = paramDownloadProgressListener;
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
    boolean bool = paramOnContentsResponse.zzto();
    Status localStatus;
    if (bool)
    {
      localStatus = new com/google/android/gms/common/api/Status;
      int i = -1;
      localStatus.<init>(i);
    }
    for (;;)
    {
      zza.zzb localzzb = this.zzamC;
      zzs.zzb localzzb1 = new com/google/android/gms/drive/internal/zzs$zzb;
      zzv localzzv = new com/google/android/gms/drive/internal/zzv;
      Contents localContents = paramOnContentsResponse.zztn();
      localzzv.<init>(localContents);
      localzzb1.<init>(localStatus, localzzv);
      localzzb.zzs(localzzb1);
      return;
      localStatus = Status.zzagC;
    }
  }
  
  public void zza(OnDownloadProgressResponse paramOnDownloadProgressResponse)
  {
    DriveFile.DownloadProgressListener localDownloadProgressListener = this.zzasy;
    if (localDownloadProgressListener != null)
    {
      localDownloadProgressListener = this.zzasy;
      long l1 = paramOnDownloadProgressResponse.zztq();
      long l2 = paramOnDownloadProgressResponse.zztr();
      localDownloadProgressListener.onProgress(l1, l2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */