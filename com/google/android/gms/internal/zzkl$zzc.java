package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzkl$zzc
  extends zzkl.zzb
{
  private final String zzUO;
  
  public zzkl$zzc(zzkl paramzzkl, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
    this.zzUO = paramString;
  }
  
  protected void zza(zzkm paramzzkm)
  {
    zzkl.zzc.1 local1 = new com/google/android/gms/internal/zzkl$zzc$1;
    local1.<init>(this);
    String str = this.zzUO;
    paramzzkm.zzb(local1, str);
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkl$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */