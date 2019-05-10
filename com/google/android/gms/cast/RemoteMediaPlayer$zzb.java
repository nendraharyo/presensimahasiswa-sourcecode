package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

abstract class RemoteMediaPlayer$zzb
  extends zzb
{
  zzo zzacm;
  
  RemoteMediaPlayer$zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    RemoteMediaPlayer.zzb.1 local1 = new com/google/android/gms/cast/RemoteMediaPlayer$zzb$1;
    local1.<init>(this);
    this.zzacm = local1;
  }
  
  public RemoteMediaPlayer.MediaChannelResult zzq(Status paramStatus)
  {
    RemoteMediaPlayer.zzb.2 local2 = new com/google/android/gms/cast/RemoteMediaPlayer$zzb$2;
    local2.<init>(this, paramStatus);
    return local2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */