package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;

class RemoteMediaPlayer$1
  extends zzm
{
  RemoteMediaPlayer$1(RemoteMediaPlayer paramRemoteMediaPlayer, String paramString)
  {
    super(paramString);
  }
  
  protected void onMetadataUpdated()
  {
    RemoteMediaPlayer.zzb(this.zzabK);
  }
  
  protected void onPreloadStatusUpdated()
  {
    RemoteMediaPlayer.zzd(this.zzabK);
  }
  
  protected void onQueueStatusUpdated()
  {
    RemoteMediaPlayer.zzc(this.zzabK);
  }
  
  protected void onStatusUpdated()
  {
    RemoteMediaPlayer.zza(this.zzabK);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */