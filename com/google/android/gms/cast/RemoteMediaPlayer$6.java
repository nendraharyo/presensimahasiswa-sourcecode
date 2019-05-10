package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

class RemoteMediaPlayer$6
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$6(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, GoogleApiClient paramGoogleApiClient2, MediaQueueItem paramMediaQueueItem, int paramInt, long paramLong, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze paramzze)
  {
    Object localObject1 = this.zzabK;
    synchronized (RemoteMediaPlayer.zze((RemoteMediaPlayer)localObject1))
    {
      localObject1 = this.zzabK;
      localObject1 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject1);
      localObject6 = this.zzabL;
      ((RemoteMediaPlayer.zza)localObject1).zzc((GoogleApiClient)localObject6);
      try
      {
        localObject1 = this.zzabK;
        localObject1 = RemoteMediaPlayer.zzg((RemoteMediaPlayer)localObject1);
        localObject6 = this.zzacm;
        i = 1;
        arrayOfMediaQueueItem = new MediaQueueItem[i];
        int j = 0;
        MediaQueueItem localMediaQueueItem = this.zzabV;
        arrayOfMediaQueueItem[0] = localMediaQueueItem;
        j = this.zzabU;
        localMediaQueueItem = null;
        long l = this.zzabR;
        JSONObject localJSONObject = this.zzabS;
        ((zzm)localObject1).zza((zzo)localObject6, arrayOfMediaQueueItem, j, 0, 0, l, localJSONObject);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Object localObject2 = new com/google/android/gms/common/api/Status;
          int k = 2100;
          ((Status)localObject2).<init>(k);
          localObject2 = zzq((Status)localObject2);
          zza((Result)localObject2);
          localObject2 = this.zzabK;
          localObject2 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject2);
          k = 0;
          localObject6 = null;
          ((RemoteMediaPlayer.zza)localObject2).zzc(null);
        }
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      finally
      {
        localObject6 = this.zzabK;
        localObject6 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject6);
        int i = 0;
        MediaQueueItem[] arrayOfMediaQueueItem = null;
        ((RemoteMediaPlayer.zza)localObject6).zzc(null);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */