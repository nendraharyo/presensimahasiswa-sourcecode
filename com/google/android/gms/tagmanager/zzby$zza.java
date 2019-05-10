package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzmq;

class zzby$zza
  implements zzcx.zza
{
  zzby$zza(zzby paramzzby) {}
  
  public void zza(zzaq paramzzaq)
  {
    zzby localzzby = this.zzbjK;
    long l = paramzzaq.zzGD();
    zzby.zza(localzzby, l);
  }
  
  public void zzb(zzaq paramzzaq)
  {
    Object localObject = this.zzbjK;
    long l = paramzzaq.zzGD();
    zzby.zza((zzby)localObject, l);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Permanent failure dispatching hitId: ");
    l = paramzzaq.zzGD();
    zzbg.v(l);
  }
  
  public void zzc(zzaq paramzzaq)
  {
    long l1 = paramzzaq.zzGE();
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = this.zzbjK;
      l2 = paramzzaq.zzGD();
      localObject2 = zzby.zza(this.zzbjK);
      long l3 = ((zzmq)localObject2).currentTimeMillis();
      zzby.zza((zzby)localObject1, l2, l3);
    }
    for (;;)
    {
      return;
      l1 += 14400000L;
      zzmq localzzmq = zzby.zza(this.zzbjK);
      l2 = localzzmq.currentTimeMillis();
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        localObject1 = this.zzbjK;
        l2 = paramzzaq.zzGD();
        zzby.zza((zzby)localObject1, l2);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "Giving up on failed hitId: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        l2 = paramzzaq.zzGD();
        localObject1 = l2;
        zzbg.v((String)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzby$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */