package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;

public final class zzt
  extends zzau.zza
{
  private zzm zzbsk;
  private zzu zzbso;
  private final Object zzpV;
  
  public zzt()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
  }
  
  public void zza(zzu paramzzu)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = zzx.zzz(paramzzu);
      localObject2 = (zzu)localObject2;
      this.zzbso = ((zzu)localObject2);
      localObject2 = this.zzbsk;
      if (localObject2 != null) {
        paramzzu.zzb((zzm)localObject2);
      }
      return;
    }
  }
  
  public void zzy(int paramInt1, int paramInt2)
  {
    synchronized (this.zzpV)
    {
      zzu localzzu = this.zzbso;
      zzm localzzm = new com/google/android/gms/wearable/internal/zzm;
      localzzm.<init>(paramInt1, paramInt2);
      this.zzbsk = localzzm;
      if (localzzu != null) {
        localzzu.zzb(localzzm);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */