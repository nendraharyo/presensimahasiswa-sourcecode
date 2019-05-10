package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

class RemoteMediaPlayer$zzb$1
  implements zzo
{
  RemoteMediaPlayer$zzb$1(RemoteMediaPlayer.zzb paramzzb) {}
  
  public void zza(long paramLong, int paramInt, Object paramObject)
  {
    RemoteMediaPlayer.zzb localzzb = null;
    boolean bool = paramObject instanceof JSONObject;
    if (bool) {}
    for (paramObject = (JSONObject)paramObject;; paramObject = null)
    {
      localzzb = this.zzacn;
      RemoteMediaPlayer.zzc localzzc = new com/google/android/gms/cast/RemoteMediaPlayer$zzc;
      Status localStatus = new com/google/android/gms/common/api/Status;
      localStatus.<init>(paramInt);
      localzzc.<init>(localStatus, (JSONObject)paramObject);
      localzzb.zza(localzzc);
      return;
    }
  }
  
  public void zzy(long paramLong)
  {
    RemoteMediaPlayer.zzb localzzb = this.zzacn;
    Object localObject = this.zzacn;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(2103);
    localObject = ((RemoteMediaPlayer.zzb)localObject).zzq(localStatus);
    localzzb.zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\RemoteMediaPlayer$zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */