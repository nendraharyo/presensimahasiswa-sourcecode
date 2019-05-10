package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.zza;
import java.lang.ref.WeakReference;

class zzj$zzb
  implements IBinder.DeathRecipient, zzj.zzd
{
  private final WeakReference zzaii;
  private final WeakReference zzaij;
  private final WeakReference zzaik;
  
  private zzj$zzb(zzj.zze paramzze, zza paramzza, IBinder paramIBinder)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzza);
    this.zzaij = localWeakReference;
    localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzze);
    this.zzaii = localWeakReference;
    localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramIBinder);
    this.zzaik = localWeakReference;
  }
  
  private void zzpI()
  {
    Object localObject1 = (zzj.zze)this.zzaii.get();
    Object localObject2 = (zza)this.zzaij.get();
    if ((localObject2 != null) && (localObject1 != null))
    {
      localObject1 = ((zzj.zze)localObject1).zzpa();
      int i = ((Integer)localObject1).intValue();
      ((zza)localObject2).remove(i);
    }
    localObject1 = (IBinder)this.zzaik.get();
    localObject2 = this.zzaik;
    if (localObject2 != null)
    {
      localObject2 = null;
      ((IBinder)localObject1).unlinkToDeath(this, 0);
    }
  }
  
  public void binderDied()
  {
    zzpI();
  }
  
  public void zzc(zzj.zze paramzze)
  {
    zzpI();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */