package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zze;

class zzk$zzb$1
  implements Runnable
{
  zzk$zzb$1(zzk.zzb paramzzb, AdOverlayInfoParcel paramAdOverlayInfoParcel) {}
  
  public void run()
  {
    zze localzze = zzr.zzbA();
    Context localContext = this.zzqk.zzqh.zzpj.context;
    AdOverlayInfoParcel localAdOverlayInfoParcel = this.zzqj;
    localzze.zza(localContext, localAdOverlayInfoParcel);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzk$zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */