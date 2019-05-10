package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzmq;

class zzp$zzc
  implements zzbf
{
  private zzp$zzc(zzp paramzzp) {}
  
  public void zzGk() {}
  
  public void zza(zzbf.zza paramzza)
  {
    synchronized (this.zzbim)
    {
      Object localObject1 = this.zzbim;
      boolean bool = ((zzp)localObject1).isReady();
      if (!bool)
      {
        localObject1 = this.zzbim;
        localObject1 = zzp.zzb((zzp)localObject1);
        if (localObject1 != null)
        {
          localObject1 = this.zzbim;
          localObject3 = this.zzbim;
          localObject3 = zzp.zzb((zzp)localObject3);
          ((zzp)localObject1).zza((Result)localObject3);
        }
      }
      else
      {
        zzp.zza(this.zzbim, 3600000L);
        return;
      }
      localObject1 = this.zzbim;
      Object localObject3 = this.zzbim;
      Status localStatus = Status.zzagF;
      localObject3 = ((zzp)localObject3).zzbn(localStatus);
      ((zzp)localObject1).zza((Result)localObject3);
    }
  }
  
  public void zzb(zzaf.zzj paramzzj)
  {
    synchronized (this.zzbim)
    {
      Object localObject1 = paramzzj.zzju;
      if (localObject1 == null)
      {
        localObject1 = this.zzbim;
        localObject1 = zzp.zze((zzp)localObject1);
        localObject1 = ((zzaf.zzj)localObject1).zzju;
        if (localObject1 == null)
        {
          localObject1 = "Current resource is null; network resource is also null";
          zzbg.e((String)localObject1);
          localObject1 = this.zzbim;
          l = 3600000L;
          zzp.zza((zzp)localObject1, l);
          return;
        }
        localObject1 = this.zzbim;
        localObject1 = zzp.zze((zzp)localObject1);
        localObject1 = ((zzaf.zzj)localObject1).zzju;
        paramzzj.zzju = ((zzaf.zzf)localObject1);
      }
      localObject1 = this.zzbim;
      Object localObject3 = this.zzbim;
      localObject3 = zzp.zzc((zzp)localObject3);
      long l = ((zzmq)localObject3).currentTimeMillis();
      zzp.zza((zzp)localObject1, paramzzj, l, false);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "setting refresh time to current time: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = this.zzbim;
      l = zzp.zzf((zzp)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(l);
      localObject1 = ((StringBuilder)localObject1).toString();
      zzbg.v((String)localObject1);
      localObject1 = this.zzbim;
      boolean bool = zzp.zzg((zzp)localObject1);
      if (!bool)
      {
        localObject1 = this.zzbim;
        zzp.zza((zzp)localObject1, paramzzj);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzp$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */