package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzps;
import com.google.android.gms.measurement.zzg;

public class zzu
  extends zzd
{
  zzu(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  protected void zziJ() {}
  
  public zzps zzkZ()
  {
    zzjv();
    return zzjo().zzAI();
  }
  
  public String zzla()
  {
    zzjv();
    zzps localzzps = zzkZ();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = localzzps.zzAR();
    localStringBuilder = localStringBuilder.append(i).append("x");
    int j = localzzps.zzAS();
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */