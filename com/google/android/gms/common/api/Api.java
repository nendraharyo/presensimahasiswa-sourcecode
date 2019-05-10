package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;

public final class Api
{
  private final String mName;
  private final Api.zzc zzaeE;
  private final Api.zza zzafW;
  private final Api.zze zzafX;
  private final Api.zzf zzafY;
  
  public Api(String paramString, Api.zza paramzza, Api.zzc paramzzc)
  {
    zzx.zzb(paramzza, "Cannot construct an Api with a null ClientBuilder");
    zzx.zzb(paramzzc, "Cannot construct an Api with a null ClientKey");
    this.mName = paramString;
    this.zzafW = paramzza;
    this.zzafX = null;
    this.zzaeE = paramzzc;
    this.zzafY = null;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public Api.zza zzoP()
  {
    Api.zza localzza = this.zzafW;
    boolean bool;
    if (localzza != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.zzafW;
      bool = false;
      localzza = null;
    }
  }
  
  public Api.zze zzoQ()
  {
    Api.zze localzze = this.zzafX;
    boolean bool;
    if (localzze != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "This API was constructed with a ClientBuilder. Use getClientBuilder");
      return this.zzafX;
      bool = false;
      localzze = null;
    }
  }
  
  public Api.zzc zzoR()
  {
    Api.zzc localzzc = this.zzaeE;
    boolean bool;
    if (localzzc != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return this.zzaeE;
      bool = false;
      localzzc = null;
    }
  }
  
  public boolean zzoS()
  {
    Api.zzf localzzf = this.zzafY;
    boolean bool;
    if (localzzf != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzf = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Api.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */