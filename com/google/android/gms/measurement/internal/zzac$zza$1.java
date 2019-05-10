package com.google.android.gms.measurement.internal;

class zzac$zza$1
  implements Runnable
{
  zzac$zza$1(zzac.zza paramzza, zzm paramzzm) {}
  
  public void run()
  {
    synchronized (this.zzaYY)
    {
      Object localObject1 = this.zzaYY;
      Object localObject3 = null;
      zzac.zza.zza((zzac.zza)localObject1, false);
      localObject1 = this.zzaYY;
      localObject1 = ((zzac.zza)localObject1).zzaYU;
      boolean bool = ((zzac)localObject1).isConnected();
      if (!bool)
      {
        localObject1 = this.zzaYY;
        localObject1 = ((zzac.zza)localObject1).zzaYU;
        localObject1 = ((zzac)localObject1).zzAo();
        localObject1 = ((zzp)localObject1).zzCK();
        localObject3 = "Connected to service";
        ((zzp.zza)localObject1).zzfg((String)localObject3);
        localObject1 = this.zzaYY;
        localObject1 = ((zzac.zza)localObject1).zzaYU;
        localObject3 = this.zzaYX;
        zzac.zza((zzac)localObject1, (zzm)localObject3);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */