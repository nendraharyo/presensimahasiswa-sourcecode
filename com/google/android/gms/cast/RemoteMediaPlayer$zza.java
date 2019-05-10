package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import java.io.IOException;

class RemoteMediaPlayer$zza
  implements zzn
{
  private GoogleApiClient zzaci;
  private long zzacj = 0L;
  
  public RemoteMediaPlayer$zza(RemoteMediaPlayer paramRemoteMediaPlayer) {}
  
  public void zza(String paramString1, String paramString2, long paramLong, String paramString3)
  {
    Object localObject1 = this.zzaci;
    if (localObject1 == null)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("No GoogleApiClient available");
      throw ((Throwable)localObject1);
    }
    localObject1 = Cast.CastApi;
    Object localObject2 = this.zzaci;
    localObject1 = ((Cast.CastApi)localObject1).sendMessage((GoogleApiClient)localObject2, paramString1, paramString2);
    localObject2 = new com/google/android/gms/cast/RemoteMediaPlayer$zza$zza;
    ((RemoteMediaPlayer.zza.zza)localObject2).<init>(this, paramLong);
    ((PendingResult)localObject1).setResultCallback((ResultCallback)localObject2);
  }
  
  public void zzc(GoogleApiClient paramGoogleApiClient)
  {
    this.zzaci = paramGoogleApiClient;
  }
  
  public long zznQ()
  {
    long l = this.zzacj + 1L;
    this.zzacj = l;
    return l;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */