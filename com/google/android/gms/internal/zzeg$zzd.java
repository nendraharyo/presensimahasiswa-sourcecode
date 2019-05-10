package com.google.android.gms.internal;

public class zzeg$zzd
  extends zzjj
{
  private final zzeg.zze zzBo;
  private boolean zzBp;
  private final Object zzpV;
  
  public zzeg$zzd(zzeg.zze paramzze)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzBo = paramzze;
  }
  
  public void release()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzBp;
      if (bool) {
        return;
      }
      bool = true;
      this.zzBp = bool;
      Object localObject2 = new com/google/android/gms/internal/zzeg$zzd$1;
      ((zzeg.zzd.1)localObject2).<init>(this);
      Object localObject4 = new com/google/android/gms/internal/zzji$zzb;
      ((zzji.zzb)localObject4).<init>();
      zza((zzji.zzc)localObject2, (zzji.zza)localObject4);
      localObject2 = new com/google/android/gms/internal/zzeg$zzd$2;
      ((zzeg.zzd.2)localObject2).<init>(this);
      localObject4 = new com/google/android/gms/internal/zzeg$zzd$3;
      ((zzeg.zzd.3)localObject4).<init>(this);
      zza((zzji.zzc)localObject2, (zzji.zza)localObject4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */