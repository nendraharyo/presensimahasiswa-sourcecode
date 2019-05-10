package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zze
  extends zza.zza
{
  zze(GoogleApiClient paramGoogleApiClient)
  {
    super(localzzc, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzj paramzzj);
  
  protected final void zza(zzf paramzzf)
  {
    Context localContext = paramzzf.getContext();
    zzj localzzj = (zzj)paramzzf.zzqJ();
    zza(localContext, localzzj);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */