package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

class RemoteMediaPlayer$15
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$15(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, int paramInt, GoogleApiClient paramGoogleApiClient2, long paramLong, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze paramzze)
  {
    Object localObject1 = this.zzabK;
    synchronized (RemoteMediaPlayer.zze((RemoteMediaPlayer)localObject1))
    {
      localObject1 = this.zzabK;
      int i = this.zzacc;
      int j = RemoteMediaPlayer.zza((RemoteMediaPlayer)localObject1, i);
      i = -1;
      if (j == i)
      {
        localObject1 = new com/google/android/gms/common/api/Status;
        i = 0;
        localObject6 = null;
        ((Status)localObject1).<init>(0);
        localObject1 = zzq((Status)localObject1);
        zza((Result)localObject1);
        return;
      }
      localObject1 = this.zzabK;
      localObject1 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject1);
      Object localObject6 = this.zzabL;
      ((RemoteMediaPlayer.zza)localObject1).zzc((GoogleApiClient)localObject6);
      try
      {
        localObject1 = this.zzabK;
        localObject6 = RemoteMediaPlayer.zzg((RemoteMediaPlayer)localObject1);
        localzzo = this.zzacm;
        int k = this.zzacc;
        long l = this.zzabR;
        JSONObject localJSONObject = this.zzabS;
        ((zzm)localObject6).zza(localzzo, k, l, null, 0, null, localJSONObject);
        localObject1 = this.zzabK;
        localObject1 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject1);
        i = 0;
        localObject6 = null;
        ((RemoteMediaPlayer.zza)localObject1).zzc(null);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Object localObject3 = new com/google/android/gms/common/api/Status;
          i = 2100;
          ((Status)localObject3).<init>(i);
          localObject3 = zzq((Status)localObject3);
          zza((Result)localObject3);
          localObject3 = this.zzabK;
          localObject3 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject3);
          i = 0;
          localObject6 = null;
          ((RemoteMediaPlayer.zza)localObject3).zzc(null);
        }
      }
      finally
      {
        localObject6 = this.zzabK;
        localObject6 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject6);
        zzo localzzo = null;
        ((RemoteMediaPlayer.zza)localObject6).zzc(null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */