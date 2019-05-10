package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzqq$zzb
  extends zzqo.zza
{
  private final zza.zzb zzamC;
  
  public zzqq$zzb(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void zza(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    zzqs localzzqs = null;
    if (paramBundle != null) {}
    for (Object localObject = (PendingIntent)paramBundle.getParcelable("pendingIntent");; localObject = null)
    {
      Status localStatus = new com/google/android/gms/common/api/Status;
      localStatus.<init>(paramInt1, null, (PendingIntent)localObject);
      localObject = this.zzamC;
      localzzqs = new com/google/android/gms/internal/zzqs;
      localzzqs.<init>(localStatus, paramIntent);
      ((zza.zzb)localObject).zzs(localzzqs);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqq$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */