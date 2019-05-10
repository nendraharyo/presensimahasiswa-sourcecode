package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

final class RemoteMediaPlayer$zza$zza
  implements ResultCallback
{
  private final long zzack;
  
  RemoteMediaPlayer$zza$zza(RemoteMediaPlayer.zza paramzza, long paramLong)
  {
    this.zzack = paramLong;
  }
  
  public void zzp(Status paramStatus)
  {
    boolean bool = paramStatus.isSuccess();
    if (!bool)
    {
      zzm localzzm = RemoteMediaPlayer.zzg(this.zzacl.zzabK);
      long l = this.zzack;
      int i = paramStatus.getStatusCode();
      localzzm.zzb(l, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */