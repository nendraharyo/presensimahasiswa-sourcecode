package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;

final class zzm$5
  implements zzdf
{
  zzm$5(zzfb paramzzfb, zzf.zza paramzza, zzfc paramzzfc) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = paramzzjp.getView();
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      boolean bool;
      try
      {
        localObject3 = this.zzqv;
        if (localObject3 == null) {
          break label95;
        }
        localObject3 = this.zzqv;
        bool = ((zzfb)localObject3).getOverrideClickHandling();
        if (bool) {
          break label88;
        }
        localObject3 = this.zzqv;
        localObject1 = zze.zzC(localObject1);
        ((zzfb)localObject3).zzc((zzd)localObject1);
        localObject1 = this.zzqw;
        ((zzf.zza)localObject1).onClick();
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "Unable to call handleClick on mapper";
        zzin.zzd((String)localObject3, localRemoteException);
      }
      continue;
      label88:
      zzm.zzb(paramzzjp);
      continue;
      label95:
      Object localObject3 = this.zzqx;
      if (localObject3 != null)
      {
        localObject3 = this.zzqx;
        bool = ((zzfc)localObject3).getOverrideClickHandling();
        if (!bool)
        {
          localObject3 = this.zzqx;
          Object localObject2 = zze.zzC(localRemoteException);
          ((zzfc)localObject3).zzc((zzd)localObject2);
          localObject2 = this.zzqw;
          ((zzf.zza)localObject2).onClick();
        }
        else
        {
          zzm.zzb(paramzzjp);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzm$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */