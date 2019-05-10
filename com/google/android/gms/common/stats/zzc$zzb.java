package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzlz;

public final class zzc$zzb
{
  public static zzlz zzanE;
  public static zzlz zzanz;
  
  static
  {
    Object localObject = Integer.valueOf(zzd.LOG_LEVEL_OFF);
    zzanz = zzlz.zza("gms:common:stats:wakeLocks:level", (Integer)localObject);
    localObject = Long.valueOf(600000L);
    zzanE = zzlz.zza("gms:common:stats:wakelocks:time_out_duration", (Long)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzc$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */