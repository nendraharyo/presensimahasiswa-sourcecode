package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

class RemoteMediaPlayer$16
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$16(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, int paramInt1, int paramInt2, GoogleApiClient paramGoogleApiClient2, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze paramzze)
  {
    int i = 0;
    Object localObject1 = null;
    localObject6 = this.zzabK;
    Object localObject9;
    int m;
    Object localObject10;
    int n;
    Object localObject3;
    for (;;)
    {
      synchronized (RemoteMediaPlayer.zze((RemoteMediaPlayer)localObject6))
      {
        localObject6 = this.zzabK;
        j = this.zzacc;
        k = RemoteMediaPlayer.zza((RemoteMediaPlayer)localObject6, j);
        j = -1;
        if (k == j)
        {
          localObject1 = new com/google/android/gms/common/api/Status;
          k = 0;
          localObject6 = null;
          ((Status)localObject1).<init>(0);
          localObject1 = zzq((Status)localObject1);
          zza((Result)localObject1);
          return;
        }
        j = this.zzacd;
        if (j < 0)
        {
          localObject1 = new com/google/android/gms/common/api/Status;
          k = 2001;
          localObject8 = Locale.ROOT;
          localObject9 = "Invalid request: Invalid newIndex %d.";
          m = 1;
          localObject10 = new Object[m];
          n = 0;
          int i1 = this.zzacd;
          Integer localInteger = Integer.valueOf(i1);
          localObject10[0] = localInteger;
          localObject8 = String.format((Locale)localObject8, (String)localObject9, (Object[])localObject10);
          ((Status)localObject1).<init>(k, (String)localObject8);
          localObject1 = zzq((Status)localObject1);
          zza((Result)localObject1);
        }
      }
      j = this.zzacd;
      if (k != j) {
        break;
      }
      localObject3 = new com/google/android/gms/common/api/Status;
      k = 0;
      localObject6 = null;
      ((Status)localObject3).<init>(0);
      localObject3 = zzq((Status)localObject3);
      zza((Result)localObject3);
    }
    j = this.zzacd;
    if (j > k) {}
    for (k = this.zzacd + 1;; k = this.zzacd)
    {
      localObject8 = this.zzabK;
      localObject8 = ((RemoteMediaPlayer)localObject8).getMediaStatus();
      localObject6 = ((MediaStatus)localObject8).getQueueItem(k);
      if (localObject6 != null) {
        i = ((MediaQueueItem)localObject6).getItemId();
      }
      localObject6 = this.zzabK;
      localObject6 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject6);
      localObject8 = this.zzabL;
      ((RemoteMediaPlayer.zza)localObject6).zzc((GoogleApiClient)localObject8);
      try
      {
        localObject6 = this.zzabK;
        localObject6 = RemoteMediaPlayer.zzg((RemoteMediaPlayer)localObject6);
        localObject8 = this.zzacm;
        int i2 = 1;
        localObject9 = new int[i2];
        m = 0;
        localObject10 = null;
        n = this.zzacc;
        localObject9[0] = n;
        localObject10 = this.zzabS;
        ((zzm)localObject6).zza((zzo)localObject8, (int[])localObject9, i, (JSONObject)localObject10);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Object localObject4 = new com/google/android/gms/common/api/Status;
          k = 2100;
          ((Status)localObject4).<init>(k);
          localObject4 = zzq((Status)localObject4);
          zza((Result)localObject4);
          localObject4 = this.zzabK;
          localObject4 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject4);
          k = 0;
          localObject6 = null;
          ((RemoteMediaPlayer.zza)localObject4).zzc(null);
        }
      }
      finally
      {
        localObject6 = this.zzabK;
        localObject6 = RemoteMediaPlayer.zzf((RemoteMediaPlayer)localObject6);
        j = 0;
        localObject8 = null;
        ((RemoteMediaPlayer.zza)localObject6).zzc(null);
      }
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */