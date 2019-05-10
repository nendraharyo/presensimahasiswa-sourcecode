package com.google.android.gms.internal;

class zze$zza
  implements Runnable
{
  private final zzk zzv;
  private final zzm zzw;
  private final Runnable zzx;
  
  public zze$zza(zze paramzze, zzk paramzzk, zzm paramzzm, Runnable paramRunnable)
  {
    this.zzv = paramzzk;
    this.zzw = paramzzm;
    this.zzx = paramRunnable;
  }
  
  public void run()
  {
    Object localObject1 = this.zzv;
    boolean bool = ((zzk)localObject1).isCanceled();
    Object localObject2;
    if (bool)
    {
      localObject1 = this.zzv;
      localObject2 = "canceled-at-delivery";
      ((zzk)localObject1).zzd((String)localObject2);
      return;
    }
    localObject1 = this.zzw;
    bool = ((zzm)localObject1).isSuccess();
    if (bool)
    {
      localObject1 = this.zzv;
      localObject2 = this.zzw.result;
      ((zzk)localObject1).zza(localObject2);
      label60:
      localObject1 = this.zzw;
      bool = ((zzm)localObject1).zzai;
      if (!bool) {
        break label131;
      }
      localObject1 = this.zzv;
      localObject2 = "intermediate-response";
      ((zzk)localObject1).zzc((String)localObject2);
    }
    for (;;)
    {
      localObject1 = this.zzx;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.zzx;
      ((Runnable)localObject1).run();
      break;
      localObject1 = this.zzv;
      localObject2 = this.zzw.zzah;
      ((zzk)localObject1).zzc((zzr)localObject2);
      break label60;
      label131:
      localObject1 = this.zzv;
      localObject2 = "done";
      ((zzk)localObject1).zzd((String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zze$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */