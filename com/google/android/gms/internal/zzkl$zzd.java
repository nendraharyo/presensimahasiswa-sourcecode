package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzkl$zzd
  extends zzkl.zzb
{
  private final String zzUO;
  
  public zzkl$zzd(zzkl paramzzkl, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
    this.zzUO = paramString;
  }
  
  protected void zza(zzkm paramzzkm)
  {
    zzkl.zzd.1 local1 = new com/google/android/gms/internal/zzkl$zzd$1;
    local1.<init>(this);
    String str = this.zzUO;
    paramzzkm.zza(local1, str);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkl$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */