package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;

final class zze$zzd
  extends zza
{
  private final zza.zzb zzaON;
  
  public zze$zzd(zza.zzb paramzzb)
  {
    this.zzaON = paramzzb;
  }
  
  public void zza(DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    zze.zza localzza = null;
    Object localObject1 = paramDataHolder.zzpZ();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = paramDataHolder.zzpZ();
      localObject2 = "pendingIntent";
    }
    for (localObject1 = (PendingIntent)((Bundle)localObject1).getParcelable((String)localObject2);; localObject1 = null)
    {
      localObject2 = new com/google/android/gms/common/api/Status;
      int i = paramDataHolder.getStatusCode();
      ((Status)localObject2).<init>(i, null, (PendingIntent)localObject1);
      boolean bool = ((Status)localObject2).isSuccess();
      if ((!bool) && (paramDataHolder != null))
      {
        bool = paramDataHolder.isClosed();
        if (!bool) {
          paramDataHolder.close();
        }
        paramDataHolder = null;
      }
      localObject1 = this.zzaON;
      localzza = new com/google/android/gms/plus/internal/zze$zza;
      localzza.<init>((Status)localObject2, paramDataHolder, paramString1, paramString2);
      ((zza.zzb)localObject1).zzs(localzza);
      return;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zze$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */