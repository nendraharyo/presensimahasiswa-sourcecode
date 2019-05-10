package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzw$zza$1
  implements zzq.zzb
{
  zzw$zza$1(zzw.zza paramzza, long paramLong1, long paramLong2) {}
  
  public void zza(DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    long l1 = this.zzarj;
    long l2 = this.zzark;
    paramDownloadProgressListener.onProgress(l1, l2);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzw$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */