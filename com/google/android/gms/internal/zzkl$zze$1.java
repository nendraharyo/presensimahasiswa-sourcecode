package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteReferral;
import com.google.android.gms.common.api.Status;

class zzkl$zze$1
  extends zzkl.zza
{
  zzkl$zze$1(zzkl.zze paramzze) {}
  
  public void zza(Status paramStatus, Intent paramIntent)
  {
    Object localObject = this.zzUV;
    zzkn localzzkn = new com/google/android/gms/internal/zzkn;
    localzzkn.<init>(paramStatus, paramIntent);
    ((zzkl.zze)localObject).zza(localzzkn);
    boolean bool = AppInviteReferral.hasReferral(paramIntent);
    if (bool)
    {
      localObject = this.zzUV;
      bool = zzkl.zze.zza((zzkl.zze)localObject);
      if (bool)
      {
        localObject = zzkl.zze.zzb(this.zzUV);
        if (localObject != null)
        {
          localObject = zzkl.zze.zzb(this.zzUV);
          ((Activity)localObject).startActivity(paramIntent);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkl$zze$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */