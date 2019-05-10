package com.google.android.gms.internal;

public class zzm
{
  public final Object result;
  public final zzb.zza zzag;
  public final zzr zzah;
  public boolean zzai = false;
  
  private zzm(zzr paramzzr)
  {
    this.result = null;
    this.zzag = null;
    this.zzah = paramzzr;
  }
  
  private zzm(Object paramObject, zzb.zza paramzza)
  {
    this.result = paramObject;
    this.zzag = paramzza;
    this.zzah = null;
  }
  
  public static zzm zza(Object paramObject, zzb.zza paramzza)
  {
    zzm localzzm = new com/google/android/gms/internal/zzm;
    localzzm.<init>(paramObject, paramzza);
    return localzzm;
  }
  
  public static zzm zzd(zzr paramzzr)
  {
    zzm localzzm = new com/google/android/gms/internal/zzm;
    localzzm.<init>(paramzzr);
    return localzzm;
  }
  
  public boolean isSuccess()
  {
    zzr localzzr = this.zzah;
    boolean bool;
    if (localzzr == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzr = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */