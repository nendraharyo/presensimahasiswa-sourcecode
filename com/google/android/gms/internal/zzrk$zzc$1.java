package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

class zzrk$zzc$1
  extends zzrk.zza
{
  zzrk$zzc$1(zzrk.zzc paramzzc) {}
  
  public void zza(Status paramStatus, GoogleNowAuthState paramGoogleNowAuthState)
  {
    Object localObject1 = this.zzbgN;
    boolean bool = zzrk.zzc.zza((zzrk.zzc)localObject1);
    if (bool)
    {
      localObject1 = "SearchAuth";
      localObject2 = "GetGoogleNowAuthImpl success";
      Log.d((String)localObject1, (String)localObject2);
    }
    localObject1 = this.zzbgN;
    Object localObject2 = new com/google/android/gms/internal/zzrk$zzd;
    ((zzrk.zzd)localObject2).<init>(paramStatus, paramGoogleNowAuthState);
    ((zzrk.zzc)localObject1).zza((Result)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrk$zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */