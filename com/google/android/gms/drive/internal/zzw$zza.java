package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzw$zza
  implements DriveFile.DownloadProgressListener
{
  private final zzq zzari;
  
  public zzw$zza(zzq paramzzq)
  {
    this.zzari = paramzzq;
  }
  
  public void onProgress(long paramLong1, long paramLong2)
  {
    zzq localzzq = this.zzari;
    zzw.zza.1 local1 = new com/google/android/gms/drive/internal/zzw$zza$1;
    local1.<init>(this, paramLong1, paramLong2);
    localzzq.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */