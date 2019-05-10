package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;

final class zze$zze
  extends zza
{
  private final zza.zzb zzaON;
  
  public zze$zze(zza.zzb paramzzb)
  {
    this.zzaON = paramzzb;
  }
  
  public void zza(DataHolder paramDataHolder, String paramString)
  {
    zze.zzb localzzb = null;
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
      localzzb = new com/google/android/gms/plus/internal/zze$zzb;
      localzzb.<init>((Status)localObject2, paramDataHolder, paramString);
      ((zza.zzb)localObject1).zzs(localzzb);
      return;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zze$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */