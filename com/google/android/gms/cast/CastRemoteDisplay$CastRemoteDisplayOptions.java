package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;

public final class CastRemoteDisplay$CastRemoteDisplayOptions
  implements Api.ApiOptions.HasOptions
{
  final CastDevice zzZL;
  final CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzaad;
  
  private CastRemoteDisplay$CastRemoteDisplayOptions(CastRemoteDisplay.CastRemoteDisplayOptions.Builder paramBuilder)
  {
    Object localObject = paramBuilder.zzZO;
    this.zzZL = ((CastDevice)localObject);
    localObject = paramBuilder.zzaae;
    this.zzaad = ((CastRemoteDisplay.CastRemoteDisplaySessionCallbacks)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplay$CastRemoteDisplayOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */