package com.google.android.gms.internal;

import java.util.concurrent.Future;

public final class zzhf
{
  private String zzEY;
  private String zzJh;
  private zzjd zzJi;
  zzeg.zzd zzJj;
  public final zzdf zzJk;
  public final zzdf zzJl;
  zzjp zzpD;
  private final Object zzpV;
  
  public zzhf(String paramString1, String paramString2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new com/google/android/gms/internal/zzjd;
    ((zzjd)localObject).<init>();
    this.zzJi = ((zzjd)localObject);
    localObject = new com/google/android/gms/internal/zzhf$1;
    ((zzhf.1)localObject).<init>(this);
    this.zzJk = ((zzdf)localObject);
    localObject = new com/google/android/gms/internal/zzhf$2;
    ((zzhf.2)localObject).<init>(this);
    this.zzJl = ((zzdf)localObject);
    this.zzJh = paramString2;
    this.zzEY = paramString1;
  }
  
  public void zzb(zzeg.zzd paramzzd)
  {
    this.zzJj = paramzzd;
  }
  
  public zzeg.zzd zzgB()
  {
    return this.zzJj;
  }
  
  public Future zzgC()
  {
    return this.zzJi;
  }
  
  public void zzgD()
  {
    zzjp localzzjp = this.zzpD;
    if (localzzjp != null)
    {
      this.zzpD.destroy();
      localzzjp = null;
      this.zzpD = null;
    }
  }
  
  public void zzh(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */