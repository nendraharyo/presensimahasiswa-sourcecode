package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

class RemoteMediaPlayer$13
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$13(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, GoogleApiClient paramGoogleApiClient2, int paramInt, JSONObject paramJSONObject)
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
        localObject6 = RemoteMediaPlayer.zzg((RemoteMediaPlayer)localObject1);
        localzzo = this.zzacm;
        long l = -1;
        int i = this.zzabQ;
        Integer localInteger = Integer.valueOf(i);
        JSONObject localJSONObject = this.zzabS;
        ((zzm)localObject6).zza(localzzo, 0, l, null, 0, localInteger, localJSONObject);
        localObject1 = this.zzabK;
        localObject1 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject1);
        j = 0;
        localObject6 = null;
        ((RemoteMediaPlayer.zza)localObject1).zzc(null);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Object localObject2 = new com/google/android/gms/common/api/Status;
          int j = 2100;
          ((Status)localObject2).<init>(j);
          localObject2 = zzq((Status)localObject2);
          zza((Result)localObject2);
          localObject2 = this.zzabK;
          localObject2 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject2);
          j = 0;
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
        zzo localzzo = null;
        ((RemoteMediaPlayer.zza)localObject6).zzc(null);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$13.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */