package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzx;

public final class CastRemoteDisplay$CastRemoteDisplayOptions$Builder
{
  CastDevice zzZO;
  CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzaae;
  
  public CastRemoteDisplay$CastRemoteDisplayOptions$Builder(CastDevice paramCastDevice, CastRemoteDisplay.CastRemoteDisplaySessionCallbacks paramCastRemoteDisplaySessionCallbacks)
  {
    zzx.zzb(paramCastDevice, "CastDevice parameter cannot be null");
    this.zzZO = paramCastDevice;
    this.zzaae = paramCastRemoteDisplaySessionCallbacks;
  }
  
  public CastRemoteDisplay.CastRemoteDisplayOptions build()
  {
    CastRemoteDisplay.CastRemoteDisplayOptions localCastRemoteDisplayOptions = new com/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplayOptions;
    localCastRemoteDisplayOptions.<init>(this, null);
    return localCastRemoteDisplayOptions;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplay$CastRemoteDisplayOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */