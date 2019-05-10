package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

public class zzee
{
  private zzed zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzee.zza paramzza, zzan paramzzan)
  {
    zzef localzzef = new com/google/android/gms/internal/zzef;
    localzzef.<init>(paramContext, paramVersionInfoParcel, paramzzan);
    paramzza.zzAR = localzzef;
    zzee.2 local2 = new com/google/android/gms/internal/zzee$2;
    local2.<init>(this, paramzza);
    localzzef.zza(local2);
    return localzzef;
  }
  
  public Future zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzan paramzzan)
  {
    zzee.zza localzza = new com/google/android/gms/internal/zzee$zza;
    localzza.<init>(null);
    Handler localHandler = zzir.zzMc;
    zzee.1 local1 = new com/google/android/gms/internal/zzee$1;
    local1.<init>(this, paramContext, paramVersionInfoParcel, localzza, paramzzan, paramString);
    localHandler.post(local1);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzee.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */