package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zze$zzf
  extends zza
{
  private final zza.zzb zzaON;
  
  public zze$zzf(zza.zzb paramzzb)
  {
    this.zzaON = paramzzb;
  }
  
  public void zzi(int paramInt, Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent");; localPendingIntent = null)
    {
      Status localStatus = new com/google/android/gms/common/api/Status;
      localStatus.<init>(paramInt, null, localPendingIntent);
      this.zzaON.zzs(localStatus);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zze$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */