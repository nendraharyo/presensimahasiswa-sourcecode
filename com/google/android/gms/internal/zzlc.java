package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zzlc
  extends zza.zza
{
  public zzlc(GoogleApiClient paramGoogleApiClient)
  {
    super(localzzc, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzlb paramzzlb);
  
  protected final void zza(zzkz paramzzkz)
  {
    Context localContext = paramzzkz.getContext();
    zzlb localzzlb = (zzlb)paramzzkz.zzqJ();
    zza(localContext, localzzlb);
  }
  
  protected ProxyApi.ProxyResult zzj(Status paramStatus)
  {
    zzle localzzle = new com/google/android/gms/internal/zzle;
    localzzle.<init>(paramStatus);
    return localzzle;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */