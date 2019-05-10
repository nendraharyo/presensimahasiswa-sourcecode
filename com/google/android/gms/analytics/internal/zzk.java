package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzpq;
import com.google.android.gms.measurement.zzg;

public class zzk
  extends zzd
{
  private final zzpq zzQX;
  
  zzk(zzf paramzzf)
  {
    super(paramzzf);
    zzpq localzzpq = new com/google/android/gms/internal/zzpq;
    localzzpq.<init>();
    this.zzQX = localzzpq;
  }
  
  public void zziE()
  {
    Object localObject1 = zziI();
    Object localObject2 = ((zzan)localObject1).zzlg();
    if (localObject2 != null)
    {
      zzpq localzzpq = this.zzQX;
      localzzpq.setAppName((String)localObject2);
    }
    localObject1 = ((zzan)localObject1).zzli();
    if (localObject1 != null)
    {
      localObject2 = this.zzQX;
      ((zzpq)localObject2).setAppVersion((String)localObject1);
    }
  }
  
  protected void zziJ()
  {
    zzpq localzzpq1 = zzjo().zzAH();
    zzpq localzzpq2 = this.zzQX;
    localzzpq1.zza(localzzpq2);
    zziE();
  }
  
  public zzpq zzjS()
  {
    zzjv();
    return this.zzQX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */