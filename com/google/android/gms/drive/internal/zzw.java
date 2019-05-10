package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;

public class zzw
  extends zzab
  implements DriveFile
{
  public zzw(DriveId paramDriveId)
  {
    super(paramDriveId);
  }
  
  private static DriveFile.DownloadProgressListener zza(GoogleApiClient paramGoogleApiClient, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    Object localObject;
    if (paramDownloadProgressListener == null) {
      localObject = null;
    }
    for (;;)
    {
      return (DriveFile.DownloadProgressListener)localObject;
      localObject = new com/google/android/gms/drive/internal/zzw$zza;
      zzq localzzq = paramGoogleApiClient.zzr(paramDownloadProgressListener);
      ((zzw.zza)localObject).<init>(localzzq);
    }
  }
  
  public PendingResult open(GoogleApiClient paramGoogleApiClient, int paramInt, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    int i = 268435456;
    if (paramInt != i)
    {
      i = 536870912;
      if (paramInt != i)
      {
        i = 805306368;
        if (paramInt != i)
        {
          localObject = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject).<init>("Invalid mode provided.");
          throw ((Throwable)localObject);
        }
      }
    }
    Object localObject = zza(paramGoogleApiClient, paramDownloadProgressListener);
    zzw.1 local1 = new com/google/android/gms/drive/internal/zzw$1;
    local1.<init>(this, paramGoogleApiClient, paramInt, (DriveFile.DownloadProgressListener)localObject);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */