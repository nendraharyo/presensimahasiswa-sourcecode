package com.google.android.gms.measurement.internal;

public class zzp$zza
{
  private final int mPriority;
  private final boolean zzaWN;
  private final boolean zzaWO;
  
  zzp$zza(zzp paramzzp, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mPriority = paramInt;
    this.zzaWN = paramBoolean1;
    this.zzaWO = paramBoolean2;
  }
  
  public void zzd(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zzp localzzp = this.zzaWM;
    int i = this.mPriority;
    boolean bool1 = this.zzaWN;
    boolean bool2 = this.zzaWO;
    localzzp.zza(i, bool1, bool2, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public void zze(String paramString, Object paramObject1, Object paramObject2)
  {
    zzp localzzp = this.zzaWM;
    int i = this.mPriority;
    boolean bool1 = this.zzaWN;
    boolean bool2 = this.zzaWO;
    localzzp.zza(i, bool1, bool2, paramString, paramObject1, paramObject2, null);
  }
  
  public void zzfg(String paramString)
  {
    zzp localzzp = this.zzaWM;
    int i = this.mPriority;
    boolean bool1 = this.zzaWN;
    boolean bool2 = this.zzaWO;
    localzzp.zza(i, bool1, bool2, paramString, null, null, null);
  }
  
  public void zzj(String paramString, Object paramObject)
  {
    zzp localzzp = this.zzaWM;
    int i = this.mPriority;
    boolean bool1 = this.zzaWN;
    boolean bool2 = this.zzaWO;
    localzzp.zza(i, bool1, bool2, paramString, paramObject, null, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */